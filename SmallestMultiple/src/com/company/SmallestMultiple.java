package com.company;

/**
 * Created by jack.zheng on 6/10/2016.
 */
public class SmallestMultiple {
    /*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
    int[][] multiples = new int[10][2];

    SmallestMultiple() {

        for (int i = 1; i <= 10; i++) {
            multiples[i - 1][0] = i;
            multiples[i - 1][1] = 1;
        }
        multiples[0][1] = 0;
    }


    public void RemoveMultiples(int LowerNumber, HigherNumber) {


        for (int i = 2*LowerNumber; i <= multiples.length; i += LowerNumber) {
            multiples[i - 1][1] = 0;
        }
    }

    public void PrintArray() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(multiples[i - 1][0]);
            System.out.print(":");
            System.out.println(multiples[i - 1][1]);
        }
    }
}


