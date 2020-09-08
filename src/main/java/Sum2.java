import java.io.*;

public class Sum2 {
    public static void main(String[] args) {
        long sum=0;
        int[] ch=new int[2];
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("src/test.txt"));
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("sum.txt"))) {

                String[] str=bufferedReader.readLine().split(" ");
                for (int i = 0; i < str.length; i++) {
                    sum+=Integer.parseInt(str[i]);
                }

            bufferedWriter.write(""+ sum);


        }catch (FileNotFoundException ex){
            ex.getStackTrace();
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
