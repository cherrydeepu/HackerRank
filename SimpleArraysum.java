import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;

class SimpleArraysum {
    static int s=0;
    public static int simpleArraySum(List<Integer> ar) {
        for(int i=0;i<ar.size();i++) s+=ar.get(i);
        return s;
    }

}
