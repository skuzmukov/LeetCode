package arrays.Task_733;
//
public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) { return image;}
        fill(image[sr][sc], newColor, image, sr, sc);
        return image;
    }

    void fill(int oldValue, int newValue, int[][] image, int i, int j) {
        if (image[i][j] != oldValue) { return; }
        image[i][j] = newValue;
        if (i - 1 >= 0) { fill(oldValue, newValue, image, i - 1, j); }
        if (i + 1 < image.length) { fill(oldValue, newValue, image, i + 1, j); }
        if (j - 1 >= 0) { fill(oldValue, newValue, image, i, j - 1); }
        if (j + 1 < image[0].length) { fill(oldValue, newValue, image, i, j + 1); }
    }
}