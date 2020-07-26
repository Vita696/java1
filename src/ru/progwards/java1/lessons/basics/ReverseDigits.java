package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
      int a = number%10 * 100;//300
      number = number - (number%10);//123-3=120
      int b = number%100;//20
      number = number - (number%100);//120-20=100
      int c = number%1000/100;//100/100=1
     return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(reverseDigits(123));


    }
}