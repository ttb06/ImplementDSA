public class SelectionSort {
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i ++) {
            int min = i;
            for (int j = i + 1; j < n; j ++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Integer[] a = {9, 5, 1, 4, 3};
        SelectionSort.sort(a);
        for (Integer num : a) {
            System.out.println(num);
        }
    }
}
