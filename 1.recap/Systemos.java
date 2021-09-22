import java.util.ArrayList;
import java.util.List;

public class Systemos {


    public static void println(String content){
        System.out.println(content);
    }

    public void println(int content){
        System.out.println(content);
    }

    public static class out {
        public static void println(String content) {
            System.out.println(content);
        }

        public static void println(int content) {
            System.out.println(content);
        }
        public static void println(Object[] content) {
            for (Object object : content){
                System.out.println(object);
            }
        }

        public static void println(List object) {
            System.out.println(object);
        }
    }
}
