import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n + 1];
        arr[0] = 0;

        for(int i = 0 ; i < n; i++){
            arr[i+1] = arr[i] + sc.nextInt();
        }
        int[] sum = new int[n-m+1];
        for(int i =0 ; i <= n-m; i++){
            sum[i] = arr[ i + m] - arr[i];
        }
        Arrays.sort(sum);
        System.out.println(sum[sum.length-1]);
    }
}