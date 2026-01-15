public class assassin extends Character {
    private int dmg;
    private boolean dodge;

    public assassin() {
        super();
    }

    @Override
    public String getAll() {
        return "Enter the following moves - option 1: 'jab', option 2: 'lunge', option 3: 'invis'";
    }
    @Override
    public int getDmg() {
        return dmg;
    }

    public boolean isDodge() {
        return dodge;
    }

    @Override
    public void moves(String attackType) {
        if (attackType.equals("jab")) {
            dmg = (int) (Math.random() * 15) + 10;
            if ((Math.random()*9) + 1 <= 2) {
                dodge = true;
            } else {
                dodge = false;
            }
        } else if (attackType.equals("lunge")) {
            dmg = (int) (Math.random() * 11) + 5;
            if ((Math.random()*9) + 1 < 5) {
                dodge = true;
            } else {
                dodge = false;
            }
        } else if (attackType.equals("invis")) {
            if ((Math.random()*9) + 1 <= 8) {
                dodge = true;
            } else {
                dmg = 0;
                dodge = false;
            }
        }
    }
}
