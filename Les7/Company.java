import java.util.Random;

/**
 * Компания
 */
public class Company {

    private Random random;
    private String nameCompany;
    private double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    public void needEmployee(){

        Vacancy Vacancy = new Vacancy(nameCompany, "foobar", random.nextDouble(3000, maxSalary), VacancyType.randomType());
        jobAgency.sendOffer(Vacancy);
    }



}
