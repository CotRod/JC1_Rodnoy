package lection07_OOP.Objects;

public class Zombie extends Enemy {
    public Zombie(int health){
        super(health);
    }
    public void uniqueAbility(){
        this.health =500;
    }
}
