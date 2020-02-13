public class Group {
    private String name;
    private Leader leader;
    private Student[] students;

    public Group(String name, Leader leader, Student[] students) {
        this.name = name;
        this.leader = leader;
        this.students = students;
    }

    public void showInfo() {
        System.out.println("Group name: " + name + "\nLeader: " + leader.getFirstName() + " " + leader.getLastName());
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].getFirstName() + " " + students[i].getLastName());
        }
    }
}
