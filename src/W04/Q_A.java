package W04;

import java.util.Arrays;
import java.util.Scanner;

public class Q_A {

    public static void main(String[] args) {

        // Q: How to print Arrays?
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[][] twoDimArr = new int[][]{{1, 2, 3, 4}, {1, 2}};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(twoDimArr));

        // Q: How to get Input
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Your Input: " + a);

        // https://blog.jetbrains.com/idea/2020/05/debugger-basics-in-intellij-idea/

        
    }
}
