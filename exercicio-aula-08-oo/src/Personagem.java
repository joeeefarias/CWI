public class Personagem {

    private String nome;
    private int estamina;
    private float altura;
    private int vidas;
    private int moedas;

    public Personagem(String n, int e, float a, int v, int m){
        this.nome = n;
        this.estamina = e;
        this.altura = a;
        this.vidas = v;
        this.moedas = m;
    }

    public void estado(){
        System.out.println("*****************************");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Estamina: " + this.getEstamina());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Vidas: " + this.getAltura());
        System.out.println("Moedas: " + this.getMoedas());
    }
    public void revigorar(){
        this.estamina = 100;
    }

    public void morrer(){
        this.vidas --;
        this.estamina = 0;
        if (this.vidas < 0){
            this.vidas = 0;
        }else {
            revigorar();
        }
    }

    public void pegarMoeda(){
        this.moedas ++;
        if (this.moedas % 10 == 0){
            this.vidas ++;
        }
    }

    public void pular(){
        if (this.getNome().equals("Mario")){
            System.out.println("Altura do salto: " + this.getAltura() / 2);
        }else if (this.getNome().equals("Luigi")){
            System.out.println("Altura do salto: " + this.getAltura() * 2);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getEstamina(){
        return estamina;
    }

    public void setEstamina(int e){
        this.estamina = e;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int v) {
        this.vidas = v;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int m) {
        this.moedas = m;
    }
}
