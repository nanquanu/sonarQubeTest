public class DuplicateCode {
    
    public void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void printLetters() {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        DuplicateCode p = new DuplicateCode();
        p.printNumbers();
        p.printLetters();
    }
}
