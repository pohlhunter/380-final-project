package race;

import main.GameCharacter;
import main.GameCharacter.Size;

public abstract class Race 
{    
    private String raceName;

    // These are just race modifiers
    // These should be added onto the character stats
    // Store 0 if there is no race modifier
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;

    private Size size;

    public Race(String race, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.raceName = race;

        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public String getRaceName() {
        return raceName;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setStrength(int i) {
        strength = i;
    }

    public void setDexterity(int i) {
        dexterity = i;
    }

    public void setConstitution(int i) {
        constitution = i;
    }

    public void setIntelligence(int i) {
        intelligence = i;
    }

    public void setWisdom(int i) {
        wisdom = i;
    }

    public void setCharisma(int i) {
        charisma = i;
    }
}
