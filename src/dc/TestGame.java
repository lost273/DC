
package dc;


public class TestGame {
    private String alphabet = "abcdefg";
    private String numbers = "0123456";
    public String getNext (){
        int i = (int)(Math.random() * 10);
        int j = (int)(Math.random() * 10);
        String result = (alphabet[i] + numbers[j]);
        return result;
    }
    
}
