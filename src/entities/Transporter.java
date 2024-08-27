package entities;

public class Transporter extends ServiceProvider{
    String carrierName;

    public Transporter(String CNPJ, String carrierName) {
        super(CNPJ);
        this.carrierName = carrierName;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }
}
