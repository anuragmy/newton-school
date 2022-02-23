public class test1 {
    
     // leetcode solution -
     // https://leetcode.com/problems/longest-continuous-increasing-subsequence/
    
     static int findLengthOfLCIS(int[] nums) {

        int anchor = 0;
        int result = 0;
        int len = nums.length;
        // loop through array
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i - 1] > nums[i]) {
                anchor = i;

            }
            result = Math.max(result, i - anchor + 1);
        }

        return result;
    }

    static void findMinOccourance(String s) {
        HashMap<Character, Integer> hashmap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i); // a
            if (hashmap.containsKey(element)) {
                hashmap.put(element, hashmap.get(element) + 1);
            }

            else {
                hashmap.put(element, 1);
            }

        }

        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i); // a
            if (hashmap.get(element) == 1) {
                System.out.println("this is the result: " + element);
                break;
            }
        }

    }

    static void findOccWithArray(String s) {

        // String s = "aaabbcccddeff";
        int[] array = new int[26];

        // creating our own hasmap
        for (char character : s.toCharArray()) {
            array[character - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i); // a
            if (array[element - 'a'] == 1) {
                System.out.println("this is the result: " + element);
                break;
            }
        }

        // c [3 ,1 , , ,, ...]
        // 0 1

    }


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
    
     static void insetionSort(int[] a) {
        int len = a.length;
        for (int i = 1; i < len; i++) {
            int j = i - 1; // j = 0, a[j] = 5
            int current = a[i]; // 2

            System.out.println(
                    " iteration: " + i + " a[j]:" + a[j] + " " + " j: " + j + " " + "current:" + current);

            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j--;
            }

            printArr(a);
            a[j + 1] = current;

        }

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

    static int partition(int[] a, int start, int end) {
        int pivot = a[end]; // last element // -> a[9] = 7
        int i = start - 1; // 0-1 -> -1
        // 11, 14, 26, 1, 2, 5, 4, 3, 8,
        for (int j = start; j < end; j++) {
            if (a[j] < pivot) { // j=8
                i++; // i = 0, i=1, i=2, i=3, i=4,
                // swap the elemnts
                int temp = a[j]; // a[i] interchnge a[j] -> 1, 14, 26, 11, 2, 5, 4, 3, 8,
                                 // 1, 2, 26, 11, 14, 5, 4, 3, 8,
                                 // 1, 2, 5, 11, 14, 26, 4, 3, 8,
                                 // 1, 2, 5, 4, 14, 26, 11, 3, 8,
                                 // 1, 2, 5, 4, 3, 26, 11, 14, 8,
                a[j] = a[i];
                a[i] = temp;

            }
        }
        // 1, 2, 5, 4, 3, 26, 11, 14, 8,
        // i =4
        i++;
        int temp = a[i];
        a[i] = pivot;
        a[end] = temp;
        // 1, 2, 5, 4, 3, 8, 11, 14, 26,
        return i; // 5

    }

    static void qiuckSort(int[] a, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(a, start, end);
            qiuckSort(a, start, pivotIndex - 1); // 1,1
            qiuckSort(a, pivotIndex + 1, end);// 5,9
            // 1, 2, 5, 4, 3, ||| 8, 11, 14, 26,

        }
    }

    static void merge(int[] a, int start, int mid, int end) {
        int[] c = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0; //

        while (i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                c[k++] = a[i++];

            } else {
                c[k++] = a[j++];
            }
        }

        while (i <= mid) {
            c[k++] = a[i++];
        }
        while (j <= end) {
            c[k++] = a[j++];
        }
        int len = c.length;
        for (int l = 0, m = start; l < len; l++, m++) {
            a[m] = c[l];
        }

    }

    static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);

        }
    }

    public static void main(String[] args) {
        int[] a = { 11, 14, 26, 1, 2, 5, 4, 3, 8, 7 };

        int len = a.length;

        // qiuckSort(a, 0, len - 1);
        mergeSort(a, 0, len - 1);
        printArr(a);
        String s = "aaabcccdeeff";
        findMinOccourance(s);
        findOccWithArray(s);
        
      
        // LinkedList<Integer> list = new LinkedList<>();

        // System.out.println(a[8]);

        Animals dog = new Animals("tom", 20);
        Animals cat = new Animals("jerry", 13);
        // dog.setName("tom");
        dog.getName();
        dog.getAge();
        System.out.println();
        // cat.setName("jerry");
        cat.getName();
        cat.getAge();
         // aaabbcddeff
         // {a:3, b:2, c:1, d:2, e:1, f:2} - hashmap

    }
}

