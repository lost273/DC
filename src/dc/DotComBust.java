
package dc;
import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
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
}
