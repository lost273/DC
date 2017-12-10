package dc;
import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    //int numOfHits = 0;
    
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    
    public String checkYourself(String userInput){
        String result = "missed";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
        
            if (locationCells.isEmpty()){
                result = "sunk";
            } else {
                result = "got";
            }
        }
        return result;
    }
}
