package com.company;

public class Main {

    public static void main(String[] args) {
        //ООП (Объектно - Ориентированное  Програмирование);
        // Объект: некая сущность(структура), состоящая из двух частей: некого набора характеристик
        // (могут быть объекты у которых характеристик нет) и и некоего набора функций, выполняемых сущностью
        // (могут бфть без функций)
        // 4 принципа ООП:
        // 1. Принцип -  инкапсуляция
        //2. наследование
        // 3. полиморфизм
        // 4. обстракция

        // объект создается с помощью шаблона
        // ключевое слово 'class' задает ШАБЛОН объекта
        //создание объекта класса Car
        Car car = new Car();
        car.maxSpeed=200;
        car.color="red";
        System.out.println(car.maxSpeed);
        car.drive (150);
        Car bmv=new Car();

        bmv.maxSpeed=220;
        bmv.color="black";
        System.out.println(bmv.maxSpeed);
        bmv.drive (180);
        // 2 наследование
        FaierTrack ft= new FaierTrack();
        ft.maxSpeed=100;
        ft.color= "rad";
        ft.drive(70);
        car.doorsCount=12;
        ft.fireOff();
        //полиморфизм в java 2 вида
        // 1. прегрузка методов
        ft.fireOff();
        ft.fireOff(8);
        ft.fireOff(2,7);
        ft.fireOff(3.14f);
        // полиморфизм через приведение типов
        Car car3=(Car)ft;

    }

}
