public class Shirt {
    private String size;
    private String color;
    private String material;
    private String sleeves;

    public Shirt() {
    }

    public Shirt(String size, String color, String material, String sleeves) {
        this.size = size;
        this.color = color;
        this.material = material;
        this.sleeves = sleeves;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSleeves() {
        return sleeves;
    }

    public void setSleeves(String sleeves) {
        this.sleeves = sleeves;
    }

    @Override
    public String toString(){
        return  "This Shirt is " + getSize() + " and " + getColor() + ". It is made of " + getMaterial() + " and has " + getSleeves() + "s.";
    }

}
