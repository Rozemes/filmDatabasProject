
package filmdatabas;

import java.util.ArrayList;
import java.util.List;

public class Film {
    
    private int id;
    private String titel;
    public List<String> genre = new ArrayList<>();
    private String regissör;
    private String betyg;
    
    public void setTitel(String titel){
            this.titel = titel;
    }
    public void setGenre(String genre){
        int n = 0;
        while(genre.contains(",")) {
                n = genre.indexOf(",");
                this.genre.add(genre.substring(0,n));
                genre = genre.substring(n+1).trim();
        }this.genre.add(genre);
        
    }
    public void setRegissör(String regissör){
            this.regissör = regissör;
    }
    public void setBetyg(int i){
        switch(i){
            case 1: this.betyg = "dåligt";
            break;
            case 2: this.betyg = "Sådär";
            break;
            case 3: this.betyg = "Okej";
            break;
            case 4: this.betyg = "Bra";
            break;
            case 5: this.betyg = "Grym!";
            break;
            default: throw new IllegalArgumentException("Felaktigt betyg");
        }
    }
    public void setBetyg(String betyg){
        this.betyg = betyg;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getTitel(){
        return titel;
    }
    public String getGenre(){
        String allaGenres = genre.get(0);
        if(genre.size() > 1){
            for(String s : genre.subList(1, genre.size()))
                allaGenres += ", " + s;
            return allaGenres;
        }else
            return allaGenres;
    }
    public String getRegissör(){
        return regissör;
    }
    public String getBetyg(){
        return betyg;
    }
    public int getId(){
        return id;
    }
    public Film(int id, String titel, String genre, String regissör, int betyg){
        setId(id);
        setTitel(titel);
        setGenre(genre);    
        setRegissör(regissör);  
        setBetyg(betyg);
    }
    public Film(int id, String titel, String genre, String regissör, String betyg){
        setId(id);
        setTitel(titel);
        setGenre(genre);    
        setRegissör(regissör);  
        setBetyg(betyg);
    }
    @Override
    public String toString(){
        return "Filmen " + titel + " tillhör kategorin (" + getGenre() + ") och regisserades av \"" + regissör + "\" och fick betyget " + betyg;
    }
    
}
