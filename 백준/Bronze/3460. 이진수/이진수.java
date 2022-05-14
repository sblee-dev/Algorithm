import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int testCase = Integer.parseInt(br.readLine());
        
       for (int i = 0; i < testCase; i++) {
           int decimal = Integer.parseInt(br.readLine());
           String binary = Integer.toString(decimal, 2);
           String binArr[] = binary.split("");
       
           for (int j = binArr.length - 1; j >= 0; j--) {
               if ("1".equals(binArr[j])) {
                   System.out.print(binArr.length - 1 - j + " ");
               }
           }
           System.out.println();
       }
    }
}