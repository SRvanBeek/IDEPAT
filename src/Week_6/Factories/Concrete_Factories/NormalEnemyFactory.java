package Week_6.Factories.Concrete_Factories;

import Week_6.Enemies.Archer;
import Week_6.Enemies.Concrete_Enemies.NormalArcher;
import Week_6.Enemies.Concrete_Enemies.NormalSoldier;
import Week_6.Enemies.Concrete_Enemies.NormalWall;
import Week_6.Enemies.Soldier;
import Week_6.Enemies.Wall;
import Week_6.Factories.EnemyFactory;

public class NormalEnemyFactory implements EnemyFactory {
    @Override
    public Soldier spawnSoldier() {
        return new NormalSoldier();
    }

    @Override
    public Wall spawnWall() {
        return new NormalWall();
    }

    @Override
    public Archer spawnArcher() {
        return new NormalArcher();
    }
}
