package com.company;

public class Main {

    public static void main(String[] args) {
        //--------------------------------------------------
	    int clientOS = 1;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию приложения для Android по ссылке");
        //--------------------------------------------------
        int year = 2100;
        if (clientOS == 0){
            if (year > 2015)
                System.out.println("Установите версию приложения для iOS по ссылке");
            else
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else{
            if (year > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
            else
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //-------------------------------------------------
        if(year%4 == 0)
        {
            if(year%100 == 0)
            {
                if(year%400 == 0)
                {
                    System.out.format("%d год является високосным\n", year);
                }
                else
                {
                    System.out.format("%d год не является високосным\n", year);
                }
            }
            else
            {
                System.out.format("%d год является високосным\n", year);
            }
        }
        else
        {
            System.out.format("%d год не является високосным\n", year);
        }
        //--------------------------------------------------
        int deliveryDistance = 95;
        if (deliveryDistance-20 <= 0)
            System.out.println("Потребуется дней: 1");
        else
        {
            int result = (deliveryDistance-20)/40;
            if((deliveryDistance-20)%40>0)
                System.out.format("Потребуется дней: %d\n", result+2);
            else
                System.out.format("Потребуется дней: %d\n", result+1);
        }
        //--------------------------------------------------
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц: Январь    Сезон: Зима");
                break;
            case 2:
                System.out.println("Месяц: Февраль    Сезон: Зима");
                break;
            case 3:
                System.out.println("Месяц: Март    Сезон: Весна");
                break;
            case 4:
                System.out.println("Месяц: Апрель    Сезон: Весна");
                break;
            case 5:
                System.out.println("Месяц: Май    Сезон: Весна");
                break;
            case 6:
                System.out.println("Месяц: Июнь    Сезон: Лето");
                break;
            case 7:
                System.out.println("Месяц: Июль    Сезон: Лето");
                break;
            case 8:
                System.out.println("Месяц: Август    Сезон: Лето");
                break;
            case 9:
                System.out.println("Месяц: Сентябрь    Сезон: Осень");
                break;
            case 10:
                System.out.println("Месяц: Октябрь    Сезон: Осень");
                break;
            case 11:
                System.out.println("Месяц: Ноябрь    Сезон: Осень");
                break;
            case 12:
                System.out.println("Месяц: Декабрь    Сезон: Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
