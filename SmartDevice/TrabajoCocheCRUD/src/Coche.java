public class Coche {

    String fabrincante;
    String modelo;
    int year;

    public Coche(String fabrincante, String modelo, int year) {
        this.fabrincante = fabrincante;
        this.modelo = modelo;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "fabrincante='" + fabrincante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                '}';
    }
}
