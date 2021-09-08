public class Exercicio {
    public static void main(String[] args) {

        Personagem p [] = new Personagem[2];

        p[0] = new Personagem("Mario", 100, 1.60f, 2, 0);
        p[1] = new Personagem("Luigi", 100, 1.80f, 2, 0);


        Jogo F1 = new Jogo(p[0], p[1]);
        F1.apresentar();
        F1.jogar();

    }
}
