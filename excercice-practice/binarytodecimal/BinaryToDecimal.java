package binarytodecimal;

/** This program converts a binary number to a decimal number*/
public class BinaryToDecimal {
    public static String convertBinaryToDecimal (String str){
        System.out.println("DEBUG: Entrando al método con " + str);
        String binaryString = str.trim();

        if(!binaryString.isEmpty() && !binaryString.contains(" ") &&
                binaryString.matches("[01]+(,[01]+)?")){
            String [] partsBinary = binaryString.split(",");
            double integerPart = 0.0;
            double decimalPart = 0.0;
            if (partsBinary.length == 2) {
                    for (int i = partsBinary[0].length() - 1; i >= 0; i--) {
                        if (partsBinary[0].charAt(partsBinary[0].length()-i-1) == '1'){
                            integerPart += Math.pow(2,i);
                        }
                    }
                    for (int i = 0; i < partsBinary[1].length(); i++) {
                        if (partsBinary[1].charAt(i) == '1'){
                            decimalPart += Math.pow(2,-(i+1));
                        }
                    }
                    double convertNumber = integerPart + decimalPart;
                    System.out.println("debug to my program " + convertNumber);
                    return "This is the binary number convert to decimal " + convertNumber;
            } else if (partsBinary.length == 1) {
                    integerPart = Integer.parseInt(partsBinary[0],2);
                    System.out.println("debug to my program " + integerPart)  ;
                    return "This is the binary number convert to decimal " + integerPart;
            }
            System.out.println("DEBUG this line 33");
            return "This is not a valid value";
        } else {
            System.out.println("DEBUG this line 36");
            return "Please, enter a valid value to convert a decimal number";
        }
    }
}
