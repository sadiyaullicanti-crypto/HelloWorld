public class OOPSBannerAppInnerClass {

    static class CharacterPattern {
        String[] pattern;

        CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern(new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern(new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        CharacterPattern[] word = {O, O, P, S};

        for (int i = 0; i < 5; i++) {
            for (CharacterPattern ch : word) {
                System.out.print(ch.pattern[i] + "  ");
            }
            System.out.println();
        }
    }
}
