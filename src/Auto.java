public class ValoriAuto {
// Creazione delle variabili dell'auto
        private String modello;
        private String cilindrata;
        private String targa;
        private String marca;
        public ValoriAuto (String modello, String cilindrata, String targa, String marca) {
// Utilizzo della parola chiave this per la lettura dei valori presenti nel main di automobile.
            this.modello = modello;
            this.cilindrata = cilindrata;
            this.targa = targa;
            this.marca = marca;

        }
        // Uso get and set per usare le variabili private nel Main.
        public String getModello() {
            return modello;
        }
        public String getCilindrata() {
            return cilindrata;
        }
        public String getTarga() {
            return targa;
        }
        public String getMarca() {
            return marca;
        }
        public void setModello(String modello) {
            this.modello = modello;
        }
        public void setCilindrata (String cilindrata) {
            this.cilindrata = cilindrata;
        }
        public void setTarga (String targa) {
            this.targa = targa;
        }
        public void setmarca (String marca) {
            this.marca = marca;
        }
        @Override
        public String toString() {
            return "Auto: {" +
                    "Modello = " + modello +
                    ", Cilindrata = " + cilindrata  +
                    ", Targa = " + targa   +
                    ", Marca = " + marca +
                    '}';
        }
}


