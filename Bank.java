public class Bank {
    private Nasabah[] nasabah; 
    private int jumlahNasabah; 

    public Bank() {
        nasabah = new Nasabah[10];
        jumlahNasabah = 0;
    }

    public void addNasabah(String f, String l) {
        if (jumlahNasabah < nasabah.length) {
            nasabah[jumlahNasabah] = new Nasabah(f, l);
            jumlahNasabah++;
        }
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int index) {
        if (index >= 0 && index < jumlahNasabah) {
            return nasabah[index];
        }
        return null;
    }
}
