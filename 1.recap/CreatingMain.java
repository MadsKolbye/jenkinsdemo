import java.util.ArrayList;

public class CreatingMain {
    public static void main(String[] args) {

        /*public static void wordCreation() {
            for (int i = 0; i < 5; i++){
                Word word = new Word("s");
            }
        }*/
        /*Word[] words = new Word[]{
                new Word("Bord"),
                new Word("BordBord"),
                new Word("Konglomerat"),
                new Word("Skrivebord"),
                new Word ("SkrivebordBord")
        };*/

    //Systemos.out.println(words);

        ArrayList<Word> wordsList = new ArrayList<>(){{
            add(new Word("Elefant"));
            add(new Word("Giraf"));
            add(new Word("Slange"));
            add(new Word("Bille"));
            add(new Word("Mus"));
        }};
        Systemos.out.println(wordsList);
    }
}