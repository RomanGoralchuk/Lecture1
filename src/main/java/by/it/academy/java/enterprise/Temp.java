package by.it.academy.java.enterprise;

import java.util.Date;

public class Temp {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 20);
        int b = (int) (Math.random() * 10);
        Date date = new Date();
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println("Hello JAVA, the time is now:  " + date + " ...plus Calculator result: " + calculator.subtractInt(a ,
                                                                                                                 b));
    }
}
