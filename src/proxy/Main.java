package proxy;

public class Main {
    public static void main(String[] args) {
        try{
            EmployeeDAO employeeDAO = new EmployeeProxy();
            employeeDAO.create("ADMIN", new EmployeeDo());
            System.out.println("successful");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
