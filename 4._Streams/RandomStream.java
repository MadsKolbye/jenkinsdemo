import java.util.Random;

public class RandomStream {
    public static void main(String[] args){
        Random random = new Random();
        //System.out.println(random.nextInt()); //not a stream
        random.ints().limit(4).forEach(System.out::println);

    }
}
