public class Main {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Move non-zero elements of X to the beginning
        int index = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[index] = X[i];
                index--;
            }
        }

        // Merge X and Y
        int i = index + 1; // Index in X for inserting elements from Y
        int j = 0; // Index in Y
        int k = 0; // Index in merged array

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k] = X[i];
                i++;
            } else {
                X[k] = Y[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of Y if any
        while (j < n) {
            X[k] = Y[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

        mergeArrays(X, Y);

        // Print merged array X
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i] + " ");
        }
    }
}