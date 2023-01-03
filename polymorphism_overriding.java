public class polymorphism_overriding {
    public static void main(String[] args) {
        Roshan.print();
        Ajita.print();
        Ranjit.print();
    }
}

class Roshan {
    public static void print(){
        System.out.println("Hello Roshan");
    }
}

class Ajita extends Roshan{
    public static void print(){
        System.out.println("Hello Ajita");

    }
}

class Ranjit extends Roshan{
    public static void print(){
        System.out.println("Hello Ranjit");

    }
}

