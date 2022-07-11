package com.company;

//java  не поддерживает множиственное наследование
public class FaierTrack extends Car {
    //shadowing
    public int maxSpeed;
    public void fireOff () {
        System.out.println("fore is off");
    }
    // перегрузка метода fireOff  измениние количества аргументов
    public void fireOff (int h) {
        System.out.println("hours");
    }
    // перегрузка метода fireOff  измениние количества аргументов
    public void fireOff (int h, int m) {
        System.out.println("hours and mins");
    }
    // перегрузка метода fireOff  измениние типа аргумента
    public void fireOff (float s) {
        System.out.println("seconds");
    }


}
