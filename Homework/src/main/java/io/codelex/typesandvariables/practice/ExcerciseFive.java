package io.codelex.typesandvariables.practice;

public class ExcerciseFive {
    public static void main(String[] args) {
        //Would it not be better to use arrays without variables?
        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Infomation Systems";
        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";
        System.out.printf("+------------------------------------------------------------+%n");
        System.out.printf("| %d | %36s | %15s |%n", 1, course1, teacher1);
        System.out.printf("| %d | %36s | %15s |%n", 2, course2, teacher2);
        System.out.printf("| %d | %36s | %15s |%n", 3, course3, teacher3);
        System.out.printf("| %d | %36s | %15s |%n", 4, course4, teacher4);
        System.out.printf("| %d | %36s | %15s |%n", 5, course5, teacher5);
        System.out.printf("| %d | %36s | %15s |%n", 6, course6, teacher6);
        System.out.printf("| %d | %36s | %15s |%n", 7, course7, teacher7);
        System.out.printf("| %d | %36s | %15s |%n", 8, course8, teacher8);
        System.out.printf("+------------------------------------------------------------+%n");

        String[][] classesTeachers = {{"English III", "Ms. Lapan"}, {"Precalculus", "Mrs. Gideon"}, {"Music Theory", "Mr. Davis"}, {"Biotechnology", "Ms. Palmer"},
                {"Principles of Technology I", "Ms. Garcia"}, {"Latin II", "Mrs. Barnett"}, {"AP US History", "Ms. Johannessen"}, {"Business Computer Infomation Systems", "Mr. James"}};
        System.out.printf("+------------------------------------------------------------+%n");
        for (int i = 0; i < classesTeachers.length; i++)
            System.out.printf("| %d | %36s | %15s |%n", i + 1, classesTeachers[i][0], classesTeachers[i][1]);
        System.out.printf("+------------------------------------------------------------+%n");
    }
}
