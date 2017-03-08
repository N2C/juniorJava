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
            System.out.println("Please enter name for player "+(1+Int)+" :");
            String name = scanner.nextLine();
            players.add(new Player(250, name));

            do{
                System.out.println("Will you add another one player ? (y/n)");
                ys = scanner.nextLine();
            }
            while(!(ys.equals("y") || ys.equals("n")));
            Int++;
        }



        while(toContinue(players)){
            for(Player player : players){
                System.out.println("It's player "+player.getPseudo()+" turn. You have now "+ player.getPv()+" pv.");
                do{
                    System.out.println("Will you hit (hit) sb or being hill (hill) ? (hit/hill)");
                    ys = scanner.nextLine();
                }
                while(!(ys.equals("hit") || ys.equals("hill")));

                if(ys.equals("hit")) {
                    System.out.println("Please enter the number of player you want to hit : (<" + players.size() + ")");
                    int id = scanner.nextInt();
                    int pv = players.get(id).getPv();
                    players.get(id).beSlugged();
                    System.out.println("Player " +players.get(id).getPseudo() + " has been slugged !");
                    System.out.println("Player " +players.get(id).getPseudo() + " has now !"+ players.get(id).getPv() + " pv ! (-"+(pv-players.get(id).getPv())+")");
                    players.set(id,  players.get(id));
                }
                if(ys.equals("hill")){
                    player.heal();
                    System.out.println("You have been healed and have now "+player.getPv()+" pv !");
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
