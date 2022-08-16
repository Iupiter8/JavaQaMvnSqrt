package ru.netology.sqr;



public class SqrtService {
    int count = 0;

    public int calcSqrt(int downLine, int upLine){

        for (int i = 10; i <= 99; i++) {

            if ((i * i >= downLine & i * i <= upLine)) {
                count = count + 1;
//
            }
        }
        return count;

    }
}
