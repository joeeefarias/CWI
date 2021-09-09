public class Exercicio {
    public static void main(String[] args) {

        Mario m = new Mario(); // Criando Mario

        Yoshi y = new Yoshi("Yoshi", 25); // Criando Yoshi

        Luigi l = new Luigi(); // Criando Luigi

        // Passando os atributos do Mario
        m.setNome("Mario");
        m.setAltura(1.60f);

        // Passando os atibutos do Luigi
        l.setNome("Luigi");
        l.setAltura(1.80f);

        // Teste do Mario montar no Yoshi
        m.estaMontadoNoYoshi();
        m.montarNoYoshi(y);
        m.estaMontadoNoYoshi();

        // Teste ded voo do Luigi

        l.voar();

        // Teste de aumento de velocidade do yoshi
        y.comerFruta();
        System.out.println("Velocidade atual do Yoshi: " + y.getVelocidade());
        y.comerFruta();
        System.out.println("Velocidade atual do Yoshi: " + y.getVelocidade());
        y.comerFruta();
        y.comerFruta();
        System.out.println("Velocidade atual do Yoshi: " + y.getVelocidade());
    }
}
