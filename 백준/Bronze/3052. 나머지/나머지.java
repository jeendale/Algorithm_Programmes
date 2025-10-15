import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr=new int[10];
        int cnt=1;
        for(int i=0;i<10;i++){
            int a=Integer.parseInt(br.readLine());
            arr[i]=a%42;
        }
        Arrays.sort(arr);
        for(int i=1;i<10;i++){
           if(arr[i]!=arr[i-1]){
               cnt++;
           }
        }
        System.out.println(cnt);
    }
}