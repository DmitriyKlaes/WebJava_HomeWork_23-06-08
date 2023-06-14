package ru.gb;

public abstract class MyArrayException extends Exception {

    int row;
    int column;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public MyArrayException(String message) {
        super(message);
    }

    public MyArrayException(String message, int row, int column) {
        super(message);
        this.row = row;
        this.column = column;
    }
}
