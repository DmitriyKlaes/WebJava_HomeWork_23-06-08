package ru.gb;

public class SquareArrayHandler {

    public int sumSquareArray(String[][] arrayForSum) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        if (isSquareArray(arrayForSum, arrayForSum.length)) {
            for (int i = 0; i < arrayForSum.length; i++) {
                for (int j = 0; j < arrayForSum.length; j++) {
                    try {
                        result += Integer.parseInt(arrayForSum[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Преобразование к числу не удалось!", i, j);
                    }
                }
            }
        }
        return result;
    }
    
    private boolean isSquareArray(String[][] arrayForCheck, int arraySide) throws MyArraySizeException {
        for (String[] nestedArrayStrings : arrayForCheck) {
            if (arrayForCheck.length != arraySide ||
                    arrayForCheck.length != nestedArrayStrings.length) {
                throw new MyArraySizeException("Массив не соответствует размеру 4x4");
            }
        }
        return true;
    }

}
