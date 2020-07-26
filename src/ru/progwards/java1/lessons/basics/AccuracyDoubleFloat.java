package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
        public static double volumeBallDouble(double radius) {
            final double Pi = 3.14;
            int a = 4;
            int b = 3;
            double v = ((double)a/b);
             return v * Pi * radius * radius * radius;


        }
        public static float volumeBallFloat(float radius) {
            final float Pi = 3.14f;
            int a = 4;
            int b = 3;
            float v = ((float) a/b);
            return v * Pi * radius * radius * radius;
        }
        public static double calculateAccuracy(double radius) {
            return volumeBallDouble(6371.2) - volumeBallFloat(6371.2f);
        }

        public static void main(String[] args) {
         calculateAccuracy(6371.2);
        }
}
