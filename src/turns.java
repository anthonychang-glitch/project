import java.util.Scanner;
public class turns {
    private players player1;
    private players player2;
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
        player2 = new players(name, num1);
        playRound();
    }

    private void playRound() {
        boolean dodged = false;
        boolean check;
        currentTurn=player1;
        enemy=player2;
        String playerChoice = "";
        while (!player1.isDead() && !player2.isDead()) {
            if (!currentTurn.isStunned()) {
                int playerAttack = 0;
                System.out.println("-------------------------------------------------------");
                System.out.println("Type one of the following moves " + currentTurn.getName() + ": " + currentTurn.getCharacter().getAll());
                playerChoice = scanner.nextLine();
                currentTurn.getCharacter().moves(playerChoice);
                playerAttack = currentTurn.getCharacter().getDmg();
                System.out.println(currentTurn.getName() + " attacks for " + playerAttack);
                if (!dodged) {
                    enemy.dmgtake(playerAttack);
                    System.out.println(enemy.getName() + "'s health: " + enemy.getHealth());
                } else {
                    System.out.println("The enemy dodged!");
                    dodged = false;
                }
                if (currentTurn.getCharacter() instanceof assassin temp3) {
                    dodged = temp3.isDodge();
                }
                if (currentTurn.getCharacter() instanceof wizard temp) {
                    enemy.setStunned(temp.isStat());
                }
            } else {
                currentTurn.setStunned(true);
            }
            swap();
        }
        System.out.println(currentTurn.getName() + " has won!");
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