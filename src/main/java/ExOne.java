import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ExOne {
    public static void main(String[] args) {
        //try {
        //BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        //String str= bufferedReader.readLine();
        String str = "yandex";
        String[] strLineToStr = str.split(" ");
        char[] ASCII = {'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z'};
        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = 0; i < strLineToStr.length; i++) {
            char[] strToCharArray = strLineToStr[i].toCharArray();
            for (int j = 0; j < strToCharArray.length; j++) {
                for (int k = 0; k < ASCII.length; k++) {
                    if (strToCharArray[j] == ASCII[k]) {
                        int position=2;
                        //сдвиг на k позиций >>
                        if(ASCII.length-k>position){
                        strToCharArray[j] = (char)(ASCII[k+position]);
                        list.add(strToCharArray[j]);
                       }
                        if(ASCII.length-k<=position){
                            position=position-(ASCII.length-k);
                            strToCharArray[j]=ASCII[position];
                            list.add(strToCharArray[j]);
                        }
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        ArrayList<Character> ch1 = new ArrayList<Character>();

        for (int i = 0; i < strLineToStr.length; i++) {

        }

    /*
        int key = 2;
        for (int i = 0; i < strLineToStr.length; i++) {
            char[] strToCharArr = strLineToStr[i].toCharArray();
            for (int j = 0; j < strToCharArr.length; j++) {
                ch1.add((char) (strToCharArr[j] << key));
            }
        }
        for (int i = 0; i < ch1.size(); i++) {
            System.out.print(ch1.get(i) + " \t");
        }
        System.out.println();
        //дешифровка
        for (int i = 0; i < ch1.size(); i++) {
            System.out.print((char) (ch1.get(i) ^ key) + "\t");
        }

     */
            /*
        }catch (IOException ex){
            ex.getStackTrace();
        }

             */
    }
}
