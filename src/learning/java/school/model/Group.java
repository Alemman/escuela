package learning.java.school.model;


public class Group {
    private Professor professor;
    private int availability;
    private Student[] students;
    private int enrolled;

    public Group(int availability) {
        this.availability = availability;
        students = new Student[availability];
    }

    public Group(int availability,Professor professor) {
        this.availability = availability;
        this.professor = professor;
        students = new Student[availability];
    }


    public void setProfessor(Professor professorPaco) {
        professor = professorPaco;
    }

    public void addStudent(Student student) {
        students[enrolled] = student;
        changePosition();

    }
    private void changePosition(){
        enrolled ++;
    }

    public int getAvailability() {
        return availability;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public void printStudentsList() {
        for (Student student:students) {
                if(student != null)
                    System.out.println(student.getName());
        }
    }

    public Professor getProfessor() { return professor;}
}

