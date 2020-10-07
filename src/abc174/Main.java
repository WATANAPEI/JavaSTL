package abc174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        problemC();
    }

    private static void problemA() {
        String in = new Scanner(System.in).nextLine();
        int temp = Integer.parseInt(in);
        if(temp >= 30) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static void problemB() {
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split("\\s");
        int N = Integer.parseInt(in[0]);
        int D = Integer.parseInt(in[1]);
        int[] X = new int[N];
        int[] Y = new int[N];

        for(int i = 0; i < N; i++) {
            in = sc.nextLine().split("\\s");
            X[i] = Integer.parseInt(in[0]);
            Y[i] = Integer.parseInt(in[1]);
        }
        int count = 0;
        for(int i =0;i<N;i++) {
            if(Math.sqrt(Math.pow(X[i], 2) + Math.pow(Y[i], 2)) <= D) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void problemC() {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int K = Integer.parseInt(in);


    }
}