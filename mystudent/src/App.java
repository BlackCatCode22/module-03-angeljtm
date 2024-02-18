public class App {
    public static void main(String[] args) {

        Student myStudent = new Student();
        myStudent.firstName ="Angel";
        myStudent.lastName = "Torres";
        myStudent.major= "Computer Science";
        myStudent.gpa = 3.4;
        myStudent.age = 19;
        myStudent.onProbation = false;

        System.out.println(myStudent.firstName + " " + myStudent.lastName);

        Student randomStudent = new Student();
        randomStudent.firstName ="Michael";
        randomStudent.lastName = "Scott";
        randomStudent.major= "Business";
        randomStudent.gpa = 2.4;
        randomStudent.age = 24;
        randomStudent.onProbation = false;

        System.out.println(randomStudent.firstName + " " + randomStudent.lastName);
    }
}
