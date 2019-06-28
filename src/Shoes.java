import java.util.ArrayList;

public class Shoes {
    private ArrayList<Shoes> shoeList;
    private String brand;
    private int size;
    private String color;
    private String type;

//Constructors
    public Shoes(String brand, int size, String color, String type) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }


    public Shoes() {
    }



    //Getters and Setters


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "These Shoes are size " + getSize() + " and " + getColor()   + ". They are made by " + getBrand() + ".\n";
    }

}
