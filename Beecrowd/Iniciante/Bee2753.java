public class Bee2753 {
    public static void main(String[] args) {
        int letterCode = 97;
        char letter = (char) letterCode;
        for(int i=0;i<26;i++){
            System.out.println(letterCode+" e "+letter);
            letterCode++;
            letter = (char) letterCode;
        }
    }
}