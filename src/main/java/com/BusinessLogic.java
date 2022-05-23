package com;

public class BusinessLogic {
    public int calculateSumArray(int[] arrayNumber){
        int sum = 0;
        for(int number: arrayNumber){
            sum = sum + number;
        }
        return sum;
    }
}
