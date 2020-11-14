/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1306190030_yilmaz_alperen;
import java.util.Scanner ; 
import java.lang.Math; 
/**
 *
*
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Point p[] = new Point [4] ; 
       int x , y;
       Scanner fromKeyboard = new Scanner(System.in);
       System.out.println("KARE\nDIKDORTGEN\nYAMUK\nPARALELKENAR");
       System.out.println("Lütfen hangi sekli istiyorsanız onu yazınız ");
       System.out.println("ORNEK KULLANIM:  KARE");
       String keeper = fromKeyboard.nextLine();
       if(keeper.charAt(0)=='k' || keeper.charAt(0)=='K'){
           for(int i=0 ; i<4 ; ++i){
               System.out.println("Noktanin x koordinatini giriniz");
               x = fromKeyboard.nextInt();
               System.out.println("Noktanin y koordinatini giriniz");  
               y = fromKeyboard.nextInt();
               p[i] = new Point(x,y);
           }    
           Kare obj = new Kare(p[0],p[1],p[2],p[3]);
                       
       }
       else if(keeper.charAt(0)=='D' || keeper.charAt(0)=='d'){
            for(int i=0 ; i<4 ; ++i){
               System.out.println("Noktanin x koordinatini giriniz");
               x = fromKeyboard.nextInt();
               System.out.println("Noktanin y koordinatini giriniz");  
               y = fromKeyboard.nextInt();
               p[i] = new Point(x,y);
           }            
            Dikdortgen obj = new Dikdortgen(p[0],p[1],p[2],p[3]);
       }
       else if(keeper.charAt(0)=='Y' || keeper.charAt(0)=='y'){
           for(int i=0 ; i<4 ; ++i){
               System.out.println("Noktanin x koordinatini giriniz");
               x = fromKeyboard.nextInt();
               System.out.println("Noktanin y koordinatini giriniz");  
               y = fromKeyboard.nextInt();
               p[i] = new Point(x,y);
           } 
           Yamuk obj = new Yamuk(p[0],p[1],p[2],p[3]);
       }
       else if(keeper.charAt(0)=='p' || keeper.charAt(0)=='P'){
            for(int i=0 ; i<4 ; ++i){
               System.out.println("Noktanin x koordinatini giriniz");
               x = fromKeyboard.nextInt();
               System.out.println("Noktanin y koordinatini giriniz");  
               y = fromKeyboard.nextInt();
               p[i] = new Point(x,y);
           }
           ParalelKenar obj = new ParalelKenar(p[0],p[1],p[2],p[3]);
       }
       else {
           System.out.println("Invalid input");
       }
       
       }

    } 


class Point{
   private int x , y ; 
    Point(int x , int y){
        this.x = x ; 
        this.y = y  ;
    }
    void setx(int x){
        this.x = x ; 
    }
    void setY(int y){
        this.y = y ; 
    }
    int getX(){
        return x ; 
    }
    int getY(){
        return y ; 
    }
}
class Dortgen{
    private Point[] arr = new Point[4] ; 
    Dortgen(Point p0, Point p1 , Point p2 , Point p3){
        arr[0] = p0 ; 
        arr[1] = p1 ;
        arr[2] = p2 ;
        arr[3] = p3 ; 
        calcArea();
    }
    void setP0(Point p){
        arr[0] = p ;
    }
    void setP1(Point p){
        arr[1] = p ;
    }
    void setP2(Point p){
        arr[2] = p ;
    }
    void setP3(Point p){
        arr[3] = p ;
    }
    void setP4(Point p){
        arr[4] = p ;
    } 
    //---------------------------------
    Point getP0(){
        return arr[0] ; 
    }
    Point getP1(){
        return arr[1] ; 
    }
    Point getP2(){
        return arr[2] ; 
    }
    Point getP3(){
        return arr[3] ; 
    }    
    //-----------------------------------
    void calcArea(){
        double a = Math.pow(arr[0].getX()-arr[1].getX(),2) + Math.pow(arr[0].getY()-arr[1].getY(),2) ;
        double b =Math.pow(arr[0].getX()-arr[2].getX(),2) + Math.pow(arr[0].getY()-arr[2].getY(),2) ;
        double c =  Math.pow(arr[0].getX()-arr[3].getX(),2) + Math.pow(arr[0].getY()-arr[3].getY(),2); 
        a = Math.sqrt(a);
        b = Math.sqrt(b);
        c = Math.sqrt(c);
        double area ; 
        if(a == b){
            area = a*b;
            area = (double) Math.round(area*100)/100;
            System.out.println(area);
        }
        else if(a ==c){
            area = a*c;
            area = (double) Math.round(area*100)/100;
            System.out.println(area);
        }
        else if(b ==c){
            area = b*c;
            area = (double) Math.round(area*100)/100;
            System.out.println(area);
        }
        else{
            if(a > b ){
                if(a > c){
                    area = b*c;
                    area = (double) Math.round(area*100)/100;
                    System.out.println(area);
                }
                else { // c > a 
                    area = a*b;
                    area = (double) Math.round(area*100)/100;
                    System.out.println(area);
                }
            }
            else { // b > a 
               if(b > c){
                   area = a*c;
                   area = (double) Math.round(area*100)/100;
                   System.out.println(area);
               } 
               else { // c > b
                   area = a*b;
                   area = (double) Math.round(area*100)/100 ; 
                   System.out.println(area);
               }
            }
        }
    }
}

class Dikdortgen extends Dortgen{
    Dikdortgen(Point p0 , Point p1 , Point p2 , Point p3){
        super( p0 , p1 ,p2 , p3);
        
    }

}
class Kare extends Dortgen{
    Kare(Point p0 , Point p1 , Point p2 , Point p3){
        super(p0,p1,p2,p3);
    }

}
class Yamuk extends Dortgen{
    Yamuk(Point p0, Point p1 , Point p2 , Point p3){
        super(p0,p1,p2,p3);
    }
    @Override
    void calcArea(){
        double area1 = areaTri(getP0(),getP1(),getP2());    
        double area2 = areaTri(getP0(),getP1(),getP3());
        double area3 = areaTri(getP1(),getP2(),getP3());
        double a = area1+area2;
        double b = area2+area3 ; 
        double c = area1+area3;
//        a = Math.round(a*100)/100;
//        b = Math.round(b*100)/100;
//        c = Math.round(c*100)/100;
        if(a > b){
            if(b > c){
                b = (double) Math.round(b*100)/100;
                System.out.println(b);
                return ;
            }
            else{
                    
                c = (double) Math.round(c*100)/100;
                System.out.println(c);
                return ; 
            }
        }
        else if(a < b){
            if(a > c) {
                a = (double) Math.round(a*100)/100;
                System.out.println(a);
                return ;
            } 
            else {
                c = (double) Math.round(c*100)/100;
                System.out.println(c);
                return ; 
            }
        }
        else{
            System.out.println("Bu bir yamuk degil");
        }
        
    
       
    }
    double areaTri(Point p0 , Point p1 , Point p2){
        double a = Math.pow(p0.getX()-p1.getX(), 2)+ Math.pow(p0.getY()-p1.getY(),2); 
        double b = Math.pow(p0.getX()-p2.getX(),2) + Math.pow(p0.getY()-p2.getY(), 2);
        double c = Math.pow(p1.getX()-p2.getX(),2) + Math.pow(p1.getY()-p2.getY(), 2);
        a = Math.sqrt(a);        
        b = Math.sqrt(b);
        c = Math.sqrt(c);
        double u = (double)(a+b+c)/2;
        double area = u*(u-a)*(u-b)*(u-c);
        area = Math.sqrt(area);
        return area ;
        
    }
        
    
}

class ParalelKenar extends Dortgen{
    ParalelKenar(Point p0, Point p1 , Point p2 , Point p3){
        super(p0,p1,p2,p3);
    }
    @Override
    void calcArea(){
           double a = Math.pow((getP1().getX()-getP0().getX()),2) + Math.pow(getP1().getY()-getP0().getY(),2);
           a = Math.sqrt(a);
           double b = Math.pow(getP2().getX()-getP0().getX() ,2) + Math.pow(getP2().getY()-getP0().getY(),2);
           b = Math.sqrt(b);
           double c = Math.pow(getP1().getX()-getP2().getX(), 2) + Math.pow(getP1().getY()-getP2().getY(),2);
           c = Math.sqrt(c);
           double u = (double)(a+b+c)/2;
           //-----------------------------------------------------------------------------------------------
           double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
           area = (double) Math.round(area*100)/100;
           System.out.println(area*2);
    }
}
