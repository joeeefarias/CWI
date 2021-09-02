public class Mario implements Acoes{

    private String nome;
    private int estamina;
    private int vidas;
    private int moedas;

    public Mario() {
        this.nome = "Super Mario";
        this.estamina = 100;
        this.vidas = 1;
        this.moedas = 0;
    }

    @Override
    public void estado() {
        System.out.println("------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Estamina: " + this.estamina);
        System.out.println("Vidas: " + this.vidas);
        System.out.println("Moedas: " + this.moedas);

    }

    @Override
    public void revigorar() {
        this.estamina = 100;
    }

    @Override
    public void morrer() {
        this.vidas --;
        this.estamina = 0;
        if (this.vidas < 0 ){
            this.vidas = 0;
        }else {
            revigorar();
        }

    }

    @Override
    public void maisMoedas() {
        this.moedas ++;
        if (this.moedas % 10 == 0){
            this.vidas ++;
        }
    }

}
