package Aula03;

public class Aula03 {
    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2();
        c1.modelo = "BIC Cristal";
        c1.cor = "Preta";
        //c1.ponta = 0.5f; Não posso mudar esse atributo pois esta privado
        c1.carga = 90;
        //c1.tampada = false; Também não posso mudar, pois é privado
        c1.destampar();
        c1.rabiscar();
        /*Não posso mudar o atributo tampada, pois esta privado, porém
        os métodos tampar e destampar são publicos, portanto eu posso usar
        */
    }
}
