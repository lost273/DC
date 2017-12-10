package dc;
import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    //int numOfHits = 0;
    
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    public void setName(String n){
        name = n;
    }
    
    public String checkYourself(String userInput){
        String result = "missed";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
        
            if (locationCells.isEmpty()){
                result = "sunk";
                System.out.println(name + "was sunken");
            } else {
                result = "got";
            }
        }
        return result;
    }
}
