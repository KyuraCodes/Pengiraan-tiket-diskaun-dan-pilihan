import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double harga_Kanak = 20;
        final double harga_Dewasa = 30;
        final double discount = 0.20;

        char pilihan;

        do {
            System.out.println("Masukkan Bilangan tiket untuk kanak-kanak: ");
            int bilkanak = input.nextInt();

            System.out.println("Masukkan bilangan tiket untuk Dewasa: ");
            int bildewasa = input.nextInt();

            // pengiraan
            int jumlahTiket = bilkanak + bildewasa;
            double jumlahKasar = (bilkanak * harga_Kanak) + (bildewasa * harga_Dewasa);

            double diskauns;

            if (jumlahTiket >= 10) {
                diskauns = jumlahKasar * discount;
            } else {
                diskauns = 0;
            }

            double jumlahBersih = jumlahKasar - diskauns;
            
            System.out.println("Jumlah harga tiket ialah: " + jumlahBersih);

            System.out.println("Adakah anda mau menetapkan semula tempahan? (Y/T) :" ); 
            pilihan = input.next().charAt(0);
            
        } while (pilihan == 'Y' || pilihan == 'y');

        System.out.println("Terima kasih sudah membuat tempahan tiket di WONDERSPLASH.");

        
    }
}
