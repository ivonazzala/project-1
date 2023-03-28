/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoonline2;
import java.util.ArrayList;
/**
 *
 * @author 62857
 */
public class karyawan implements user {
    

private ArrayList<String> namaKaryawan = new ArrayList<String>();
private ArrayList<String> alamat = new ArrayList<String>();
private ArrayList<String> telepon = new ArrayList<String>();
private ArrayList<Integer> jabatan = new ArrayList<Integer>();

public void karyawan() {
this.namaKaryawan.add("admin");
this.alamat.add("kedung kandang");
this.telepon.add("081112223333");
this.jabatan.add(0);
}
public void setJabatan(int jabatan ){
this.jabatan.add(jabatan);
}
public int getJabatan(int id){
return this.jabatan.get(id);
}
public int getJmlKaryawan(){
return this.namaKaryawan.size();
}
@Override
public void setNama(String namaKaryawan ){
this.namaKaryawan.add(namaKaryawan);
}
@Override
public void setAlamat(String alamat ){
this.namaKaryawan.add(alamat);

}
@Override
public void setTelepon(String telepon ){
this.namaKaryawan.add(telepon);
}
@Override
public String getNama(int idKaryawan){
return this.namaKaryawan.get(idKaryawan);
}
@Override
public String getAlamat(int idKaryawan){
return this.alamat.get(idKaryawan);
}
@Override
public String getTelepon(int idKaryawan){
return this.telepon.get(idKaryawan);
}
}

