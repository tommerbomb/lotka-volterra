/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotkavolterra;

import java.util.ArrayList;

/**
 *
 * @author Tom
 */
public class DataPairList extends ArrayList<DataPair> {
    
    public String toString(){
        String ret = "";
        
        for(DataPair dp: this){
            ret+= "h= " + dp.getH() + "\tp= " + dp.getP() +"\n";
        }
        
        return ret;
    }
    
}
