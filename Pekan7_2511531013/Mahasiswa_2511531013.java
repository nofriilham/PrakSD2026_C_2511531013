package Pekan7_2511531013;

public class Mahasiswa_2511531013 {
    private String nama_1013;
    private String nim_1013;
    private String prodi_1013;

    public Mahasiswa_2511531013(String nama_1013, String nim_1013, String prodi_1013) {
        this.nama_1013 = nama_1013;
        this.nim_1013 = nim_1013;
        this.prodi_1013 = prodi_1013;
    }

    public String getNama_1013() {
        return nama_1013;
    }

    public String getNim_1013() {
        return nim_1013;
    }

    public String getProdi_1013() {
        return prodi_1013;
    }

    public void setNama_1013(String nama_1013) {
        this.nama_1013 = nama_1013;
    }

    public void setNim_1013(String nim_1013) {
        this.nim_1013 = nim_1013;
    }

    public void setProdi_1013(String prodi_1013) {
        this.prodi_1013 = prodi_1013;
    }

    @Override
    public String toString() {
        return nama_1013 + " - " + nim_1013 + " - " + prodi_1013;
    }
}