
package tokoonline2;
import java.util.ArrayList;
public class barang {
    

private ArrayList<String> namaBarang = new ArrayList<String>();
private ArrayList<Integer> stok = new ArrayList<Integer>();
private ArrayList<Integer> harga = new ArrayList<Integer>();
private ArrayList<Integer> kode = new ArrayList<Integer>();

public void barang() {

}
public void setKode(int kode){
    this.kode.add(kode);
}
public int getJmlBarang(){
return this.namaBarang.size();
}
public void setNamaBarang(String namaBarang ){
this.namaBarang.add(namaBarang);
}
public String getNamaBarang(int idBarang){

return this.namaBarang.get(idBarang);
}
public void setStok(int stok ){
this.stok.add(stok);
}
public int getStok(int idBarang){
return this.stok.get(idBarang);
}
public void editStok(int idBarang, int stok){
this.stok.set(idBarang, stok);;
}
public void setHarga(int harga ){
this.harga.add(harga);
}
public int getHarga(int idBarang){
return this.harga.get(idBarang);
}
}

