package com.GrowMyJava.Algorithmization.SortedArray;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task_6 {
    //6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
    //Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai<=ai+1, то продвинуться
    // на один элемент вперед. Если ai>ai+1, то производится перестановка и сдвигаются на один элемент назад.
    //Составить алгоритм этой сортировки.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        int step = size / 2;//инициализируем шаг. while (step > 0)//пока шаг не 0
        {
            for (int i = 0; i < (size - step); i++) {
                int j = i; //будем идти начиная с i-го элемента while (j >= 0 && a[j] > a[j + step])
//пока не пришли к началу массива
//и пока рассматриваемый элемент больше
//чем элемент находящийся на расстоянии шага
                {
//меняем их местами
                    int temp = a[j];
                    a[j] = a[j + step];
                    a[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;//уменьшаем шаг
        }
// Выводим отсортированный массив
        for (int i = 0; i < size; i++) {
            printWriter.print(a[i] + " ");
        } // После выполнения программы необходимо закрыть // потоки ввода и вывода scanner.close(); printWriter.close(); }
    }
}