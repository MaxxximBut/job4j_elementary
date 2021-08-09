package ru.job4j.condition;

public class Club {
    public static void permisson(boolean hasMoney, boolean beFriend) {
        boolean rsl = true;
        if (hasMoney || beFriend == rsl) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permisson(true, true);
        permisson(true, false);
        permisson(false, true);
        permisson(false, false);
    }
}
