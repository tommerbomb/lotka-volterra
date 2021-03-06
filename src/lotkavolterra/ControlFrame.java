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
public class ControlFrame extends javax.swing.JFrame {

    GrapherFrame grapher;
    PhaseGrapherFrame phasegrapher;
    LVModel model;
    DataPairList list;

    final int hStart = lotkavolterra.LotkaVolterra.hStart, pStart = lotkavolterra.LotkaVolterra.pStart;

    ControlFrame(LVModel lv) {
        pack();
        setLocation(650, 500);
        model = lv;
        initComponents();
        setVisible(true);
        

        list = model.list;
        grapher = new GrapherFrame(lv);
        phasegrapher = new PhaseGrapherFrame(lv.list);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alphaSlider = new javax.swing.JSlider();
        betaSlider = new javax.swing.JSlider();
        aSlider = new javax.swing.JSlider();
        bSlider = new javax.swing.JSlider();
        alphaTF = new javax.swing.JTextField();
        aTF = new javax.swing.JTextField();
        betaTF = new javax.swing.JTextField();
        bTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alphaSlider.setMaximum(1000);
        alphaSlider.setValue(0);
        alphaSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                alphaSliderStateChanged(evt);
            }
        });

        betaSlider.setMaximum(1000);
        betaSlider.setValue(0);
        betaSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                betaSliderStateChanged(evt);
            }
        });

        aSlider.setMaximum(1000);
        aSlider.setToolTipText("");
        aSlider.setValue(0);
        aSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aSliderStateChanged(evt);
            }
        });

        bSlider.setMaximum(1000);
        bSlider.setValue(0);
        bSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bSliderStateChanged(evt);
            }
        });

        alphaTF.setText("" + model.alpha);

        aTF.setText("" + model.a);

        betaTF.setText("" + model.beta);

        bTF.setText("" + model.b);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(aSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(betaSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alphaSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(betaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alphaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alphaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alphaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(betaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(betaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alphaSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_alphaSliderStateChanged

        double alphaValue = 0.01 * alphaSlider.getValue() / alphaSlider.getMaximum();

        double betaValue = 0.01 * betaSlider.getValue() / betaSlider.getMaximum();
        if (betaValue == 0.0) {
            betaValue = model.beta;
        }
        double aValue = 0.5 * aSlider.getValue() / aSlider.getMaximum();
        if (aValue == 0.0) {
            aValue = model.a;
        }
        double bValue = 0.5 * bSlider.getValue() / bSlider.getMaximum();
        if (bValue == 0.0) {
            bValue = model.b;
        }

        alphaTF.setText("" + alphaValue);
        newModel(hStart, pStart);
        setParameters(alphaValue, betaValue, aValue, bValue);
        initList();
        sim();
        grapher.repaint();

        if (phasegrapher != null) {
            phasegrapher.setList(list);
            phasegrapher.repaint();
        }
    }//GEN-LAST:event_alphaSliderStateChanged

    private void betaSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_betaSliderStateChanged
        double betaValue = 0.01 * betaSlider.getValue() / betaSlider.getMaximum();

        double alphaValue = 0.01 * alphaSlider.getValue() / alphaSlider.getMaximum();
        if (alphaValue == 0.0) {
            alphaValue = model.alpha;
        }
        double aValue = 0.5 * aSlider.getValue() / aSlider.getMaximum();
        if (aValue == 0.0) {
            aValue = model.a;
        }
        double bValue = 0.5 * bSlider.getValue() / bSlider.getMaximum();
        if (bValue == 0.0) {
            bValue = model.b;
        }

        betaTF.setText("" + betaValue);
        newModel(hStart, pStart);
        setParameters(alphaValue, betaValue, aValue, bValue);
        initList();

        sim();
        grapher.repaint();
        if (phasegrapher != null) {
            phasegrapher.setList(list);
            phasegrapher.repaint();
        }
    }//GEN-LAST:event_betaSliderStateChanged

    private void aSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aSliderStateChanged
        double aValue = 0.5 * aSlider.getValue() / aSlider.getMaximum();

        double alphaValue = 0.01 * alphaSlider.getValue() / alphaSlider.getMaximum();
        if (alphaValue == 0.0) {
            alphaValue = model.alpha;
        }
        double betaValue = 0.01 * betaSlider.getValue() / betaSlider.getMaximum();
        if (betaValue == 0.0) {
            betaValue = model.beta;
        }
        double bValue = 0.5 * bSlider.getValue() / bSlider.getMaximum();
        if (bValue == 0.0) {
            bValue = model.b;
        }

        aTF.setText("" + aValue);
        newModel(hStart, pStart);
        setParameters(alphaValue, betaValue, aValue, bValue);
        initList();
        sim();
        grapher.repaint();
        if (phasegrapher != null) {
            phasegrapher.setList(list);
            phasegrapher.repaint();
        }
    }//GEN-LAST:event_aSliderStateChanged

    private void bSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bSliderStateChanged
        double bValue = 0.5 * bSlider.getValue() / bSlider.getMaximum();

        double alphaValue = 0.01 * alphaSlider.getValue() / alphaSlider.getMaximum();
        if (alphaValue == 0.0) {
            alphaValue = model.alpha;
        }
        double aValue = 0.5 * aSlider.getValue() / aSlider.getMaximum();
        if (aValue == 0.0) {
            aValue = model.a;
        }
        double betaValue = 0.01 * betaSlider.getValue() / betaSlider.getMaximum();
        if (betaValue == 0.0) {
            betaValue = model.beta;
        }

        bTF.setText("" + bValue);
        newModel(hStart, pStart);
        setParameters(alphaValue, betaValue, aValue, bValue);
        initList();
        sim();
        grapher.repaint();
        if (phasegrapher != null) {
            phasegrapher.setList(list);
            phasegrapher.repaint();
        }
    }//GEN-LAST:event_bSliderStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    void setParameters(double alpha, double beta, double a, double b) {
        model.setAlpha(alpha);
        model.setBeta(beta);
        model.setA(a);
        model.setB(b);
    }

    void newModel(int x, int y) {
        model.h = x;
        model.p = y;

    }

    private void initList() {
        list.clear();
    }

    private void sim() {
        for (int i = 0; i < 1000; i++) {
            //System.out.println(model);
            model.takeStep();
            if (model.h <= 0 || model.p <= 0) {
                break;
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider aSlider;
    private javax.swing.JTextField aTF;
    private javax.swing.JSlider alphaSlider;
    private javax.swing.JTextField alphaTF;
    private javax.swing.JSlider bSlider;
    private javax.swing.JTextField bTF;
    private javax.swing.JSlider betaSlider;
    private javax.swing.JTextField betaTF;
    // End of variables declaration//GEN-END:variables
}
