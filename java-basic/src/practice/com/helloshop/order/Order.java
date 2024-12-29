package practice.com.helloshop.order;

import practice.com.helloshop.product.Product;
import practice.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
