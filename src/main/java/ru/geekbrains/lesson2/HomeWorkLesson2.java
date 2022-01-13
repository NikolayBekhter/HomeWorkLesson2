package ru.geekbrains.lesson2;

public class HomeWorkLesson2 {

    public static void main(String[] args) {
        LeapYearOrNot(2022);
    }

    public static void LeapYearOrNot(int year) {
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
        System.out.println(result);
    }
}
