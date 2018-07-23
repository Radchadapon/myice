package Models;
public class Ice {
}
    private String id,name,brand;
    private float price;
    private int number;

    public Ice() {
    }

    public Ice(String id, String name, String brand, float price, int number) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.number = number;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
