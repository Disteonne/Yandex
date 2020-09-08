
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            String str=bufferedReader.readLine();
            String[] strToChar=str.split(" ");
            int sum=0;
            for (int i = 0; i < strToChar.length; i++) {
                sum+=Integer.parseInt(strToChar[i]);
            }
            System.out.println(sum);

        }catch (IOException ex){
            ex.getStackTrace();
        }
    }
}
