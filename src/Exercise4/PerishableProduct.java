package Exercise4;

public class PerishableProduct extends Producto{
    private String expirationDate;

    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "PerishableProduct{" +
                "expirationDate='" + expirationDate + '\'' +
                '}';
    }

    public PerishableProduct(String name, String description, int price, int stock, String expirationDate) {
        super(name, description, price, stock);
        this.expirationDate = expirationDate;
    }
}
