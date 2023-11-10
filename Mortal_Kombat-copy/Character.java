import java.util.*;
/**
 * Write a description of class Character here.
 * heranca
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    private final String[] attacks = {"strong punch", "light punch", "strong kick", "light kick"};
    private final String[] defenses = {"block", "ko"};
    private final int SUFFER_ATTACK = 20;
    // instance variables - replace the example below with your own
    private String name;
    private String weapon;
    private String homeland;
    private String fightingStyles;
    private double height;
    private String[] strokes;
    private int energy = 100;
    
    /**
     * Constructor for objects of class Character
     */
    public Character(
        String name,
        String weapon,
        String homeland, 
        String fightingStyles,
        double height
    )
    {
        this.name = name;
        this.weapon = weapon;
        this.homeland = homeland;
        this.fightingStyles = fightingStyles;
        this.height = height;
    }
    
    public int getEnergy() {
        return this.energy;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getWeapon(){
        return this.weapon;
    }
    
    public String getHomeland(){
        return this.homeland;
    }
    
    public String getFightingStyles(){
        return this.fightingStyles;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder();
        
        str.append("----CHARACTER----\n");
        str.append("----Name:----\n");
        str.append(this.name + "\n");
        str.append("----Weapon:----\n");
        str.append(this.weapon + "\n");
        str.append("----Homeland:----\n");
        str.append(this.homeland + "\n");
        str.append("----Fighting Styles:----\n");
        str.append(this.fightingStyles + "\n");
        str.append("----Height:----\n");
        str.append(this.height + "\n");
        str.append("--------------\n");
        
        return str.toString();
    }
    
    public String selectAtack() {
        Random rand = new Random();
        int Index = rand.nextInt(this.attacks.length - 1);
        return this.attacks[Index];
    }
    
    public String generateAttack(){
        Random rand = new Random();
        int attackIndex =rand.nextInt(this.attacks.length - 1);
        System.out.println(attackIndex);
        return this.attacks[attackIndex];
    }
    
    public void sufferAttack() {
        this.energy = this.energy - this.SUFFER_ATTACK;
    }
}