import java.util.Random;

public class Employee {
    static int idGen = 0;
    String id;
    String accNum;
    String name;
    Boolean isEmployee;

    Employee(String name){
        this.name = name;
        this.id = "Emp-" + Employee.idGen;
        Employee.idGen++;
        this.accNum = this.generateAccountNumber();
        this.isEmployee = true;
    }

    private String generateAccountNumber(){
        Random rand = new Random(); 
        int upperbound = 100000;
        return "account num =" + rand.nextInt(upperbound);
    }
}