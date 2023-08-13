package hello;

@FunctionalInterface
interface Calculate{
    int plus(int a, int b);

    default int minus (int a, int b ){
        return a+b;
    }

    default int di(int a, int b){
        return a/b;
    }

    static int pluse(int a, int b){
        return a+b;
    }
}
public class Lamda{

    public static void main(String[] args){

        Calculate c =(a,b)->{return a+b;};
        System.out.println(c.di(1,3));

    }
}
