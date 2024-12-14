import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lineNumber = 1;
        while (s.hasNextLine()) {
            String line = s.nextLine();
            System.out.println(lineNumber + " " + line); 
            lineNumber++; 
        }
        s.close(); 
    }
}
