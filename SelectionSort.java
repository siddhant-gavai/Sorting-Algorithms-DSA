public class SelectionSort {
    public static void SelectionSortAlgo(int[] selection) {
        int n = selection.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (selection[j] < selection[minIndex]) {
                    minIndex = j;

                }
            }
            // Swap the found minimum element with the first element
            int temp = selection[i];
            selection[i] = selection[minIndex];
            selection[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] selection = { 5, 4, 2, 3, 1 };
        SelectionSortAlgo(selection);
        for (int i : selection) {
            System.out.print(i + " ");
        }
    }
}