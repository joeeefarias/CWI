public class Mario {

    public String nome;
    private int vida;
    private float altura;



    public void estado(AcaoEnum acao){
        if (acao.equals(AcaoEnum.DANO)){
            System.out.println("Sofreu dano! -10 de vida. Vida atua: " + this.getVida());
        }else if (acao.equals(AcaoEnum.FOOD)){
            System.out.println("Ganhou +5 de vida. Vida atual: " + this.getVida() );
        }else if(acao.equals(AcaoEnum.CRESCER)) {
            System.out.println("Cresceu!");
        }else{
            System.out.println("Nome: " + this.getNome());
            System.out.println("Vida : " + this.getVida());
            System.out.println("Altura: " + this.getAltura());
        }

    }

    public void Mario(String n, int v, float a) {
        this.nome = n;
        this.vida = v;
        this.altura = a;
    }
    public void dano(){
        int d = 10;
        if (this.getVida() >= 0){
            this.setVida(this.getVida() - d);
        }else{
            this.setVida(0);
        }
        this.estado(AcaoEnum.DANO);
    }
    public void food(){
        int f = 5;
        if (this.getVida() < 100){
            this.setVida(this.getVida() + f);
        }else{
            this.setVida(100);
        }
        this.estado(AcaoEnum.FOOD);
    }
    public void crescer(){
        setAltura(this.getAltura() * 2);
        this.estado(AcaoEnum.CRESCER);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int v) {
        this.vida = v;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }
}
