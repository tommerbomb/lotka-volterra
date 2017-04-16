/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotkavolterra;

/**
 *
 * @author Tom
 */
public class LotkaVolterra {

    static final int hStart = 1000, pStart = 200;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LVModel lv = new LVModel(hStart, pStart);
        //new GrapherFrame(lv);
        new ControlFrame(lv);

    }

}
