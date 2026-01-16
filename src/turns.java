import java.util.Scanner;
public class turns {
    private String name1;
    private String name2;
    private players test1;
    private players test2;
    private int wins;
    private players currentTurn;
    private players enemy;
    Scanner scanner = new Scanner(System.in);

    public void gameplay () {
        System.out.print("Enter player one's name: ");
        String test1 = scanner.nextLine();
        System.out.print("Enter player two's name: ");
        String test2 = scanner.nextLine();
        playRound();
    }

    private void playRound() {
        System.out.println("Player1 enter 1 for wizard, enter 2 for assassin, or enter 3 for warrior: ");
        int answer = Integer.parseInt(scanner.nextLine());
        players ex1 = new players(name1, answer);
        System.out.println("Player2 enter 1 for wizard, enter 2 for assassin, or enter 3 for warrior: ");
        answer = Integer.parseInt(scanner.nextLine());
        players ex2 = new players(name2, answer);
        currentTurn=ex1;
        enemy=ex2;
        while (!ex1.isDead() || !ex2.isDead()) {
            System.out.println("Type one of the following moves: " + currentTurn.getCharacter());
            String example = scanner.nextLine();
            int playerAttack = currentTurn.getCharacter().getDmg();
            System.out.println(currentTurn.getName() + " attacks for " + playerAttack);
            swap();
        }
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
        if (currentTurn == test1) {
            currentTurn = test2;
            enemy = test1;
        } else {
            currentTurn = test1;
            enemy = test2;
        }
    }
}
