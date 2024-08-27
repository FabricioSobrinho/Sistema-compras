package entities;

public class Seller {
    String name;
    String CPF;
    float maxDiscount;

    public Seller(String name, String CPF, float maxDiscount) {
        this.name = name;
        this.CPF = CPF;
        this.maxDiscount = maxDiscount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(float maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
