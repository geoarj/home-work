package com.sbrf.reboot;

import java.util.Arrays;

public class Calculator {

    public static double getAddition(double a, double b) {
        return a + b;
    }

    public static double getSubtraction(double a, double b) {
        return a - b;
    }

    public static double getMultiplication(double a, double b) {
        return a * b;
    }

    public static double getDivision(double a, double b) {
        return a / b;
    }

    public static double getPercentage(double obtainedScore, double totalScore) {
        return (obtainedScore * 100) / totalScore;
    }

    public static int getFahrenheitToCelsius(int fahrenheit) {
        return ((fahrenheit - 32) * 5) / 9;
    }

    public static double getMedian(int[] array, int size) {
        Arrays.sort(array);

        if (size % 2 != 0) {
            return array[size / 2];
        }

        return (double) (array[(size - 1) / 2] + array[size / 2]) / 2.0;
    }


}
