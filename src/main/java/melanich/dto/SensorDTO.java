package melanich.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SensorDTO {

    @NotEmpty(message = "Название не может быть пустым")
    @Size(min = 3,max = 30,message = "Имя должно быть в пределах 3-30 слов")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
