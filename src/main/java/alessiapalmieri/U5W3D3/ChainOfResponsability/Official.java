package alessiapalmieri.U5W3D3.ChainOfResponsability;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Official {
    private Official superior;
    private int salary;

    public void check(int salary){
        if(salary <= this.salary) System.out.println(this.getClass().getSimpleName() + "'s Salary is higher than " + salary);
        if (superior != null){
            this.superior.check(salary);
        } else {
            System.out.println("There are no other superior officers!!");
        }
    }

}
