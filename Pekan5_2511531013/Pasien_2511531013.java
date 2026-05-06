package pekan5_2511531013;

public class Pasien_2511531013 {

    // atribut data pasien
    private String namaPasien_1013;
    private String keluhan_1013;
    private int nomorAntrian_1013;

    // pointer ke pasien berikutnya
    private Pasien_2511531013 next_1013;

    // konstruktor untuk isi data pasien
    public Pasien_2511531013(String namaPasien_1013,String keluhan_1013,int nomorAntrian_1013) {
        this.namaPasien_1013 = namaPasien_1013;
        this.keluhan_1013 = keluhan_1013;
        this.nomorAntrian_1013 = nomorAntrian_1013;
        // node awal belum terhubung ke node lain
        this.next_1013 = null;
    }

    // getter nama pasien
    public String getNamaPasien_1013() {
        return namaPasien_1013;
    }

    // getter keluhan pasien
    public String getKeluhan_1013() {
        return keluhan_1013;
    }

    // getter nomor antrian
    public int getNomorAntrian_1013() {
        return nomorAntrian_1013;
    }

    // getter pointer next
    public Pasien_2511531013 getNext_1013() {
        return next_1013;
    }

    // setter nama pasien
    public void setNamaPasien_1013(String namaPasien_1013) {
        this.namaPasien_1013 = namaPasien_1013;
    }

    // setter keluhan pasien
    public void setKeluhan_1013(String keluhan_1013) {
        this.keluhan_1013 = keluhan_1013;
    }

    // setter nomor antrian
    public void setNomorAntrian_1013(int nomorAntrian_1013) {
        this.nomorAntrian_1013 = nomorAntrian_1013;
    }

    // setter pointer next
    public void setNext_1013(Pasien_2511531013 next_1013) {
        this.next_1013 = next_1013;
    }

    // supaya data pasien bisa langsung dicetak
    @Override
    public String toString() {
        return "No Antrian : " + nomorAntrian_1013 + ", Nama : " + namaPasien_1013 + ", Keluhan : " + keluhan_1013;
    }
}