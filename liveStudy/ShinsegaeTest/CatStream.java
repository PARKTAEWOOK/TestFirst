package liveStudy.ShinsegaeTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CatStream {

    public static class Cat{
        public Cat(int number, String name){
            this.number = number;
            this.name = name;
        }

        private int number;
        private String name;

        public int getNumber(){
            return number;
        }

        public String getName(){
            return name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "number=" + number +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] arg){
        List<Cat> cats = Arrays.asList(
                new Cat(2,"aaa"),
                new Cat(3,"momo"),
                new Cat(1,"mina"),
                new Cat(4,"zina")
        );

       List<Cat> cats1 =  cats.stream().sorted(Comparator.comparing(Cat::getNumber).thenComparing(Cat::getName)).collect(Collectors.toList());

       System.out.println(cats1.get(0));
       System.out.println(cats.get(0));
    }
}
