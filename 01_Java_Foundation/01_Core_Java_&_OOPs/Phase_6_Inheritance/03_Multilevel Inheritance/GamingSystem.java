/*Problem 3 of 8 — Gaming Domain
GameCharacter → Warrior → Knight

Now we'll change the focus from fields to methods across multiple inheritance levels.

The main question for this problem is:

If a method belongs to the grandparent, can the final child call it? And can a middle-level method use a grandparent field?

Yes.

Problem Statement

Build a simple gaming system with this hierarchy:

GameCharacter
      ↓
   Warrior
      ↓
    Knight
Level 1 — GameCharacter

Fields:

protected String characterName;
protected int health;

Method:

void showCharacterStatus()
Level 2 — Warrior

Warrior extends GameCharacter.

Field:

protected int attackPower;

Method:

void performAttack()

This method should use the inherited characterName.

Level 3 — Knight

Knight extends Warrior.

Fields:

int armorStrength;
int bonusDamage;

Method:

void performSpecialAttack()

Calculate:

Total Special Damage = attackPower + bonusDamage */
class GameCharacter{
    protected String characterName;
    protected int health;

    void showCharacterStatus(){
        System.out.println("Character Name:-" + characterName);
        System.out.println("Health:-" + health);
    }
}

class Warrior extends GameCharacter{
    protected int attackPower;

    void performAttack(){
        System.out.println(characterName +" performs a normal attack.");
        System.out.println("Attack Damage: " + attackPower);
    }
}

class Knight extends Warrior{
    int armorStrength;
    int bonusDamage;

    void performSpecialAttack(){
        int totalDamage = attackPower + bonusDamage;

        System.out.println(characterName + " performs a Knight Special Attack!");
        System.out.println("Base Attack Power: " + attackPower);
        System.out.println("Bonus Damage: " + bonusDamage);
        System.out.println("Total Special Damage: " + totalDamage);
        System.out.println("Armor Strength: " + armorStrength);
    }
}
public class GamingSystem {
    public static void main(String[] args) {

        Knight knight = new Knight();

        knight.characterName = "Arthur";
        knight.health = 100;
        knight.attackPower = 40;
        knight.armorStrength = 70;
        knight.bonusDamage = 25;

        knight.showCharacterStatus();
        knight.performAttack();
        knight.performSpecialAttack();
    }
}