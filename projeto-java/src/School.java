public class School {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Alex Silva";
        student.age = 45;
        student.sex = 'M';
        student.color = "Black";

        Student student2 = new Student();
        student2.name = "João Silva";
        student2.age = 35;
        student2.sex = 'M';
        student2.color = "Black";

        System.out.println(student.name);
        System.out.println(student2.name);
    }
}
