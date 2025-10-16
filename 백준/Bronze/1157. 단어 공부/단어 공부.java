import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        String str=br.readLine().toUpperCase();
        
        int[] arr=new int[26];
        
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'A']++;
        }
        int max=0;
        int a=0;
        boolean flag=true;
        for(int i=0;i<26;i++){
            if(max<arr[i]){
                max=arr[i];
                a=i;
                flag=false;
            }else if(max==arr[i]){
                flag=true;
            }
        }
        System.out.println(flag?"?":(char)('A'+a));
  }
}