public class PassingExample {
    public static void main(String[] args) {
        String name = "Asmi";
        // greet(name);
        changeName(name);
        System.out.println(name);
    }
    static void greet(String nam){
        System.out.println(nam);
        nam = "ashu";
    }

    static void changeName(String naam) {
        naam = "Anjli";
    }
}
