public class Test {
    public static void main(String[] args) {
        GroupBuilder groupBuilder = new GroupBuilder();
        Group group = groupBuilder.buildGroup();
        group.showInfo();
    }
}
