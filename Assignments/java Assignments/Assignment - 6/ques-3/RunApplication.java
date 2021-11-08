import java.util.*;

public class RunApplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("choose the option below to sort accordingly " +
                "a - ID " +
                "b - Name " +
                "c - Department " +
                "d - Salary ");
        String ch  = s.nextLine();

        switch (ch){
            case "a":
                TreeSet<Employee> employees = new TreeSet<>(Comparator.comparingInt(Employee::getId));

                Employee e1 = new Employee(1190,"abc","hbhj",98999);
                Employee e2 = new Employee(889,"plo","wased",30000);
                Employee e3 = new Employee(9320,"yhn","cffdr",8786);
                Employee e4 = new Employee(340,"ni","hbhmkoj",343767);
                Employee e5 = new Employee(190,"vdr","mnu",6546);
                Employee e6 = new Employee(909,"bhuy","nbh",43243);
                Employee e7 = new Employee(7690,"des","ikjuh",4343);
                Employee e8 = new Employee(453430,"mjhu","plok",5670980);
                Employee e9= new Employee(76690,"bgt","qwae",53548999);
                Employee e10 = new Employee(550,"bygy","mnjhk",989932319);

                employees.add(e1);
                employees.add(e2);
                employees.add(e3);
                employees.add(e4);
                employees.add(e5);
                employees.add(e6);
                employees.add(e7);
                employees.add(e8);
                employees.add(e9);
                employees.add(e10);
                for (Employee e : employees) {
                    System.out.println(e);
                }
                break;
            case "b":
                TreeSet<Employee> employeesByName = new TreeSet<>(new ComparatorClass());

                Employee en1 = new Employee(1190,"abc","hbhj",98999);
                Employee en2 = new Employee(889,"plo","wased",30000);
                Employee en3 = new Employee(9320,"yhn","cffdr",8786);
                Employee en4 = new Employee(340,"ni","hbhmkoj",343767);
                Employee en5 = new Employee(190,"vdr","mnu",6546);
                Employee en6 = new Employee(909,"bhuy","nbh",43243);
                Employee en7 = new Employee(7690,"des","ikjuh",4343);
                Employee en8 = new Employee(453430,"mjhu","plok",5670980);
                Employee en9= new Employee(76690,"bgt","qwae",53548999);
                Employee en10 = new Employee(550,"bygy","mnjhk",989932319);

                employeesByName.add(en1);
                employeesByName.add(en2);
                employeesByName.add(en3);
                employeesByName.add(en4);
                employeesByName.add(en5);
                employeesByName.add(en6);
                employeesByName.add(en7);
                employeesByName.add(en8);
                employeesByName.add(en9);
                employeesByName.add(en10);
                for (Employee e : employeesByName) {
                    System.out.println(e);
                }


                break;
            case "c":
                TreeSet<Employee> employeesByDepartment = new TreeSet<>(new DepartmentComparatorClass());

                Employee ed1 = new Employee(1190,"abc","hbhj",98999);
                Employee ed2 = new Employee(889,"plo","wased",30000);
                Employee ed3 = new Employee(9320,"yhn","cffdr",8786);
                Employee ed4 = new Employee(340,"ni","hbhmkoj",343767);
                Employee ed5 = new Employee(190,"vdr","mnu",6546);
                Employee ed6 = new Employee(909,"bhuy","nbh",43243);
                Employee ed7 = new Employee(7690,"des","ikjuh",4343);
                Employee ed8 = new Employee(453430,"mjhu","plok",5670980);
                Employee ed9= new Employee(76690,"bgt","qwae",53548999);
                Employee ed10 = new Employee(550,"bygy","mnjhk",989932319);

                employeesByDepartment.add(ed1);
                employeesByDepartment.add(ed2);
                employeesByDepartment.add(ed3);
                employeesByDepartment.add(ed4);
                employeesByDepartment.add(ed5);
                employeesByDepartment.add(ed6);
                employeesByDepartment.add(ed7);
                employeesByDepartment.add(ed8);
                employeesByDepartment.add(ed9);
                employeesByDepartment.add(ed10);

                for (Employee e : employeesByDepartment) {
                    System.out.println(e);
                }
                break;

            case "d":
                TreeSet<Employee> employeesBySalary = new TreeSet<>(Comparator.comparingInt(Employee::getSalary));

                Employee es1 = new Employee(1190,"abc","hbhj",98999);
                Employee es2 = new Employee(889,"plo","wased",30000);
                Employee es3 = new Employee(9320,"yhn","cffdr",8786);
                Employee es4 = new Employee(340,"ni","hbhmkoj",343767);
                Employee es5 = new Employee(190,"vdr","mnu",6546);
                Employee es6 = new Employee(909,"bhuy","nbh",43243);
                Employee es7 = new Employee(7690,"des","ikjuh",4343);
                Employee es8 = new Employee(453430,"mjhu","plok",5670980);
                Employee es9= new Employee(76690,"bgt","qwae",53548999);
                Employee es10 = new Employee(550,"bygy","mnjhk",989932319);

                employeesBySalary.add(es1);
                employeesBySalary.add(es2);
                employeesBySalary.add(es3);
                employeesBySalary.add(es4);
                employeesBySalary.add(es5);
                employeesBySalary.add(es6);
                employeesBySalary.add(es7);
                employeesBySalary.add(es8);
                employeesBySalary.add(es9);
                employeesBySalary.add(es10);

                for (Employee e : employeesBySalary) {
                    System.out.println(e);
                }
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
