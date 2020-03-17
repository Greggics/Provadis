package aufgabe52;

public class Company {
    private String name;
    private String industry;
    private int employees;

    public Company(String name, String industry, int employees) {
        this.name = name;
        this.industry = industry;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                ", employees=" + employees +
                '}';
    }
}
