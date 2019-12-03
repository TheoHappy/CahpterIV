public class DanglingElseProblem {
    public static void main(String[] args) {
        int x = 9;
        int y = 11;

        System.out.println("Output for a) x=9, y=11");
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");

        System.out.println("Output for b) x=9, y=11");
        if (x < 10) {
            if (y > 10)
            System.out.println("*****");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }


        x = 11;
        y = 9;
        System.out.println("Output for a) x=11, y=9");
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");

        System.out.println("Output for b) x=11, y=9");
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }

    }
}
