package sortingalgorithms;

/**
 *
 * @author K1ta
 */
public class Algorithms {

    public void QuickSort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int i = l, j = r;
        int pivot = (i + j) / 2;
        while (i < j) {
            while (i < pivot && a[i] <= a[pivot]) {
                i++;
            }
            while (j > pivot && a[j] >= a[pivot]) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                if (i == pivot) {
                    pivot = j;
                } else if (j == pivot) {
                    pivot = i;
                }
            }
        }
        QuickSort(a, l, pivot);
        QuickSort(a, pivot + 1, r);
    }

    public void BubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (i < j && a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void SelectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i; j < a.length; j++) {
                minIndex = (a[j] < a[minIndex]) ? j : minIndex;
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public void InsertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
            }
        }
    }
}
