public class Employee {
    String name;
    double salary;

    public Employee(String name,double salary){
        if (name == null && salary <=0){
            this.name="Unknown";
            this.salary = 0;
        }
        else
            this.salary=salary;
            this.name = name;
    }

    public Employee() {

    }

    public void printEmployee(){
        System.out.println("Employee name:" + " " + name + " " + "Salary:" + " " + salary);
    }
}
