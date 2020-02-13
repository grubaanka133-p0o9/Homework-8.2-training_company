import java.util.Scanner;

public class GroupBuilder {
    public Group buildGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Group name: ");
        String name = scanner.nextLine();
        Leader leader = buildLeader();
        Student[] students = buildStudentsArray();
        return new Group(name, leader, students);

    }

    private Leader buildLeader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Leader first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Leader last name: ");
        String lastName = scanner.nextLine();
        return new Leader(firstName, lastName);
    }

    private Student[] buildStudentsArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int number = scanner.nextInt();
        Student[] students = new Student[number];
        for (int i = 0; i < number; i++) {
            students[i] = buildStudent();
        }
        return students;
    }

    private Student buildStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Student last name: ");
        String lastName = scanner.nextLine();
        return new Student(firstName, lastName);
    }
}

