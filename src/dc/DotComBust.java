
package dc;
import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    //public only for test
    public ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("PETS");
        DotCom two = new DotCom();
        two.setName("ETOYS");
        DotCom three = new DotCom();
        three.setName("GO2");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println("Your target is to sink three subjects.");
        System.out.println("PETS, ETOYS, GO2");
        
        for (DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Make your move");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "missed";
        for(DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("got")){
                break;
            }
            if(result.equals("sunk")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("subjects was sunken");
        if(numOfGuesses <= 18){
            System.out.println("Very good. You had " + numOfGuesses + " attempts");
        } else {
            System.out.println("Very bad. You had " + numOfGuesses + " attempts");
        }
    }
    public static void main (String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        //game.startPlaying();
        //test
        Test gameTest = new Test();
        String result = gameTest.getResult(game);
        System.out.println(result);
    }
}
