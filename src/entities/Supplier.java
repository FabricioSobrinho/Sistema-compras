package entities;

public class Supplier extends ServiceProvider {
    String shopName;

    public Supplier(String CNPJ, String shopName) {
        super(CNPJ);
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
