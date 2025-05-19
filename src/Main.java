import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Targa, Proprietario> registro = new HashMap<Targa, Proprietario>();

        registro.put(new Targa("CDWFRER"), new Proprietario("Dino","Cortinovis","DNCRT9884GB255"));
        registro.put(new Targa("NMREIYF"), new Proprietario("Livio","Dentella","LVDNT84297632"));
        registro.put(new Targa("CDWFRER"), new Proprietario("Alessio","Gritti","LSSGRT9865GF255"));

    }
}