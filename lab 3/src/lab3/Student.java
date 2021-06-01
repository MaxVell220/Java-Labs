package lab3;

public class Student {
    private static int counter = 1;
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private String address;
    private String number;
    private String faculty;
    private int course;
    private int group;


    public Student() {
        this.surname = "";
        this.name = "";
        this.patronymic = "";
        this.dateOfBirth = "";
        this.address = "";
        this.number = "";
        this.faculty = "";
        this.course = 1;
        this.group = 1;
    }

    public Student(Student student) {
        surname = student.surname;
        name = student.name;
        patronymic = student.patronymic;
        dateOfBirth = student.dateOfBirth;
        address = student.address;
        number = student.number;
        faculty = student.faculty;
        course = student.course;
        group = student.group;
        id = counter;
        counter++;
    }

    public Student(String surname, String name, String patronymic, String dateOfBirth, String address, String number, String faculty, int course, int group) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.number = number;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        id = counter;
        counter++;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }


    @Override
    public String toString() {
        return "Student {" +
                "Full name: " + surname + " " + name + " " + patronymic + '\n' +
                "Birth day: " + dateOfBirth + '\n' +
                "Address: " + address + '\n' +
                "Phone number: " + number + '\n' +
                "Faculty, course aтв group: " + faculty + " " + course + " " + group +
                '}';
    }

}
