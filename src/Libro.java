public class Libro {
    /**************************************** ATTRIBUTI ****************************************/
    private String titolo;
    private String autore;
    private int numeroPagine;
    private double costoPagine = 0.05;
    private static double costoFisso = 5.5;

    /**************************************** COSTRUTTORI ****************************************/
    /* Master */
    public Libro (String titolo, String autore, int numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    /* Copia */
    public Libro (Libro libro) {
        this.titolo = libro.getTitolo();
        this.autore = libro.getAutore();
        this.numeroPagine = libro.getNumeroPagine();
    }

    /**************************************** SETTER ****************************************/
    public void setAutore(String autore) {
        this.autore = autore;
    }

    public static void setCostoFisso(double costoFisso) {
        Libro.costoFisso = costoFisso;
    }

    public void setCostoPagine(double costoPagine) {
        this.costoPagine = costoPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**************************************** GETTER ****************************************/
    public String getAutore() {
        return autore;
    }

    public static double getCostoFisso() {
        return costoFisso;
    }

    public double getCostoPagine() {
        return costoPagine;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    /**************************************** METODI *****************************************/
    public double Prezzo (Libro l) {
        double prezzo;

        prezzo = l.getNumeroPagine() * costoPagine ;

        return prezzo;
    }

    public boolean equalsLibri (Libro l) {
        boolean esito = false;

        if (autore.equals(l.getAutore()) && titolo.equals(l.getTitolo())) {
            esito = true;
        }

        return esito;
    }

    public String toString () {
        return "\nTitolo: " + titolo +  "\nAutore: " + autore + "\nPagine: " + numeroPagine;
    }
}