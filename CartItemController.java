package net.ShopCart;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartItemController {

	@Autowired
	private CartItemService service;
	
	@GetMapping("/allItems")
	public List<shop_cart_item> List(){
		return service.listAll();
		
	}
	
	@GetMapping("/item/{id}")
	public ResponseEntity <shop_cart_item>get(@PathVariable Integer id) {
		try {
			shop_cart_item shopcart = service.get(id);
			return new ResponseEntity <shop_cart_item>(shopcart,HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity <shop_cart_item>(HttpStatus.NOT_FOUND);
		}
		}
	
	@PostMapping("/addToCart")
	public void add(@RequestBody shop_cart_item shopcart) {
		service.save(shopcart);
	}
	@PutMapping("/shop_cart_item/{id}")
	public ResponseEntity<?> update(@RequestBody shop_cart_item shopcart, @PathVariable Integer id) {
	try {
		shop_cart_item existCart = service.get(id);
		service.save(shopcart);
		return new ResponseEntity<>(HttpStatus.OK);
	}catch(NoSuchElementException e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}
	}
	
	@DeleteMapping("/deleteItem/{id}")
		public void delete(@PathVariable Integer id) {
			service.delete(id);
		}
}