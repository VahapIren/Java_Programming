package day45_AbstractionContinue_Interface;

import day44_AbstractionContinue_Interface.Tesst;

public interface PropertiesOfInterface {
    int a=100; //final and static by default
    static int b=200; //final by default

    /*
    public PropertiesOfInterface(int a){
        this.a=a;
    }

    static {
        b=100;
    }

    public void method1(){

    }

     */
    public static void method2(){
        System.out.println("Static method");
    }
    public abstract void method3();

    public default void method4(){  //default for creating method with implementation
        System.out.println("Default method");
    }

    class Test implements PropertiesOfInterface {
        @Override
        public void method3() {

        }

        public static void main(String[] args) {
            new Test().method4();
            Tesst.method();
            PropertiesOfInterface.method2();
        }

    }



}
