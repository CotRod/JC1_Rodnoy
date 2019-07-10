package lection07_OOP.Objects;

public class Archer extends Hero {
    public Archer(String name, int health){
        super(name, health);
    }
    public void attackEnemy(Enemy obj){
        powerKick++;
        if (powerKick ==2) {
            powerKick =0;
            System.out.println("It's an accurate shot!!!");
            obj.takeDamage(300);
        }
        System.out.println("Archer "+this.getName()+" shoots a bow");
        obj.takeDamage(150);
    }
    public void uniqueAbility(Enemy obj){
        System.out.println("HEADSHOT!!!");
        obj.takeDamage(600);
    }
}
