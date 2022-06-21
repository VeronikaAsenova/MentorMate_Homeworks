package MentorMate_Homeworks.src.Homework6_OOP;

public class Rectangle extends Shape {

    public double width;
    public double length;

    public Rectangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean isFilled) {
        super();
        this.width = width;
        this.length = length;
        this.color = color;
        this.isFilled = isFilled;
    }

    public Rectangle(String color, Boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
