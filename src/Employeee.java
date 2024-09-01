public class Employeee {
    private String id;
    private String name;

    private String company;

    private Integer salary;

    public Employeee(String id, String name, String company, Integer salary) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
