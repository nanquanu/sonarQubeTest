package io.github.nanquanu.sonarqubetest.cyclomatic;

public class CyclomaticComplexityExamplesRun {
    public static void main(String[] args) {
        System.out.println("CyclomaticComplexityIssueExample, highCyclomatic = " +
                CyclomaticComplexityIssueExample.highCyclomatic(5, 15, true, false, "A"));
        System.out.println("CyclomaticComplexityFixedExample, lowCyclomatic = " +
                CyclomaticComplexityFixedExample.lowCyclomatic(5, 15, true, false, "A"));
    }
}

class CyclomaticComplexityIssueExample {
    static String highCyclomatic(int x, int y, boolean flag1, boolean flag2, String mode) {
        if (x > 0) {
            if (y > 10) {
                if (flag1) {
                    return "Path A";
                } else if (flag2) {
                    return "Path B";
                } else {
                    return "Path C";
                }
            } else if (y == 10) {
                if ("A".equals(mode)) {
                    return "Path D";
                } else if ("B".equals(mode)) {
                    return "Path E";
                } else {
                    return "Path F";
                }
            } else {
                return "Path G";
            }
        } else if (x == 0) {
            if (flag1 || flag2) {
                return "Path H";
            } else {
                return "Path I";
            }
        } else {
            return "Path J";
        }
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
