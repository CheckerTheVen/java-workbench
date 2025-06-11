package workbench.shared;

import java.util.ArrayList;

public final class Data {
    private Data() {}

    public static ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(100, "Banana", 2.30));
        products.add(new Product(101, "Apple", 0.75));
        products.add(new Product(102, "Lettuce", 0.90));
        products.add(new Product(103, "Potato", 1.00));
        products.add(new Product(200, "Chocolate", 2.30));
        products.add(new Product(201, "Milk", 1.45));
        products.add(new Product(202, "Sausage", 1.75));
        products.add(new Product(203, "Steak", 3.35));
        products.add(new Product(300, "Sweater", 19.90));
        products.add(new Product(301, "Phone charger", 15.90));
        products.add(new Product(300, "Refridgerator", 189.00));
        products.add(new Product(300, "Set of forks", 4.90));

        return products;
    }
}
