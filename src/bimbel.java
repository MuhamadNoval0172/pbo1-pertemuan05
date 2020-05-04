public class bimbel {
    public static void main(String[] args){
        siswa siswa = new siswa();

        siswa.namaSiswa = "Muhamad Noval";
        siswa.idBimbel = "09CO";
        siswa.noTelpon = "08990873445";
        siswa.harga = 250000;
        siswa.alamat = "Jln Mawar Blok 4E";
        siswa.cetak();

        siswa.BimbelYangDiambil();
        siswa.metodeBelajar();
        siswa.jamBimbel();
    }
}
