package com.company;

public class Car {
    public static int carCounter;
    public static final int DISCOUNT = 5;

    public String model;
    private final double ENGINE;    //нельзя создать сеттер т.к поле является константой
    public int yearOfManufacture;
    private int price;
    public int [] equipmentPrices;



    public Car(){
        model = "Mercedes-Benz S500 4 MATIC";
        ENGINE = 5.0;
        yearOfManufacture = 2012;
        price = 35000;
        equipmentPrices = new int[10];
        equipmentPrices[0] = 250;
        equipmentPrices[1] = 100;
        equipmentPrices[2] = 700;
        equipmentPrices[3] = 400;
        equipmentPrices[4] = 1200;
        equipmentPrices[5] = (int) (Math.random()*1001+2000);           // случайное число от 2 до 3 тысяч включительно
        equipmentPrices[6] = 350;
        equipmentPrices[7] = 670;
        equipmentPrices[8] = 1700;
        equipmentPrices[9] = 980;
        carCounter++;
    }

    public Car(String model, double engineVolume, int yearOfManufacture,  int price) {
        this.model = model;
        this.ENGINE = engineVolume;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        carCounter++;
    }

    public double getENGINE() {
        return ENGINE;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //ДЗ №3

    public void acceleration(int speed, int speedLimit){
        if (speed > speedLimit){
            System.out.println("Превышение скорости!");
            return;
        }
        while (speed < speedLimit){
            speed++;
            System.out.println("Скрость: "+speed+" км/ч");
        }
        System.out.println("Максимальная скорость набрана: "+ speed+" км/ч");
    }

    public void acceleration2(int speed, int speedLimit){       //для реализации метода с do...while требуется больше кода
        if (speed > speedLimit){
            System.out.println("Превышение скорости!");
            return;
        }else if (speed == speedLimit){
            System.out.println("Максимальная скорость набрана: "+ speed+" км/ч");
            return;
        }
        do {
            speed++;
            System.out.println("Скрость: "+speed+" км/ч");

        } while (speed < speedLimit);
        System.out.println("Максимальная скорость набрана: "+ speed+" км/ч");

    }
    public static void showArray(int [] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public  static void arraySorter(int [] array){
        for (int i = array.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public void addDiscount(){
        this.price = this.price - this.price*DISCOUNT/100;
    }
}
