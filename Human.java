public class Human {
    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;

    public Human(int yearOfBirth, String name, String town) {
        setYearOfBirth(yearOfBirth);
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else this.name = "Информация не указана";
        setTown(town);
    }

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this(yearOfBirth, name, town);
        if (jobTitle != null && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else this.jobTitle = "Информация не указана";
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            yearOfBirth = 0;
        }
        this.yearOfBirth = yearOfBirth;
    }

    public void setTown(String town) {
        if (town == null || town.isBlank() == true) {
            town = "Информация не указана";
        }
        this.town = town;
    }
}
