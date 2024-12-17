import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String S1=s.next().toLowerCase();
        String S2=s.next().toLowerCase();
        int c1[]=new int[256];
        int c2[]=new int[256];
        for(int i=0;i<S1.length();i++){
            c1[S1.charAt(i)]++;
        }
        for(int i=0;i<S2.length();i++){
            c2[S2.charAt(i)]++;
        }
        boolean ans=true;
        for(int i=0;i<256;i++)
        {
            if(c1[i]!=c2[i])
            {
                ans=false;
                break;
            }
        }
       System.out.println(ans?"Anagrams":"Not Anagrams");
    }
}
