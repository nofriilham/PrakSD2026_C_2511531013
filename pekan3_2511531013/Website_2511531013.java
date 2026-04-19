package Pekan3_2511531013;

public class Website_2511531013 {
    private String judul_1013;
    private String url_1013;

    // Konstructor
    Website_2511531013(String judul_1013, String url_1013) {
        this.judul_1013 = judul_1013;
        this.url_1013 = url_1013;
    }

    // Getter
    public String getJudul_1013() {
        return judul_1013;
    }

    public String getUrl_1013() {
        return url_1013;
    }

    // Setter
    public void setJudul_1013(String judul_1013) {
        this.judul_1013 = judul_1013;
    }

    public void setUrl_1013(String url_1013) {
        this.url_1013 = url_1013;
    }

    // Override
    @Override
    public String toString() {
        return "Judul : " + judul_1013 + "\nURL   : " + url_1013;
    }
}