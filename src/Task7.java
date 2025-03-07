//Задача 7: Треугольник максимальной суммы
//Дана треугольная матрица чисел. Реализуйте программу, которая нахо-
//дит максимальную сумму, начиная с верхушки треугольника и двигаясь
//вниз, выбирая на каждом уровне один из двух возможных элементов на
//следующем уровне: с каждой позиции (i, j) можно перемещаться вниз,
//переходя в позиции (i+1, j) или (i+1, j +1). В данном случае увеличение
//i — это спуск вниз по треугольнику, а увеличение j — это движение вправо
//к склону треугольника.
//Более подробная информация
//Формат ввода:
//• Первое число N ( 1 ≤ N ≤ 100 ) — количество строк в треугольнике.
//• Далее вводятся строки треугольника, где с каждой следующей стро-
//ки ширина треугольника увеличивается на 1 до N. Каждый элемент
//— целое число.
//Формат вывода:
//Одно число - максимальная сумма, которую можно получить, начиная с
//верхушки треугольника.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] t = new int[n][];

        for (int i = 0; i < n; i++) {
            t[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                t[i][j] = s.nextInt();
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                t[i][j] += Math.max(t[i + 1][j], t[i + 1][j + 1]);
            }
        }

        System.out.println(t[0][0]);
        s.close();
    }
}
