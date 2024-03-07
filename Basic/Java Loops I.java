import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        for(int i=1;i<11;i++){
            System.out.print(N + " x " + i + " = " + N*i+"\n");
        }
    }
}
