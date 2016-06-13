package com.company;

import java.util.*;

/**
 * Created by jack.zheng on 6/10/2016.
 */

public class Animal {
    public static final double FavNumber = 1.6180;
    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    static Scanner userInput = new Scanner(System.in);

    public Animal() {
        numberOfAnimals++;
        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " + sumOfNumbers);
        System.out.println("Enter the name:");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getUniqueID() {
        return uniqueID;

    }

    public void setUniqueID(){
        long minNumber = 1;
        long maxNumber = 1000000;
        this.uniqueID = minNumber + (long)(Math.random() * (maxNumber - minNumber) + 1);
    }
    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }

    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar() {
        int randomNumber = (int)(Math.random() * 126 + 1);
        this.favoriteChar = (char) randomNumber;
        if(randomNumber == 32){
            System.out.println("Favorite Character set to space");
        } else{
            System.out.println("Some other Character");
        }
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }
}

