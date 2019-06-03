package com.huangjie;

public class TestLabelContinue {
    //print prime number between 101 and 150
    public static void main(String[] args) {
        twoLevelLoopWithBreak();
        System.out.println();
        twoLevelLoopWithContinue();
    }

    //has bug to be fixed
    public static void twoLevelLoopWithBreak() {
        int j;
        for (int i = 2; i < 100; i++) {
            for (j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i / 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static void twoLevelLoopWithContinue() {
        outer:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }
    }

    public void add(int x, double y) {

    }

    public void add(double x, int y) {

    }
}
