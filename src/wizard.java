public class wizard {
    private int dmg;
    private boolean stat;
    private String all;

    public String getAll() {
        return "Enter the following moves - option 1: 'fireball', option 2: 'zap', option 3: 'boom'";
    }

    public int getDmg() {
        return dmg;
    }

    public boolean isStat() {
        return stat;
    }

    public void moves(String attackType) {
        if (attackType.equals("fireball")) {
            dmg = (int) (Math.random() * 21) + 10;
            if ((Math.random()*9) + 1 <= 3) {
                stat = true;
            } else {
                stat = false;
            }
        } else if (attackType.equals("zap")) {
            dmg = (int) (Math.random() * 11) + 8;
            if ((Math.random()*9) + 1 < 7) {
                stat = true;
            } else {
                stat = false;
            }
        } else if (attackType.equals("boom")) {
            if ((Math.random()*9) + 1 == 1) {
                dmg = 1000000;
            } else {
                dmg = 0;
                stat = false;
            }
        }
    }
}
