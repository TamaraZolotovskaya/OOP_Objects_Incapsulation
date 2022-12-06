public class Human {
    public final int yearOfBirth;
    public final String name;
    public String town;
    public String jobTitle;

    public Human(int yearOfBirth, String name, String town) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else this.yearOfBirth = 0;
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else this.name = "Информация не указана";
        if (town != null && !town.isBlank()) {
            this.town = town;
        } else this.town = "Информация не указана";
    }

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this(yearOfBirth, name, town);
        if (jobTitle != null && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else this.jobTitle = "Информация не указана";
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
