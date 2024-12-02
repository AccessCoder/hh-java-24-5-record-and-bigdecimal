package org.example;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
      double a = 0.1;
      double b = 0.2;

        System.out.println(a+b);

        BigDecimal c = new BigDecimal("0.1");
        BigDecimal d = new BigDecimal("0.2");
        System.out.println(c.add(d));
        System.out.println(c.subtract(d));
        System.out.println(c.multiply(d));
        System.out.println(c.divide(d, RoundingMode.HALF_UP));

        BigDecimal e = new BigDecimal("2.63499999999");
        BigDecimal rounded = e.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Rouded = "+rounded);

        /**
         * BigDecimal.ROUND_UP = IMMER aufrunden!
         * BigDecimal.ROUND_DOWN = IMMER abrunden!
         * BigDecimal.ROUND_HALF_UP = Kfm. runden = ab x.5 = aufrunden!
         * BigDecimal.ROUND_HALF_DOWN = Kfm. runden = ab x.6 = aufrunden!
         *
         * BigDecimal.ROUND_CEILING = Positive Num = ROUND_UP | Negative Num = ROUND_DOWN
         * BigDecimal.ROUND_CEILING = Positive Num = ROUND_DOWN | Negative Num = ROUND_UP
         * BigDecimal.ROUND_HALF_EVEN = Jede Zahl bis x.4 = ROUND_DOWN |
         * x.5 oder höher = nächste num = gerade (2, 4, 6) = ROUND_UP sonst ROUND_DOWN
         */
    }
}