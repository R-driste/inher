public class Pen extends ArtSupply{
    private String type;
    private double diameter;

    public Pen(String brand, String color, String type, double diameter){
        super("Pen",brand,color);
        this.type = type;
        this.diameter = diameter;
    }

    public String getType(){
        return type;
    }

    public void setType(String t){
        type = t;
    }

    public double getDiameter(){
        return diameter;
    }

    public void setDiameter(double d){
        diameter = d;
    }


    public void paint(){
        System.out.println("Skrr Skrr Skrr. You etched a + " + super.getColor() + 
        " picture using the " + super.getBrand() + " Pen.");
    }

    public void displayProperties(){
        super.displayProperties();
        System.out.println("It has type: " + type + ", and of diameter " + diameter + " mm.")
    }
    

}