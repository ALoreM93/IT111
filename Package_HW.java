public class Package_HW {
    public static void main(String[] args){
        //create our variables

        String firstPersonName = "Lore";
        String secondPersonName = "Mario";

        int firstPersonAge = 29;
        int secondPersonAge = 24;
        int firstPersonCarAge = 2009 ;
        int secondPersonCarAge = 2015 ;


        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        int firstPersonCreditScore =  790;
        int secondPersonCreditScore = 670;

        double monthlyRate1;
        double monthlyRate2;

        double adjustedRate1;
        double adjustedRate2;



// if the car is newer, the "person" will be paying more insurance, and if the car is older,
// the monthly premiums will be less.

        if(firstPersonViolations == true && firstPersonCreditScore <= 700){
            monthlyRate1 = 500;

        } else {
            monthlyRate1 = 100;
        }

        if(secondPersonViolations == true && secondPersonCreditScore <= 700){
            monthlyRate2 = 500;

        } else {
            monthlyRate2 = 100;
        }
//

        if(firstPersonCarAge <= 2010){
            adjustedRate1 = 100;

        } else {
            adjustedRate1 = 0;
        }

        if(secondPersonCarAge >2010){
            adjustedRate2 = 100;

        } else {
            adjustedRate2 = 0;
        }

        double total1 = monthlyRate1 + adjustedRate1;
        double total2 = monthlyRate2 + adjustedRate2;


        System.out.println("First Person Name:" + firstPersonName);
        //System.out.println("First Person Gender:" + firstPersonGender);
        System.out.println("First Person Age:" + firstPersonAge);
        System.out.println("First Person Car Age:" + firstPersonCarAge);
        System.out.println("First Person Violations:" + firstPersonViolations);
        System.out.println("First Person Credit Score:" + firstPersonCreditScore);
        System.out.println( total1 + " dollars");
        System.out.println();


        System.out.println("Second Person Name:" + secondPersonName);
        System.out.println("Second Person Age:" + secondPersonAge);
        System.out.println("Second Person Car Age:" + secondPersonCarAge);
        System.out.println("Second Person Violations:" + secondPersonViolations);
        System.out.println("Second Person Credit Score:" + secondPersonCreditScore);
        System.out.println( total2 + " dollars");
    }
}

