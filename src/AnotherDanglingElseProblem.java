public class AnotherDanglingElseProblem {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        System.out.println("Output for a)");
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");

        System.out.println("Output for b)");
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }

        System.out.println("Output for d)");
        x = 5;
        y = 7;
        if (y == 8)
            if (x == 5) {
                System.out.println("@@@@@");
            }
            else {}
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");

    }
}
