package palindrome;

/**Haz que la función palindromo(str) tome el parametro str que se está pasando
 * y determine si es posible crear una cadena palindrómica de longitud minima de
 * 3 caracteres eliminando 1 o 2 caracteres. Por ejemplo si str es "abjchba", entonces
 * puede eliminar los caracteres jc para producir "abhba" que es un palindromo. Para este
 * ejemplo, el programa debe devolver los dos caracteres que se eliminaron sin delimitador y
 * en el orden en que aparecen en la cadena, por ejemplo, jc. Si no puede quitar 1 o 2
 * caracteres para pñroducir un palíndromo, no es posible devolver la cadena.

 Si la cadena de entrada ya es un palíndromo, el programa
 debe devolver la cadena palíndromo. El programa siempre debe
 eliminar los caracteres que aparecen anteriormente en la cadena.
 En el ejemplo anterior, tambioen puede eliminar ch para formar
 un palindromo, pero jc aparece primero, lo que la respuesta correcta es jc.

 La entrada solo contendrá caracteres alfabéticos en minúsculas.
 El programa siempre debe intentar crear la subcadena palindromica mas
 larga eliminando 1 o 2 caracteres. Los 2 caracteres que quite no tienen que estar adyacentes en la cadena.

 Ejemplo
 "nmop"
 salida: no posible.

 Entrada: "kjjjhjjj"
 salida: k. */

public class Palindrome {
    public static boolean isPalindrome(String str){
        return str.contentEquals(new StringBuilder(str).reverse());
    }

    public static String validatePalindrome (String word){
        if (word.length() < 3) return  "Word must be greater than 3 characters";

        if(isPalindrome(word)) return word;

        String newWord;
        for (int i = 0; i < word.length(); i++) {
            newWord =  word.substring(0,i) + word.substring(i+1);
            if (isPalindrome(newWord)) {
                return newWord + " is palindrome and delete this character " + word.charAt(i);
            }
        }

        for (int i = 0; i <word.length(); i++) {
            for (int j = i + 1; j < word.length() ; j++) {
                newWord = word.substring(0,i) + word.substring(i+1,j) + word.substring(j+1);
                if(isPalindrome(newWord)) {
                    System.out.println(newWord);
                    return " This is palindrome and remove "
                            + word.charAt(i) + " and " + word.charAt(j);
                }
            }

        }

        return "Is not possible";
    }
}
