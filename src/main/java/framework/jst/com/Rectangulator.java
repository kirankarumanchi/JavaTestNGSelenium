package framework.jst.com;

public class Rectangulator {
    public static void main(String []args)
    {
        int length = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        Rectangle myRectangle = new Rectangle(length,width);

        System.out.println("Length is : " + length + " && Width is : " + width);
        System.out.println("Area is : " + myRectangle.getArea());
        System.out.println("Perimeter is : " + myRectangle.getPerimeter());
    }
}
