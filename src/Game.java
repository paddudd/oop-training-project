import java.util.Scanner;

public class Game {
    public void start() {
        Player player = new Player();
        System.out.println("Welcome to ROGUE");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        player.setPlayerName(name);
        System.out.println("Your name is " + player.getPlayerName() + "?");
    }
}
