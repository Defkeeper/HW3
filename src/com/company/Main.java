package com.company;

public class Main {

    public static void main(String[] args) {
        int month = 5;
        if (month == 5) {
            System.out.println("Весна");
        } else {
            System.out.println("Другое время года");
        }
        switch (month) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Другое время года");
                break;
        }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = array.length; i >= 0; i--) {
        System.out.print(array[i] + " ");
        }
        int[][] squareArray = new int[2][1];
        squareArray [0][0] = 11;
        squareArray [0][1] = 12;
        squareArray [1][0] = 13;
        squareArray [1][1] = 14;
        squareArray [2][0] = 15;
        squareArray [2][1] = 16;
        for(int q = 0; q < squareArray.length; q++){
            for(int j = 0; j < squareArray[q].length; j++){
                System.out.println(squareArray[q][j] + " ");
            }
            System.out.println();
        }
    }
}
