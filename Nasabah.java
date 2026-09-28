public class Nasabah {
    private String namaPertama;
    private String namaAkhir;

    private Akun[] akun = new Akun[5]; 
    private int jumlahAkun = 0;

    public Nasabah(String f, String l) {
        this.namaPertama = f;
        this.namaAkhir = l;
    }

    public String getFirstName() {
        return namaPertama;
    }

    public String getLastName() {
        return namaAkhir;
    }

    public void setAkun(Akun acct) {
        if (jumlahAkun < 5) {
            akun[jumlahAkun] = acct;
            jumlahAkun++;
        } else {
            System.out.println("Kapasitas akun penuh!");
        }
    }

    public Akun getAkun(int akunIndex) {
        if (akunIndex >= 0 && akunIndex < jumlahAkun) {
            return akun[akunIndex];
        }
        return null;
    }

    public int getJumlahAkun() {
        return jumlahAkun;
    }
}
