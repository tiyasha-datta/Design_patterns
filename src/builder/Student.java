package builder;

public class Student {
    private int id;
    private int psp;
    private String name;
    private int gradYear;
    private int age;

    private Student(Builder builder) {
        this.id = builder.id;
        this.psp = builder.psp;
        this.name = builder.name;
        this.gradYear = builder.gradYear;
        this.age = builder.age;
    }

    public static Builder builder(){
        Builder builder1 = new Builder();
        return builder1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static class Builder{
        private int id;
        private int psp;
        private String name;
        private int gradYear;
        private int age;

        private Builder() {
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() throws Exception{
            if(gradYear >= 2023){
                throw new Exception("grad year is not valid");
            }

            if(age < 18){
                throw new Exception("age is not valid");
            }

            if(psp < 80){
                throw new Exception("psp is not valid");
            }
            Student student = new Student(this);
            return student;
        }
    }
}
