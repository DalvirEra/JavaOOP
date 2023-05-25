
public class Student implements Observer {

    private String name;
    private double salary;
    private VacancyType vacancyType;

    public Student(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
        salary = 5000;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.vacancyType == vacancy.getVacancyType()){
            if (this.salary < salary){
                System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f]\n",
                        name, vacancy.getCompanyName(), salary);
                this.salary = salary;
            }
            else{
                System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f]\n",
                        name, vacancy.getCompanyName(), salary);
            }
        }
        else{
            System.out.printf("Студент %s >>> Я найду работу по образованию! [%s - %f]\n",
                    name, vacancy.getCompanyName(), salary);
        }

    }
}
