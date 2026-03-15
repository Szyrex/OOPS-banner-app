public class UC7_OOPS {

    static class CharacterPattern {
        char letter;
        String[] pattern;

        CharacterPattern(char letter, String[] pattern){
            this.letter = letter;
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O',
                new String[]{
                        " *** ",
                        "*   *",
                        "*   *",
                        "*   *",
                        " *** "
                });

        CharacterPattern P = new CharacterPattern('P',
                new String[]{
                        "**** ",
                        "*   *",
                        "**** ",
                        "*    ",
                        "*    "
                });

        CharacterPattern S = new CharacterPattern('S',
                new String[]{
                        " *** ",
                        "*    ",
                        " *** ",
                        "    *",
                        " *** "
                });

        CharacterPattern[] word = {O,O,P,S};

        for(int i=0;i<5;i++){
            for(CharacterPattern cp : word){
                System.out.print(cp.pattern[i] + " ");
            }
            System.out.println();
        }
    }
}
