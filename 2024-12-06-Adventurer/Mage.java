

public class Mage extends Adventurer{
    private int magic;
    private int maxMagic = 10;

    public Mage (String name){
        super(name);
        this.magic = 0;
    }
    public Mage (String name, int hp){
        super(name, hp);
        this.magic = 6;
    }

    public String getSpecialName(){
        return "Magic";
    }
  //accessor methods
    public int getSpecial(){
        return magic;
    }
    public void setSpecial(int n){
        magic = n;
    }
    public int getSpecialMax(){
        return maxMagic;
    }
  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
    public String attack(Adventurer other){
        other.applyDamage(3);
        this.magic--;
        return this.getName() + " attacked " + other.getName() + " with " + 5 + "  damage";
    }

    

  //heall or buff the target adventurer
    public String support(Adventurer other){
        other.restoreSpecial(2);
        this.magic--;
        return this.getName() + " healed " + other.getName() + " with a spell";
    }

  //heall or buff self
    public String support(){
        this.restoreSpecial(2);
        this.magic--;
        return this.getName() + " healed themselves with a spell";
    }

  //hurt or hinder the target adventurer, consume some special resource
    public  String specialAttack(Adventurer other){
        other.applyDamage(5);
        this.magic--;
        return this.getName() + " attacked  " + other.getName() + " with a super spell of "
+ 10 + " damage";    }

}