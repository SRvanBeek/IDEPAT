import Week_6.Factories.Concrete_Factories.HardEnemyFactory;
import Week_6.Factories.Concrete_Factories.NormalEnemyFactory;
import Week_6.TowerDefense;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TowerDefense towerDefense;

        System.out.println("type 'hard' for hard difficulty");

        if (Objects.equals(scanner.nextLine(), "hard")) {
            towerDefense = new TowerDefense(new HardEnemyFactory());
        }
        else {
            towerDefense = new TowerDefense(new NormalEnemyFactory());
        }


        while (true) {
            towerDefense.checkWaveEnded();
            towerDefense.fireWeapon(scanner.nextLine());
        }
    }
}