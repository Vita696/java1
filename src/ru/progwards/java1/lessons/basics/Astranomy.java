package ru.progwards.java1.lessons.basics;

public class Astranomy {
        public static Double sphereSquare(Double r) {
            final double Pi = 3.14;
            return 4 * Pi * r * r;
        }
        public static Double earthSquare() {
            return sphereSquare(6371.2);
        }
        public static Double mercurySquare() {
            return sphereSquare(2439.7);
        }
        public static Double jupiterSquare() {
            return sphereSquare(71492.0);
        }
        public static Double earthVsMercury() {
            double A;
            A = earthSquare()/ mercurySquare();
            return A;
        }
        public static Double earthVsJupiter() {
            double A;
            A = earthSquare() / jupiterSquare();
            return A;
        }

        public static void main(String[] args) {
            System.out.println("Площадь поверхности Земли равна " + earthSquare() + " кв.км");
            System.out.println("Площадь поверхности Меркурия равна " + mercurySquare()+ " кв.км");
            System.out.println("Площадь поверхности Юпитера равна " + jupiterSquare()+ " кв.км");
            System.out.println("Отношение Площадей поверхности Земли и Меркурия равна "+ earthVsMercury());
            System.out.println("Отношение Площадей поверхности Земли и Юпитера равна " + earthVsJupiter());
        }
    }
