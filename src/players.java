public class players {
    private String name;
    private Character character;
    private int health;
    private boolean stunned;

    public players (String name, int charNumber) {
        this.name = name;
        health = 100;
        character = generateCharacter(charNumber);
    }

    public boolean isStunned() {
        return stunned;
    }

    public void setStunned(boolean stunned) {
        this.stunned = stunned;
    }

    public int getHealth() {
        return health;
    }

    public boolean isDead() {
        return health == 0;
    }

    public String getName() {
        return name;
    }

    public Character getCharacter() {
        return character;
    }

    public void dmgtake (int takeDamage) {
        health -= takeDamage;
        if(health <= 0) {
            health = 0;
        }
    }

    private Character generateCharacter(int characterChoice) {
        Character option = null;
        if (characterChoice == 1) {
            option = new wizard();
        } else if (characterChoice == 2) {
            option = new assassin();
        } else {
            option = new warrior();
        }
        return option;
    }
}
