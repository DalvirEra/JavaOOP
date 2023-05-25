
public class Vacancy {
    private String VacancyName;
    private String CompanyName;
    private double Salary;
    private VacancyType VacancyType;   


    public Vacancy (String CompanyName, String VacancyName, double Salary, VacancyType VacancyType){
        this.CompanyName = CompanyName;
        this.VacancyName = VacancyName;
        this.Salary = Salary;
        this.VacancyType = VacancyType;
    }

    public String getVacancyName(){
        return VacancyName;
    }
    public String getCompanyName(){
        return CompanyName;
    }
    public String getSalary(){
        return Salary;
    }
    public VacancyType getVacancyType(){
        return VacancyType;
    }

}