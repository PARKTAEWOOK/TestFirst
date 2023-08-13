package liveStudy;

public interface PrintalbeAnimal extends Animal, Comparable<PrintalbeAnimal> {

    default void print(){
        System.out.println("이름 : " + getName());
        System.out.println("다리 개수 : " + getLegs());
    }

    static String getDescription(){
        return "출력 기능이 있는 동물 인터페이스 ";
    }

    @Override
    default int compareTo(PrintalbeAnimal o){
        return getLegs() - o.getLegs();
    }
}
