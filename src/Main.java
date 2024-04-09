public class Main {
    public static void main(String[] args) {
        int clientOS=1;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");}
        else if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");}
        int clientDeviceYear=1;
        if(clientOS == 1 && clientDeviceYear == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке».");}else
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");}
        if(clientOS == 0 && clientDeviceYear == 1){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}else
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");}
        int year=2024;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0))
                System.out.println(year + " год является высокосным");
            else {
                System.out.println(year + "год не является высокоснЫм");
            }
            int deliveryDistance=40;
            if (deliveryDistance <= 20) {System.out.println("потребуетс 1 день");}
            if (deliveryDistance > 20&&deliveryDistance <= 60){
                System.out.println("потребуется 2 дня");}
            if(deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("потребуется 3 дня");}
            if (deliveryDistance>100){
                System.out.println("доставки нет");}
            int monthNumber=5;
            switch (monthNumber){
                case 1,2,3:
                    System.out.println("зима");
                    break;
                case 4,5,6:
                    System.out.println("весна");
                    break;
                case 7,8,9:
                    System.out.println("лето");
                    break;
                case 10,11,12:
                    System.out.println("осень");
                    break;
                default:
                    System.out.println("такого месяца не существует");
            }



        }

    }
}