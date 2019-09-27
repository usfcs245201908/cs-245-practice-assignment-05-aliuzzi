public class InsertionSort implements SortingAlgorithm {

    //    void swap(int[] a, int i, int j){
//        int temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//
//
//    }
    public void sort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while ((i > -1) && (a[i] > key)) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }
}
