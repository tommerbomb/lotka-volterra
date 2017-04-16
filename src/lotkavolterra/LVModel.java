/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotkavolterra;

import java.util.*;

/**
 *
 * @author Tom
 */
class LVModel {

    int h, p;
    double alpha = 0.001, beta = 0.001d;
    double a = 0.1, b = 0.4;
    int time = 0;
    DataPairList list = new DataPairList();

    LVModel(int h, int p) {
        this.h = h;
        this.p = p;
        list.add(new DataPair(h,p));
    }

    void takeStep() {
        /* dH = aH - αHP 
         dP = βHP - bP 
        
         a = birthrate of herbivores
         b = deathrate for predators
         alpha = proportion of H eaten by P
         beta = proportion of eaten Hs that convert to Ps
        
         */

        int dH = (int) (a * h - alpha * h * p);
        int dP = (int) (beta * h * p - b * p);

        int derH = (int) (h * (a - alpha * p));
        int derP = (int) (p * (beta * h - b));

        h += derH;
        p += derP;

        time++;
        list.add(new DataPair(h, p));

    }

    public String toString() {
        String ret = "";
        ret += "H= " + h + "\n" + "P= " + p + " Time= " + time;
        return ret;

    }

    public DataPairList getList() {
        return list;
    }

    public void setAlpha(double d) {
        alpha = d;
    }

    public void setBeta(double d) {
        beta = d;
    }

    public void setA(double d) {
        a = d;
    }

    public void setB(double d) {
        b = d;
    }

    public int getH() {

        return h;
    }

    public int getP() {

        return p;
    }
}
