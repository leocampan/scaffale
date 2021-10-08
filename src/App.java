public class App {
    public static void main(String[] args) throws Exception {
        Mensola m1 = new Mensola();

        Libro l1 = new Libro("Pinocchio", "Carlo Collodi", 250);
        Libro l2 = new Libro("Il Piccolo Principe", "Antoine de Saint-Exupéry", 200);
        Libro l3 = new Libro("Cappuccetto Rosso", "Jacob Grimm", 300);

        m1.addLibro(l1);
        m1.addLibro(l2);
        m1.addLibro(l3);

        System.out.println(m1);
    }
}
