import java.util.Scanner;

public class Pascal_Recursion {
    
    // calculates the factorial of num using recursion
    public int fact(int num) {
        if (num == 0 || num == 1) { // if num is 0 or 1
            return 1; // return 1. This is the base case
        }
        return num * fact(num - 1); // Reduce the num by 1 with each step
        // Example. fact(5) calls: 5 * fact(4) 
        // fact (4) = 4 * 6 = 24
        // fact (5) calls: 5 * 24 this returns 120
    }

    // Recursive method to calculate the binomial coefficient "n choose k"
    public static int nck(int n, int k) {
        if (k == 0 || k == n) {   // if k = 0 or k = n
            return 1; // return 1. Base case, stops recursion.
        }
        // return the sum of these 2 recursive calls
        return nck(n - 1, k - 1) + nck(n - 1, k); 
        // Eample nck(4,2) would call:
        // nck(3,1) + nck(3,2)
    }
        
    public static void main(String[] args) {
        // Prompt user for number of rows for Pascal's Triangle
        System.out.print("Enter number of rows: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();
        
        // Print Header with # of rows
        System.out.println("");
        System.out.printf("Pascal's triangle with %2d rows%n", rows);

        for (int n = 0; n < rows; n++) {  // outer loop for rows
            for (int j = 0; j < rows - n; j++) { // lower row # (n) = more spaces needed to create triangle
                System.out.print("  "); // Print two spaces each (before printing values)
            }
            
            for (int k = 0; k <= n; k++) { // inner loop for each position in row (normaly colums)
                System.out.printf("%5d", Pascal_Recursion.nck(n, k)); 
                // calls nck(n,k) and prints output for each position
                // %5d forces a minimum width of 5 characters for each number
            }
            System.out.println(); // Move to the next line after each row
        } 
    } 
}
