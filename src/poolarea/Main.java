package poolarea;
/*
→ TEST CODE: Write the below code into the main method.
Rectangle rectangle = new Rectangle(5, 10);
System.out.println("rectangle.width= " + rectangle.getWidth());
System.out.println("rectangle.length= " + rectangle.getLength());
System.out.println("rectangle.area= " + rectangle.getArea());
Cuboid cuboid = new Cuboid(5,10,5);
System.out.println("cuboid.width= " + cuboid.getWidth());
System.out.println("cuboid.length= " + cuboid.getLength());
System.out.println("cuboid.area= " + cuboid.getArea());

System.out.println("cuboid.height= " + cuboid.getHeight());
System.out.println("cuboid.volume= " + cuboid.getVolume());
→ OUTPUT
rectangle.width= 5.0
rectangle.length= 10.0
rectangle.area= 50.0
cuboid.width= 5.0
cuboid.length= 10.0
cuboid.area= 50.0
cuboid.height= 5.0
cuboid.volume= 250.0
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 3 classes.
 */

public class Main {
    public static void main(String[] args) {    // print statement
        Rectangle rectangle = new Rectangle(5,10);  //object calling
        System.out.println("Rectangle.width = " + rectangle.getWidth());
        System.out.println("Rectangle.length=" + rectangle.getLength());
        System.out.println("Rectangle.Area. =" + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Cuboid.width = " + cuboid.getWidth());
        System.out.println("Cuboid.length =" +cuboid.getLength());
        System.out.println("Cuboid.area =" + cuboid.getArea());
        System.out.println("Cuboid.height =" +cuboid.getHeight());
        System.out.println("Cuboid.Volume = " +cuboid.getVolume());

    }
}
