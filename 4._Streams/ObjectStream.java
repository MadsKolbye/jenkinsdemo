import java.util.Date;
import java.util.stream.Stream;

public class ObjectStream {
    public static void main(String[] args) {

        //alternative syntax
        //Stream<Date> clock = Stream.generate(Date::new);
        Stream<Date> clock = Stream.generate(() -> new Date());
        //clock.forEach(timestamp -> {
           // System.out.println("And the time is...");
            //System.out.println(timestamp);
       // });
        //clock.forEach(timestamp -> System.out.println(timestamp));
        //System.out.println(clock);
        clock.forEach(System.out::println);
    }
}
