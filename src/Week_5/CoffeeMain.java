package Week_5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CoffeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        System.out.println("""
                Select a Option:
                
                [1] Provide Payment
                [2] Brew Coffee
                [3] Cancel
                [4] Clean Machine
                [5] Repair Machine
                """);

        if (scanner.nextInt() == 1) {
            coffeeMachine.pay();
        }

        else if (scanner.nextInt() == 2) {
            coffeeMachine.brewCoffee();
        }

        else if (scanner.nextInt() == 3) {
            coffeeMachine.cancel();
        }

        else if (scanner.nextInt() == 4) {
            coffeeMachine.clean();
        }

        else if (scanner.nextInt() == 5) {
            coffeeMachine.repair();
        }

        else {
            System.out.println("Please make a proper selection!");
        }
    }
}
