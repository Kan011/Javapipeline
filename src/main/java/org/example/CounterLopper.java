package org.example;

public class CounterLopper {
    public void looper1() {
        try {
            int counter = 1;
            while (counter <= 10) {
                System.out.println("I am number " + counter++);
                Thread.sleep(1000L);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }
}
