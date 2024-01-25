
package factoryornek2;


public class DugmeFactory {
    
    public static Dugmeler dugmeolustur(String x)
    {
       if("1".equals(x))
       {
           return new BasitDugme();
       }
       else if("2".equals(x))
       {
           return new  AnaSayfaDugmesi(); 
       }
       else if("3".equals(x))
       {
           return new IletisimDugmesi();
       }
       else {
           throw new RuntimeException(" Nesne olusturulamadi");
       }
    }
    
}
