public class Macchina {
    private int cilindrata;
    private int modello;
    private String marca;
    private String targa;
    public Macchina (int cilindrata, int modello, String marca, String targa) {

        this.cilindrata = cilindrata;
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;

    }
    public int getCilindrata() {
        return cilindrata;
    }
public int getModello() {
        return modello;
}
public String getMarca() {
        return marca;
}
public String getTarga() {
        return targa;
}
public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
}
public void setModello (int modello) {
        this.modello = modello;
    }
    public void setMarca (String marca) {
        this.marca = marca;
    }
    public void setTarga (String targa) {
        this.targa = targa;
    }
@Override
    public String toString() {
    return "Macchina: {" +
            "Cilindrata = " + cilindrata +
            ", Modello = " + modello  +
            ", Marca = " + marca   +
            ", Targa = " + targa +
            '}';
}
}


