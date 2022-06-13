package MentorMate_Homeworks.src.Homework5_Constructors;

public class Cars {

    String name;
    String color;
    int releaseYear;
    int hp;
    boolean isSecondHand;

    public Cars() {
    }

    public Cars(String name, String color, int releaseYear, int hp, boolean isSecondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.hp = hp;
        this.isSecondHand = isSecondHand;
    }

    public Cars(String name, String color, boolean isSecondHand) {
        this(name,color,-1,-1,true);
        this.name = name;
        this.color = color;
        this.isSecondHand = isSecondHand;
    }

    public Cars(String name, String color, int releaseYear, int hp) {
        this(name,color,releaseYear,hp,false);
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.hp = hp;
    }

    public Cars(String name, int releaseYear, int hp, boolean isSecondHand) {
        this(name, "N/A", releaseYear, hp, isSecondHand);
        this.name = name;
        this.releaseYear = releaseYear;
        this.hp = hp;
        this.isSecondHand = isSecondHand;
    }
    public Cars(int releaseYear, int hp, boolean isSecondHand) {
        this("N/A", "N/A", releaseYear, hp, isSecondHand);
        this.releaseYear = releaseYear;
        this.hp = hp;
        this.isSecondHand = isSecondHand;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", releaseYear=" + releaseYear +
                ", hp=" + hp +
                ", isSecondHand=" + isSecondHand +
                '}';

    }


}
