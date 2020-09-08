import java.util.Scanner;

public class ExTwo {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            //вводим кол-во поддонов
        int count=0; //кол-во поддонов
            int n = scanner.nextInt();
            int[] w=new int[n];
            int[] h=new int[n];
            for (int i = 0; i < n; i++) {
                Scanner scanner1 = new Scanner(System.in);
                String str = scanner1.nextLine();
                String[] str1=str.split(" ");
                w[i] =Integer.parseInt(str1[0]);//ширина
                h[i] =Integer.parseInt(str1[1]);
            }
            //сравниваем
        int counter=0;
        for (int i = 0; i < w.length; i++) {
            //count++;//1
            for (int j = 0; j < h.length; j++) {
                if(i!=j){

                    if((w[i]>w[j]) || (h[i]>h[j])){
                        int tmp=w[i];
                        w[i]=h[i];
                        h[i]=tmp;
                        if((w[i]>w[j]) || (h[i]>h[j])){
                            count++;
                        }
                    }
                }
            }
            if(count==n-1){
                counter++;
            }
            count=0;
        }
        System.out.println(counter);

    }
}
