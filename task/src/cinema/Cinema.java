package cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row;");
        int cols = scanner.nextInt();

        CinemaManager cinemaManager = new CinemaManager(rows, cols);
        int select;
        do {
            Menu.main();
            select = scanner.nextInt();
            if (select == 1) {
                cinemaManager.display();
            } else if (select == 2) {
                cinemaManager.buyTicket();
            } else if (select == 3) {
                System.out.println(cinemaManager.statistics());
            }
        }while(select != 0);
    }
}