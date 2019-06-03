package com.huangjie;

public class TestRecursion {
    public static void main(String[] args) {
        long result;
        long t0 = System.nanoTime();
        result = factorial(30);
        long t1 = System.nanoTime();
        System.out.printf("递归结果是： %s，用时%s\n", result, t1 - t0);
        long t2 = System.nanoTime();
        result = loopFactorial(30);
        long t3 = System.nanoTime();
        System.out.printf("循环结果是： %s，用时%s\n", result, t3 - t2);
        long t4 = System.nanoTime();
        result = loopFactorial1(30);
        long t5 = System.nanoTime();
        System.out.printf("循环结果是： %s，用时%s\n", result, t5 - t4);
    }

    static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else return n * factorial(n - 1);
    }

    static long loopFactorial(int n) {
        long result = n;
        while (n > 1) {
            result *= --n;
        }
        return result;
    }

    static long loopFactorial1(int n)
    {
        long result = 1;
        while (n > 1) {
            result *= n * (n - 1);
            n -= 2;
        }
        return result;
    }
}
