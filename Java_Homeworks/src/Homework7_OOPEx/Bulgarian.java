package MentorMate_Homeworks.src.Homework7_OOPEx;

public class Bulgarian extends Person {
    public Bulgarian(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", pin, countryOfResidence);
    }

    public void drinks() {
        if (isAdult()) {
            System.out.format("%s drinks rakia\n ", getName());
        } else {
            System.out.format("%s drinks milk\n", getName());
        }
    }

    public void sayHello() {
        System.out.format("Здравей, аз се казвам %s!\n", getName());
    }

    public boolean isAdult() {

        if (getAge() >= 18) {
            System.out.format("%s is adult!\n", getName());
            return true;
        } else {
            System.out.format("%s is not adult!\n", getName());
            return false;
        }
    }

    @Override
    public boolean canTakeLoan() {
        if (isAdult() && getJob() != null) {
            System.out.format("%s can take a loan\n", getName());
            return true;
        } else {
            System.out.format("%s can't take a loan\n", getName());
            return false;
        }
    }
}

