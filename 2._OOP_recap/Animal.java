public class Animal extends Kingdom implements Movement {

    public String activity(int choice) {
        int choiceNumber = 1;

        switch (choice){
            case 1:
                System.out.print("Still standing still....MOVE");
                break;
            case 2:
                System.out.print("SWIMMING YEEE");
                break;
            case 3:
                System.out.print("Falling down NOOO");
                break;
            case 4:
                System.out.print("IM FLYING....YAAAAY");
                break;
            case 5:
                System.out.print("LEEEETS RUUUN");
                break;
            case 6:
                System.out.print("FUCK NO IM TAKING A BREAK");
                break;

        }
        return activity();
    }
}
