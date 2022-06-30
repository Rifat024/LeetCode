package Easy;

public class MargeTwoSortedArray {

    public void merge(int[] arr1, int m, int[] arr2, int n) {

        int[] result = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i = i + 1;
            } else {
                result[k] = arr2[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while (j < n) {
            result[k] = arr2[j];
            j = j + 1;
            k = k + 1;
        }
        while (i < m) {
            result[k] = arr1[i];
            i = i + 1;
            k = k + 1;
        }


        for (i = 0; i < result.length; i++)
            System.out.println(result[i]);

    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{4,0,0,0,0};
        int[] arr2 = new int[]{1,2,3,5,6};
        int m =1;
        int n = arr2.length;
        MargeTwoSortedArray margeTwoSortedArray = new MargeTwoSortedArray();
        margeTwoSortedArray.merge(arr1, m, arr2, n);
    }
}
