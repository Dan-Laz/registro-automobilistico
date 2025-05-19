public class Targa {
    private String numero;

    public Targa(String numero){

    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero(){
        return numero;
    }

    public boolean equals(Object o){
        if (o instanceof Targa){
            Targa t = (Targa) o;
            return (t.getNumero().equals(this.getNumero()));
        }else return false;
    }

    public int hashCode() {
        return numero.hashCode();
    }

    public String toString(){
        return "targa: "+numero;
    }
}
