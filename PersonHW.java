package package_person_homework;

public class PersonHW {

        public PersonHW() {

    }

    String name;
    char gender;
    int age;
    String car;

    double year;

    boolean violations;
    double creditScore;

    double monthlyRate;

    public void display(){
        System.out.println("Customer name: " +name);
        System.out.println("Age:" +age);
        System.out.println("Gender:" +gender);
        System.out.println("Car Year: "+ year);
        System.out.println("car:" +car);
        System.out.println("violations:" +violations);
        System.out.println("Credit Score: " +creditScore);
    }

    public double getRate(double monthlyRate){
        if(violations == true && creditScore <= 700){
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }
        return monthlyRate;

    }

    public double assumeGender(double adjustedRate){
        if(gender == 'M' && age <= 25) {
            adjustedRate = 100;

        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    public double getyear(double year){
        if( year <= 2010){
            monthlyRate = 200.00;
        } else {
            monthlyRate = 500.00;
        }
        return monthlyRate;

    }

    public static void main(String[] args) {
        PersonHW person = new PersonHW();



    }




}

