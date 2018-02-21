package framework.jst.com;

public class Rectangulator {
    public static void main(String []args)
    {
        int length = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        Rectangle myRectangle = new Rectangle(length,width);

        System.out.println("Length is : " + length + "Width is : " + width);
    }
}
