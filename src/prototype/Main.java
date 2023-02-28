package prototype;

public class Main {
    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry = fillUpRegister(studentRegistry);

        Student aprBatchStudent = studentRegistry.get("Apr - LLD").clone();
        aprBatchStudent.setId(1);
        aprBatchStudent.setName("tiya");
        aprBatchStudent.setAge(23);

        Student mayBatchStudent = studentRegistry.get("May - LLD").clone();

    }

    private static StudentRegistry fillUpRegister(StudentRegistry studentRegistry) {

        Student aprBatch = new Student();
        aprBatch.setAvgBatchPsp(80);
        aprBatch.setBatchName("Apr - LLD");
        aprBatch.setYearOfEnrollment(2022);
        studentRegistry.register(aprBatch);

        Student mayBatch = new Student();
        mayBatch.setAvgBatchPsp(90);
        mayBatch.setBatchName("May - LLD");
        mayBatch.setYearOfEnrollment(2019);
        studentRegistry.register(mayBatch);

        IntelligentStudent intelligentAprBatch = new IntelligentStudent();
        intelligentAprBatch.setAvgBatchPsp(95);
        intelligentAprBatch.setBatchName("Intelligent - Apr - LLD");
        intelligentAprBatch.setYearOfEnrollment(2020);
        intelligentAprBatch.setIq(100);
        studentRegistry.register(intelligentAprBatch);

        return studentRegistry;
    }
}
