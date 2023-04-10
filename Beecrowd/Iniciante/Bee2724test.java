//These inputs are very annoying so this version of the code makes it a bit easier to test and debug things
public class Bee2724test {
    public static void main(String[] args) {
        //String[] x = {"H2O2", "C41H64O14", "C10H14N2","Pb","C21H22N2O2","NaCN","Hg","C31H42N2O6","As","C24H27Cl5O6"};
        String[] x = {"KBrAsC", "Mg2F","CsH"};
        String[] testStrings = {"KBrAsCl", "Mg2Fe","CsHe","Mg2F","Cl2NaOPMg2F","KBrAsC"};

        for (String testString : testStrings) {
            boolean isValid = false;
            for (String s : x) {
                int index = testString.indexOf(s);
                while (index != -1) {
                    // Check if there is a number immediately after the match
                    if (index + s.length() < testString.length() && (Character.isDigit(testString.charAt(index + s.length())) || Character.isLowerCase(testString.charAt(index + s.length())))) {
                        isValid = false; // Invalid match
                        break;
                    } else {
                        isValid = true; // Valid match
                        index = testString.indexOf(s, index + 1); // Look for next match
                    }
                }
                if (isValid) {
                    break; // No need to check remaining strings in x array
                }
            }
            if (isValid) {
                System.out.println(testString + ": RED");
            } else {
                System.out.println(testString + ": GREEN");
            }
        }
    }
}