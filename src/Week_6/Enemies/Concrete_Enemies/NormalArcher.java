package Week_6.Enemies.Concrete_Enemies;

import Week_6.Enemies.Archer;

public class NormalArcher implements Archer {
    int health = 2;

    @Override
    public void dealDamage() {
        health--;
        System.out.println(health);
    }

    @Override
    public boolean isDead() {
        return health == 0;
    }
}
