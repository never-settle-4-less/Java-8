class User{

    static int idGen = 0;
    String id;
    String name;
    Boolean isEmployee;

    User(String name){
        this.name = name;
        this.id = "Emp-" + User.idGen;
        User.idGen++;
        this.isEmployee = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void print(){
        
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }
}
