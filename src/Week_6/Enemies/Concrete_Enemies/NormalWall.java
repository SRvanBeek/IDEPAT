package Week_6.Enemies.Concrete_Enemies;

import Week_6.Enemies.Wall;

public class NormalWall implements Wall {
    int armor = 5;

    @Override
    public void breakWall() {
        armor--;
        System.out.println(armor);
    }

    @Override
    public boolean isDestroyed() {
        return armor == 0;
    }
}
