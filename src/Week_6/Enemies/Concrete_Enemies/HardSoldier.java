package Week_6.Enemies.Concrete_Enemies;

import Week_6.Enemies.Soldier;

public class HardSoldier implements Soldier {
    double health = 6;

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
