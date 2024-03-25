public class Paint extends ArtSupply{
    private String texture;
    private double milliliters;

    public Paint(String brand, String color, String texture, double milliliters){
        super("Paint", brand, color);
        this.texture = texture;
        this.milliliters = milliliters;
    }

    public String getTexture(){
        return texture;
    }

    public void setTexture(String t){
        texture = t;
    }

    public double getML(){
        return milliliters;
    }

    public void setML(double m){
        milliliters = m;
    }

    public void paint(){
        System.out.println("Swish Swish Swish. You painted a + " + super.getColor() + 
        " picture using the " + super.getBrand() + " Paint.");
    }

    public void displayProperties(){
        super.displayProperties();
        System.out.println("It has a " + texture + " texture and also has " + milliliters + " mL left.")
    }


}
