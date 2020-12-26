import java.rmi.Naming;


public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
           service1.crediter(150);
           service1.lireSolde();
           service1.debiter(50);
           service1.lireSolde();

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}