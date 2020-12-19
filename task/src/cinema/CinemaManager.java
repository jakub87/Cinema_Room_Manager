package cinema;

import java.util.Scanner;

public class CinemaManager {
    private char tab[][];
    private int rows;
    private int cols;
    private Scanner scanner;
    private int totalIncome;
    private int purchaseTicket;
    private String percentage;
    private int currentIncome;

    public CinemaManager(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        tab = new char [rows][cols];
        scanner = new Scanner(System.in);
        purchaseTicket = 0;
        currentIncome = 0;
        percentage = "0.00";
        totalIncome = 0;
        initialize();
        setTotalIncome();
    }

    private void initialize() {
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                tab[i][j] = 'S';
            }
        }
    }

    public void display() {
        System.out.println("\nCinema:");
        System.out.print("  ");
        for (int i = 1; i <= cols ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < cols ; j++) {
                System.out.print(tab[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void markSeat(int row, int col) {
        tab[row][col] = 'B';
    }

    public void buyTicket() {
        int ticketPrice;
        int row, column;
        boolean end = true;
        do {
            System.out.println("Enter a row number:");
            row = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            column = scanner.nextInt();
            row--;
            column--;
            if ((row >= 0 && row < rows) && (column >= 0 && column < cols)) {
                if (tab[row][column] == 'B') {
                    System.out.println("That ticket has already been purchased!");
                } else {
                    markSeat(row, column);
                    ticketPrice = getTicketPrice(++row);
                purchaseTicket++;
                currentIncome += ticketPrice;
                System.out.println("Ticket price: $" + ticketPrice);
                    end = false;
                }
            } else {
                System.out.println("Wrong input!");
            }
        } while (end);
    }

    public String statistics() {
       setPercentage();
       return toString();
    }

    private int getTicketPrice(int row) {
        if (rows * cols < 60) {
            return 10;
        } else {
            int half = rows / 2;
            if (row > half) {
                return 8;
            } else {
                return 10;
            }
        }
    }

    private void setTotalIncome() {
        int rowIncome ;
        for (int i = 1; i <= rows; i++) {
            rowIncome = 0;
            rowIncome = (rowIncome + getTicketPrice(i)) * cols;
            totalIncome += rowIncome;
        }
    }

    public void setPercentage() {
        percentage = String.format("%1.2f",(purchaseTicket/(double)(rows*cols))*100).replace(",",".");
     }

    @Override
    public String toString() {
        return "Number of purchased tickets: " + purchaseTicket +
                "\nPercentage: " + percentage + "%"+
                "\nCurrent income: $" + currentIncome +
                "\nTotal income: $" + totalIncome;
    }
}
