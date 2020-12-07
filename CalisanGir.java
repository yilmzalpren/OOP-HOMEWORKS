/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisangir;
import java.util.Scanner ;
/**
 *

 */

interface Odeme{
    void maasHesapla();
}

abstract class Calisan implements Odeme{
    private String ad ; 
    private String soyad;
    private String sskNo;
    Calisan(String ad, String soyad, String sskNo){
        this.ad = ad ; 
        this.soyad = soyad;
        this.sskNo = sskNo;
    }
    String getAd(){
        return ad;
    }
    String getSoyad(){
        return soyad;
    }
    String getSskNo(){
        return sskNo;
    }
    
}
class MaasliCalisan extends Calisan{
    private double haftalikMaas;
    MaasliCalisan(String ad , String soyad , String sskNo , double haftalikMaas){
        super(ad,soyad,sskNo);
        this.haftalikMaas = haftalikMaas;
    }
    @Override
    public void maasHesapla(){
        System.out.println("Ad = "+getAd()+"\nSoyad = "+getSoyad()+"\nSskNo = "+getSskNo());
        System.out.println("Maasi =  " + (haftalikMaas*4)+"TL");
        System.out.println("--------------------------------------------------------------");
    }
}

class SaatliCalisan extends Calisan{
    private double saatlikUcret;
    private double calismaSaati;
    SaatliCalisan(String ad , String soyad , String sskNo , double saatlikUcret , double calismaSaati){
        super(ad,soyad,sskNo);
        this.saatlikUcret = saatlikUcret;
        this.calismaSaati = calismaSaati;
    }
    @Override
    public void maasHesapla(){
        System.out.println("Ad = "+getAd()+"\nSoyad = "+getSoyad()+"\nSskNo = "+getSskNo());
        if(calismaSaati <= 40){
            System.out.println("Maasi : " +(calismaSaati*saatlikUcret) +"TL" );
            
        }
        else{
            double maas = (calismaSaati*saatlikUcret) + (saatlikUcret*1.5)*(calismaSaati-40);
            System.out.println("Maasi : "+ maas+"TL");
            
        }
        System.out.println("--------------------------------------------------------------");
            
    }
}

class PrimliCalisan extends Calisan{
    private double primUcret;
    private double satisSayisi ; // actually type of satisSayisi  will be int but it doesn't matter !!
    PrimliCalisan(String ad , String soyad , String sskNo , double primUcret , double satisSayisi){
        super(ad,soyad,sskNo);
        this.primUcret = primUcret;
        this.satisSayisi = satisSayisi;
    }
    @Override
    public void maasHesapla(){
        System.out.println("Ad = "+getAd()+"\nSoyad = "+getSoyad()+"\nSskNo = "+getSskNo());
        System.out.println("Maasi : " + (primUcret * satisSayisi) +"TL");
        System.out.println("--------------------------------------------------------------");
        
        
    }
}





public class CalisanGir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keeper = new Scanner(System.in);
        //-------------------------------------
        String choose ; 
        //--------------
        String ad ;
        String soyad;
        String sskNo;
        //--------------
        Calisan[] obj = new Calisan[3];
        for(int i = 0 ; i < 3 ; ++i){
            System.out.println("Hangi calisan icin islem yapmak istiyorsunuz ? \n(Lutfen ya yanında belirtilen numarayı ya da "
                     + "islem yapmak istediginiz seceneyi direk yazin");
            System.out.println("1-Maasli Calisan\n2-Saatli Calisan\n3-Primli Calisan");
            choose = keeper.next();
            keeper.nextLine();          // BU SAYEDE EGER KULLAINICI MAASLI CALISAN DIYE BOSLUKLU GIRERSE BOSLUKTAN SONRA YAZILANIN
                                        // AD OLMASI ENGELLENIR !!!!!!!!!
                                        // YANI INPUT BUFFERIN FLUSH EDILMESINI SAGLAR BIR BAKIMA !!!!!!
            System.out.println("Calisanin adini giriniz : ");
            ad = keeper.next();
            System.out.println("calisanin soyadini giriniz : ");
            soyad = keeper.next();
            System.out.println("Calisanin sskNo'sunu giriniz : ");
            sskNo = keeper.next();
            if(choose.charAt(0)=='1' || choose.charAt(0) =='M' || choose.charAt(0) == 'm' ){
                double haftalikMaas;
                System.out.println("Caslinanin haftalik maasini giriniz : ");
                haftalikMaas = keeper.nextDouble();
                obj[i] = new MaasliCalisan(ad, soyad, sskNo , haftalikMaas);
                
                
            }
            else if(choose.charAt(0)=='2' || choose.charAt(0) =='S' || choose.charAt(0) == 's' ){
                double saatlikUcret , calismaSaati;
                System.out.println("Calisanin saatlik ucretini giriniz : ");
                saatlikUcret = keeper.nextDouble();
                System.out.println("Calisanin calisma saatini giriniz :  ");
                calismaSaati = keeper.nextDouble();
                obj[i] = new SaatliCalisan(ad , soyad , sskNo , saatlikUcret , calismaSaati);
            }
            else if(choose.charAt(0)=='3' || choose.charAt(0) =='P' || choose.charAt(0) == 'p' ){
                double primUcret , satisSayisi;
                System.out.println("Calisanin prim ucretini giriniz : ");
                primUcret = keeper.nextDouble();
                System.out.println("Calisanin satis sayisini giriniz");
                satisSayisi = keeper.nextDouble();
                obj[i] = new PrimliCalisan(ad , soyad , sskNo , primUcret , satisSayisi);
            }
            else{
                System.out.println("Invalid input") ; 
                
            }
        }
        for(int i = 0 ; i < 50 ; i++) System.out.println();
          System.out.println("--------------------------------------------------------------");

        for(int i = 0 ; i < 3 ; ++i){
            obj[i].maasHesapla();
        }
        
        
        
        
    }
    
}
