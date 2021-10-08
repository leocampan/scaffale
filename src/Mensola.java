public class Mensola {
    /**************************************** ATTRIBUTI ****************************************/
    private static final int MAX_NUM_VOLUMI = 15;
    private Libro[] volumi;

    /**************************************** METODI *****************************************/
    public Mensola() {
        volumi = new Libro [MAX_NUM_VOLUMI] ;
    }

    public Mensola(Mensola mensola) {
        this();

        for (int i = 0; i < MAX_NUM_VOLUMI; i++) {
            if (mensola.getVolume (i) != null) {
                volumi[i] = new Libro (mensola.getVolume(i));
            }       
        }
    }

    public int setVolume(Libro libro, int i) {
        if (( i< 0) || (i >= MAX_NUM_VOLUMI)) {
            return -1;  
        }
            
        if (volumi[i]!= null) {
            return -2;
        }
             
        volumi[i] = new Libro(libro); 
        return i; 
    }

    public Libro getVolume (int i) {
        if ((i < 0) || (i > MAX_NUM_VOLUMI)) {
            return null; 
        }
        
        if(volumi[i]!=null) {
            return new Libro(volumi[i]);
        } 
        else {
            return null;
        }
    }
        
    public int rimuoviVolume (int i) {
        if ((i < 0) || (i >= MAX_NUM_VOLUMI)) {
            return -1;
        }
           
        if (volumi[i]== null) {
            return -2;
        }
           
        volumi[i] = null;
        return i; 
    }

    public void addLibro (Libro l) {
        for (int i = 0; i < volumi.length; i++) {
            if (volumi[i] == null) {
                volumi[i] = l;
            }
        }
    }

    public void addLibroPlus (int pos, Libro l) throws Exception {
        if (volumi[MAX_NUM_VOLUMI - 1] != null) {
            throw new Exception("Non c'è spazio sulla mensola");
        }
        else {
            for (int i = volumi.length - 1; i > pos; i--) { // Parto dal fonto perchè se no la posizione dove vado a copiare i libri prima andrebbe persa
                volumi[i] = volumi[i - 1];
            } 
            
            volumi[pos] = l;
        }  
    }

    public int getMaxNumVolumi() {
        return MAX_NUM_VOLUMI;
    }

    public int getNumVolumi() {
        int num = 0;
        for (int i=0; i<MAX_NUM_VOLUMI; i++){
            if (volumi[i]!= null) {
                num += 1;
            }      
        }

        return num;
    }

    public String toString() {
        String s =" ";
        for (int i = 0; i < volumi.length; i++) {
            s += String.format("%s\n", volumi[i]);
        }

        return s;
    }
}