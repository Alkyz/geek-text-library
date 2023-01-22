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
public class CartController {

	@Autowired
	private CartService service;
	
	@GetMapping("/allCart")
	public List<shop_cart> List(){
		return service.listAll();		
	}
	
	@GetMapping("/getSpecificCart/{id}")
	public ResponseEntity<shop_cart> get(@PathVariable Integer id) {
		try {
		shop_cart shopcart = service.get(id);
		return new ResponseEntity<shop_cart>(shopcart,HttpStatus.OK);
	}catch(NoSuchElementException e) {
		return new ResponseEntity<shop_cart>(HttpStatus.NOT_FOUND);
	}
	}
	
	@PostMapping("/addCart")
	public void add(@RequestBody shop_cart shopcart) {
		service.save(shopcart);
	}
	
	@PutMapping("/cart/{id}")
	public ResponseEntity<?> update(@RequestBody shop_cart shopcart, @PathVariable Integer id) {
	try {
		shop_cart existCart = service.get(id);
		service.save(shopcart);
		return new ResponseEntity<>(HttpStatus.OK);
	}catch(NoSuchElementException e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}
	}
	
	@DeleteMapping("/deleteCart/{id}")
		public void delete(@PathVariable Integer id) {
			service.delete(id);
		}
	}
