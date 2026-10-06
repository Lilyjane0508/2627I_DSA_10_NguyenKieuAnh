import java.util.*;
public class JavaSort {
    public class Student {
        int id;
        String name;
        double cgpa;
        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }

    public class StudentComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (s1.cgpa != s2.cgpa) return Double.compare(s2.cgpa, s1.cgpa);
            else if (!s1.name.equals(s2.name)) return s1.name.compareTo(s2.name);
            else return Integer.compare(s1.id, s2.id);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = scanner.nextDouble();
            students[i] = new JavaSort().new Student(id, name, cgpa);
        }
        Arrays.sort(students, new JavaSort().new StudentComparator());
        for (Student student : students) System.out.println(student.name);
    }
}