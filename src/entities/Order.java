package entities;
import java.util.ArrayList;
import java.util.List;

public class Order {
    Seller responsibleSeller;
    List<ItenProduct> products = new ArrayList<>();
    Supplier supplier;
    Transporter transporter;

    public Order(Seller responsibleSeller, List<ItenProduct> products, Supplier supplier, Transporter transporter) {
        this.responsibleSeller = responsibleSeller;
        this.products = products;
        this.supplier = supplier;
        this.transporter = transporter;
    }

    @Override
    public String toString() {
        for (ItenProduct product : products) {
            System.out.println(product.value + product.name);
        }
        return ".";
    }
}
