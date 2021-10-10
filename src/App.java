public class App {
    public static void main(String[] args) {
        /**************************************** SCAFFALI *****************************************/
        Scaffale s1 = new Scaffale();

        /**************************************** LIBRI *****************************************/
        Libro l1 = new Libro("Pinocchio", "Carlo Collodi", 250);
        Libro l2 = new Libro("Il Piccolo Principe", "Antoine de Saint-Exupéry", 200);
        Libro l3 = new Libro("Cappuccetto Rosso", "Jacob Grimm", 300);

        /**************************************** TEST *****************************************/
    
        /* Mensola 1 */
        /****************************************/
        s1.setLibro(l1, 0, 0);

        if (s1.setLibro(l1, 0, 0) == 1) {
            System.out.println("Ripiano non valido");
        }
        else if (s1.setLibro(l1, 0, 0) == 2) {
            System.out.println("Posizione non valida o non libera");
        }
        else {
            System.out.println("Inserimento riuscito");
        }
        /****************************************/
        
        /* Mensola 2 */
        /****************************************/
        s1.setLibro(l2, 1, 0);

        if (s1.setLibro(l2, 1, 0) == 1) {
            System.out.println("Ripiano non valido");
        }
        else if (s1.setLibro(l2, 1, 0) == 2) {
            System.out.println("Posizione non valida o non libera");
        }
        else {
            System.out.println("Inserimento riuscito");
        }
        /****************************************/

        /* Mensola 3 */
        /****************************************/
        s1.setLibro(l3, 2, 0);

        if (s1.setLibro(l3, 2, 0) == 1) {
            System.out.println("Ripiano non valido");
        }
        else if (s1.setLibro(l3, 2, 0) == 2) {
            System.out.println("Posizione non valida o non libera");
        }
        else {
            System.out.println("Inserimento riuscito");
        }
        /****************************************/

        /* Visualizzazione contenuto mensola */
        for (int ripiano = 0; ripiano < s1.getNumeroRipiani(); ripiano++) {
            for (int posizione = 0; posizione < s1.ripiani[ripiano].getMaxNumVolumi(); posizione++) {
                l1 = s1.getLibro(posizione, ripiano);
            }

            if (l1 != null) {
                System.out.println("Ripiano: " + ripiano + "\nPosizione: " + posizione + " --> " + "\nTitolo [" + l1.getTitolo() + "]" + "\nPrezzo [" + l1.Prezzo(l1) + "€");
            }
        }
        
    }
}
