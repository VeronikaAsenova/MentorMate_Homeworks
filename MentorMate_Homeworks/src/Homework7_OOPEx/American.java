package MentorMate_Homeworks.src.Homework7_OOPEx;

public class American extends Person {

    public American(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "American", job, "American", pin, countryOfResidence);
    }

    public void sayHello() {
        System.out.format("Hello, my name is %s!\n", getName());
    }

    @Override
    public boolean isAdult() {

        if (getAge() >= 21) {
            System.out.format("%s is adult!\n", getName());
            return true;
        } else {
            System.out.format("%s is not adult!\n", getName());
            return false;
        }
    }

    public boolean weaponBelonging() {
        if (isAdult()) {
            System.out.format("%s can have a weapon!\n", getName());
            return true;
        } else {
            System.out.format("%s cannot have a weapon, sorry\n", getName());
            return false;
        }
    }

    public boolean canEnterInAChurch() {
        if ("catholic".contentEquals(getReligion().toLowerCase())) {
            System.out.format("%s can enter in a Catholic church!\n", getName());
            return true;
        } else {
            System.out.format("%s CAN't enter in a Catholic church!\n", getName());
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


