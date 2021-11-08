import java.util.Comparator;

public class ComparatorClass implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
class DepartmentComparatorClass implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getDepartment().compareTo(e2.getDepartment());
    }
}


