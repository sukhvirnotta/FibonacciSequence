package com.sparta.sn;

public class Fibonacci {
    public int getFib(int num) {
        if (num == 0) {
            return 0;
        }
        else {
            int[] fib = new int[num + 1];

            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i <= num; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            return fib[num];
        }
    }
}
