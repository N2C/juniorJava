import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in the best game ever!");

        ArrayList<Player> players = new ArrayList();

        int Int = 0;
        String ys = "y";
        while(ys.equals("y")){
            System.out.println("Please enter name for player "+Int+" :");
            String name = scanner.nextLine();
            players.add(new Player(250, name));

            System.out.println("Will you add another one player ? (y/n)");
            ys = scanner.nextLine();
            Int++;
        }



        while(toContinue(players)){
            for(int i = 0; i < players.size() ; i++){
                System.out.println("It's player "+players.get(i).getPseudo()+" turn. Will you hit (hit) sb or being hill (hill) ? (hit/hill)");
                ys = scanner.nextLine();

                if(ys.equals("hit")) {
                    System.out.println("Please enter the number of player you want to hit : (<" + players.size() + ")");
                    int id = scanner.nextInt();
                    Player player = players.get(id);
                    player.beSlugged();
                    System.out.println("Player " +players.get(id).getPseudo() + "has been slugged and has now " + player.getPv() + " pv !");
                    players.set(id, player);
                }
                if(ys.equals("hill")){

                    Player player = players.get(i);
                    player.heal();
                    System.out.println("You have been healded and have now "+player.getPv()+" pv !");

                }

            }
        }

        System.out.println("Party has stopped, scores :");

        for(int i = 0; i < players.size() ; i++){
            System.out.println("Player "+i+" : "+players.get(i).getPv());
        }
    }

    private static boolean toContinue(ArrayList<Player> players){
        for(Player player : players){
            if(player.getPv() <= 0) return false;
        }
        return true;
    }


}
