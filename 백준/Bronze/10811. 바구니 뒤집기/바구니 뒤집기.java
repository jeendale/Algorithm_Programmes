import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=i+1;
        
      for (int t = 0; t < m; t++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            int l = a - 1, r = b - 1;
            while (l < r) {
                int tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;
                l++; r--;
            }
        }

        for(int i=0;i<n;i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}