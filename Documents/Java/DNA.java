public class DNA {
    public static boolean verifyDNA(String dna){
        if(dna.endsWith("TGA") && dna.startsWith("ATG") && dna.length() % 3 == 0){
            return true;
        }
        return false;
        
    }
    



    public static void main(String[] args) {
        String dna1 = "ATGCGATACGTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";



    }
    
}
