
package design;


public class jf1 extends javax.swing.JFrame {

   
    String a;
    public jf1() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tv1 = new javax.swing.JTextField();
        tv2 = new javax.swing.JTextField();
        tv3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tv1.setBackground(new java.awt.Color(153, 255, 153));

        tv2.setBackground(new java.awt.Color(102, 255, 102));

        tv3.setBackground(new java.awt.Color(102, 0, 0));
        tv3.setForeground(new java.awt.Color(0, 255, 51));
        tv3.setText("ADD");
        tv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tv3ActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 274, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tv1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tv2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tv3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tv3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String num1=tv1.getText();
         double n1=Double.parseDouble(num1);
         String num2=tv2.getText();
         double n2=Double.parseDouble(num2);
         double sum=n1+n2;
         
            a=String.valueOf(sum);
        
        
        jf2 obj=new jf2(a);
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tv3ActionPerformed
        
    }//GEN-LAST:event_tv3ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jf1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField tv1;
    private javax.swing.JTextField tv2;
    private javax.swing.JButton tv3;
    // End of variables declaration//GEN-END:variables
}
