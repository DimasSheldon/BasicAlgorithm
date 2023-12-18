import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Be an architect of stairs!");
        Scanner in = new Scanner(System.in);

        System.out.print("Tell us how many steps would you like for your stair: ");
        int steps = in.nextInt();

        boolean stairIsBuilt = false;
        while (!stairIsBuilt) {

            if (steps > 100) {
                System.out.printf("Sorry, %d steps are too large and costly\n", steps);
                System.out.print("Tell us how many steps would you like for your stair: ");
                steps = in.nextInt();
            } else if (steps <= 0) {
                System.out.printf("Sorry, %d steps means no stairs will be made\n", steps);
                System.out.print("Tell us how many steps would you like for your stair: ");
                steps = in.nextInt();
            } else {
                createStair(steps);
                stairIsBuilt = true;
            }

        }
        in.close();
    }

    private static void createStair(int steps) {
        System.out.printf("Building stair with %d steps...\n", steps);
        StringBuilder tempStair = new StringBuilder("#");
        for (int i = 0; i < steps; i++) {
            System.out.printf("%" + steps + "s\n", tempStair.toString());
            tempStair.append("#");
        }
        System.out.println("Your stair is done!");
    }
}