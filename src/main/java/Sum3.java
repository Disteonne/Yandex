import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] str= scanner.nextLine().split(" ");

       int sum=Integer.parseInt(str[0])+Integer.parseInt(str[1]);
       System.out.println(sum);

    }
}
