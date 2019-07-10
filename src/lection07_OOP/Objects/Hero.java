package lection07_OOP.Objects;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    int powerKick = 0;
    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    String getName() {
        return name;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public abstract void attackEnemy(Enemy obj);
     public abstract void uniqueAbility(Enemy obj);

    public boolean isAlive(){
        return health > 0;
    }
}
