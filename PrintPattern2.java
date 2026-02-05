import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 0;

        while (size < 1 || size > 5) {
            System.out.print("Enter the size: ");
            size = in.nextInt();

            if (size < 1) {
                System.out.println("too small!");
            } else if (size > 5) {
                System.out.println("too big!");
            }
        }
        int totalRows = size * 2;
        for (int row = 1; row <= totalRows; row++) {
            int currentRow = row;
            if (row > size) {
                currentRow = totalRows - row + 1;
            }
            for (int col = 0; col < size; col++) {
                System.out.print(currentRow + col);
            }
            for (int col = size - 1; col >= 0; col--) {
                System.out.print(currentRow + col);
            }
            System.out.println();
        }
    }
}
