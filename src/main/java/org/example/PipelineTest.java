package org.example;

public class PipelineTest {

    public static void main( String[] args )
    {
        System.out.println( "Hello, this is Pipeline Tester." );

        System.out.println( "I go to run the local method test1()." );
        test1();

        System.out.println( "I go to run the looper() in class CounterLooper." );
        new CounterLopper().looper1();

        System.out.println( "I go to run the sayStringArray() in class Simplestringarray class." );
        new Simplestringarray().sayStringArray();

    }

    public static void test1() {
        System.out.println( "Hello, this is Pipeline test1." );
    }

    public static void test2() {

    }


}
