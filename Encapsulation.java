// Student.java
class Student {

    // 1 Private data members (Data Hiding)
    private int rollNo;
    private String name;
    private int marks;

    // 2 Public setter methods
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) { // validation
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    // 3 Public getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

// Main.java
public class Encapsulation {
    public static void main(String[] args) {

        Student s = new Student();

        s.setRollNo(101);
        s.setName("Rahul");
        s.setMarks(5);

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}