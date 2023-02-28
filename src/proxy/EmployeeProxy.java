package proxy;

public class EmployeeProxy implements EmployeeDAO{

    private EmployeeDAO employeeDAO;

    public EmployeeProxy(){
        this.employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {

        if(client.equals("ADMIN")){
            employeeDAO.create(client,obj);
            return;
        }
        throw new Exception("access denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {

        if(client.equals("ADMIN")){
            employeeDAO.delete(client,employeeId);
            return;
        }
        throw new Exception("access denied");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {

        if(client.equals("ADMIN")){
            return employeeDAO.get(client,employeeId);
        }
        throw new Exception("access denied");
    }
}
