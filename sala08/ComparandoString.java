package sala08;

public class ComparandoString {
    public static void main(String[] args) {
        String nome1 = "Marcelo";
        String nome2 = "Marcelo";
        String nome3 = new String("Marcelo");
        String res;
        String res2;
        String res3;
        res = (nome1==nome2)?"igual":"diferente";
        res2 = (nome1==nome3)?"igual":"diferente";
        res3 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}
