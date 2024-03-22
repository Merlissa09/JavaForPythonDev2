import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;


enum Major { COMPUTERSCIENCE, BUSINESS, PSYCHOLOGY, COMMUNICATIONS };
/**
 * Startup
 */
public class Startup {
    static int classLocal;

    public static void main(String[] args) {
        Student student = new Student();
        student.major = Major.COMPUTERSCIENCE;
        student.name = "Melissa";
        student.dateOfBirth = LocalDate.of(1994, 5, 2);
        System.out.println(student);
        System.out.println(student.getAge());

        Student student2 = new Student();
        student2.major = Major.PSYCHOLOGY;
        student2.name = "Peter";
        student2.dateOfBirth = LocalDate.of(1991, 7, 3);
        System.out.println(student2.toString("Hegney"));
        System.out.println(student2.getAge());

        if (student.major == Major.COMPUTERSCIENCE) {
            System.out.println("Computers are the best");
        }


        Car car1 = new Car();
        car1.setHorsePower(14);
        car1.setCarStyle(CarStyle.SUV);
        car1.setPowerType(PowerType.UNLEADED);

        Car car2 = new Car();

        Car car3 = new Car();
        car3.setHorsePower(195);

        System.out.println(car1.getHorsePower());
        System.out.println(car2.getHorsePower());
        System.out.println(car3.getHorsePower());


        Instructor teacher = new Instructor();
        teacher.email = "mhegney@stmartin.edu";
        Instructor teacher2 = new Instructor();
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