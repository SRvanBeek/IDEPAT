package Week_6.Enemies.Concrete_Enemies;

import Week_6.Enemies.Soldier;

public class NormalSoldier implements Soldier {
    int health = 3;

    @Override
    public void dealDamage() {
        health--;
        System.out.println(health);
    }

    @Override
    public boolean isDead() {
        if (health == 0) {
            return true;
        }
        return false;
    }
}
