public class warrior extends Character {
    private int dmg;
    private boolean rage;

    public warrior() {
        super();
    }

    @Override
    public String getAll() {
        return "option 1: 'axe', option 2: 'takedown', option 3: 'berserker'";
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
            System.out.println("PLAYER IS RAGED!");
        } else {
            mult = 1;
        }
        if (attackType.equals("axe")) {
            dmg = (int) (Math.random() * 21) * mult + 10;
            if (rage) {
                rage = false;
            }
            rage = (Math.random() * 4) + 1 == 1;
        } else if (attackType.equals("takedown")) {
            dmg = (int) (Math.random() * 11) * mult + 11;
            if (rage) {
                rage = false;
            }
            rage = (Math.random() * 4) + 1 == 1;
        } else if (attackType.equals("berserker")) {
                rage = true;
            }
        }
    }
