package Jobsheet_2;

public class buku22 {
    
        String judul,pengarang;
        int halaman,stok,harga;

        void tampilInformasi(){
            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
            System.out.println("Jumlah halaman: " + halaman);
            System.out.println("Sisa stok: " + stok);
            System.out.println("Harga: Rp " + harga);
        }

        void terjual(int jml){
            if(stok > 0){
                stok -= jml;
            } else{
                System.out.println("Stock tidak tersedia.");
            }
        }

        void restock(int jml){
            stok += jml;
        }

        void gantiHarga(int hrg){
            harga = hrg;
        }
        
        public buku22(){

        }

        public buku22(String jud, String pg, int hal, int stok, int har){
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }
    
}
