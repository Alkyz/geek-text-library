package net.ShopCart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	@Autowired
	private CartRepository repo;
	
	public List<shop_cart> listAll(){
		return repo.findAll();
	}
	
	public void save (shop_cart cart) {
		repo.save(cart);
	}
	
	public shop_cart get(Integer id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
