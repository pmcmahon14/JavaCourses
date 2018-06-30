package com.patricksmcmahon;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32 (2^5), is also used as default var type
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        //byte has a width of 8 (2^3)
        byte myByteValue = -128;
        //casting below specifies byte on right side, otherwise treats as literal
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteTotal = " + myNewByteValue);

        //short has a width of 16 (2^4)
        short myShortValue = -32768;
        short myNewShortValue = (short) (myByteValue/2);

        //long has a width of 64
        long myLongvalue = 9_223_372_036_854_775_807L;
        long myNewLongValue = (long) (myByteValue/2);

        byte byteValue = 50;
        short shortValue = 14000;
        int intValue = 1_025_000_941;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

    }
}
