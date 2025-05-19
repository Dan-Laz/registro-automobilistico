import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static HashMap<Targa, Proprietario> registro = new HashMap<Targa, Proprietario>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("targa RETURN nome RETURN cognome RETURN codice fiscale RETURN");
            if (put(new Targa(in.nextLine()), new Proprietario(in.nextLine(),in.nextLine(),in.nextLine()))){
                System.out.println("aggiunto");
            }else{
                System.out.println("non aggiunto, gia presente");
            }
            System.out.println(registro);
            System.out.println("continue? yes - no");
        }while(in.nextLine().equals("yes"));
    }

    public static boolean put(Targa t, Proprietario p){
        if (registro.containsKey(t)){
            return false;
        }else{
            registro.put(t,p);
            return true;
        }
    }

    public static HashMap<Proprietario, List<Targa>> revert(){

    }
}