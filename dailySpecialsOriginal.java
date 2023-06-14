import java.util.Scanner;

public class dailySpecialsOriginal {

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
                    System.out.println("How many Lattes would you like to order?");
                    int entrada = input.nextInt();
                    printMessages(coffee, price, entrada);


                }
                case "Tuesday" -> {
                    coffee = "Frappuccino";
                    price = 4.95;
                    System.out.println(specials + "'s coffee of tha day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many" + coffee + "would you like to order?");
                    int entrada = input.nextInt();
                    printMessages(coffee, price, entrada);

                }
                case "Wednesday" -> {
                    coffee = "Capuccino";
                    price = 4.35;
                    System.out.println(specials + "'s coffee of tha day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many" + coffee + "would you like to order?");
                    int entrada = input.nextInt();
                    printMessages(coffee, price, entrada);

                }
                case "Thursday" -> {
                    coffee = "Regular joe";
                    price = 2.95;
                    System.out.println(specials + "'s coffee of tha day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many" + coffee + "would you like to order?");
                    int entrada = input.nextInt();
                    printMessages(coffee, price, entrada);

                }
                case "Friday" -> {
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(specials + "'s coffee of tha day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many" + coffee + "would you like to order?");
                    int entrada = input.nextInt();
                    printMessages(coffee, price, entrada);

                }
            }
        }


        public static void printMessages(String coffee, double price, int entrada){
            if (entrada == 0) {

                System.out.println("Looks like you dont like lattes! So sad!!!");

            } else if (entrada > 0) {

                System.out.print("Looks like you qualify for a group discount! Your regular price is");
                System.out.printf(" $%.2f", entrada*price , " dollars");

                if (entrada >= 5 && entrada < 10)  {

                    System.out.println(" You have ordered " + "" + entrada + "" + coffee + " but will be only charge $" + (entrada*price - (entrada*price*.10)) + " dollars!");
                }
                else if (entrada >= 10){

                    System.out.println("You have ordered " + " " + entrada + "" + coffee + " but will be only charge $" + (entrada*price -(entrada*price*.20)) + " dollars!");

                }
            }


        }
    }




