package MentorMate_Homeworks.src.Homework6_OOP;

public class Square extends Rectangle{

    public double side;

    public Square(double side, String color, Boolean isFilled) {
        super();
        this.side = this.side;
        this.color = color;
        this.isFilled = isFilled;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side*side;
    }

    @Override
    double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
