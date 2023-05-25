
import java.util.Random;

public enum VacancyType {
    Programmer,
    Economist,
    Teacher;

    private static Random RNG = new Random();
    public static VacancyType randomType(){
        VacancyType[] vacancyTypes = values();
        return vacancyTypes[RNG.nextInt(vacancyTypes.length)];
    }
}