package lab3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskA {
    public static void defiant() {
        ArrayList<Student> mass = new ArrayList<>();
        int key = 1;
        Scanner in = new Scanner(System.in);
        while (key != 0) {
            menu();
            key = in.nextInt();
            switch (key) {
                case 1:
                    System.out.println("enter from the keyboard");
                    String surname;
                    String name;
                    String patronymic;
                    String dateOfBirth;
                    String address;
                    String number;
                    String faculty;
                    int course;
                    int group;
                    int count = 0;
                    System.out.print("Enter the number of students: ");
                    count = in.nextInt();
                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter student details: " + '\n' + "full name: ");
                        surname = in.next();
                        name = in.next();
                        patronymic = in.next();
                        System.out.print("Date of birth and address: ");
                        dateOfBirth = in.next();
                        address = in.next();
                        System.out.print("Personal number: ");
                        number = in.next();
                        System.out.print("Faculty, course and group: ");
                        faculty = in.next();
                        course = in.nextInt();
                        group = in.nextInt();
                        mass.add(new Student(surname, name, patronymic, dateOfBirth, address, number, faculty, course, group));
                    }
                    break;
                case 2:
                    System.out.println("Data is taken out of file");
                    try {
                        File file = new File("D:/labs/2course/MPI/BSU/fourth-semester/text-files-for-labs/students.txt");
                        FileReader fr = new FileReader(file);
                        BufferedReader reader = new BufferedReader(fr);
                        surname = reader.readLine();
                        while (surname != null) {
                            name = reader.readLine();
                            patronymic = reader.readLine();
                            dateOfBirth = reader.readLine();
                            address = reader.readLine();
                            number = reader.readLine();
                            faculty = reader.readLine();
                            course = Integer.parseInt(reader.readLine());
                            group = Integer.parseInt(reader.readLine());
                            mass.add(new Student(surname, name, patronymic, dateOfBirth, address, number, faculty, course, group));
                            surname = reader.readLine();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    for (Student iter : mass) {
                        System.out.println(iter + "\n");
                    }
                    break;
                case 3:
                    System.out.println("introduce students of one faculty");
                    System.out.println("Enter the name of the faculty: ");
                    faculty = in.next();
                    if (!mass.isEmpty()) {
                        ArrayList<Student> res = byFaculty(mass, faculty);
                        if (res.isEmpty()) {
                            System.out.println("No students found for this faculty.");
                        } else {
                            for (Student iter : res) {
                                System.out.println(iter + "\n");
                            }
                        }
                    } else {
                        System.out.println("You have not entered any student yet");
                    }
                    break;
                case 4:
                    System.out.println("introduce faculty and course students");
                    System.out.println("Enter faculty name and course: ");
                    faculty = in.next();
                    course = in.nextInt();
                    if (!mass.isEmpty()) {
                        ArrayList<Student> res = byFacultyAndCourse(mass, faculty, course);
                        if (res.isEmpty()) {
                            System.out.println("No students of this faculty and course were found.");
                        } else {
                            for (Student iter : res) {
                                System.out.println(iter + "\n");
                            }
                        }
                    } else {
                        System.out.println("You have not entered any student yet");
                    }
                    break;
                case 5:
                    System.out.println("introduce students of one study group");
                    System.out.println("Enter faculty name, course and group: ");
                    faculty = in.next();
                    course = in.nextInt();
                    group = in.nextInt();
                    if (!mass.isEmpty()) {
                        ArrayList<Student> res = byGroup(mass, faculty, course, group);
                        if (res.isEmpty()) {
                            System.out.println("No students found in this study group.");
                        } else {
                            for (Student iter : res) {
                                System.out.println(iter + "\n");
                            }
                        }
                    } else {
                        System.out.println("You have not entered any student yet");
                    }
                    break;
                case 6:
                    System.out.println("introduce students by age");
                    System.out.println("Enter the year: ");
                    int year = in.nextInt();
                    if (!mass.isEmpty()) {
                        ArrayList<Student> res = byAge(mass, year);
                        if (res.isEmpty()) {
                            System.out.println("No students of this faculty and course were found.");
                        } else {
                            for (Student iter : res) {
                                System.out.println(iter + "\n");
                            }
                        }
                    } else {
                        System.out.println("You have not entered any student yet");
                    }
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("1 - enter from the keyboard");
        System.out.println("2 - enter from file");
        System.out.println("3 - enter students of the same faculty");
        System.out.println("4 - enter the students of the faculty and course");
        System.out.println("5 - enter students of one study group");
        System.out.println("6 - enter students by age");
        System.out.println("0 - exit");
    }

    private static ArrayList<Student> byFaculty(ArrayList<Student> mass, String faculty) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student iter : mass) {
            if (iter.getFaculty().equals(faculty)) {
                result.add(iter);
            }
        }
        return result;
    }

    private static ArrayList<Student> byFacultyAndCourse(ArrayList<Student> mass, String faculty, int course) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student iter : mass) {
            if (iter.getFaculty().equals(faculty) && course == iter.getCourse()) {
                result.add(iter);
            }
        }
        return result;
    }

    private static ArrayList<Student> byGroup(ArrayList<Student> mass1, String faculty, int course, int group) {
        ArrayList<Student> mass = byFacultyAndCourse(mass1, faculty, course);
        ArrayList<Student> result = new ArrayList<>();
        for (Student iter : mass) {
            if (iter.getGroup() == group) {
                result.add(iter);
            }
        }
        return result;
    }

    private static ArrayList<Student> byAge(ArrayList<Student> mass, int year) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student iter : mass) {
            String buff = iter.getDateOfBirth().substring(6);
            Integer yearOfBirth = Integer.valueOf(buff);
            if (yearOfBirth.intValue() >= year) {
                result.add(iter);
            }
        }
        return result;
    }
}
