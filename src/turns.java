import java.util.Scanner;
public class turns {
    private players player1;
    private players player2;
    private int wins;
    private players currentTurn;
    private players enemy;
    Scanner scanner = new Scanner(System.in);

    public void gameplay () {
        System.out.print("Enter player one's name: ");
        String player1 = scanner.nextLine();
        System.out.print("Enter player two's name: ");
        String player2 = scanner.nextLine();
    }

    private void playRound() {
        System.out.println();
        while (!player1.isDead() || !player2.isDead()) {
            System.out.println(enemy.getName() + "'s health: " + enemy.getHealth());
            System.out.print("Type one of the following moves: " + currentTurn.getCharacter());
            int playerAttack = currentTurn.getCharacter().getDmg();
            System.out.println(currentTurn.getName() + " attacks for " + playerAttack);
        }
        System.out.println(currentTurn.getName() + " has slain the " + enemy.getName());
        System.out.println(currentTurn.getName() + " has won!");

        if (currentTurn.getCharacter() instanceof wizard) {
            wizard temp1 = (wizard) currentTurn.getCharacter();
            temp1.isStat();
        } else if (currentTurn.getCharacter() instanceof assassin) {
            assassin temp3 = (assassin) currentTurn.getCharacter();
            temp3.isDodge();
        } else if (currentTurn.getCharacter() instanceof warrior) {
            warrior temp3 = (warrior) currentTurn.getCharacter();
            temp3.isRage();
        }

    }

    private boolean isGameOver() {
        return true;
    }

    private void swap() {
        if (currentTurn == player1) {
            currentTurn = player2;
            enemy = player1;
        } else {
            currentTurn = player1;
            enemy = player2;
        }
    }
}
