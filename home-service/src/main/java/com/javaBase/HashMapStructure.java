package com.javaBase;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by zbb1990 on 2016/5/9.
 */
public class HashMapStructure {
    /**
     * @author Arpit Mandliya
     */
    public static void main(String[] args) {

        Country india=new Country("India",1000);
        Country japan=new Country("Japan",10000);

        Country france=new Country("France",2000);
        Country russia=new Country("Russia",20000);

        HashMap<Country,String> countryCapitalMap=new HashMap<Country,String>();
        countryCapitalMap.put(india,"Delhi");
        countryCapitalMap.put(japan,"Tokyo");
        countryCapitalMap.put(france,"Paris");
        countryCapitalMap.put(russia,"Moscow");

        Iterator<Country> countryCapitalIter=countryCapitalMap.keySet().iterator();//put debug point at this line
        while(countryCapitalIter.hasNext())
        {
            Country countryObj=countryCapitalIter.next();
            String capital=countryCapitalMap.get(countryObj);
            System.out.println(countryObj.getName()+"----"+capital);
        }
    }

}
