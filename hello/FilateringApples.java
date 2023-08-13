package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilateringApples {
    public static void main(String[] args){
        List<Apple> inventory = Arrays.asList(new Apple(80, "GREEN"),
                                                new Apple(155,"GREEN"),
                                                new Apple(1120,"RED"));

        for(Apple a : inventory){
            System.out.println(a.toString());
        }

        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());
        List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());

        System.out.println("Heavy     "+ heavyApples);
        System.out.println("GReen     "+ greenApples);

    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){

        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }
}
