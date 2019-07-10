package lection07_OOP.Objects;

public class Enemy implements Mortal{
    int health;
    String name = this.getClass().getSimpleName();
    int uniqueKick;

    public Enemy(int health){
        this.health = health;
    }

    public String getName(){
        return name;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public int attackHero(){
        System.out.println("Hero was attacked");
        uniqueKick++;
        if (uniqueKick==5){
            uniqueKick = 0;
            System.out.println("Aaarrrghhh");
            return 300;
        }
        return 100;
    }
    public void uniqueAbility(){
        this.health =500;
    }

    @Override
    public boolean isAlive() {
        if(health>0){
            return true;
        } else {
            return false;
        }
    }
}
