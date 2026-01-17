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
        String name = scanner.nextLine();
        System.out.println("press 1 for wizard, press 2 for assassin, or press 3 for warrior: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        player1 = new players(name, num1);
        System.out.print("Enter player two's name: ");
        name = scanner.nextLine();
        System.out.println("press 1 for wizard, press 2 for assassin, or press 3 for warrior: ");
        num1 = Integer.parseInt(scanner.nextLine());
        player1 = new players(name, num1);
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