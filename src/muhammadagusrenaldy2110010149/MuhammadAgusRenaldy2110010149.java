/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammadagusrenaldy2110010149;

/**
 *
 * @author ACER
 */
public class MuhammadAgusRenaldy2110010149 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jalan obj = new Jalan ();
        
        obj.setIDJLN("01");
        obj.setNAMAJLN("Jalan Sudirman");
        obj.setLATIUTDE("-6.2088°");
        obj.setLONGITUDE("106.8456°");
        System.out.println("id : "+obj.getIDJLN()+"\n namajln :"  +obj.getNAMAJLN()+"\n latiutde :" +obj.getLATIUDE()+"\n longitude :"+obj.getLONGITUDE());
    
    }
    public static void main2(String[] args) {
        // TODO code application logic here
        Angkutan obj = new Angkutan ();
        
        obj.setIDANGKU("");
        obj.setNAMAANGKU("");
        
        System.out.println("id : "+obj.getIDANGKU()+"\n namajln :"  +obj.getNAMAANGKU());
    }
    
    public static void main3(String[] args) {
        // TODO code application logic here
        Login obj = new Login ();
        
        obj.setUSERNAME("");
        obj.setPASSWORD("");
        
        System.out.println("username : "+obj.getUSERNAME()+"\n password :"  +obj.getPASSWORD());
    }
    
        public static void main4(String[] args) {
        // TODO code application logic here
        Lokasi obj = new Lokasi ();
        
        obj.setIDLOK("");
        obj.setIDJAL("");
        obj.setNAMLOK("");
        obj.setLATIUTDE("");
        obj.setLONGIUTDE("");

       System.out.println("idlok : "+ obj.getIDLOK()+"\n idjal :"  + obj.getIDJAL()+"\n namlok :" + obj.getNAMLOK()+"\n latiutde :" + obj.getLATIUTDE()+"\n longiutde :" + obj.getLONGIUTDE());        
    }
        
            public static void main5(String[] args) {
        // TODO code application logic here
        Rute obj = new Rute ();
        
        obj.setIDRUT("");
        obj.setIDJAL("");
        obj.setIDANGKU("");
        
        System.out.println("idrut : "+obj.getIDRUT()+"\n idjal :"  +obj.getIDJAL()+"\n idangku:" +obj.getIDANGKU());
    }
}
