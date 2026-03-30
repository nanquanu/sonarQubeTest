public class CyclomaticComplexityExample {
    public static void highCyclomatic(int x, int y, boolean flag1, boolean flag2, String mode) {
        if (x > 0) {
            if (y > 10) {
                if (flag1) {
                    System.out.println("Path A");
                } else if (flag2) {
                    System.out.println("Path B");
                } else {
                    System.out.println("Path C");
                }
            } else if (y == 10) {
                if ("A".equals(mode)) {
                    System.out.println("Path D");
                } else if ("B".equals(mode)) {
                    System.out.println("Path E");
                } else {
                    System.out.println("Path F");
                }
            } else {
                System.out.println("Path G");
            }
        } else if (x == 0) {
            if (flag1 || flag2) {
                System.out.println("Path H");
            } else {
                System.out.println("Path I");
            }
        } else {
            System.out.println("Path J");
        }
    }

    public static void main(String[] args) {
        highCyclomatic(5, 15, true, false, "A");
    }
}

