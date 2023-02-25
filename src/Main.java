import java.time.LocalDate;

public class Main {
    public static void printSeparator() {
        System.out.println("====================");
    } // разделитель
    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
    } // проверка года на високосность
    public static void checkVersion (int clientOSi, int clientDeviceYear) {
        if (clientOSi == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную  версию приложения для iOS по ссылке");
        } else if (clientOSi == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS  по ссылке");
        } else if (clientOSi == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите  облегченную версию приложения для Андроид  по ссылке");
        } else {
            System.out.println("Установите версию приложения для Андроид  по ссылке");
        }
    } // проверка версии ОС
    public static int cardDeliveryTime(int deliveryDistance) {    int deliveryDay = 1;
        if (deliveryDistance <= 20) {        System.out.println("Потребуется дней для доставки " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {        deliveryDay+=1;
            System.out.println("Потребуется дней для доставки " + (deliveryDay));    } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay+=2;        System.out.println("Потребуется дней для доставки " + (deliveryDay));
        } else {        deliveryDay=0;
            System.out.println("Доставки нет");    }
        return deliveryDay;} // время доставки карты


    public static void main(String[] args) {
        printSeparator();
        int year1=2008;
        checkYear(year1);
        printSeparator();
        int osType = 1;
        int currentYear = LocalDate.now().getYear();
        checkVersion(osType,currentYear);
        printSeparator();
        int distance = 37;
        cardDeliveryTime(distance);
        printSeparator();

    }




}