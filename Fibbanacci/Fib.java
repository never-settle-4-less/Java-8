public class Fib {
    private int n1 = 0;
    private int n2 = 1;
    

    public void iterative(int N){

        int counter = 0;

        while(counter <= N){
            System.out.println(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            counter = counter + 1;
        }
    }

    public int recursive(int num){

        if(num <= 1){
            return num;
        }
        return recursive(num - 1) + recursive(num - 2);
    }
}




   