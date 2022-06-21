package MentorMate_Homeworks.src.Homework7_OOPEx;

public class Italian extends Person{
    public Italian(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "Italian", job, "Italian", pin, countryOfResidence);
    }

    public void sayHello() {
        System.out.format("Ciao, il mio nome e %s!\n", getName());
    }

    @Override
    public boolean isAdult() {

        if (getAge() >= 18) {
            System.out.format("%s is adult!\n", getName());
            return true;
        } else {
            System.out.format("%s is not adult!\n", getName());
            return false;
        }
    }

    public boolean eightOfMarchPromo(){
        if ("female".contentEquals(getSex().toLowerCase())){
            System.out.format("%s is a female.So you receive a twenty percent OFF ticket\n", getName());
            return true;
        }else{
            System.out.format("%s is not a female.So you don't receive a twenty percent OFF ticket\n", getName());
            return false;
        }
    }

    public boolean isSteward(){
        if ("steward".contentEquals(getJob().toLowerCase())){
            System.out.format("%s is a steward.So you receive a free tour guide for the Colosseum.\n", getName());
            return true;
        }else{
            System.out.format("%s is not a steward.So you don't receive a free tour guide for the Colosseum.\n", getName());
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
