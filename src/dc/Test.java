
package dc;

import java.util.ArrayList;

public class Test {
    public String getResult(DotComBust game){
        for(DotCom subj : game.dotComsList){
            for(String loc : subj.locationCells){
                if(subj.checkYourself(loc) != "got"){
                    return "false";
                };
            }
            
        }
        return "pass";
    }
}
