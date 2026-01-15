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
            wizard temp = (wizard) currentTurn.getCharacter();
            temp.isStat();
        } else if ( ) {

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
