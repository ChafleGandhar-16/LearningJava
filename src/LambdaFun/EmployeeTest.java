package LambdaFun;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int empID;
    String name;
    int salary;
    Department dept;

    public Employee(int empID, String name, int salary, Department dept) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
        this.dept = dept;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept=" + dept.toString() +
                '}';
    }

    int getEmpID() {
        return empID;
    }
    void setEmpID(int empID) {
        this.empID = empID;
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    int getSalary() {
        return salary;
    }
    void setSalary(int salary) {
        this.salary = salary;
    }
    Department getDept() {
        return dept;
    }
}

class Department {
    private int deptID;
    private String name;
    private int empID;

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptID=" + deptID +
                ", name='" + name + '\'' +
                ", empID=" + empID +
                '}';
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Scanner in  = new Scanner(System.in);
        List<Integer> id = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<String> name = new ArrayList<>(Arrays.asList("AA",  "BB", "CC", "DD", "EE", "FF", "GG", "HH", "II", "JJ"));
        List<Integer> salary = new ArrayList<>(Arrays.asList(10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000));
        List<String> deptName = new ArrayList<>(Arrays.asList("Management","Sells","Sells", "Design", "Sells", "Design", "Design","Worker", "Worker","Management"));
        List<Integer> deptID = new ArrayList<>(Arrays.asList(1,2,2,4,2,3,3,5,5,1));
        for (int i = 0; i < 10; i++) {
            Department dept = new Department();
            dept.setEmpID(id.get(i));
            dept.setName(deptName.get(i));
            dept.setDeptID(deptID.get(i));
            empList.add(new Employee(id.get(i), name.get(i), salary.get(i), dept));
        }
        System.out.println("Department Info:");
        for (Employee emp : empList) {
            System.out.println(emp.toString());
        }

//        List<String> names = empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
    }
}
