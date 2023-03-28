
package tokoonline2;


public class laporan {
    
public void laporan(barang barang){
int x=barang.getJmlBarang();
System.out.println();
System.out.println("Tabel Barang");
System.out.println();
System.out.println("Nama Barang \tStok \tHarga");
for (int i = 0; i < x; i++) {
System.out.println(barang.getNamaBarang(i)+"\t"+
barang.getStok(i)+"\t"+barang.getHarga(i));
}
}
public void laporan(member member){
int x=member.getJmlMember();
System.out.println();
System.out.println("Tabel Member");
System.out.println();
System.out.println("Nama \tAlamat \t\tTelepon \t\tSaldo");
for (int i = 0; i < x; i++) {
System.out.println(member.getNama(i)+"\t"+member.getAlamat(i)+"\t"+member.getTelepon(i)+"\t"+member.getSaldo(i));
}
}
public void Laporan(transaksi transaksi, barang barang){
int x=transaksi.getJmlTransaksi();
System.out.println();
System.out.println("Laporan Transaksi");
System.out.println();
System.out.println("Nama Barang\tQty \tHarga \tJumlah");
int total=0;
for (int i = 0; i < x; i++) {
int jumlah=transaksi.getBanyaknya(i)*barang.getHarga(transaksi.getIdBarang(i));
total+=jumlah;
System.out.println(barang.getNamaBarang(transaksi.getIdBarang(i))+"\t"+transaksi.getBanyaknya(i)+"\t"+barang.getHarga(transaksi.getIdBarang(i))+"\t"+jumlah);
}
System.out.println("Total Omset = "+total);
}
}

