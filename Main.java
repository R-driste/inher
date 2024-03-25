public class Main{
    public static void main(String[] args){
        ArtSupply a = new ArtSupply("Pencil","FaberCastle","Grey");
        a.use();
        System.out.println(a);
        System.out.println();

        Pen pe = new Pen("Micron", "Magenta","Felt Tip", 0.7);
        pe.use();
        System.out.println(pe);
        System.out.println();

        Paint pa = new Paint("Crayola","Blue","Puffy",100.0);
        pa.use();
        System.out.println(pa);
    }
    /*
 * 1.) We have a class design for an art supply, describing its name and color. We want to differentiate into two more classes for pens and paints so that the pens can have a variable for the type and width, and the paints can have a variable for the texture. We can inherit from the art supply class so we don't have to rewrite the name or color data and functions.

2.) Superclass: We should have two private String variables for name and color. Then our constructor can accept two Strings and assign them to our variables. Finally, we should have the functions getName(), setName(), getColor(), and setColor(). We can also have a use() function that creates a drawing, and a toString() to be overwritten later.

3.) Subclasses should be Pen and Paint, and they both use the superclass ArtSupply to store the name and color of their class. Pen will have the additional variables of type and width, and paint will have the additional variable texture.

4.) Pen and Paint would inherit all the functions of the superclass as well as access to the superclass private variables through these methods. The constructor should be rewritten for both classes, but we will call the super(name, color) constructor within them.

5.) We will override the use() function to match the pen type and width or the paint texture. We also override toString to reflect if the object is specifically pen or paint.
 */

}