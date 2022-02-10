public class test1 {

    static void printArr(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void swap(int a, int b) {
        int temp = a; // a -> 4, temp -> 4
        a = b; // b-> 5, a->5,
        b = temp;// b -> 4, temp -> 4

    }

    static void selectionSort(int[] a) {

        int len = a.length;
        for (int i = 0; i < len; i++) { // 11
            int min = i; // 0
            for (int j = i + 1; j < len; j++) {
                if (a[min] > a[j]) {
                    min = j;

                }

            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }

    }

    static void bubble(int[] a) {
        int len = a.length;

        for (int i = 0; i < len; i++) {
            System.out.print("a[i]" + a[i] + " ");
            for (int j = 0; j < len - 1 - i; j++) {

                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

                System.out.println();
            }
            printArr(a);
        }

    }

    public static void main(String[] args) {
        int[] a = { 11, 14, 26, 1, 2, 5, 4, 3, 8, 7 };
        // 1 2 6
        int len = a.length;

        // bubble(a);
        selectionSort(a);
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}
