//compile time overloading-> method overloading
 

public class polymorphism_overloading {
    public static void main(String[] args) {
        System.out.println(Math.Multiply(1,2));
        System.out.println(Math.Multiply(2,3,4));
    }
}

class Math {
    static int Multiply(int a, int b){
        return a*b;
    }

    static int Multiply(int a, int b, int c){
        return a*b*c;
    }
}


