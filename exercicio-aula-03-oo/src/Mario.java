public class Mario {

    protected int vidas;
    public String bigode;
    public String macacao;
    private String camisa;
    protected String cabelo;
    public boolean florDefogo;


    public void estado() {

        System.out.println("It's me, Mario!");
        System.out.println("Tenho " + this.vidas + " vidas atualmente.");
        System.out.println("Uso bigode " + this.bigode);
        System.out.println("Tenho cabelo " + this.cabelo);
        System.out.println("Tenho um macacão " + this.macacao);
        System.out.println("Uso com uma camisa " + this.camisa);


    }

    void atirarBolaDeFogo() {

        if (this.florDefogo){
            System.out.println("Tenho a flor de fogo agora posso atirar bolas de fogo!");
        } else {
            System.out.println("Estou sem a flor de fogo, não posso atirar bolas de fogo.");
        }
    }

    private void comFlor() {
        this.florDefogo = true;}
    public void semFlor() {
        this.florDefogo = false;}



}
