/**
 * Created by nicol_000 on 02/03/2017.
 */
public class Player {
    private int pv;
    private String pseudo;

    public Player(int pv, String pseudo){
        this.pseudo = pseudo;
        this.pv = pv;
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
        this.pv += 20;
        return this;
    }

    public Player beSlugged(){
        this.pv += -20;
        return this;
    }

}
