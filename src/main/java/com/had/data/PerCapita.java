package com.had.data;

/**
 * @author Akshat Shukla
 * @since January 19, 2016
 */

public class PerCapita
{
    String name;
    float percapitaYear2009_10;
    float percapitaYear2010_11;
    
    public PerCapita(String name,float percapitaYear2009_10,float percapitaYear2010_11)
    {
        this.name = name;
        this.percapitaYear2009_10 = percapitaYear2009_10;
        this.percapitaYear2010_11 = percapitaYear2010_11;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public float getPerCapitaYear2009_10() {
        return percapitaYear2009_10;
    }
    
    public void setPerCapitaYear2009_10(float percapitaYear2009_10) {
        this.percapitaYear2009_10 = percapitaYear2009_10;
    }
    
    public float getPerCapitaYear2010_11() {
        return percapitaYear2010_11;
    }
    
    public void setPerCapitaYear2010_11(float percapitaYear2010_11) {
        this.percapitaYear2010_11 = percapitaYear2010_11;
    }
}
