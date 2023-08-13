package liveStudy;

public class Main {

    public static void main(String[] args){

        Snake snake = new Snake();
        snake.print();

        // 이름 : 뱀
        // 다리 개수 : 0
        
    }

    public static void printAmina(Animal animal){
        System.out.println("이름 : " + animal.getName());
        System.out.println("다리 개 : " + animal.getLegs());
    }
}

