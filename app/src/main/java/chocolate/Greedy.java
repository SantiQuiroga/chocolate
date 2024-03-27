package chocolate;

import java.util.Scanner;

public class Greedy {
    public static int maxPieces(int n) {
        int count = 0;
        int size = 1;
        while (n >= size) {
            n -= size;
            size++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(maxPieces(n));
    }
}
