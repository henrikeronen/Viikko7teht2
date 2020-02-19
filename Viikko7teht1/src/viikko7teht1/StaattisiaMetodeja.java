package viikko7teht1;
public class StaattisiaMetodeja {
    
    public static double ympyranAla(double sade){
        double ala = Math.PI * sade * sade;
        return ala;
    }

    public static boolean tarkistaSotu(String sotu){
        if(sotu.length()==11){
            return true;
        }else{
            return false;
        }
       
    }
    
    public static String muunna(String mjono){
        
        String output;
        output = mjono.substring(0, 1).toUpperCase() + mjono.substring(1);
        
        return output;
    }
    
    
}