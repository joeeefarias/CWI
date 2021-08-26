public class Exercicio {

    public static void main(String[] args) {
        Mario m1 = new Mario();

        m1.vidas = 9; //Atributo protegido
        m1.bigode = "Grosso e castanho escuro."; //Atributo publico
        m1.cabelo = "Curto, castanho com duas costeletas."; //Atributo protegido
        m1.macacao = "Azul com botões amarelos."; //Atributo publico
        //m1.camisa = "Vermelha."; //Atributo privado
        //m1.semFlor(); //Atributo privado
        m1.estado(); //Método publico
        m1.atirarBolaDeFogo(); //Método publico
    }

}
