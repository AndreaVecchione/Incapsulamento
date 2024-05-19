
public class Main {
    public static void main(String[] args) {
        
//Richiamando la classe ValoriAuto, vado a crearmi un metodo contenente i valori per i metodi creati precedentemente.
        
        ValoriAuto Automobile1 = new ValoriAuto("1500", "12242394", "Volvo", "P20231");
        ValoriAuto Automobile2 = new ValoriAuto ("1200", "238238238", "Ford", "L23123");

        System.out.println("Info dell'auto sono: " + Automobile1);
        System.out.println("Info dell'auto sono: " + Automobile2);
    }
}
