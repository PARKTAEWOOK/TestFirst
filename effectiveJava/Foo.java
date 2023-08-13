package effectiveJava;

import java.util.EnumSet;

public class Foo {
    String namee;
    String address;

    // 1 . 이름을 가질 수 있다.
    public Foo(){

    }

    public Foo(String name){
        this.namee = name;
    }

    private static final Foo GOOD_NIGHT = new Foo();

    public static Foo withNmme( String name ){
        return new Foo(name);
    }

    public static Foo withAddress( String address ){
        Foo foo = new Foo();
        foo.address = address;

        return foo;
    }

    public static Foo getFoo(){
        return GOOD_NIGHT;
    }

    public static Foo getFoo(boolean flag ){
        return flag ? new Foo() : new BarFoo();
    }


    public static void main(String[] args){
        Foo foo1 = new Foo("TAEWOOK");

        Foo foo2 = Foo.withNmme("parkTaewook");

        Foo foo3 = Foo.getFoo();

        Foo foo4 = Foo.getFoo(false);

        EnumSet<Color> colors = EnumSet.allOf(Color.class);


    }

    static class BarFoo extends Foo {

    }

    enum Color {
        RED, BLUE, WHITE
    }

    public void doSomethign(){
        // TODO 청소를 한다
        // TODO 애들이랑 놀아준다.
        게임을한다();
    }

    public void doSomethingTomorrow(){
        // TODO 게임을 한다.
        게임을한다();
    }

    private void 게임을한다(){
            // TODO 게임을 한다.
        // TODO 잔다.
    }
}
