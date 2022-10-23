public class Main {

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        String osName = "iOS";
        int clientOS = getClientOS(osName);
        int clientDeviceYear = 2016;
        if (clientOS == 0) {System.out.println("Установите версию приложения для iOS по ссылке");}
        else {System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= 2015) System.out.println("приложение будет работать корректно и Установите облегченную версию приложения для Android по ссылке");
        else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

    }
}
