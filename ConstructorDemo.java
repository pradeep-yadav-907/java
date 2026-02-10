
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");

        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}