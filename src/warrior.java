public class warrior {
    private int dmg;
    private boolean rage;

    public int getDmg() {
        return dmg;
    }

    public boolean isRage() {
        return rage;
    }

    public void moves(String attackType) {
        if (attackType.equals("axe")) {
            dmg = (int) (Math.random() * 21) + 10;
            if ((Math.random()*9) + 1 <= 3) {
                rage = true;
            } else {
                rage = false;
            }
        } else if (attackType.equals("zap")) {
            dmg = (int) (Math.random() * 11) + 11;
        } else if (attackType.equals("berserker")) {
            }
        }
    }
