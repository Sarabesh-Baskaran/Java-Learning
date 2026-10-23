public class StringMethod {
    public static void main(String[] args){
        String text = "  Java Programming  ";
        String t = text.trim();             // "Java Programming"

        System.out.println(text.length());                      // 20  (spaces um serthu)
        System.out.println(t.toUpperCase());                    // JAVA PROGRAMMING
        System.out.println(t.toLowerCase());                    // java programming
        System.out.println(t.charAt(0));                        // 'J'
        System.out.println(t.indexOf("Pro"));                   // 5   (illana -1)
        System.out.println(t.lastIndexOf('a'));                 // 10
        System.out.println(t.substring(5));                     // "Programming"
        System.out.println(t.substring(0, 4));                  // "Java"   (end index include aagaadhu)
        System.out.println(t.contains("Java"));                 // true
        System.out.println(t.startsWith("Java"));               // true
        System.out.println(t.endsWith("ing"));                  // true
        System.out.println(t.replace("Java", "Spring"));        // "Spring Programming"
        System.out.println("ha".repeat(3));
        System.out.println("   ".isBlank() ); //Only, if it is blank it will return true.
        //Conversion Methods
        System.out.println(String.valueOf(100));                  // "100"   (number -> String)
        System.out.println(Integer.parseInt("42"));               // 42      (String -> number)
        System.out.println("hi".toCharArray());                   // ['h', 'i']

        String msg = String.format("Name: %s, Age: %d, GPA: %.2f", "Ravi", 20, 8.456);
        System.out.println(msg);              // Name: Ravi, Age: 20, GPA: 8.46
        //%s - String, %d - Integer, %.2f - 2 Decimal Places.
    }
}
