public class Ogrenciler {
    private String ad;
    private String bolum;
    private int girisYili;
    private int bolumKodu;
    private float gano;
    private long ogrNo;

    public Ogrenciler(String ad, String bolum, int girisyili, int bolumKodu, float gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisyili;
        this.bolumKodu = bolumKodu;
        this.gano = gano;
        this.ogrNo = ogrNo;
    }

    public Ogrenciler(int ad, int bolum, int i, int i1, float v) {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public float getGano() {
        return gano;
    }

    public void setGano(float gano) {
        this.gano = gano;
    }

    public long getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(long ogrNo) {
        this.ogrNo = ogrNo;
    }

    public void ganoKontrol() {
        if (gano < 0 || gano > 4) {
            throw new Error("Gano 0'dan küçük ya da 4'ten büyük olamaz");
        }
    }

    public void olusturOgrNo() {
        int rand = (int) (Math.random() * 99999) + 10000;
        String no = "" + girisYili + bolumKodu + rand;


        int cut = no.length() - 10;
        if (no.length() > 10) {

            no = no.substring(0, no.length() - cut);
        }

        setOgrNo(Long.parseLong(no));

    }

    public float harcHesapla(int dersSayisi) {
        return (dersSayisi * 12.4f);
    }

    public float harcHesapla(int dersSayisi, int yil) {
        return (dersSayisi * yil * 12.4f);
    }
}