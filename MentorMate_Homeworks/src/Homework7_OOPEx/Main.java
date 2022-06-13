package MentorMate_Homeworks.src.Homework7_OOPEx;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Albena", "Female", "Orthodox", "Bulgarian", "QA",
                "Bulgaria", "0351283437","Bulgaria");

        Person anotherPerson = new Person("Marius", "MALE", "Catholic", "Italian", null,
                "Italy", "8305128347","Itaaly");

        Person thirdPerson = new Person("John", "other", "Islam", "English", "Support",
                "USA", "0745178345","USA");

        System.out.println(person);
        System.out.println(anotherPerson);
        System.out.println(thirdPerson);

        System.out.println();

        person.sayHello();
        anotherPerson.sayHello();
        thirdPerson .sayHello();

        System.out.println();

        person.celebrateEaster();
        anotherPerson.celebrateEaster();
        thirdPerson.celebrateEaster();

        System.out.println();

        person.isAdult();
        anotherPerson.isAdult();
        thirdPerson.isAdult();

        System.out.println();

        person.canTakeLoan();
        anotherPerson.canTakeLoan();
        thirdPerson.canTakeLoan();



        Child child = new Child("Roni", "Female", "Catholic", "Bulgarian", null,
                "Bulgarian", "9506051713", "Bulgaria");

        Child anotherChild = new Child("Viko", "Male", "Catholic", "Bulgarian", null,
                "Bulgarian", "0052051713", "Bulgaria");

        Child thirdChild = new Child("Lili", "Female", "Catholic", "Bulgarian", null,
                "Bulgarian", "0346071713", "Bulgaria");

        System.out.println("");
        System.out.println(" Calling Child");

        child.isAdult();
        anotherChild.isAdult();
        thirdChild.isAdult();

        System.out.println();

        child.play();
        anotherChild.play();
        thirdChild.play();

        System.out.println();

        child.canTakeLoan();
        anotherChild.canTakeLoan();
        thirdChild.canTakeLoan();

        System.out.println();
        System.out.println("Calling Bulgarian");


        Bulgarian bulgarian = new Bulgarian("Васил", "Male", "Catholic", "Bulgarian", "DEV",
                "Bulgarian", "8602131712", "Bulgaria");
        Bulgarian anotherBulgarian = new Bulgarian("Глория", "Female", "Islam", "Bulgarian", "QA",
                "Bulgarian", "9507221712", "Bulgaria");
        Bulgarian thirdBulgarian = new Bulgarian("Йоанна", "Female", "Catholic", "Bulgarian", "HR",
                "Bulgarian", "0951131512", "Bulgaria");

        System.out.println();
        bulgarian.sayHello();
        anotherBulgarian.sayHello();
        thirdBulgarian.sayHello();

        System.out.println();

        bulgarian.drinks();
        anotherBulgarian.drinks();
        thirdBulgarian.drinks();

        System.out.println();

        bulgarian.isAdult();
        anotherBulgarian.isAdult();
        thirdBulgarian.isAdult();

        System.out.println();

        bulgarian.canTakeLoan();
        anotherBulgarian.canTakeLoan();
        thirdBulgarian.canTakeLoan();

        System.out.println();
        System.out.println("Calling American");

        //Calling American

        American american = new American("Jane", "Female", "Orthodox", "American",
                "null", "American", "0051231616", "America");
        American anotherAmerican = new American("Mike", "Male", "Catholic", "American",
                "Waitress", "American", "9901221615", "America");
        American thirdAmerican = new American("Eleven", "Female", "Islam", "American",
                "null", "American", "0951111616", "America");

        american.sayHello();
        anotherAmerican.sayHello();
        thirdAmerican.sayHello();

        System.out.println();

        american.isAdult();
        anotherAmerican.isAdult();
        thirdAmerican.isAdult();

        System.out.println();

        american.canTakeLoan();
        anotherAmerican.canTakeLoan();
        thirdAmerican.canTakeLoan();

        System.out.println();

        american.weaponBelonging();
        anotherAmerican.weaponBelonging();
        thirdAmerican.weaponBelonging();

        System.out.println();

        american.canEnterInAChurch();
        anotherAmerican.canEnterInAChurch();
        thirdAmerican.canEnterInAChurch();

    }
}
