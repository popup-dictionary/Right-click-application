/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import rita.wordnet.RiWordnet;

/**
 *
 * @author Usama
 */
public class Dictionary {
    public String wordsearch(String word)
    {
        RiWordnet wn = new RiWordnet();
        String pos=wn.getBestPos(word);
        String def = wn.getDescription(word, pos);
        return def;
    }
}
