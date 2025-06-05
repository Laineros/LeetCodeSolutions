package Medium.BinarySearch;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] subArr : matrix) {
            int left = 0, right = subArr.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if(subArr[mid] == target) {
                    return true;
                } else if (subArr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
