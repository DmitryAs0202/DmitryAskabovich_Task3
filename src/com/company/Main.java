package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        int limit = 80;
        car1.acceleration(79,limit);
        car1.acceleration(100, limit);
        car1.acceleration(75, limit);
        car1.acceleration(80, limit);

        System.out.println("Метод с do-while-------------------------------------");
        car1.acceleration2(81, limit);
        car1.acceleration2(77, limit);
        car1.acceleration2(80, limit);

        System.out.println("---------------Массивы---------------------");

        Car.showArray(car1.equipmentPrices);
        Car.arraySorter(car1.equipmentPrices);
        System.out.println("Сортировка");
        double time1 = System.currentTimeMillis();
        Car.showArray(car1.equipmentPrices);
        double time2 = System.currentTimeMillis();
        Car car2 = new Car();

        System.out.println("-----------Для авто2------");
        double time3 = System.currentTimeMillis();
        Arrays.sort(car2.equipmentPrices);
        double time4 = System.currentTimeMillis();
        Car.showArray(car2.equipmentPrices);
        System.out.println("Время работы собственного метода: "+ (time2-time1)+" миллисекунд");
        System.out.println("Время работы Arrays.sort: "+ (time4-time3)+" миллисекунд");

        System.out.println("Foreach");
        for (Integer i : car2.equipmentPrices){
            System.out.println(i);
        }
        Car car3 = new Car("Audi A6 C8", 3.0, 2019, 65000);


        String [] models = new String[2];
        models[0] = car1.model;
        models[1] = car3.model;

        for ( String model: models){
            System.out.println(model);
        }
        System.out.println(car1.getENGINE());   // значение можно только получить, но не изменить
        System.out.println(Car.carCounter);
        System.out.println(car1.carCounter);
        System.out.println(car2.carCounter);
        System.out.println("Изменение CarConunter");
        car1.carCounter = 5;
        System.out.println(Car.carCounter);
        System.out.println(car1.carCounter);
        System.out.println(car2.carCounter);

        //Car.DISCOUNT= 7;
        car3.addDiscount();
        System.out.println("Цена со скидкой: "+car3.getPrice());



    }
}
