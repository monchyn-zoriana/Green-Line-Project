package ua.greenline.demo.DTO;



import java.time.LocalDate;


public class UserFullDTO extends UserSimpleDTO{
    private String name;
    private LocalDate dateBirth;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

}
