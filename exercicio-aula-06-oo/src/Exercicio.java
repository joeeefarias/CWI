public class Exercicio {
    public static void main(String[] args) {
        Mario m = new Mario();

        System.out.println("Teste de ganho de moedas");
        m.estado();
        m.maisMoedas();
        m.estado();
        System.out.println("Teste de ganho de vida");
        m.maisMoedas();
        m.maisMoedas();
        m.maisMoedas();
        m.maisMoedas();
        m.maisMoedas();
        m.maisMoedas();
        m.maisMoedas();
        m.maisMoedas();
        m.maisMoedas();
        m.estado();
        System.out.println("Teste de perda de vida");
        m.morrer();
        m.estado();
        m.morrer();
        m.estado();
    }
}
