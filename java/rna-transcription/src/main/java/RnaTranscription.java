public class RnaTranscription {
    public static String ofDna(String letter) {
        String rna = "";
        if (letter.length() > 1){
            int i = letter.length();
            int z = 0;
            while (z < i){
                rna = rna + rnaMaker(Character.toString(letter.charAt(z))); 
                z++;
            }
                
        }
        else{
           rna = rnaMaker(letter);
        }
        return rna;
    }

    public static String rnaMaker(String letter) {
         String rna = "";
         switch(letter) {
                case "C":   rna = rna + "G";
                            break;
                case "G":   rna = rna + "C";
                            break;
                case "T":   rna = rna + "A";
                            break;
                case "A":   rna = rna + "U";
                            break;
                default:    rna = "";
            }
        return rna;
    }
}