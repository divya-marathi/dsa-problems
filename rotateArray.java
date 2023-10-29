import java.util.*;

public class rotateArray {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 8, 9, 10 };
        int n = a.length;

        // take input for k number of steps
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        // for handling k if the (k>n)
        k = k % n;

        // for handle the negetive number
        if (k < 0) {
            k += n;
        }

        int start = 0;       
        reverse(a, start, n - k - 1);  //reverse first 3 numbers of array
        reverse(a, n - k, n - 1);   //reverse last 3 numbers of array
        reverse(a, 0, n - 1); // reverse array 

        // Print the rotated array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");   // 8,9,10,1,2,3
        }
    }

    public static void reverse(int a[], int start, int end) {

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}