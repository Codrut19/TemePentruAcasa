public class Main {
    public static void main(String [] args){
        //Write a Java program to find the smallest number among three numbers.
        int arrayNumere[] = new int[2];
        int num1 = 15;
        System.out.println("Primul numar este: " +num1);
        int num2 = 51;
        System.out.println("Numarul doi este: " + num2);
        int num3= 55;
        System.out.println("Numarul trei este: " + num3);
        System.out.println("Cel mai mic numar este " + celMaiMicNumar(num1, num2, num3));


        //Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        int arrayMediaNumerelor[] = new int[2];
        int x = 18;
        int y = 44;
        int z = 106;
        System.out.println("Primul numar este " + x);
        System.out.println("Numarul 2 este " + y);
        System.out.println("Numarul 3 este " + z);
        System.out.println("Media celor 3 numere este " + (x+y+z)/3);

        //Write a Java program to display the middle character of a string.
        String text1 = "Java is a general-purpose programming language that is class-based, object-oriented, and designed " +
                "to have as few implementation dependencies as possible. It is intended to let application developers write once, run anywhere (WORA),[16] meaning that compiled Java code can run on all platforms " +
                "that support Java without the need for recompilation.[17] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. " +
                "The syntax of Java is similar to C and C++, but it has fewer low-level facilities than either of them. As of 2019, Java was one of the most popular programming languages in use according to GitHub," +
                "[18][19] particularly for client-server web applications, with a reported 9 million developers.[20]";

         caracterulDinMijloc(text1);
        System.out.println("Caracterul din mijloc este: " + caracterulDinMijloc(text1));

        //Write a Java program to count all words in a string.
        String text2 = "Java is a general purpose programming language that is class based, object oriented";
        numarareCuvinte(text2);
        System.out.println("Totalul cuvintelor este " + numarareCuvinte(text2));
        //Write a Java program to print characters between two characters ( ex. A to P) from a text.
        String text3 = "At one time, Sun made most of its Java implementations available without charge, despite their proprietary software status";
        caractereleDintreDouaCaractere('c', 'l');
        //Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if is odd, repeat the process until n=1
        //Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20
        int[] numere = {10,10,6,19,20,20};
        int numerePare = 0, numereImpare = 0;

        //Write a Java program to find the numbers greater that the average of the numbers of a given array
        int arrayNumereIntregi[] = new int[]{3,12,23,44,19,99};
        int sum = 0;
        for(int cursor1 = 0; cursor1 < arrayNumereIntregi.length; cursor1++){
            sum = sum + arrayNumereIntregi[cursor1];
        }
        double average = sum / arrayNumereIntregi.length;
        System.out.println("Media numerelor din array sunt: " +average);
        System.out.println("Numerele mai mari decat media sunt: " );
        for(int cursor1 = 0; cursor1 < arrayNumereIntregi.length; cursor1++){
            if(arrayNumereIntregi[cursor1] > average){
                System.out.println(arrayNumereIntregi[cursor1]);
            }
        }
        //Write a Java program to check if the value 20 appears three times in an array
        //Write a Java program to add all the digits of a given positive integer until the result has a single digit
        //Write a Java program to check if a positive number is a palindrome or not
        //Write a Java program to check if a string is a palindrome or not
        //Write a Java program to compute the sum of first n given prime numbers.

        //Write a Java program to print the characters on positions that are multiple of 5 but not multiple of 10.
        //Write a Java program to read a string and if the first or last characters are 's' or 'e' return the string without the words from odd positions
        //Write a Java program to count the number of words ending that have more than 2 vowels
        //Write a Java program to count all "," and spaces in a text
        String text4 = "The latest versions are Java 14, released in March 2020, and Java 11, a currently supported long-term support (LTS) version, released on September 25, 2018; Oracle released for the legacy Java 8 LTS the last free public update in January 2019 for commercial use";

        //Write a Java program to replace all spaces from a string with ";" if the space is on even position and with " | " if the space is on an odd position from a given string.


    }
    public static int celMaiMicNumar(int num1, int num2, int num3){
        return Math.min(Math.min(num1,num2),num3);
    }
    public static String caracterulDinMijloc(String text1) {
        int position;
        int length;
        if (text1.length() % 2 == 0) {
            position = text1.length() / 2 - 1;
            length = 2;
        }
        else{
            position = text1.length() / 2;
            length = 1;
        }
        return text1.substring(position, position + length);

    }
    public static int numarareCuvinte(String text2){
        int cuvinte = 0;
        if(!(" ".equals(text2.substring(0, 1))) || !(" ".equals(text2.substring(text2.length() - 1)))){
            for(int cursor = 0; cursor < text2.length(); cursor++){
                if(text2.charAt(cursor) == ' '){
                    cuvinte++;
                }
            }
            cuvinte = cuvinte + 1;
        }
        return cuvinte;

    }
    public static void caractereleDintreDouaCaractere(char c, char l){
        for(int cursor = 1; c <= l; cursor++, c++){
            System.out.println(c + " ");
        }
    }


    }




