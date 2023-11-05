package org.example;

public class EvenOddNumber {
    public boolean evenOddNumber(int n) {
        return  n % 2 == 0;
    }

    public boolean isInInterval(int n) {
        int intervalStart = 25;
        int intervalEnd = 100;
        return intervalStart <= n && n <= intervalEnd;
    }

}
