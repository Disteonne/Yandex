import java.util.ArrayList;
import java.util.Scanner;

public class ExThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] str1 = str.split(" ");
        int numbOne = Integer.parseInt(str1[0]);//кол-во частей 1й функции
        int numbTwo = Integer.parseInt(str1[1]);//кол-во частей 2й функции
        double[] pointOne = new double[numbOne + 1];
        double[] pointTwo = new double[numbTwo + 1];

        //работа с 1й функцией
        String funcOne = scanner.nextLine();
        addBorPoint(numbOne, pointOne, funcOne);
        ArrayList<double[]> arrList = new ArrayList<double[]>();
        for (int i = 0; i < numbOne; i++) {
            String funcOneCoefficient = scanner.nextLine();
            arrList.add(addCoeff(numbOne, funcOneCoefficient));
        }
        /*          Проверка значений для интервалов
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = 0; j < arrList.get(i).length; j++) {
                System.out.print(arrList.get(i)[j]+"\t");
            }
            System.out.println();
        }

        //Проверка интервала
        System.out.println(pointOne[0]);
        System.out.println(pointOne[1]);
         */

        //работа со 2й функцией
        String funcTwo = scanner.nextLine();
        addBorPoint(numbTwo, pointTwo, funcTwo);
        ArrayList<double[]> arrList2 = new ArrayList<double[]>();
        for (int i = 0; i < numbTwo; i++) {
            String funcTwoCoefficient = scanner.nextLine();
            arrList2.add(addCoeff(numbTwo, funcTwoCoefficient));
        }


        /*          Проверка значений для интервалов
        System.out.println("2я функция значения инт: ");
        for (int i = 0; i < arrList2.size(); i++) {
            for (int j = 0; j < arrList2.get(i).length; j++) {
                System.out.print(arrList2.get(i)[j]+"\t");
            }
            System.out.println();
        }

        System.out.println("2я знач границ");
        //Проверка интервала
        System.out.println(pointTwo[0]);
        System.out.println(pointTwo[1]);

         */

    }

    public static void addBorPoint(int numb, double[] array, String scannerLine) {
        if (numb > 0) {
            String[] str2 = scannerLine.split(" ");
            if (str2.length < array.length || str2.length > array.length) {
                System.out.println("error");
            } else {
                for (int i = 0; i < array.length; i++) {
                    array[i] = Double.parseDouble(str2[i]);
                }
            }

        }
    }

    public static double[] addCoeff(int numb, String scannerLine) {
        String[] str = scannerLine.split(" ");
        if (str.length == 3) {
            double[] coefficient = new double[str.length];
            for (int i = 0; i < str.length; i++) {
                coefficient[i] = Double.parseDouble(str[i]);
            }
            return coefficient;
        } else {
            System.out.println("error");
            return null;
        }
    }
}


