import java.util.Set;

public class encapsulation{
    public static void main(String[] args) {
            GFG G = new GFG();
            G.set("Roshan Poudel",11.0f);
            G.get();
        
    }
}

public class GFG {
    static String Employee_name;
    static Float Employee_salary;

    public void set(String E, Float s){
        Employee_name = E;
        Employee_salary = s;
    }

    public void get(){
        System.out.println("Employee name:" + Employee_name);
        System.out.println("Employee salary: "+Employee_salary);
    }

}


// For reference: https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/