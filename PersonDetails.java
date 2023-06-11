package package_person_homework;

import package_person.Person;

public class PersonDetails {
    public static void main(String[] args) {
        PersonHW firstPerson;
        PersonHW secondPerson;
        PersonHW thirdPerson;
        //PersonHW fourthPerson;
// person class
        firstPerson = new PersonHW();
        secondPerson = new PersonHW();
        thirdPerson = new PersonHW();
       // fourthPerson = new PersonHW("Laura", 'F', 15, "Mazda", 2007, true, 680);
       // PersonHW carYear = new PersonHW();
        //carYear.getyear(2023);


        // info, add values

        firstPerson.name = "Lore";
        firstPerson.gender = 'F';
        firstPerson.age = 29;
        firstPerson.year = 2009;
        firstPerson.car = "Volkswagen Bug";
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Mario";
        secondPerson.gender = 'M';
        secondPerson.age = 24;
        secondPerson.year = 2022;
        secondPerson.car = "Tesla";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Ariel";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.year = 2023;
        thirdPerson.car = "Mustang";
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;

//        System.out.println(firstPerson.name);
//        System.out.println(firstPerson.gender);
//        System.out.println(firstPerson.age);
//        System.out.println(firstPerson.car);
//        System.out.println(firstPerson.violations);
//        System.out.println(firstPerson.creditScore);
//        System.out.println();
//        System.out.println(secondPerson.name);
//        System.out.println(secondPerson.gender);
//        System.out.println(secondPerson.age);
//        System.out.println(secondPerson.car);
//        System.out.println(secondPerson.violations);
//        System.out.println(secondPerson.creditScore);

        double monthlyRate = 0;
        double adjustedRate = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for " + firstPerson.name + ": " + firstPerson.getRate(monthlyRate) + " dollars");
        //System.out.println("Adjustments" + firstPerson.assumeGender(adjustedRate));
        System.out.println("Here is " + firstPerson.name + " 's total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate));
        System.out.println( "You have to pay " + firstPerson.getyear(firstPerson.year )+ "dollars");



        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": "+ secondPerson.getRate(monthlyRate) + " dollars");
        //System.out.println("Adjustments" +secondPerson.assumeGender(adjustedRate));
        System.out.println("Here is " + secondPerson.name + " 's total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate));
        System.out.println( "You have to pay " + secondPerson.getyear(secondPerson.year )+ "dollars");

        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for " +thirdPerson.name+ ": "+ thirdPerson.getRate(monthlyRate) + " dollars");
        //System.out.println("Adjustments" +thirdPerson.assumeGender(adjustedRate));
        System.out.println("Here is " + thirdPerson.name + " 's total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + thirdPerson.getRate(monthlyRate));
        System.out.println( "You have to pay " + thirdPerson.getyear(thirdPerson.year )+ "dollars");




    }
}
