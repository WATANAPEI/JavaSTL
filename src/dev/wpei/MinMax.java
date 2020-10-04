package dev.wpei;

public class MinMax {
    public static int myMin(int[] a) {
        heapify(a);
        for(int i=a.length-1; i>0;i--) {
            // the first element of array a can be ignored.
            // it has already become max element by heapify.
            a[i] = deleteMax(a, i+1);
        }
        return a[a.length - 1];
    }

    public static void heapify(int[] a) {
        for(int i = a.length/2-1; i >= 0; i--) {
            downMax(a, i);
        }
    }

    public static void downMax(int[] a, int i) {
        int child = 2 * i + 1;
        if(child >= a.length) return;
        if(child+1 < a.length && a[child] < a[child+1]) child = child+1;
        if(a[child] > a[i]) {
            swap(i, child, a);
            downMax(a, child);
        }
        return ;
    }

    public static int deleteMax(int[] a, int n) {
        int max = a[0];
        a[0] = a[a.length-1];
        downMax(a, n-1);
        return max;
    }

    public static void swap(int i, int j, int[] a) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
