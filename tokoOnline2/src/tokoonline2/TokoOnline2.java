
package tokoonline2;
import java.util.Scanner;
public class TokoOnline2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        karyawan kr = new karyawan();
        member mem = new member();
        barang br = new barang ();
        transaksi tr = new transaksi();
        laporan lp = new laporan();
        String ulang, opsi;
        
        
        br.setNamaBarang("Cheek lit");
        br.setHarga(50000);
        br.setStok(5);
        br.setNamaBarang("sunscreen");
        br.setHarga(52000);
        br.setStok(10);
        br.setNamaBarang("compact powder");
        br.setHarga(75000);
        br.setStok(8);
        br.setNamaBarang("body scrub");
        br.setHarga(53000);
        br.setStok(8);
        br.setNamaBarang("body butter");
        br.setHarga(77000);
        br.setStok(4);
        
        System.out.println("================================");
        System.out.println("login tokoOnline sebagai: \n\n-karyawan\n-member\n");
        System.out.println("opsi yang dipilih");
        opsi = sc.next();
        
        if (opsi.equalsIgnoreCase("Karyawan")){
            System.out.println("======================");
            System.out.println("apakah anda ingin menambah database member?\nyes (menambah database)\nno (opsi menggunakan database yang sudah ada)\n");
            System.out.println("opsi yang dipilih");
            opsi = sc.next();
            if (opsi.equalsIgnoreCase("Yes")){
                System.out.println("============================ form database member =======================\n");
                do{
                    System.out.println("masukan nama member     : ");
                    String nama = sc.next();
                    mem.setNama(nama);
                    System.out.println("masukan alamat member   : ");
                    String alamat = sc.next();
                    mem.setAlamat(alamat);
                    System.out.println("masukan nomor telepon   : ");
                    String nomor = sc.next();
                    mem.setTelepon(nomor);
                    System.out.println("masukan saldo   : ");
                    int saldo = sc.nextInt();
                    mem.setSaldo(saldo);
                    System.out.println("\n=====================================\n");
                    System.out.println("apakah menambah database member lagi?\nyes\nno");
                    System.out.println("opsi yang dipilih   : ");
                    ulang=sc.next();
                } while (ulang.equalsIgnoreCase("yes"));
                mem.member();

            } else if (opsi.equalsIgnoreCase("no")){
                System.out.println("apakah anda ingin mengisi database barang?\nYes\nNo ");
                opsi =sc.next();
                if (opsi.equalsIgnoreCase("yes")){
                System.out.println("<==========Database barang============>\n");
                do {
                    System.out.println("masukan nama barang     : ");
                    String nama = sc.next();
                    br.setNamaBarang(nama);
                    System.out.println("masukan stok barang     : ");
                    int stok = sc.nextInt();
                    br.setStok(stok);
                    System.out.println("masukan harga barang    : ");
                    int harga = sc.nextInt();
                    br.setStok(stok);
                    System.out.println("\n================================\n");
                    System.out.println("apakah menambah database barang lagi?\nYes\nNo");
                    ulang = sc.next();
                }while (ulang.equalsIgnoreCase("yes"));
                br.barang();
                System.out.println("\n<====lanjut mengisi form database===>\n");
            } else if (opsi.equalsIgnoreCase("no")){
                    System.out.println("apakah anda ingin menambah database karyawan?\nYes \nNo");
                    opsi=sc.next();
                    if(opsi.equalsIgnoreCase("yes")){
                         System.out.println("<==============Database karyawan================>");
                     do{
                    System.out.println("masukkan nama karyawan  : ");
                    String nama = sc.next();
                    kr.setNama(nama);
                    System.out.println("masukkan alamat karyawan    : ");
                    String alamat = sc.next();
                    kr.setAlamat(alamat);
                    System.out.println("masukan nomor telepon   : ");
                    String telepon = sc.next();
                    kr.setTelepon(telepon);
                    System.out.println("\n=======================================\n");
                    System.out.println("apakah menambah daftar karyawan lagi?\nY\nN");
                    ulang = sc.next();
                } while (ulang.equalsIgnoreCase("y"));
                kr.karyawan();
                System.out.println("\n<===Lanjut mengisi form database===>\n");
            }else if (opsi.equalsIgnoreCase("No")){
                System.out.println("\n<===Lanjut mengisi database barang===>\n");
            } else {
                System.out.println("maaf input yang anda  masukan salah");
                return;
            }
                    }
            } else{
                System.out.println("maaf input yang anda masukan salah");
                return;
            }
             
         }else if (opsi.equalsIgnoreCase("Member")){
            System.out.println("\n=============Welcome member===========\n");
            mem.member();
            
            tr.prosesTransaksi(mem, tr, br);
            System.out.println("\n<=====Laporan====>\n");
            lp.laporan(mem);
            System.out.println("");
            lp.Laporan(tr, br);
        }else{
            
        }
    }
    }
    

