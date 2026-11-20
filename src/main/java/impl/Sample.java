package impl;
/*An abstract class may, not to implement all the abstract methods when serving as child class*/
public abstract class Sample {
    abstract void firstMethod();
    abstract void secondMethod();
    abstract void ThirdMethod();
}

abstract class FirstChild extends Sample{
    @Override
    void firstMethod() {
        for (int i = 0; i < 9; i++) {
            System.out.println(i);;
        };
    }

}

class SecondChild extends FirstChild{
    @Override
    void secondMethod() {
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
        }
    }

    @Override
    void ThirdMethod() {
        for (int i = 0; i < 20; i++) {
            System.out.println(20);
        }
    }
}
