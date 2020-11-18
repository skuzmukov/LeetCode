package math;

//https://leetcode.com/problems/water-bottles/
public class Task_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        while (numBottles >= numExchange) {
            numBottles -= numExchange - 1;
            count += numExchange;
        }
        if (numBottles > 0) {
            count += numBottles;
        }

        return count;
    }
}

/*
*
* Пока количество бутылок больше чем numExchange
* Вычитаем из количества бутылок numExchange - 1
* В count добавляем numExchange
* Если количество бутылок  > 0 - в count добавляем оставшееся количество бутылок
* 
* */