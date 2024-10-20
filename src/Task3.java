//Задача 3: Удаление дубликатов из массива
//Реализуйте программу, которая удаляет все дубликаты из отсортирован-
//ного массива целых чисел и возвращает новый массив без дубликатов.
//Предполагается, что на вход подаётся уже отсортированный массив.
//Формат ввода:
//Вводится одно положительное целое число N ( 1 ≤ N ≤ 109) и N целых
//чисел, разделённых пробелом, всё в одной строке.
//Формат вывода:
//Выведите элементы нового массива без дубликатов, разделённые про-
//белом.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n > 0) {
            int p = s.nextInt();
            System.out.print(p + " ");

            for (int i = 1; i < n; i++) {
                int c = s.nextInt();
                if (c != p) {
                    System.out.print(c + " ");
                    p = c;
                }
            }
        }
    }
}
