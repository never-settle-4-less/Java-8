public class NonRegisteredUser extends User{
    
    NonRegisteredUser(String name){
        super(name);
        this.id = "non Reg-" + User.idGen;
    }

}
