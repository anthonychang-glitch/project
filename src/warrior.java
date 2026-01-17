public class warrior extends Character {
    private int dmg;
    private boolean rage;

    public warrior() {
        super();
    }

    @Override
    public String getAll() {
        return "option 1: 'axe', option 2: 'tank', option 3: 'berserker'";
    }
    @Override
    public int getDmg() {
        return dmg;
    }

    public boolean isRage() {
        return rage;
    }

    @Override
    public void moves(String attackType) {
        int mult;
        if (rage) {
            mult = 2;
        } else {
            mult = 1;
        }
        if (attackType.equals("axe")) {
            dmg = (int) (Math.random() * 21) * mult + 10;
            if ((Math.random()*4) + 1 == 1) {
                rage = true;
            } else {
                rage = false;
            }
        } else if (attackType.equals("takedown")) {
            dmg = (int) (Math.random() * 11) * mult + 11;
            if ((Math.random()*4) + 1 == 1) {
                rage = true;
            } else {
                rage = false;
            }
        } else if (attackType.equals("berserker")) {
                rage = true;
            }
        }
    }
