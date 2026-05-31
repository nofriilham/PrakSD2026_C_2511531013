package Pekan8_2511531013;

public class dataLagu_2511531013 {

    private String judul_1013;
    private String penyanyi_1013;
    private int durasi_1013;

    public dataLagu_2511531013(
    		String judul_1013,
    		String penyanyi_1013,      
    		int durasi_1013) {
   
        this.judul_1013 = judul_1013;
        this.penyanyi_1013 = penyanyi_1013;
        this.durasi_1013 = durasi_1013;
    }
    public String getJudul_1013() {
        return judul_1013;
    }
    public String getPenyanyi_1013() {
        return penyanyi_1013;
    }
    public int getDurasi_1013() {
        return durasi_1013;
    }
    @Override
    public String toString() {
        return judul_1013 + " - " +
               penyanyi_1013 + " - " +
               durasi_1013 + " detik";
    }
}