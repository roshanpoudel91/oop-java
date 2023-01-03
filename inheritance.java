public class inheritance {
    public static void main(String[] args) {
        Enginner E1 = new Enginner();
        System.out.println("Salary:"+E1.salary+"\nBenefit:"+E1.benefit);        
    }   
}

class Employee{
        int salary = 50000;
}


class Enginner extends Employee{
    int benefit = 10000;
}

// Reference: https://www.geeksforgeeks.org/inheritance-in-java

