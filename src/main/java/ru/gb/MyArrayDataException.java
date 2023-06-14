package ru.gb;

public class MyArrayDataException extends MyArrayException {

    public MyArrayDataException(String message, int row, int column) {
        super(message, row, column);
    }

}
