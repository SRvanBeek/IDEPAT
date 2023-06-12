package Week_6;

import Week_6.Enemies.Archer;
import Week_6.Enemies.Soldier;
import Week_6.Enemies.Wall;
import Week_6.Factories.EnemyFactory;

import java.util.ArrayList;
import java.util.Random;

public class TowerDefense {
    int waveSize = 0;
    ArrayList<Soldier> soldiers = new ArrayList<>();
    ArrayList<Wall> walls = new ArrayList<>();
    ArrayList<Archer> archers = new ArrayList<>();

    EnemyFactory enemyFactory;

    public TowerDefense(EnemyFactory enemyFactory) {
        this.enemyFactory = enemyFactory;
    }

    public void spawnWave() {
        System.out.println("Wave Size: " + waveSize + "\n");
        while (enemiesRemaining() < waveSize) {
            Random random = new Random();
            int randomNumber = random.nextInt(3);

            switch (randomNumber) {
                case 0 -> soldiers.add(enemyFactory.spawnSoldier());
                case 1 -> walls.add(enemyFactory.spawnWall());
                case 2 -> archers.add(enemyFactory.spawnArcher());
            }
        }
    }

    public void checkWaveEnded() {
        if (enemiesRemaining() == 0) {
            waveSize += 5;
            spawnWave();
            displayEnemies();
        }
    }

    public void fireWeapon(String weaponType) {
        switch (weaponType) {
            case "s" -> shootSoldiers();
            case "w" -> shootWalls();
            case "a" -> shootArchers();
        }
        displayEnemies();
    }

    private void shootSoldiers() {
        if (soldiers.size() == 0) {
            return;
        }
        Soldier frontSoldier = soldiers.get(0);
        frontSoldier.dealDamage();
        if (frontSoldier.isDead()) {
            soldiers.remove(frontSoldier);
        }
    }

    private void shootWalls() {
        if (walls.size() == 0) {
            return;
        }
        Wall frontWall = walls.get(0);
        frontWall.breakWall();
        if (frontWall.isDestroyed()) {
            walls.remove(frontWall);
        }
    }

    private void shootArchers() {
        if (archers.size() == 0) {
            return;
        }
        Archer frontArcher = archers.get(0);
        frontArcher.dealDamage();
        if (frontArcher.isDead()) {
            archers.remove(frontArcher);
        }
    }

    public void displayEnemies() {
        int maxRows = Math.max(soldiers.size(), Math.max(walls.size(), archers.size()));

        System.out.println("=================\n");

        for (int row = 0; row < maxRows; row++) {
            String soldierRow = (row < soldiers.size()) ? " X " : "  ";
            String wallRow = (row < walls.size()) ? " [] " : "  ";
            String archerRow = (row < archers.size()) ? " A " : " ";

            System.out.println(soldierRow + " " + wallRow + " " + archerRow);
        }

        System.out.println("\n=================");
    }

    private int enemiesRemaining() {
        return soldiers.size() + archers.size() + walls.size();
    }
}
