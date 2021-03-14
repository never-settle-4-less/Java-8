import java.util.ArrayList;

public class arraylist {
     public static void main(String[] args){

        ArrayList<Employee> emp_list = new ArrayList<Employee>();

        Employee obj1 = new Employee("Sai");
        Employee obj2 = new Employee("Sravan");
        Employee obj3 = new Employee("Sagar");

        emp_list.add(obj1);
        emp_list.add(obj2);
        emp_list.add(obj3);

        for (Employee ob: emp_list)
        {
            
            System.out.println("Emp ID = "+ ob.id);
            System.out.println("Emp Name = "+ ob.name);
            System.out.println("Account num = "+ ob.accNum);


            System.out.println("------------------------------------------------");
        }

        String[] ename = {"Sravan", "Sathwik", "Akhilesh", "Sagar"};
        ArrayList<RegisteredUser> registered_list = new ArrayList<>();
        int size = ename.length;

        for(int i = 0; i < size; i++){

            registered_list.add(new RegisteredUser(ename[i]));
            displayElements(registeredlist);  
        }

        // public void displayElements(ArrayList<)



     }  



    
}
