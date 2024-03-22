import java.util.Arrays;
import java.util.HashSet;

/**
 * Startup
 */
public class Startup {
    static int classLocal;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Circle 1s radius " + circle);

        Circle circle2 = circle;
        System.out.println("Circle 2s radius " + circle2);

        circle.radius = 10;
        //System.out.println("Circle 2s radius " + circle2.radius);

        int radius = 5;
        System.out.println("radius1 " + radius);

        int radius2 = radius;
        System.out.println("radius2 " + radius2);

        radius = 76;
        System.out.println("radius2 " + radius2);

        String name = "Melissa";
        String name1 = "Melissa12";

        System.out.println(name.toUpperCase());

        Student student = new Student();
        System.out.println(student);
        System.out.println(student.name);
        student.name = "Melissa";
        System.out.println(student.name);
        student.GPA = Float.parseFloat("4537.1");
        System.out.println("GPA $" + student.GPA);
        //System.out.println(local);
        System.out.println(classLocal);

        System.out.println(vowels("vetstotech"));
        System.out.println(calcVowels("vetstotEch"));
        System.out.println(getVowels("vetstotech"));


    }

    public static double harmonic(int n) {
        int local = 0;
        System.out.println(local);
        System.out.println(classLocal);

        for (int i = 0; i < 3; i++) {
            int forLoopLocal = 1;
            System.out.println(forLoopLocal);
        }
        //System.out.println(forLoopLocal);

        return n;
    }

    // https://codeshare.io/hegney

    public static int vowels(String testString) {
        int numVowels = 0;
        char[] vowelsArr = { 'a', 'e', 'i', 'o', 'u' };

        for (char c : testString.toLowerCase().toCharArray()) { // O(n)

            if (Arrays.binarySearch(vowelsArr, c) > 0) { // O(log n)
                numVowels++;
            }
        }

        return numVowels;
    }
    
    public static int calcVowels(String inputString) {
        int res = 0;
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');

        for (int i = 0; i < inputString.length(); i++) { // O(n)
            char tmp = inputString.charAt(i);
            inputString = inputString.toLowerCase();
            if (vowels.contains(tmp)) {   //O(n)
                res++;
            }
        }
        return res;
    }
    
    // vetstotech
    public static int getVowels(String term) {
        String lowerCased = term.toLowerCase();
        int counter = 0;
        for (int i = 0; i < lowerCased.length(); i++) {
            char letter = lowerCased.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i'
                    || letter == 'o' || letter == 'u') {
                counter++;
            }
        }
        
        return counter;
    }

}