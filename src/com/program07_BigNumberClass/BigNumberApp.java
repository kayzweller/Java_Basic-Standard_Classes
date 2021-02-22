package com.program07_BigNumberClass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
  public static void main(String[] args) {

    //. BIG INTEGER
    BigInteger bigInt1 = new BigInteger("10000000000000000000000000000000000000000000000000000000000069");
    BigInteger bigInt2 = new BigInteger("420000000000000000000000000000000000000000000000000000000069");
    BigInteger result1 = bigInt1.add(bigInt2);
    BigInteger result2 = bigInt1.subtract(bigInt2);
    BigInteger result3 = bigInt1.multiply(bigInt2);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);

    System.out.println();

    //. BIG DECIMAL
    BigDecimal bigIntA = new BigDecimal("100000000000000000000000000000000000000000000000000000000000.69");
    BigDecimal bigIntB = new BigDecimal("420000000000000000000000000000000000000000000000000000000.069");
    BigDecimal resultA = bigIntA.add(bigIntB);
    BigDecimal resultB = bigIntA.subtract(bigIntB);
    BigDecimal resultC = bigIntA.multiply(bigIntB);
    System.out.println(resultA);
    System.out.println(resultB);
    System.out.println(resultC);

  }
}
