package com.company;

public class Car {
    //+набор характеристик
    //+ набор функций
    // сокрытие (инкапсуляция) полей класса, задается через модификаторы доступа
    //public - поле доступно извне (во всех пакетах)
    // private - доступно только внутри класса
    // protected - внутри класса оно будет как private, при наследовании как public
    // (packege-protected) - внутри пакета как public, вне пакета - private
    public int maxSpeed;
    public String color;
    private String carType;
    protected int doorsCount;
    // переменная объявленная внутри класса называют свойство класса
    // методы класса - все функции внутри класса
   public void drive(int speed) {
        System.out.println("скорость машины ="+ speed+ "км/ч");
    }
    // влияние модификатора доступа на проццес наследования:
    // public - наследуется без ограничиний
    // privete - не наследуется
    //protected-наследуется рамках одного пакета
    // (packege-protected) - только внутри пакета наследуется.

}
