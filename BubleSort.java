public class BubleSort {

    public static void BubbleSortAlgo(int[] bubble) {
        int n = bubble.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;

                }
            }
        }

    }

    public static void main(String[] args) {
        int[] bubble = { 5, 4, 2, 3, 1 };
        BubbleSortAlgo(bubble);
        System.out.println("Sorted array: ");
        for (int i : bubble) {
            System.out.print(i + " ");
        }
    }
}