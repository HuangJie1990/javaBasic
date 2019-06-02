package com.huangjie;

import java.math.BigDecimal;

public class TestFloat {

    public static void main(String[] args) {
	// write your code here
        float a = 0.1f;
        float b = 1/10;
        if (a == b) {
            System.out.println("a equal to b");
        }else {
            System.out.println("a does no equal b");
        }

        float c = 4234432423f;
        float d = c+1;
        if (c == d) {
            System.out.println("c equal to c");
        }else {
            System.out.println("c does no equal c");
        }

        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println("1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 = "+bd);
        System.out.println("1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 = "+(1f-0.1f-0.1f-0.1f-0.1f-0.1f));
    }
}
