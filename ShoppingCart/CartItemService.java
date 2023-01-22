package net.ShopCart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemService {

	@Autowired
	private CartItemRepository repo;
	
	public List<shop_cart_item> listAll(){
		return repo.findAll();
	}
	
	public void save (shop_cart_item cart) {
		repo.save(cart);
	}
	
	public shop_cart_item get(Integer id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
