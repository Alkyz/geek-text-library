package net.ShopCart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<shop_cart_item, Integer>{

}
