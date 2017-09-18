package sortingalgorithms;

/**
 *
 * @author K1ta
 */
public class Main {

    public static void main(String[] args) {
        int a[] = {5, 4, 6, 2, 1, -10, 8, 100, 3, -1, -1, 0};
        Algorithms s = new Algorithms();
        s.BubbleSort(a);
        print(a);
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

}
