public class Pangrams{
    public static boolean isPangram(String phrase) {
        phrase = phrase.toLowerCase();
        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++){
            if (phrase.indexOf(alphabet) == -1){
                return false;
            }
        }
        return true;
    }
}
