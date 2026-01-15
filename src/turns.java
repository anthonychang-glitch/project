import java.util.Scanner;
public class turns {
    private players player1;
    private players player2;
    private int wins;
    private players currentTurn;
    private

    public void gameplay () {
        System.out.print("Enter player one's name: ");
    }

    private void playRound() {
        System.out.println();
        while (!player1.isDead() || !player2.isDead()) {
            System.out.println(enemy.getName() + "'s health: " + enemy.getHealth());
            System.out.print("--> press enter to attack");
            scan.nextLine();
            int playerAttack = currentTurn.attack();
            System.out.println(currentTurn.getName() + " attacks for " + playerAttack);
        }
        System.out.println(currentPlayer.getName() + " has slain the " + enemy.getName());
        int gold = enemy.dropGold();
        System.out.println("It left behind " + gold + " gold");
        currentPlayer.addGold(gold);
        System.out.println(currentPlayer.getName() + " collects it and now has " + currentPlayer.getGold() + " gold");
    }

    private boolean isGameOver() {
        return true;
    }

    private void swap() {
        if (currentTurn == player1) {
            currentTurn = player2;
        } else {
            currentTurn = player1;
        }
    }
}
