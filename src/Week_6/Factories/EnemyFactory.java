package Week_6.Factories;

import Week_6.Enemies.Archer;
import Week_6.Enemies.Soldier;
import Week_6.Enemies.Wall;

public interface EnemyFactory {
    Soldier spawnSoldier();
    Wall spawnWall();
    Archer spawnArcher();
}
