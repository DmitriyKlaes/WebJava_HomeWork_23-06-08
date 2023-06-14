package ru.gb;

//Задача 1:
//
//        1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
//        подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//        2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
//        просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
//        ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//        MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//        3 В методе main() вызвать полученный метод, обработать возможные исключения
//        MyArraySizeException и MyArrayDataException и вывести результат расчета.


public class Program {
    public static void main(String[] args) {
        SquareArrayHandler sah = new SquareArrayHandler();

        String[][] doubleArrayRight = {{"1", "1", "7", "1"},
                                       {"1", "1", "7", "1"},
                                       {"1", "1", "7", "1"},
                                       {"1", "1", "7", "2"}};

        String[][] doubleArrayDataEx = {{"1", "1", "7", "1"},
                                        {"1", "1", "7", "1"},
                                        {"1", "1", "7", "l"},
                                        {"1", "1", "7", "1"}};

        String[][] doubleArraySizeEx = {{"1", "1", "7", "1"},
                                        {"1", "1", "7", "1"},
                                        {"1", "1", "7", "1"},
                                        {"1", "1", "7", "2", "1"}};

        try {
            System.out.printf("Сумма элементов массива: %d%n", sah.sumSquareArray(doubleArrayRight));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.err.printf("Содержимое в ячейке [%d:%d] не является числом%n",
                    e.getRow(), e.getColumn());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }
    }
}
