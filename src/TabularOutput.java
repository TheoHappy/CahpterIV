public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("N\t10*N\t100*N\t1000*N");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("\n%d\t%d\t\t%d\t\t%d", i, 10 * i, 100 * i, 1000 * i);
        }

    }
}
