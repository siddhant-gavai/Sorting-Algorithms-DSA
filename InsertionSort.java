public class InsertionSort {
    public static void main(String[] args) {
        int[] insertion = { 5, 4, 2, 3, 1 };
        int n = insertion.length;
        for (int i = 1; i < n; i++) {
            int curr = insertion[i];
            int prev = i - 1;
            while (prev >= 0 && insertion[prev] > curr) {
                insertion[prev + 1] = insertion[prev];
                prev--;

            }
            insertion[prev + 1] = curr;

        }
        for (int i : insertion) {
            System.out.print(i + " ");
        }
    }

}
