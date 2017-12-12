
package dc;


public class TestGame {
    private String alphabet = "abcdefg";
    private String numbers = "0123456";
    public String getNext (){
        int i = (int)(Math.random() * 7);
        int j = (int)(Math.random() * 7);
        String result = "" + alphabet.charAt(i) + numbers.charAt(j);
        System.out.println("AI move:" + result);
        return result;
    }
    
}
