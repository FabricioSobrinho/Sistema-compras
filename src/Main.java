import entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Transporter transporter = new Transporter("4434-4353-34", "TranSete");
        Supplier supplier = new Supplier("43243-2342-2342", "Kadri");
        Product product = new Product("Mouse", 10, 120);

        ItenProduct item = new ItenProduct("Nome", 2, 3, product);
        ItenProduct item2 = new ItenProduct("Nome 2", 2, 3, product);
        ItenProduct item3 = new ItenProduct("Nome 4", 2, 3, product);

        List<ItenProduct> list = new ArrayList<>();
        list.add(item);
        list.add(item2);
        list.add(item3);
        Seller seller = new Seller("Sellername", "333.333.333-33", 10);
        Order order = new Order(seller, list, supplier, transporter);
        System.out.println(order);
    }
}