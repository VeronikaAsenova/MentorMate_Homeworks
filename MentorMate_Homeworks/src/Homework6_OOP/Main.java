package MentorMate_Homeworks.src.Homework6_OOP;

public class Main {
    public static void main(String[] args) {


        //Circle
        Circle circle = new Circle(5.5, "red", false);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.println(circle.getRadius());

        System.out.println();

        //Upcast Circle to Shape
        Shape s1 = new Circle(5.5, "green", true);
        System.out.println(s1);
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //  System.out.println(s1.getRadius());

        System.out.println();

        // Downcast back to Circle
        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        System.out.println();

        //Rectangle
        Shape s3 = new Rectangle(1.0, 2.0, "red", true);
        System.out.println(s3);
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getArea());
        System.out.println(s3.getColor());
        System.out.println(s3.isFilled());
        // System.out.println(s3.getLength);

        System.out.println();

        //Downcast
        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println();

        Shape s4 = new Square(6.6, "red", true);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSide());

    }
}
