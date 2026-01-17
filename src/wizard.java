public class wizard extends Character {
    private int dmg;
    private boolean stat;

    public wizard() {
        super();
    }

    @Override
    public String getAll() {
        return "option 1: 'fireball', option 2: 'zap', option 3: 'boom'";
    }
    @Override
    public int getDmg() {
        return dmg;
    }

    public boolean isStat() {
        return stat;
    }

    @Override
    public void moves(String attackType) {
        stat = false;
        if (attackType.equals("fireball")) {
            dmg = (int) (Math.random() * 21) + 10;
            if ((Math.random()*9) + 1 <= 3) {
                stat = true;
                System.out.println("stunning enemy");
            } else {
                stat = false;
            }
        } else if (attackType.equals("zap")) {
            dmg = (int) (Math.random() * 11) + 8;
            if ((Math.random()*9) + 1 < 6) {
                stat = true;
                System.out.println("ELECTRO - FRIED: The enemy is stunned!");
            } else {
                stat = false;
            }
        } else if (attackType.equals("boom")) {
            if ((Math.random()*9) + 1 == 1) {
                dmg = 1000000;
                stat = false;
                System.out.println("KABOOM!");
            } else {
                dmg = 0;
                stat = false;
                System.out.println("oops that missed");
            }
        }
    }
}
