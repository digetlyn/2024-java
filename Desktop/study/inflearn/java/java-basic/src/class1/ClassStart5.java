package class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "송경민";
        student1.age = 40;
        student1.grade = 50;

        Student student2 = new Student();
        student2.name = "송경민2";
        student2.age = 42;
        student2.grade = 55;

        Student[] students = new Student[] {student1, student2};
        for (int i  = 0; i < students.length; i++) {
            System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:"  + students[0].grade);
        }
    }
}
