package com.daivers.submission;

import java.util.ArrayList;
import java.util.Collection;

public class DataKlub {

    public static String[] NamaKlub = {
            "Arsenal",
            "Barcelona",
            "Bayern Munchen",
            "Chelsea",
            "Inter Milan",
            "Juventus",
            "Liverpool",
            "Manchester United",
            "AC Milan",
            "Tottenham"
    };

    public static String[] DetailKlub = {
            "Arsenal didirikan di daerah Woolwich, bagian tenggara kota London pada 1886 dengan nama Dial Square, lalu dengan cepat berganti nama menjadi Royal Arsenal.",
            "Didirikan pada tahun 1899 oleh sekelompok pemain Swiss, Inggris dan Catalan yang dipimpin oleh Joan Gamper, klub telah menjadi simbol budaya Catalan dan Catalanisme, yang mempunyai motto Més que un club (Lebih dari sebuah klub).",
            "FC Bayern didirikan pada tahun 1900 oleh sebelas pemain sepak bola yang dipimpin oleh Franz John.",
            "Chelsea didirikan pada tanggal 10 Maret 1905 di sebuah pub The Rising Sun (kini restoran The Butcher's Hook) dan pertama kali bermain pada kompetisi Football League.",
            "Klub ini didirikan pada 9 Maret 1908 mengikuti pecahnya dari Klub Kriket dan Sepak bola Milan(Milan Criket and Football Club), yang sekarang lebih dikenal dengan nama AC Milan.",
            "Juventus pertama kali dibentuk pada tahun 1897, tepatnya pada tanggal 1 November 1897. Awalnya klub ini bernama Sport-Club Juventus dan dibentuk pertama kali oleh siswa dari sekolah di Turin bernama Massimo D’Azeglio Lyceum.",
            "Liverpool didirikan pada tahun 1892 dan bergabung dengan Football League pada tahun berikutnya. Klub ini telah bermain di Stadion Anfield sejak pembentukannya yang terletak sekitar 4,8 km dari pusat kota Liverpool. ",
            "Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.",
            "Klub ini didirikan pada tahun 1899 dengan nama Klub Kriket dan Sepak bola Milan (Milan Cricket and Football Club) oleh Alfred Edwards dan Herbert Kilpin, seorang ekspatriat Inggris.",
            "Didirikan pada tahun 1882, Tottenham memenangkan Piala FA untuk pertama kalinya pada tahun 1901, dan menjadi satu-satunya klub non-Liga yang menjuarai Piala FA, sejak dibentuknya The Football League."
    };

    public static int[] KlubPhoto = {
            R.drawable.arsenal,
            R.drawable.barcelona,
            R.drawable.bayern_munchen,
            R.drawable.chelsea,
            R.drawable.inter,
            R.drawable.juve,
            R.drawable.liverpool,
            R.drawable.manchester_united,
            R.drawable.milan,
            R.drawable.tottenham
    };

    static ArrayList<Klub> getListData(){
        ArrayList<Klub> list = new ArrayList<>();
        for (int pos = 0; pos < NamaKlub.length; pos++){
            Klub klub = new Klub();
            klub.setNama(NamaKlub[pos]);
            klub.setDetail(DetailKlub[pos]);
            klub.setPhoto(KlubPhoto[pos]);
            list.add(klub);
        }
        return list;
    }
}
