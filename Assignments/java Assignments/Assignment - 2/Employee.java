class Main{
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee labour  = new Labour();
        int sal1 = manager.getSalary(20000);
        int sal2 = labour.getSalary(4);
        System.out.println("Salary of Manager = " +sal1+" Salary of labour = "+sal2);
        System.out.println("Total Salary of Employees = " +(sal1+sal2));
    }
}

public class Employee {
    int salary = 50000;

    int getSalary(int increments){
        return salary+increments;
    }

}

class Labour extends Employee{
    int overtime = 4;

    @Override
    int getSalary(int increment) {
        return super.getSalary(overtime*1000);
    }
}

class Manager extends Employee{
    int incentives = 20000 ;

    @Override
    int getSalary(int increment) {
        return super.getSalary(incentives);
    }
}

