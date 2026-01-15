public class players {
    private String name;
    private int character;
    public players (String name, int character) {
        this.name = name;
        this.character = character;
    }

    public String getName() {
        return name;

    }
    public String getCharacter() {
        String option = "";
        if (character == 1) {
            option = "wizard";
            return option;
        } else if (character == 2) {
            option = "assassin";
        } else {
            option = "warrior";
            return option;
        }
        option = "not selected";
        return option;
    }
}
