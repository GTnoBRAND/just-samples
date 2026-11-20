package impl;

///*
/// An abstract class can have an inner abstract class with and abstract method
/// To implement the inner abstract method first outer abstract class should be extended
/// then inside that extending class another inner class can extend that inner abstract class
/// which lets us implement an abstract method overall*/

public abstract class Out {

    abstract class In{
        abstract void innerMethod();
    }
}

class Outer extends Out{
    class Inner extends In{

        @Override
        void innerMethod() {
            System.out.println("Inner method implemented;");
        }
    }

    static void main(String[] args){

        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        inner.innerMethod();
    }
}

