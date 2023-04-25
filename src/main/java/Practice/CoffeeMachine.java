package Practice;

import java.util.Scanner;

public class CoffeeMachine {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Push button pls with number (1 - ESPRESSO, 2 - AMERICANO, 3- CAPPUCCINO, 4- LATTE)");
            int button = sc.nextInt();
            sc.close();

            Drink choice = null;

            switch (button) {
                case 1 -> {
                    choice = Drink.ESPRESSO;
                    makeEspresso(false);
                }
                case 2 -> {
                    choice = Drink.AMERICANO;
                    makeAmericano();
                }
                case 3 -> {
                    choice = Drink.CAPPUCCINO;
                    makeCappuccino();
                }
                case 4 -> {
                    choice = Drink.LATTE;
                    makeLatte();
                }
                default -> System.out.println("Incorrect button");
            }

            if (choice != null)
                System.out.println("Your drink is ready, pls pay " + choice.getPrice() + " Euro");

        }

        public static void makeEspresso(boolean subprocess) {
            if (subprocess)
                System.out.println("Adding an espresso (" + Volume.SMALL.getVolume() + " ml)");
            else
                System.out.println("Making an espresso (" + Volume.SMALL.getVolume() + " ml)");
        }

        public static void addSomeWater() {
            System.out.println("Adding some water (" +
                    (Volume.MIDDLE.getVolume() - Volume.SMALL.getVolume()) + " ml)");
        }

        public static void makeAmericano() {
            makeEspresso(true);
            addSomeWater();
        }

        public static void addSomeFoamMilk() {
            //todo finish
            System.out.println("Adding some foam milk");
        }

        public static void makeCappuccino() {
            //todo finish
            makeEspresso(true);
            addSomeFoamMilk();
        }

        public static void makeLatte() {
            //todo finish
            addSomeFoamMilk();
            makeEspresso(true);
        }


    }

    enum Drink {
        // espresso, americano, cappuccino, latte
        ESPRESSO(1.5, Volume.SMALL, true),
        AMERICANO(1.9, Volume.MIDDLE, true),
        CAPPUCCINO(2.6, Volume.MIDDLE, false),
        LATTE(2.8, Volume.LARGE, false);

        private double price;
        private Volume volume;
        private boolean strong;

        Drink(double price, Volume volume, boolean strong) {
            this.price = price;
            this.volume = volume;
            this.strong = strong;
        }

        public double getPrice() {
            return price;
        }

        public Volume getVolume() {
            return volume;
        }

        public boolean isStrong() {
            return strong;
        }
    }

    enum Volume {
        SMALL(50), MIDDLE(120), LARGE(200);

        private int volume;

        Volume(int volume) {
            this.volume = volume;
        }

        public int getVolume() {
            return volume;
        }

}