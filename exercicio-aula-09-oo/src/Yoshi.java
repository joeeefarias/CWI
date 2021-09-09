public class Yoshi extends Personagem{

    private String nome;
    private int idade;
    private int frutas;
    private int velocidade;

    public  Yoshi(String n, int i){
        this.nome = n;
        this.idade = i;
        this.frutas = 0;
        this.velocidade = 10;
    }

    public void comerFruta(){
        this.frutas++;
        if (this.frutas % 2 == 0){
            this.velocidade *= 2;
        }
    }

    public int getVelocidade(){
        return velocidade;
    }
}
