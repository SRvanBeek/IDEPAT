package Week_6.Enemies.Concrete_Enemies;

import Week_6.Enemies.Wall;

public class HardWall implements Wall {
    double armor = 10;

    @Override
    public void breakWall() {
        armor-= 0.5;
        System.out.println(armor);
    }

    @Override
    public boolean isDestroyed() {
        return armor <= 0;
    }
}
