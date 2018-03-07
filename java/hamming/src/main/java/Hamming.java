public class Hamming {
    public static int compute(String dna1, String dna2){
        if (dna1.length() != dna2.length()){
            throw new IllegalArgumentException();
        }
        int number = 0;
        for (int i = 0; i < dna1.length(); i++){
            if (dna1.charAt(i) != dna2.charAt(i)){
                number = number +1;
            }
        }
        return number;
    }
}
