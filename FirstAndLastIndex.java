import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int data = sc.nextInt();
        firstIndex(arr,data);
        lastIndex(arr,data);
        sc.close();
    }
    public static void firstIndex(int[] arr,int data) {
        int l = 0;
        int h = arr.length - 1;
        int fi = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (data > arr[m]) {
                l = m + 1;

            } else if (data < arr[m]) {
                h = m - 1;
            } else {
                fi = m;
                h = m - 1;
            }
        }
        System.out.println(fi);
    }
    public static void lastIndex(int[] arr,int data) {
        int l = 0;
        int h = arr.length - 1;
        int li = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (data > arr[m]) {
                l = m + 1;

            } else if (data < arr[m]) {
                h = m - 1;
            } else {
                li = m;
                l = m + 1;
            }
        }
        System.out.println(li);
    }
}
