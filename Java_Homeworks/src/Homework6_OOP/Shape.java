package MentorMate_Homeworks.src.Homework6_OOP;

abstract class Shape {

    public String color;
    public Boolean isFilled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return isFilled;
    }

    public void setFilled(Boolean filled) {
        isFilled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();

    public boolean isFilled(){
        if(isFilled){
            return true;
        }else{
            return false;
        }
    }

    public Shape() {
        this.color = color;
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
}
