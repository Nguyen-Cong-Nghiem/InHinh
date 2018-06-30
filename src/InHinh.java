import java.util.Scanner;

public class InHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("4. Draw the triangle");
        System.out.println("Enter your choice: ");
        int choice;
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int j = 1; j <= 5; j++) {
                    for (int i = 1; i < 7; i++) {
                        System.out.print("*  ");
                    }
                    System.out.println();
                }

            case 2:

                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            case 3:
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            case 4:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }


//        }
//
//    }
        }
    }
}
