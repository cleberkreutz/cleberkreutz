/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import funcoes.*;

/**
 *
 * @author jonasdhein
 */
public class TelaCombate extends javax.swing.JFrame {

    Personagem personagem;
    Inimigo inimigo;
    String[] inimigos = {"Cell", "Bardock", "Inimigo Final"};
    int contInimigo = 0;
    
    public TelaCombate() {
        initComponents();
        
        personagem = new Personagem();
        personagem.setNome("Goku");
        personagem.setVida(100);
        personagem.setAtaque(15);
        
        gerarInimigo();
        
        exibirPersonagem();
        exibirInimigo();
    }
    
    private void exibirPersonagem(){
        lblNomePersonagem.setText(personagem.getNome());
        lblVidaPersonagem.setText(String.valueOf(personagem.getVida()));
        lblAtaquePersonagem.setText(String.valueOf(personagem.getAtaque()));
    }
    
    private void exibirInimigo(){
        lblNomeInimigo.setText(inimigo.getNome());
        lblVidaInimigo.setText(String.valueOf(inimigo.getVida()));
        lblAtaqueInimigo.setText(String.valueOf(inimigo.getAtaque()));
    }
    
    private void gerarInimigo(){
        
        inimigo = new Inimigo();
        inimigo.setNome(inimigos[contInimigo]);
        inimigo.setVida(100);
        inimigo.setAtaque(15);
        
        if(contInimigo < inimigos.length){
            contInimigo += 1;
        }else{
            contInimigo = 0;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomePersonagem = new javax.swing.JLabel();
        lblPersonagem1 = new javax.swing.JLabel();
        lblVidaPersonagem = new javax.swing.JLabel();
        lblAtaquePersonagem = new javax.swing.JLabel();
        lblPersonagem2 = new javax.swing.JLabel();
        btnAtacar = new javax.swing.JButton();
        lblNomeInimigo = new javax.swing.JLabel();
        lblPersonagem3 = new javax.swing.JLabel();
        lblVidaInimigo = new javax.swing.JLabel();
        lblAtaqueInimigo = new javax.swing.JLabel();
        lblPersonagem4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomePersonagem.setText("...");

        lblPersonagem1.setText("Vida:");

        lblVidaPersonagem.setText("...");

        lblAtaquePersonagem.setText("...");

        lblPersonagem2.setText("Ataque:");

        btnAtacar.setText("ATACAR");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });

        lblNomeInimigo.setText("...");

        lblPersonagem3.setText("Vida:");

        lblVidaInimigo.setText("...");

        lblAtaqueInimigo.setText("...");

        lblPersonagem4.setText("Ataque:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnAtacar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonagem2)
                            .addComponent(lblPersonagem1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVidaPersonagem)
                            .addComponent(lblAtaquePersonagem))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonagem4)
                            .addComponent(lblPersonagem3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVidaInimigo)
                            .addComponent(lblAtaqueInimigo))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomePersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersonagem1)
                            .addComponent(lblVidaPersonagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersonagem2)
                            .addComponent(lblAtaquePersonagem)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeInimigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersonagem3)
                            .addComponent(lblVidaInimigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersonagem4)
                            .addComponent(lblAtaqueInimigo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnAtacar)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        
        atacar();
        
        if(inimigo.getVida() <= 0){ //VERIFICA SE PRECISA GERAR OUTRO INIMIGO
            CaixaDeDialogo.obterinstancia().exibirMensagem("Inimigo derrotado, PARABÉNS!!!", 'i');
            gerarInimigo();
        }
        
         if(personagem.getVida() <= 0){ //VERIFICA SE PRECISA GERAR OUTRO INIMIGO
            CaixaDeDialogo.obterinstancia().exibirMensagem("GAME OVER!!!", 'i');
         }
        
        
        exibirPersonagem();
        exibirInimigo();
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void atacar(){
        int ataque = personagem.getAtaque();
        int vida = inimigo.getVida();
        /*
        1,2 = inimigo ataca
        3 = ataque normal
        4 = ataque + 10%
        5 = ataque * 2
        */
        int dado = Funcoes.sortearNumero(5);
        if(dado == 1 || dado == 2){
            personagem.setVida(personagem.getVida() - inimigo.getAtaque());
        }else if(dado == 3){
            inimigo.setVida(inimigo.getVida() - ataque);
        }else if(dado == 4){ //10% a mais
            vida = (int) (inimigo.getVida() - (ataque * 1.1));
            inimigo.setVida(vida);
        }else{ //ataque x 2
            inimigo.setVida(inimigo.getVida() - (ataque * 2));
            personagem.setAtaque((int) (ataque * 1.2));
        }
    }
    
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
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCombate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtacar;
    private javax.swing.JLabel lblAtaqueInimigo;
    private javax.swing.JLabel lblAtaquePersonagem;
    private javax.swing.JLabel lblNomeInimigo;
    private javax.swing.JLabel lblNomePersonagem;
    private javax.swing.JLabel lblPersonagem1;
    private javax.swing.JLabel lblPersonagem2;
    private javax.swing.JLabel lblPersonagem3;
    private javax.swing.JLabel lblPersonagem4;
    private javax.swing.JLabel lblVidaInimigo;
    private javax.swing.JLabel lblVidaPersonagem;
    // End of variables declaration//GEN-END:variables
}
