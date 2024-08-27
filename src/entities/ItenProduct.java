package entities;

public class ItenProduct extends Product {
    Product product;
    int unit;

    public ItenProduct(String name, int unit, float value, Product product) {
        super(name, unit, value);
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }
}
