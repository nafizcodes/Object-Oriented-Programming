public class Item {

    private String name;
    private String description;
    private double price;
    private double salePrice;
    
    public Item(String name, String description, double price, double salePrice ){
        this.name = name;
        this.description = description;
        this.price = price;
        this.salePrice = salePrice;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public String toString() {
        return "Item Name: " + this.name +
                "\n   Description: " + this.description +
                "\n   Regular Price: " + this.price +
                "\n   Sale price: " + this.salePrice;
    }
}