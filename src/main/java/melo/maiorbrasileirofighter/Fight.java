package melo.maiorbrasileirofighter;

import java.awt.ComponentOrientation;
import java.util.Random;
import javax.swing.JLabel;

public class Fight extends javax.swing.JFrame {

    public Fight() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomePlayer = new javax.swing.JLabel();
        hpPlayer = new javax.swing.JLabel();
        nomeOponente = new javax.swing.JLabel();
        hpOponente = new javax.swing.JLabel();
        iniciaLuta = new javax.swing.JButton();
        ataqueTxt = new javax.swing.JLabel();
        danoTxt = new javax.swing.JLabel();
        imagemPlayer = new javax.swing.JLabel();
        imagemOponente = new javax.swing.JLabel();
        barraPlayer = new javax.swing.JProgressBar();
        barraOponente = new javax.swing.JProgressBar();
        fraseDerTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maior Brasileiro Fighter");
        setPreferredSize(new java.awt.Dimension(1200, 600));

        nomePlayer.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        nomePlayer.setText("Player");

        hpPlayer.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        hpPlayer.setText("Vida");

        nomeOponente.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        nomeOponente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomeOponente.setText("Oponente");

        hpOponente.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        hpOponente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hpOponente.setText("Vida");

        iniciaLuta.setText("Iniciar batalha");
        iniciaLuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciaLutaActionPerformed(evt);
            }
        });

        ataqueTxt.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        ataqueTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ataqueTxt.setEnabled(false);

        danoTxt.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        danoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        danoTxt.setEnabled(false);

        barraOponente.setValue(50);

        fraseDerTxt.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        fraseDerTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fraseDerTxt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fraseDerTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(danoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ataqueTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagemPlayer)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hpPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barraPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeOponente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hpOponente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barraOponente, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(imagemOponente)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(iniciaLuta)
                .addContainerGap(396, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemPlayer)
                    .addComponent(imagemOponente)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeOponente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hpOponente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraOponente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hpPlayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(ataqueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(danoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(fraseDerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(iniciaLuta)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Random random = new Random();
    ResultadosMongo rm = new ResultadosMongo();
    
    private Fighter player;
    private Fighter oponente;
    private int flagBotao = 0;
    private String email;
    private String nick;
    private int vidaOponente;
    private int vidaPlayer;
    private String urlImagemPlayer;
    private String urlImagemOponente;
    private String urlImagemVitoria;
    private String textoVitoria;
    
    public Fighter getPlayer() {
        return player;
    }

    public void setPlayer(Fighter player) {
        this.player = player;
        nomePlayer.setText(player.getNome());
        vidaPlayer = player.getHp();
        hpPlayer.setText(String.valueOf(vidaPlayer));
        barraPlayer.setMaximum(vidaPlayer);
        barraPlayer.setValue(vidaPlayer);
    }

    public Fighter getOponente() {
        return oponente;
    }

    public void setOponente(Fighter oponente) {
        this.oponente = oponente;
        nomeOponente.setText(oponente.getNome());
        vidaOponente = oponente.getHp();
        hpOponente.setText(String.valueOf(vidaOponente));
        barraOponente.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        barraOponente.setMaximum(vidaOponente);
        barraOponente.setValue(vidaOponente);
    }

    public int getFlagBotao() {
        return flagBotao;
    }

    public void setFlagBotao(int flagBotao) {
        this.flagBotao = flagBotao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getUrlImagemPlayer() {
        return urlImagemPlayer;
    }

    public void setUrlImagemPlayer(String urlImagemPlayer) {
        this.urlImagemPlayer = urlImagemPlayer;
        System.out.println(urlImagemPlayer + ".jpg");
        imagemPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource(urlImagemPlayer + ".jpg")));
        
    }

    public String getUrlImagemOponente() {
        return urlImagemOponente;
    }

    public void setUrlImagemOponente(String urlImagemOponente) {
        this.urlImagemOponente = urlImagemOponente;
        System.out.println(urlImagemOponente + ".jpg");
        imagemOponente.setIcon(new javax.swing.ImageIcon(getClass().getResource(urlImagemOponente + ".jpg")));
    }

    public String getUrlImagemVitoria() {
        return urlImagemVitoria;
    }

    public void setUrlImagemVitoria(String urlImagemVitoria) {
        this.urlImagemVitoria = urlImagemVitoria;
    }

    public String getTextoVitoria() {
        return textoVitoria;
    }

    public void setTextoVitoria(String textoVitoria) {
        this.textoVitoria = textoVitoria;
    }
    
    private void iniciaLutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciaLutaActionPerformed
        // TODO add your handling code here:
        switch (getFlagBotao()) {
            case 0:
                lutar();
                break;
            case 1:
                atacaPlayer();
                break;
            case 2:
                atacaOponente();
                break;
            case 3:
                Vitoria vit = new Vitoria();
                vit.setEmail(getEmail());
                vit.setNick(getNick());
                vit.setUrlImagem(getUrlImagemVitoria());
                vit.setTextoVitoria(getTextoVitoria());
                vit.setVisible(true);
                dispose();
            default:
                break;
        }
    }//GEN-LAST:event_iniciaLutaActionPerformed

    public void lutar(){
        ataqueTxt.setEnabled(true);
        danoTxt.setEnabled(true);
        ataqueTxt.setText("A batalha vai começar!");
        iniciaLuta.setText("Ataque do " + player.getNome());
        setFlagBotao(1);
    }
    
    public void atacaPlayer(){
        int danoPlayer = random.nextInt(player.getDano());
        int op = random.nextInt(2);
        String ataque = new String();
        if (op == 1){
            ataque = player.getAtaqueSecundario();
        } else if (op == 0){
            ataque = player.getAtaquePrimario();
        }
        ataqueTxt.setText(player.getNome() + " " + ataque);
        danoTxt.setText("Dano: " +danoPlayer);
        barraOponente.setValue(barraOponente.getValue() - danoPlayer);
        
        if (vidaOponente >= danoPlayer){
            vidaOponente -= danoPlayer;
            hpOponente.setText(String.valueOf(vidaOponente));
            iniciaLuta.setText("Ataque do " + oponente.getNome());
            setFlagBotao(2);
        } else {
            vidaOponente -= vidaOponente;
            hpOponente.setText(String.valueOf(vidaOponente));
            fraseDerTxt.setText(oponente.getNome() + " " + oponente.getFraseDerrota());
            fraseDerTxt.setEnabled(true);
            setUrlImagemVitoria(getUrlImagemPlayer() +"0.jpg");
            setTextoVitoria(player.getNome() + " " + player.getFraseVitoria());
            rm.insereResultado(player.getNome(), oponente.getNome(), 0, getNick());
            iniciaLuta.setText("Continuar");
            setFlagBotao(3);
        }
    }
    
    public void atacaOponente(){
        int danoOponente = random.nextInt(oponente.getDano());
        int op = random.nextInt(2);
        String ataque = new String();
        if (op == 1){
            ataque = oponente.getAtaqueSecundario();
        } else if (op == 0){
            ataque = oponente.getAtaquePrimario();
        }
        ataqueTxt.setText(oponente.getNome() + " " + ataque);
        danoTxt.setText("Dano: " +danoOponente);
        barraPlayer.setValue(barraPlayer.getValue() - danoOponente);
        
        if (vidaPlayer >= danoOponente){
            vidaPlayer -= danoOponente;
            hpPlayer.setText(String.valueOf(vidaPlayer));
            iniciaLuta.setText("Ataque do " + player.getNome());
            setFlagBotao(1);
        } else {
            vidaPlayer -= vidaPlayer;
            hpPlayer.setText(String.valueOf(vidaPlayer));
            fraseDerTxt.setText(player.getNome() + " " + player.getFraseDerrota());
            fraseDerTxt.setEnabled(true);
            setUrlImagemVitoria(getUrlImagemOponente() +"0.jpg");
            setTextoVitoria(oponente.getNome() + " " + oponente.getFraseVitoria());
            rm.insereResultado(player.getNome(), oponente.getNome(), 1, getNick());
            iniciaLuta.setText("Continuar");
            setFlagBotao(3);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ataqueTxt;
    private javax.swing.JProgressBar barraOponente;
    private javax.swing.JProgressBar barraPlayer;
    private javax.swing.JLabel danoTxt;
    private javax.swing.JLabel fraseDerTxt;
    private javax.swing.JLabel hpOponente;
    private javax.swing.JLabel hpPlayer;
    private javax.swing.JLabel imagemOponente;
    private javax.swing.JLabel imagemPlayer;
    private javax.swing.JButton iniciaLuta;
    private javax.swing.JLabel nomeOponente;
    private javax.swing.JLabel nomePlayer;
    // End of variables declaration//GEN-END:variables
}
