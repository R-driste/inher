public class ArtSupply {
    private String name;
    private String brand;
    private String color;

    public ArtSupply(String name, String brand, String color){
        this.name = name;
        this.brand = brand;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String b){
        brand = b;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        name = c;
    }

    public void paint(){
        System.out.println("Scribble scribble scribble. You drew a + " + color + " picture using the " + brand + " " + name);
    }

    public void displayProperties(){
        System.out.println("Your " + color + " art supply, " + name +", is of the " + brand + " brand.");
    }

}
