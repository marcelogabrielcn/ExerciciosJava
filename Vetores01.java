public class Vetores01 {
    public static void main(String[] args) {
        int[] x = new int[5];
        for (int c = 0; c < x.length; c++) {
            x[c] = (c+1)*2;
        }
        for (int i : x) {
            System.out.print(i + " ");
        }
    }
}
