/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member dan memastikan setiap
 * perubahan data lolos validasi sebelum disimpan.
 */
public class Member {

    private static final String AWALAN_TELEPON = "0";
    private static final int PANJANG_MINIMAL_TELEPON = 10;
    private static final String PAKET_BASIC = "Basic";
    private static final String PAKET_PREMIUM = "Premium";
    private static final String PAKET_VIP = "VIP";
    private static final String NILAI_KOSONG = "-";

    // Nilai awal = nilai default yang aman jika data tidak valid
    private String nama = "Tanpa Nama";
    private String noTelepon = NILAI_KOSONG;
    private String tanggalDaftar = NILAI_KOSONG;
    private String jenisPaket = PAKET_BASIC;

    /**
     * Membuat member dengan data lengkap. Semua nilai diisi lewat setter
     * sehingga validasi tetap berjalan.
     *
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon, diawali 0 dan minimal 10 digit
     * @param tanggalDaftar tanggal pendaftaran, contoh 17-08-2026
     * @param jenisPaket    Basic, Premium, atau VIP
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    


    
