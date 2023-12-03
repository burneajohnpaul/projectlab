package Main;

class Student extends Person {
    private final String studentID;

    public Student(String name, String category, String studentID) {
        super(name, category);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }
}