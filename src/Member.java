/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member dan memastikan setiap
 * perubahan data lolos validasi sebelum disimpan.
 */
public class Member {

    public static final String PAKET_BASIC = "Basic";
    public static final String PAKET_PREMIUM = "Premium";
    public static final String PAKET_VIP = "VIP";

    private static final String AWALAN_TELEPON = "0";
    private static final int PANJANG_MINIMAL_TELEPON = 10;

    private static final String NAMA_DEFAULT = "Tidak diketahui";
    private static final String TELEPON_DEFAULT = "-";
    private static final String TANGGAL_DEFAULT = "-";
}

/**
     * Constructor lengkap dengan 4 parameter.
     * Mengisi nilai atribut melalui setter untuk menjamin validasi.
     *
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon aktif member
     * @param tanggalDaftar tanggal pertama pendaftaran
     * @param jenisPaket    jenis paket keanggotaan (Basic, Premium, VIP)
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }
