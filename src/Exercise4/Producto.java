package Exercise4;

public class Producto {
    private String name;
    private String description;
    private int price;
    private int stock;

    public Producto(String name, String description, int price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto" +
                "name:" + name +
                ", description:"+ description +
                ", price:"+ price +
                ", stock:"+ stock ;

    }
}
