package io.github.nanquanu.sonarqubetest.cyclomatic;

public class CyclomaticComplexityFixedExampleRun {
    public static void main(String[] args) {
        System.out.println("CyclomaticComplexityFixedExample, lowCyclomatic = " +
                CyclomaticComplexityFixedExample.lowCyclomatic(5, 15, true, false, "A"));
    }
}

class CyclomaticComplexityFixedExample {

    static String lowCyclomatic(int x, int y, boolean flag1, boolean flag2, String mode) {
        if (x > 0) {
            return handlePositiveX(y, flag1, flag2, mode);
        } else if (x == 0) {
            return handleZeroX(flag1, flag2);
        } else {
            return "Path J";
        }
    }

    static String handlePositiveX(int y, boolean flag1, boolean flag2, String mode) {
        if (y > 10) {
            return handleYGreaterThan10(flag1, flag2);
        } else if (y == 10) {
            return handleYEquals10(mode);
        } else {
            return "Path G";
        }
    }

    static String handleYGreaterThan10(boolean flag1, boolean flag2) {
        if (flag1) {
            return "Path A";
        } else if (flag2) {
            return "Path B";
        } else {
            return "Path C";
        }
    }

    static String handleYEquals10(String mode) {
        if ("A".equals(mode)) {
            return "Path D";
        } else if ("B".equals(mode)) {
            return "Path E";
        } else {
            return "Path F";
        }
    }

    static String handleZeroX(boolean flag1, boolean flag2) {
        if (flag1 || flag2) {
            return "Path H";
        } else {
            return "Path I";
        }
    }
}
