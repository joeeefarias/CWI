public class Mario {


    private String nome;
    private int idade;
    private int stamina;
    private float altura;

    public Mario(String n, int i, int s, float a){
        this.nome = n;
        this.idade = i;
        this.stamina = s;
        this.altura = a;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public int getStamina(){
        return this.stamina;
    }
    public void setStamina(int s){
        this.stamina = s;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float a){
        this.altura = a;
    }

    public void estado() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Estamina: " + this.stamina);
        System.out.println("Altura: " + this.altura);
    }

}
