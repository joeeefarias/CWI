public class Mario {

    int vidas;
    String bigode;
    String macacao;
    String camisa;
    String cabelo;
    boolean florDefogo;


    void estado() {

        System.out.println("It's me, Mario!");
        System.out.println("Tenho " + this.vidas + " vidas atualmente.");
        System.out.println("Uso bigode " + this.bigode);
        System.out.println("Tenho cabelo " + this.cabelo);
        System.out.println("Tenho um macacão " + this.macacao);
        System.out.println("Uso com uma camisa " + this.camisa);


    }

    void atirarBolaDeFogo() {

        if (this.florDefogo == true){
            System.out.println("Tenho a flor de fogo agora posso atirar bolas de fogo!");
        } else {
            System.out.println("Estou sem a flor de fogo, não posso atirar bolas de fogo.");
        }
    }

    void comFlor() { this.florDefogo = true; }
    void semFlor() { this.florDefogo = false; }



}
