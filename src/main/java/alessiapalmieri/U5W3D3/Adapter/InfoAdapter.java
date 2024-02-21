package alessiapalmieri.U5W3D3.Adapter;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class InfoAdapter implements DataSource{
    private Info info;

    @Override
    public String getFullName(){
        return info.getName() + " " + info.getLastname();
    }

    @Override
    public int getAge(){
        LocalDate dateOfBirth = info.getDateOfBirth();
        LocalDate today = LocalDate.now();
        return today.minusYears(dateOfBirth.getYear()).getYear();
    }
}
