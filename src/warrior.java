public class warrior extends Character {
    private int dmg;
    private boolean rage;

    public warrior() {
        super();
    }

    @Override
    public String getAll() {
        return "Enter the following moves - option 1: 'axe', option 2: 'tank', option 3: 'berserker'";
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
        if (attackType.equals("axe")) {
            dmg = (int) (Math.random() * 21) + 10;
            if ((Math.random()*4) + 1 == 1) {
                rage = true;
            } else {
                rage = false;
            }
        } else if (attackType.equals("tank")) {
            dmg = (int) (Math.random() * 11) + 11;
            if ((Math.random()*4) + 1 == 1) {
                rage = true;
            } else {
                rage = false;
            }
        } else if (attackType.equals("berserker")) {
            if ((Math.random()*4) + 1 == 1) {
                rage = true;
            } else {
                rage = false;
            }
            }
        }
    }
