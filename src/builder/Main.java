package builder;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = Student.builder()
                .setId(1)
                .setPsp(81)
                .setName("tiyasha")
                .setGradYear(2022)
                .setAge(21)
                .build();

        System.out.println(student.getName());
        System.out.println(student.getAge());

    }
}
