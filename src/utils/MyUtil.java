package src.utils;

import java.util.Scanner;

public class MyUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void ViewChoiceStandards() {
        System.out.println("Choice Standards:");
        System.out.println("1.One Star\n2.Two Stars\n3.Three Starts\n4.four Starts\n5.fiveStars");
    }


    public static void ViewChoiceServiceFree() {
        System.out.println("Choice bookingService Free;");
        System.out.println("1.Free one month of room cleaning");
        System.out.println("2.Free bus fare for a month to work far away");
        System.out.println("3.Free breakfast for one month");
    }

    public static void ViewGender() {
        System.out.println("Choice gender:");
        System.out.println("1. Female\n2. Male");
    }

    public static void viewRentalType() {
        System.out.println("Choice type:");
        System.out.println("1.by hour\n2.by day\n3.by month\n4.by month");
    }

    public static String setRomStandards(int select) {
        String standards = "";
        do {
            switch (select) {
                case 1:
                    standards = "One Star";
                    break;
                case 2:
                    standards = "Two Stars";
                    break;
                case 3:
                    standards = "Three Stars";
                    break;
                case 4:
                    standards = "Four Stars";
                    break;
                case 5:
                    standards = "Five Stars";
                    break;
            }
        } while (standards.equals(""));
        return standards;
    }


    public static String setServiceFree(int choice) {
        String svFree = "";
        do {
            switch (choice) {
                case 1:
                    svFree = "cleaning";
                    break;
                case 2:
                    svFree = "bus";
                    break;
                case 3:
                    svFree = "breakfast";
                    break;
                default:
                    System.out.println("Choice number 1 --> 3:");
            }
        } while (svFree.equals(""));
        return svFree;
    }

    public static String setGender(int choice) {
        String gender = "";
        do {
            switch (choice) {
                case 1:
                    gender = "Female";
                    break;
                case 2:
                    gender = "Male";
                    break;
            }
        } while (gender.equals(""));
        return gender;
    }

    public static String setRentalType(int choice) {
        String type = "";
        do {
            switch (choice) {
                case 1:
                    type = "by hour";
                    break;
                case 2:
                    type = "by day";
                    break;
                case 3:
                    type = "by month";
                    break;
                case 4:
                    type = "by year";
                    break;
            }
        } while (type.equals(""));
        return type;
    }
    public static boolean checkDate(int age) {
        return age >= 18 && age <= 100;
    }
}
