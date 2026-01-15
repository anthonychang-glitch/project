public class players {
    private String name;
    private Character character;
    private int health;

    public players (String name, int charNumber) {
        this.name = name;
        health = 100;
        character = generateCharacter(charNumber);
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
