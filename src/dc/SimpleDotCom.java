package dc;


public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    
    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "missed";
        for (int cell : locationCells){
            if (guess == cell){
                result = "got";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "sunk";
        }
        System.out.println(result);
        return result;
    }
}
