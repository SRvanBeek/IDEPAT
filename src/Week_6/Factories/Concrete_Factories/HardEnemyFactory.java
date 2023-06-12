package Week_6.Factories.Concrete_Factories;

import Week_6.Enemies.Archer;
import Week_6.Enemies.Concrete_Enemies.HardArcher;
import Week_6.Enemies.Concrete_Enemies.HardSoldier;
import Week_6.Enemies.Concrete_Enemies.HardWall;
import Week_6.Enemies.Soldier;
import Week_6.Enemies.Wall;
import Week_6.Factories.EnemyFactory;

public class HardEnemyFactory implements EnemyFactory {
    @Override
    public Soldier spawnSoldier() {
        return new HardSoldier();
    }

    @Override
    public Wall spawnWall() {
        return new HardWall();
    }

    @Override
    public Archer spawnArcher() {
        return new HardArcher();
    }
}
