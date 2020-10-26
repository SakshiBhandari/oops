
public class Employee {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    //Write your code here
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public int getEmpId(){
        return this.empId = empId;
    }
    public void setFirstName(String empFirstName){
        this.empFirstName = empFirstName;
    }
    public String getFirstName(){
        return this.empFirstName = empFirstName;
    }
    public void setSecondName(String empSecondName) {
        this.empSecondName = empSecondName;
    }
    public String getSecondName() {
        return this.empSecondName = empSecondName;
    }
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    public double getEmpSalary() {
      return  this.empSalary = empSalary;
    }
}
class Source1  {
    public static void main(String[] args) {

        //Write your code here
        Employee E1 = new Employee();
        Employee E2 = new Employee();

        E1.setEmpId(101512031);
        E1.setEmpSalary(540006.96);
        E1.setFirstName("Sushil");
        E1.setSecondName("Kumar");
        System.out.println("employee full name " + E1.getFirstName()+" "+ E1.getSecondName());
        System.out.println(" ");
        System.out.println("employee annual package "+ E1.getEmpSalary());

        E2.setEmpId(10151203);
        E2.setEmpSalary(612011.88);
        E2.setFirstName("Tara");
        E2.setSecondName("Sharma");
        System.out.println("employee full name " + E2.getFirstName()+" "+ E2.getSecondName());
        System.out.println(" ");
        System.out.println("employee annual package "+ E2.getEmpSalary());
    }
}
