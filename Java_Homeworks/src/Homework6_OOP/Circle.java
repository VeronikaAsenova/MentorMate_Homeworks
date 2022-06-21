package MentorMate_Homeworks.src.Homework6_OOP;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Circle extends Shape {

    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean isFilled) {
        this.radius = radius;
        this.color = color;
        this.isFilled = isFilled;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
