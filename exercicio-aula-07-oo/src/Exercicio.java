public class Exercicio {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Mario",100, 1.70f, 2, 30);
        Personagem p2 = new Personagem("Luigi", 80, 1.90f, 3, 50);

        p1.estado();
        p2.estado();
        p1.pular();
        p2.pular();
    }
}
