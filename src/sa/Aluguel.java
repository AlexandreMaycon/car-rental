/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno_Manha
 */
public class Aluguel extends javax.swing.JFrame {

    Eventos event = new Eventos();
    CarroController ccarro = new CarroController();
    ArrayList<Carro> estCarro = ccarro.getList();

    /**
     * Creates new form Aluguel
     */
    public Aluguel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        day_choose = new javax.swing.JTextField();
        labelinput = new javax.swing.JLabel();
        conf_buton = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();
        id_choose = new javax.swing.JTextField();
        labelinput1 = new javax.swing.JLabel();
        simular_buton = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(865, 385));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setText("Aluguel");
        jLabel1.setToolTipText("");

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        day_choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day_chooseActionPerformed(evt);
            }
        });

        labelinput.setLabelFor(day_choose);
        labelinput.setText("ID do veículo:");

        conf_buton.setText("OK");
        conf_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conf_butonActionPerformed(evt);
            }
        });

        aviso.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 51, 51));

        id_choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_chooseActionPerformed(evt);
            }
        });

        labelinput1.setLabelFor(day_choose);
        labelinput1.setText("Número de dias:");

        simular_buton.setText("Simular Valor");
        simular_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simular_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Voltar)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 182, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_choose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelinput, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelinput1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(day_choose, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(conf_buton))))
                            .addComponent(aviso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simular_buton)
                        .addContainerGap(196, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Voltar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelinput)
                    .addComponent(labelinput1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_choose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day_choose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conf_buton)
                    .addComponent(simular_buton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        event.nextWindow(new Menu(), this);
    }//GEN-LAST:event_VoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        event.centerJFrame(this);
        ccarro.listarCarro(jTable1);
    }//GEN-LAST:event_formWindowOpened

    private void day_chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day_chooseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day_chooseActionPerformed

    private void conf_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conf_butonActionPerformed
//Declaração de variável
        aviso.setText("");
        String text_aviso = "";

//Pegar ID
        try {
            int input_car = Integer.parseInt(id_choose.getText());
            System.out.println("Input Car: " + input_car); // TIRAR ESSE LINHA
            if (input_car > estCarro.size() || input_car < 0) {
                text_aviso = text_aviso + "Digite um ID válido |";
            } else {
                Cliente.setCompra(input_car);
            }
        } catch (NumberFormatException e) {
            text_aviso = text_aviso + "Digite um ID válido |";
        }
//Pegar Dias
        try {
            int input_days = Integer.parseInt(day_choose.getText());
            System.out.println("Input Days: " + input_days); // TIRAR ESSE LINHA
            Cliente.setQtd_dias(input_days);
        } catch (NumberFormatException e) {
            if (!(day_choose.getText().length() == 0)) {
                text_aviso = text_aviso + " Digite apenas números |";
            }
        }
//Verificar sem os campos tem algo
        if (id_choose.getText().length() == 0 && day_choose.getText().length() == 0) {
            text_aviso = "Digite algo!!";
        }
//Avisar
        if (text_aviso.length() != 0) {
            aviso.setText(text_aviso);
        } else {
            Cliente.setCompra(0);
            Cliente.setQtd_dias(Integer.parseInt(day_choose.getText()));
            int id_carro = Integer.parseInt(id_choose.getText());
            TelaFinal.carro_select = ccarro.getCarro(id_carro);
            event.nextWindow(new TelaFinal(), this);
        }
    }//GEN-LAST:event_conf_butonActionPerformed

    private void id_chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_chooseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_chooseActionPerformed

    private void simular_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simular_butonActionPerformed
//Declaração de variável
        aviso.setText("");
        String text_aviso = "";

//Pegar ID
        try {
            int input_car = Integer.parseInt(id_choose.getText());
            System.out.println("Input Car: " + input_car); // TIRAR ESSE LINHA
            if (input_car >= estCarro.size() || input_car < 0) {
                text_aviso = text_aviso + "Digite um ID válido |";
            } else {
                Cliente.setCompra(input_car);
            }
        } catch (NumberFormatException e) {
            text_aviso = text_aviso + "Digite um ID válido |";
        }
//Pegar Dias
        try {
            int input_days = Integer.parseInt(day_choose.getText());
            System.out.println("Input Days: " + input_days); // TIRAR ESSE LINHA
            Cliente.setQtd_dias(input_days);
        } catch (NumberFormatException e) {
            if (!(day_choose.getText().length() == 0)) {
                text_aviso = text_aviso + " Digite apenas números |";
            }
        }
//Verificar sem os campos tem algo
        if (id_choose.getText().length() == 0 && day_choose.getText().length() == 0) {
            text_aviso = "Digite algo!!";
        }
//Avisar
        if (text_aviso.length() != 0) {
            aviso.setText(text_aviso);
        } else {
            int input_car = Integer.parseInt(id_choose.getText());
            int input_days = Integer.parseInt(day_choose.getText());
            aviso.setText("Valor: " + String.valueOf(ccarro.getCarro(input_car).getPrecoAluguel() * input_days));
        }
    }//GEN-LAST:event_simular_butonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel aviso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton conf_buton;
    private javax.swing.JTextField day_choose;
    private javax.swing.JTextField id_choose;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelinput;
    private javax.swing.JLabel labelinput1;
    private javax.swing.JButton simular_buton;
    // End of variables declaration//GEN-END:variables
}
