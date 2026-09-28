public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addNasabah("John", "Smith");
        bank.addNasabah("Jane", "Doe");

        Nasabah nasabah1 = bank.getNasabah(0);
        
        Akun akun1 = new Akun(500000);
        nasabah1.setAkun(akun1);
        Akun akun2 = new Akun(1000000);
        bank.getNasabah(1).setAkun(akun2);

        akun2.deposit(300000);
        akun2.withdraw(500000);

        akun1.deposit(200000);
        akun1.withdraw(150000);

        System.out.println("Jumlah Nasabah: " + bank.getJumlahNasabah());
        System.out.println("Nama Nasabah 1: " + nasabah1.getFirstName() + " " + nasabah1.getLastName());
        System.out.println("Saldo Akhir Rekening 1: Rp " + nasabah1.getAkun(0).getBalance());
        System.out.println("Nama Nasabah 2: " + bank.getNasabah(1).getFirstName() + " " + bank.getNasabah(1).getLastName());
        System.out.println("Saldo Akhir Rekening 2: Rp " + bank.getNasabah(1).getAkun(0).getBalance());
    }
}
