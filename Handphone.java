/*
Perbaikan yang dilakukan:
1. Penambahan tipe data method `setDataHP` dan `getTahunPembuatan`.
2. Penyesuaian parameter method `setDataHP`.
3. Penambahan kata kunci `return` pada method `getJenisHP` dan `getTahunPembuatan`.
4. Penambahan `System.out.println` pada method `main` untuk menampilkan hasil.

*/
package semester4.pbo;
public class Handphone {
    String jenis_hp;
    int tahun_pembuatan;

    public void setDataHP(String jenisHp, int tahunPembuatan) {
        jenis_hp = jenisHp;
        tahun_pembuatan = tahunPembuatan;
    }

    public String getJenisHP() {
        return jenis_hp;
    }

    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.setDataHP("Samsung", 2024);
        System.out.println("Jenis Handphone: " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}
    