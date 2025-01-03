public class words{
    public static void main(String[] agrs){
        makeWords(3,"", "abc");
    }
    public static void makeWords(int remainingLetters, String result, String alphabet){
        if(remainingLetters == 0){
            System.out.println(result);
        }
        else{
            for(int i = 1; i <= alphabet.length(); i++){
                makeWords(remainingLetters - 1, result + alphabet.substring(i- 1, i), alphabet);
            }
        }
    }
} 