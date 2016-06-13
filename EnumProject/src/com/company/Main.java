package com.company;

enum normalEnum {
    basic, plus, premium;
}

enum CoffeeSize {
    // 8, 10, 20, 30 are passed to the constructor
    Tall(8), Grande(10), Venti(20), Trenti(30);
    private int ounces;

    //Setter by Enum by using the constructor - the coffee sizes are set the moment Coffee
    //Size is implemented
    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    //Getter
    public int GetOunces() {
        return ounces;
    }
}
class Coffee{
    CoffeeSize size;
    int order;
}

public class Main {
// Example where Enum is it's own class


    public static void main(String[] args) {

        // setting the size as the enum CoffeeSize = Grande; 
        // similar to setting the order to an integer = 1;
        Coffee drink1 = new Coffee();
        drink1.size = CoffeeSize.Grande;
        drink1.order = 1;
        Coffee drink2 = new Coffee();
        drink2.size = CoffeeSize.Trenti;



        // Calling drink.size will return the object size
        System.out.println(drink1.size + " " + drink1.size.GetOunces());

        for (CoffeeSize coffeeSize : CoffeeSize.values())
            System.out.println(coffeeSize + " " + coffeeSize.GetOunces());

        for (normalEnum nE : normalEnum.values())
            System.out.println(nE);
    }
}





