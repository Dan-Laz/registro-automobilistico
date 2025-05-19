public class Proprietario {

    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Proprietario(String nome, String cognome, String codiceFiscale){
        setNome(nome);
        setCognome(cognome);
        setCodiceFiscale(codiceFiscale);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public void setCodiceFiscale(String codiceFiscale){
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String toString() {
        return "nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale;
    }
}
