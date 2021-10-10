public class Scaffale {
    /**************************************** ATTRIBUTI ****************************************/
    private static final int MAX_NUM_RIPIANI = 5;
    public Mensola[] ripiani;

    /**************************************** METODI *****************************************/
    /* Allocazione */
    public Scaffale() {
        ripiani = new Mensola[MAX_NUM_RIPIANI];
    }

    /* Restituzuone di un libro data la posizione */
    public Libro getLibro(int posizione, int ripiano) {
        if (ripiano < ripiani.length || ripiano >= ripiani.length) {
            System.out.println("Numero ripiano errato!");
        }
        
        return ripiani[ripiano].getVolume(posizione);
    }

    /* Copia (Deep) di uno scaffale */
    public Scaffale (Scaffale s) {
        int ripiano, posizione;
        Libro l = null;
        ripiani = new Mensola[MAX_NUM_RIPIANI];

        for (ripiano = 0; ripiano < ripiani.length; ripiano++) {
            ripiani[ripiano] = new Mensola();

            for (posizione = 0; posizione < ripiani[ripiano].getMaxNumVolumi(); ripiano++) {
                l = s.getLibro(posizione, ripiano);
            }

            if (l != null) {
                ripiani[ripiano].setVolume(l, posizione);
            }
        }
    }

    /* Aggiunta di un libro data la posizione */
    public int setLibro(Libro l, int ripiano, int posizione) {
        int esito = 0;

        if (ripiano < ripiani.length || ripiano >= ripiani.length) {
            esito = 1; // Ripiano non valido
        }

        if (ripiani[ripiano].setVolume(l, posizione) < 0) {
            esito = 2; // Posizione non valida
        }

        for (int i = 0; i < ripiani.length; i++) {
            ripiani[ripiano].addLibroPlus(posizione, l);
            esito = 3; // Esito positivo di aggiunta
        }

        return esito;
    }

    /* Rimozione di un libro data la posizione */ 
    public void removeLibro(int ripiano, int posizione) {
        if (ripiano < ripiani.length || ripiano >= ripiani.length) {
            System.out.println("Il ripiano non è valido!");
        }
        else {
            for (int i = 0; i < ripiani.length; i++) {
                ripiani[ripiano].rimuoviVolume(posizione);
            }  
        }
    }

    /* Restituzione di quanti ripiani ci sono */
    public int getNumeroRipiani() {
        return MAX_NUM_RIPIANI;
    }

    /* Restituzione del numero massimo di libri consentito nello scaffale */
    public int getNumeroMaxLibri() {
        int n = 0;
        
        for (int ripiano = 0; ripiano < ripiani.length; ripiano++) {
            n += ripiani[ripiano].getMaxNumVolumi();
        }

        return n;
    }

    /* Restituzione del numero di libri effettivamente presenti nello scaffale */
    public int getNumeroLibri() {
        int n = 0;
        
        for (int ripiano = 0; ripiano < ripiani.length; ripiano++) {
            n += ripiani[ripiano].getNumVolumi();
        }

        return n;
    }

    /* Restituizone del numero di libri presenti in un determinato ripiano */
    public int getNumeroLibriRipiano(int ripiano) {
        int n = 0;

        for (int i = 0; i < ripiani.length; i++) {
            n = ripiani[ripiano].getNumVolumi();
        }

        return n;
    }

    /*
    public Libro getLibroAutore(String autore) {
        Libro[] libri;
        int num = 0;
        
        for (int i = 0; i < ripiani.length; i++) {
            if (ripiani[i]

            }
        }

        return libri;
    }
    */

    /* Stampa dello scaffale */
    public String toString() {
        String s = "";

        for (int i = 0; i < ripiani.length; i++) {
            s += String.format("%s\n", ripiani[i]);
        }

        return s;
    }
}
