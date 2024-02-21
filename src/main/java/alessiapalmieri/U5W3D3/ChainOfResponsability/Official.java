package alessiapalmieri.U5W3D3.ChainOfResponsability;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Official {
    private Official superior;
    private int salary;
}
