package hello;

import java.util.*;

public class colletionsSortAndCompre {
    static  class Person{
        String name;
        int age;

        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString(){
            return "Person"+
                    "name= " + name +
                    "   age =" + age
                    ;
        }
    }
    public static void main(String[] args){

        List<Person> nameList = new ArrayList<>();
        nameList.add(new Person("Heo",28));
        nameList.add(new Person("Park",34));
        nameList.add(new Person("Kang",29));

        System.out.println("0----- 정렬 전 ------ " + nameList);

        Collections.sort(nameList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.age - p1.age;
            }
        });   // [Personname= Park   age =34, Personname= Kang   age =29, Personname= Heo   age =28]  내림차순

        System.out.println(nameList);


        Collections.sort(nameList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }
        });   // [Personname= Heo   age =28, Personname= Kang   age =29, Personname= Park   age =34]  오름 차순 

        System.out.println(nameList);

        Integer[] aa = {3,11,4,15,5};
        Arrays.sort(aa);
        // 3 , 4, 5 , 11, 15
        System.out.println(aa[2]);
    }
}
