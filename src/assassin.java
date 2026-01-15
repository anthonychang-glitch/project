public class assassin {
    private int dmg;
    private boolean dodge;

    public int getDmg() {
        return dmg;
    }

    public boolean isDodge() {
        return dodge;
    }

    public void moves(String attackType) {
        if (attackType.equals("hit")) {
            dmg = (int) (Math.random() * 15) + 10;
            if ((Math.random()*9) + 1 <= 2) {
                dodge = true;
            } else {
                dodge = false;
            }
        } else if (attackType.equals("jab")) {
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
