import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    Integer id;
    String name;
    Integer salary;

    public Employee(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Tolganay1",5),
                new Employee(2,"Tolganay2",7),
                new Employee(3,"Tolganay3",1),
                new Employee(4,"Tolganay4",3),
                new Employee(5,"Tolganay5",6));
//first way
        employeeList.stream()
                .sorted(Comparator.comparing(employee -> - employee.getSalary()))
                .limit(3)
                .forEach(System.out::println);
//second way
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);

    }
}
