package ru.geekbrains.lesson2;

public class HomeWorkLesson2 {

    public static void main(String[] args) {
        System.out.println(LeapYearOrNot(2022));
        System.out.println(CheckingSum(7, 13));
    }

    public static boolean LeapYearOrNot(int year) {
        boolean result = false;
        if(year % 400 == 0){
            result = true;
        } else if(year % 100 == 0){
            result = false;
        } else if(year % 4 == 0){
            result = true;
        } else{
            result = false;
        }
        return result;
    }

    public static boolean CheckingSum(int a, int b) {
        boolean result = false;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
