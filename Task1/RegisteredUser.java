// package RegisteredUser;
import java.util.Random;

class RegisteredUser extends User{

    String accNum;

    RegisteredUser(String name){
        super(name);
        this.id = "Reg-" + User.idGen;
        this.isEmployee = true;
        this.accNum = this.generateAccountNumber();
    }

    private String generateAccountNumber(){
        Random rand = new Random(); 
        int upperbound = 100000;
        return "" + rand.nextInt(upperbound);
    }
    
    @Override
    public void print() {
        System.out.println("Registered User: " + this.id);
        System.out.println("ACC NUMBER: "+ this.accNum);
    }

}