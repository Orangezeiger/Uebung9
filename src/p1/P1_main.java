package p1;

import java.util.Arrays;
import java.util.Random;

public class P1_main {
    static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArray(10)));
        System.out.println(Arrays.toString(randomArray2(10)));
        System.out.println(Arrays.toString(randomArray3()));
        System.out.println(Arrays.toString(randomArray4(13)));
    }

    public static int[] randomArray(int x) {
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = rand.nextInt();
        }

        return arr;
    }

    public static int[] randomArray2(int x) {
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = rand.nextInt(x);
        }

        return arr;
    }

    public static int[] randomArray3() {
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = rand.nextInt(20) + 55;
        }

        return arr;
    }

    public static int[] randomArray4(int n) {
        int[] arr = new int[n + 1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(49) + 1;
            sum += arr[i];
        }

        arr[n] = sum / n;
        return arr;
    }
}
