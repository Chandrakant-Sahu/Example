import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        shift(arr);
        sc.close();
    }
    public static void shift(int[] arr) {
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
                temp = i;
            if(arr[i]<0){
                int swap = arr[i];
                arr[i] = arr[temp];
                arr[temp] = swap;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
