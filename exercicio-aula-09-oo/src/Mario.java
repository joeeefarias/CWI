public class Mario extends Personagem{

    private Yoshi yoshi;

    public void montarNoYoshi(Yoshi yoshi){
        this.yoshi = yoshi;
    }
    public void estaMontadoNoYoshi(){
        if (this.yoshi != null){
            System.out.println("Mario está montado no Yoshi");
        }else {
            System.out.println("Mario não está montado no Yoshi");
        }
    }
}
