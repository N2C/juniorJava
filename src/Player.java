import java.util.Random;

/**
 * Created by nicol_000 on 02/03/2017.
 */


public class Player {
    private int pv;
    private String pseudo;
    private Random random;

    public Player(int pv, String pseudo){
        this.pseudo = pseudo;
        this.pv = pv;
        this.random = new Random();
    }

    public int getPv() {
        return pv;
    }

    public Player setPv(int pv) {
        this.pv = pv;
        return this;
    }

    public String getPseudo() {
        return pseudo;
    }

    public Player setPseudo(String pseudo) {
        this.pseudo = pseudo;
        return this;
    }

    public Player heal(){
        this.pv += this.random.nextInt(50);
        return this;
    }

    public Player beSlugged(){
        int r = this.random.nextInt(10);
        this.pv -= (r==5) ? 100 : this.random.nextInt(50);
        return this;
    }

}
