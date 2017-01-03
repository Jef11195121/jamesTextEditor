package farOutAtSea;

public class Main {

    public static void main(String[] args) {

        Predator myPredator = new Predator();

        int predatorAggression = myPredator.getAggression();
        System.out.println("Predator Aggression is " + predatorAggression);

        Prey myPrey = new Prey();

        int preyAggression = myPrey.getAggression();
        System.out.println("Prey Aggression is " + preyAggression);

        //Prey newPrey = new Prey(12,4,6,true,5,6); //Int, int, int, false, int, int.
        //int preyAggression3 = newPrey.getAggression();
       //System.out.println("New Aggression " + preyAggression3);

        //Seal mySeal = new Seal();
        //int preyAggression2 = mySeal.getAggression();
        //System.out.println("Cute Seal " + preyAggression2);

        battle(predatorAggression, preyAggression);
    }

    public static void battle(int predatorAgg, int preyAgg){
        if(predatorAgg == preyAgg){
            System.out.println("Both are injured!");
        }else{
            if(predatorAgg > preyAgg){
                System.out.println("Predator Wins!");
            }else{
                System.out.println("Prey Wins!");
            }
        }
    }
}