public class CharacterPatternShapeK {
    public static void main(String[] args) {

        for (int i = 6; i >= 1; i--) {
            char ch = 'A';
            int ascii = (int) ch;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ascii + " ");
                ascii++;
            }
            System.out.println();
        }

        for (int i = 1; i <= 6; i++) {
            char ch = 'A';
            int ascii = (int) ch;
            for (int j = i; j > 0; j--) {
                System.out.print((char) ascii + " ");
                ascii++;
            }
            System.out.println();
        }
    }
}
