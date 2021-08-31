public class Exericio {
    public static void main(String[] args) {

        Mario m1 = new Mario();

    m1.setNome("Super Mario");
    m1.setVida(100);
    m1.setAltura(1.60f);

    m1.estado(AcaoEnum.STATUS);
    m1.dano();
    m1.dano();
    m1.food();
    m1.food();
    m1.food();
    m1.food();
    m1.food();
    m1.crescer();
    m1.estado(AcaoEnum.STATUS);

    }
}
