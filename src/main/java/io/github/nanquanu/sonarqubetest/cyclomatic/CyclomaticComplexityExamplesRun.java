package io.github.nanquanu.sonarqubetest.cyclomatic;

public class CyclomaticComplexityExamplesRun {
    public static void main(String[] args) {
        System.out.println("CyclomaticComplexityIssueExample, highCyclomatic = " +
                CyclomaticComplexityIssueExample.highCyclomatic(5, 15, true, false, "A"));
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


