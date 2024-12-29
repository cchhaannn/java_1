package practice.com.helloshop.order;

import practice.com.helloshop.product.Product;
import practice.com.helloshop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
