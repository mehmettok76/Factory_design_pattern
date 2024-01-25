
package factoryornek2;


public class FactoryOrnek2 {

   
    public static void main(String[] args) {
        Dugmeler urun1 = DugmeFactory.dugmeolustur("1");
        urun1.bas();
        
        Dugmeler urun2 = DugmeFactory.dugmeolustur("2");
        urun2.bas();
        
        Dugmeler urun3 = DugmeFactory.dugmeolustur("3");
        urun3.bas();
        
        Dugmeler urun4 = DugmeFactory.dugmeolustur("4");
        urun4.bas();
      
    }
    
}
