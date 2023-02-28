package proxy;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("employee created");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("employee deleted");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("employee received");
        return new EmployeeDo();
    }
}
