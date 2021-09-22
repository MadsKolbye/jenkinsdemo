import java.util.Random;

public class Octopus extends Animal{

    Random random = new Random();
    int min = 1;
    int max = 10;

    public void makeDoActivity(){
        for (int i = 1; i > 0; i++){
            //System.out.println(selectActivity());
            String activity = selectActivity();
            System.out.println(activity);
            if (activity.equals("mate")){
                GameOfOctopus gameThread = new GameOfOctopus();
                //System.out.println("Otto is a horny beast!");
                gameThread.start();
            }
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ex){
                ex.printStackTrace();
                System.out.println("Waiting 2 sec...");
            }
        }
    }


    public String move() {
        return "Swish swosh";
    }
    public String selectActivity(){
        String activity;
        int activityNumber = random.nextInt(max)+min;

        switch(activityNumber){
            case 1: activity = "eat";
            break;
            case 2: activity = "mate";
            break;
            case 3: activity = "sleep";
                break;
            case 4: activity = "roar";
                break;
            case 5: activity = "yikes";
                break;
            case 6: activity = "game";
                break;
            case 7: activity = "snoring";
                break;
            case 8: activity = "shouting";
                break;
            default: activity = move();
        }
        return activity;
        }
        
    }


