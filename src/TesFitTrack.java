**
 * Program uji untuk class Member pada sistem keanggotaan FitTrack.
 */
public class TesFitTrack {

      /**
     * Titik masuk program: membuat member, menguji validasi, lalu mencetak semua data.
     *
     * @param args argumen command line (tidak dipakai)
     */
    public static void main(String[] args) {
        Member[] daftarMember = new Member[5];

        daftarMember[0] = new Member("Budi Santoso", "081234567890", "17-08-2026", "Basic");
        daftarMember[1] = new Member("Siti Aminah", "082345678901", "18-08-2026", "Premium");
        daftarMember[2] = new Member("Andi Wijaya", "083456789012", "19-08-2026", "VIP");
        daftarMember[3] = new Member("Dewi Lestari", "084567890123", "20-08-2026"); // tanpa paket

        System.out.println("--- Membuat member dengan data tidak valid ---");
        daftarMember[4] = new Member("Rudi Hartono", "8123", "21-08-2026", "Gold");

        System.out.println("--- Mengubah data member yang sudah jadi dengan nilai tidak valid ---");
        System.out.println("Nomor sebelum: " + daftarMember[0].getNoTelepon());
        daftarMember[0].setNoTelepon("12345");
        System.out.println("Nomor sesudah: " + daftarMember[0].getNoTelepon());

        System.out.println("--- Daftar semua member ---");
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println((i + 1) + ". " + daftarMember[i]);
        }
    }
}
     
