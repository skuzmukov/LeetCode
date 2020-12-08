package arrays;

public class Task_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        int len = flowerbed.length - 1;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == len || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                counter += 1;
            }
        }
        return counter >= n;
    }
}