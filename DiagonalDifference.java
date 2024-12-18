import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][n];
        int s1=0;
        int s2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    s1+=a[i][j];
                }
            }
        }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i+j==n-1){
                        s2+=a[i][j];
                    }
                }
            }
            if(s1>s2){
                System.out.println(s1-s2);
            }else{
                System.out.println(s2-s1);
            }
        }
    }
