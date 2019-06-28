public class Jacket {
    private String matereal;
    private String size;
    private String color;

    public Jacket (){

    }

    public Jacket (String matereal,String size, String color){
        this.matereal =matereal;
        this.size = size;
        this.color =color;
    }

    public String getMatereal() {
        return matereal;
    }

    public void setMatereal(String matereal) {
        this.matereal = matereal;
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

    @Override
    public String toString(){
        return "This Jacket is " + getSize() + " and " + getColor() + ". it is made of " + getMatereal() + ".";
    }
}
