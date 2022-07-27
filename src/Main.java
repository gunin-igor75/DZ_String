import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1_2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ",lastName, firstName ,middleName);
        System.out.println(fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));
    }

    public static void task4() {
        String fullName = "Ivanov Ivan Ivanovich";
        int indexLastName = fullName.indexOf(" ");
        int indexMiddleName = fullName.lastIndexOf(" ");
        String firstName = fullName.substring(indexLastName + 1, indexMiddleName);
        String lastName = fullName.substring(0,indexLastName);
        String middleName  = fullName.substring(indexMiddleName + 1);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника —" + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    public static void task5() {
        String fullName = "ivanov ivan ivanovich";
        String[] newLine = fullName.split(" ");
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < newLine.length; i++) {
            String separator = (i == newLine.length - 1) ? "": " ";
            string.append(Character.toUpperCase(newLine[i].charAt(0)) + newLine[i].substring(1) + separator);
        }
        String result = string.toString();
        System.out.println(result);
    }

    public  static  void  task6(){
        String stringOdd = "135";
        String stringEven = "246";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stringEven.length(); i++) {
            result.append(stringOdd.charAt(i)).append(stringEven.charAt(i));
        }
        System.out.println(result);
    }

    public static void task7() {
        String string = "aabccddefgghiijjkk";
        StringBuilder result = new StringBuilder();
        while (!string.isEmpty()) {
            String tmp = String.valueOf(string.charAt(0));
            int indexFirst = string.indexOf(tmp);
            int indexEnd = string.lastIndexOf(tmp);
            if (indexEnd > indexFirst){
                result.append(tmp);
            }
            string = string.substring(indexEnd + 1);
        }
        System.out.println(result);
    }
}