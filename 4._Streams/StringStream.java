import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hej", "Med", "Dig", "Hej", "");
        System.out.println(sentences);

        List<String> onlyWords = sentences.stream().filter(sen -> sen != "").collect(Collectors.toList());
        System.out.println(onlyWords);

        long vocabulary = sentences.stream().filter(sen -> sen.length() > 0).distinct().count();
        System.out.println(vocabulary);

        String sentence = sentences.parallelStream().filter(sen -> !(sen.equals(""))).map(sen -> sen + " ").collect(Collectors.joining()) + ".";
        System.out.println(sentence);

    }
}
