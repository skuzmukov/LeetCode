package dynamic.Task_303;

class NumArray {
    private int[] arr;
    public NumArray(int[] nums) {
        arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += nums[i];
            arr[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        return i == 0 ? arr[j] : arr[j] - arr[i - 1];
    }
}


/* Memory Limit Exceeded
class NumArray {
    private int[][] arr;
    public NumArray(int[] nums) {
        arr = new int[nums.length][nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = nums[i];
            for (int j = i + 1; j < arr.length; j++) {
                arr[i][j] = arr[i][j - 1] + nums[j];
            }
        }
    }

    public int sumRange(int i, int j) {
        return arr[i][j];
    }
}
* */
