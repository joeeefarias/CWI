import java.util.Random;

public class Jogo {

    private Personagem player01;
    private Personagem player02;

    public Jogo(Personagem p01, Personagem p02) {
        this.player01 = p01;
        this.player02 = p02;
    }


    public void apresentar(){

            System.out.println(">>>>>>>Player One<<<<<<<");
            this.player01.estado();
            System.out.println(">>>>>>>Player Two<<<<<<<");
            this.player02.estado();
    }

    public void jogar(){
        Random aleatorio = new Random();

        int moedasColetadasPlayer01 = aleatorio.nextInt(30);
        for (int i = 0; i < moedasColetadasPlayer01; i++){
            player01.pegarMoeda();
        }

        int moedasColetadasPlayer02 = aleatorio.nextInt(30);
        for (int i = 0; i < moedasColetadasPlayer02; i++){
            player02.pegarMoeda();
        }
        System.out.println("Player 01 coletou moedas " + moedasColetadasPlayer01 + " vezes.");
        System.out.println("Resultado Player 01: ");
        player01.estado();

        System.out.println("Player 02 coletou moedas " + moedasColetadasPlayer02 + " vezes.");
        System.out.println("Resultado Player 02: ");
        player02.estado();

    }
}
