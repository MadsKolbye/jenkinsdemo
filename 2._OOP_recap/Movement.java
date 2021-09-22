public interface Movement {

    default String move(){
        return "Swiggity Swoggity";
    };

    default String activity(){
        return "Standing still...";
    }
}
