package Week_6.Enemies.Concrete_Enemies;

import Week_6.Enemies.Archer;

public class HardArcher implements Archer {
    double health = 4;

    @Override
    public void dealDamage() {
        health -= 0.5;
        System.out.println(health);
    }

    @Override
    public boolean isDead() {
        return health <= 0;
    }
}
