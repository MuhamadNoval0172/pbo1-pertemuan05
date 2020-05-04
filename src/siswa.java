public class siswa {
    String namaSiswa;
    String idBimbel;
    String noTelpon;
    double harga;
    String alamat;

    public siswa(){

    }
    void BimbelYangDiambil(){
        System.out.println("Bimbel yang diambil : Web Design, Jaringan Komputer, Android");
    }

    void metodeBelajar(){
        System.out.println("Metode Belajar      : Diskusi, Tanya Jawab, Latihan");
    }

    void jamBimbel(){
        System.out.println("Waktu Belajar       : Senin - Jum'at jam 15.00pm-17.30pm");
    }

    public void cetak(){
        System.out.println("===========================");
        System.out.println("Nama Siswa  : " + namaSiswa );
        System.out.println("Id Bimbel   : " + idBimbel );
        System.out.println("No Telepon  : " + noTelpon );
        System.out.println("Harga       : " + harga);
        System.out.println("Alamat      : " +alamat);
        System.out.println();
    }
}
