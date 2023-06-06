import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args){
        String specials;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day of the week excluding weekends Monday - Friday only!");

        specials = input.next();

        // in the world of coffee, I need a name of a coffee beverage and a price

        String coffee;
        double price;

        boolean Saturday = specials.equals("Saturday");
            boolean Sunday = specials.equals("Sunday");

            if(Saturday || Sunday) {
                System.out.println("Please enter a weekday, not weekend");
                specials = input.next();
            }

        switch (specials) {
            // my cases will be the day of the week
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of tha day is a " + coffee + " and the price will be $" + price);
            }
            case "Tuesday" -> {
                coffee = "Frappuccino";
                price = 5.95;
                System.out.println(specials + "'s coffee of tha day is a " + coffee + " and the price will be $" + price);
            }
            case "Wednesday" -> {
                coffee = "Capuccino";
                price = 4.35;
                System.out.println(specials + "'s coffee of tha day is a " + coffee + " and the price will be $" + price);
            }
            case "Thursday" -> {
                coffee = "Regular joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of tha day is a " + coffee + " and the price will be $" + price);
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of tha day is a " + coffee + " and the price will be $" + price);
            }
        }
    }
}
