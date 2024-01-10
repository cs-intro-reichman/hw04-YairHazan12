public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    
    }

    public static String capVowelsLowRest (String string) {
        String S = "";
        for (int i = 0; i < string.length(); i++) {
            if ("AEIOUaeiou".indexOf(string.charAt(i)) != -1) { //is the char a low case vowl
                S += uppercase(string.charAt(i));
            }else if (string.charAt(i) <= 90 && string.charAt(i) >= 65) {
                S += (char)(string.charAt(i) + 32);
            }else{
                S += string.charAt(i); 
            }
        }
        return S;
    }

    public static String camelCase (String string) {
        // Write your code here:
        string = dropSpacesStart(string);
        string = lowercaseall(string);
        string = capitalFirstInWord(string);
        string = dropSpaces(string);
        return string;
    }

    private static String dropSpacesStart(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                return string.substring(i);
            }
        }
        return null;
    }

    private static String capitalFirstInWord(String string) {
        String S = "";
        S += lowercase(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                S += string.charAt(i);
            }else if (string.charAt(i-1) == ' ') {
                S += uppercase(string.charAt(i));
            }else{
                S += string.charAt(i);
            }
        }
        return S;
    }

    private static char uppercase(char charAt) {
        if (charAt >= 97 && charAt <= 122) {
            return (char)(charAt - 32);
        }
        return charAt;    
        
    }

    private static char lowercase(char charAt) {
        if (charAt >= 65 && charAt <= 90) {
            return (char)(charAt + 32);
        }
        return charAt;
    }

    private static String lowercaseall(String string) {
        String S = "";
        for (int i = 0; i < string.length(); i++) {
            S += lowercase(string.charAt(i));
        }
        return S;
    }

    private static String dropSpaces(String string) {
        String S = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                S += string.charAt(i);
            }
        }
        return S;
    }

    public static int[] allIndexOf (String string, char chr) {
        //**countChar();
        //creat arrayin this length;
        //for that finds the char and appends i to the array
        //**return new int[1];
        int chrCounter = countChar(string,chr);
        int [] array = new int[chrCounter];
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }

    private static int countChar(String string, char chr) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                counter++;
            }
        }
        return counter;
    }
}
