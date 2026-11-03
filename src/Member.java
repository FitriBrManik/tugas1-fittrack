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

    /**
     * Membuat member tanpa menentukan paket. Paket otomatis menjadi Basic.
     *
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, PAKET_BASIC);
    }

     /**
     * Mengambil nama member.
     *
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengubah nama member. Nama kosong atau hanya spasi ditolak.
     *
     * @param nama nama baru
     */
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong atau hanya berisi spasi");
            return;
        }
        this.nama = nama.trim();
    }

    /**
     * Mengambil nomor telepon member.
     *
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengubah nomor telepon setelah divalidasi. Jika tidak valid,
     * nomor lama dipertahankan dan pesan penolakan dicetak.
     *
     * @param noTelepon nomor baru, diawali 0 dan minimal 10 digit
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null
                || !noTelepon.startsWith(AWALAN_TELEPON)
                || noTelepon.length() < PANJANG_MINIMAL_TELEPON
                || !noTelepon.matches("\\d+")) {
            System.out.println("Nomor telepon harus diawali angka 0 dan minimal "
                    + PANJANG_MINIMAL_TELEPON + " digit");
            return;
        }
        this.noTelepon = noTelepon;
    }

    /**
     * Mengambil tanggal daftar member.
     *
     * @return tanggal daftar
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengubah tanggal daftar. Tanggal kosong ditolak.
     *
     * @param tanggalDaftar tanggal baru, contoh 17-08-2026
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar == null || tanggalDaftar.trim().isEmpty()) {
            System.out.println("Tanggal daftar tidak boleh kosong");
            return;
        }
        this.tanggalDaftar = tanggalDaftar.trim();
    }

     /**
     * Mengambil jenis paket member.
     *
     * @return jenis paket
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah jenis paket. Hanya Basic, Premium, atau VIP yang diterima.
     * Jika tidak valid, paket lama dipertahankan.
     *
     * @param jenisPaket paket baru
     */
    public void setJenisPaket(String jenisPaket) {
        if (PAKET_BASIC.equals(jenisPaket)
                || PAKET_PREMIUM.equals(jenisPaket)
                || PAKET_VIP.equals(jenisPaket)) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println("Jenis paket harus Basic, Premium, atau VIP (penulisan persis). "
                    + "Paket tetap: " + this.jenisPaket);
        }
    }

     /**
     * Mengubah objek menjadi teks berlabel yang mudah dibaca.
     *
     * @return representasi teks member
     */
    @Override
    public String toString() {
        return "Member{nama='" + nama + "', noTelepon='" + noTelepon
                + "', tanggalDaftar='" + tanggalDaftar
                + "', jenisPaket='" + jenisPaket + "'}";
    }
}




    


    
