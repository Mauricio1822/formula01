/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class ManutencaoEquipe extends javax.swing.JDialog {

    /**
     * Creates new form ManutencaoEquipe
     */
    public ManutencaoEquipe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manutenção Equipe");

        jLabel3.setText("Código:");

        jLabel4.setText("Nome:");

        jButton1.setText("Adicionar");

        jButton2.setText("Alterar");

        jButton3.setText("Excluir");

        jButton4.setText("Cancelar");

        jLabel5.setText("País:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AD - Andorra", "AE - Emirados Árabes Unidos", "AF - Afeganistão", "AG - Antígua e Barbuda", "AI - Anguilla", "AL - Albânia", "AM - Armênia", "AO - Angola", "AQ - Antártica", "AR - Argentina", "AS - Samoa Americana", "AT - Áustria", "AU - Austrália", "AW - Aruba", "AZ - Azerbaijão", "BA - Bósnia e Herzegovina", "BB - Barbados", "BD - Bangladesh", "BE - Bélgica", "BF - Burkina Faso", "BG - Bulgária", "BH - Barém", "BI - Burundi", "BJ - Benin", "BL - São Bartolomeu", "BM - Bermuda", "BN - Brunei", "BO - Bolívia", "BR - Brasil", "BS - Bahamas", "BT - Butão", "BV - Ilha Bouvet", "BW - Botswana", "BY - Belarus", "BZ - Belize", "CA - Canadá", "CC - Ilhas Cocos (Keeling)", "CD - Congo, República Democrática do", "CF - República Centro-Africana", "CG - Congo, República do", "CH - Suíça", "CI - Costa do Marfim", "CK - Ilhas Cook", "CL - Chile", "CM - Camarões", "CN - China", "CO - Colômbia", "CR - Costa Rica", "CU - Cuba", "CV - Cabo Verde", "CW - Curaçao", "CX - Ilha Christmas", "CY - Chipre", "CZ - República Tcheca", "DE - Alemanha", "DJ - Djibuti", "DK - Dinamarca", "DM - Dominica", "DO - República Dominicana", "DZ - Argélia", "EC - Equador", "EE - Estônia", "EG - Egito", "EH - Saara Ocidental", "ER - Eritréia", "ES - Espanha", "ET - Etiópia", "FI - Finlândia", "FJ - Fiji", "FK - Ilhas Falkland (Malvinas)", "FM - Micronésia, Estados Federados da", "FO - Ilhas Feroe", "FR - França", "FX - França Metropolitana", "GA - Gabão", "GB - Reino Unido", "GD - Grenada", "GE - Geórgia", "GF - Guiana Francesa", "GG - Guernsey", "GH - Gana", "GI - Gibraltar", "GL - Greenland", "GM - Gâmbia", "GN - Guiné", "GP - Guadelupe", "GQ - Guiné Equatorial", "GR - Grécia", "GS - Geórgia do Sul e Ilhas", "GT - Guatemala", "GU - Guam", "GW - Guiné-Bissau", "GY - Guiana", "HK - Hong Kong", "HM - Ilhas Heard and McDonald", "HN - Honduras", "HR - Croácia", "HT - Haiti", "HU - Hungria", "ID - Indonésia", "IE - Irlanda", "IL - Israel", "IM - Ilha de Man", "IN - Índia", "IO - Território Britânico do Oceano Índico", "IQ - Iraque", "IR - Irã", "IS - Islândia", "IT - Itália", "JE - Jersey", "JM - Jamaica", "JO - Jordânia", "JP - Japão", "KE - Quênia", "KG - Quirguistão", "KH - Camboja", "KI - Kiribati", "KM - Cômoros", "KN - São Cristóvão e Nevis", "KP - Coreia do Norte", "KR - Coreia do Sul", "KW - Kuwait", "KY - Ilhas Caiman", "KZ - Cazaquistão", "LA - Laos", "LB - Líbano", "LC - Santa Lúcia", "LI - Liechtenstein", "LK - Sri Lanka", "LR - Libéria", "LS - Lesoto", "LT - Lituânia", "LU - Luxemburgo", "LV - Letônia", "LY - Líbia", "MA - Marrocos", "MC - Mônaco", "MD - Moldova", "ME - Montenegro", "MF - Saint Martin", "MG - Madagascar", "MH - Ilhas Marshall", "MK - Macedônia", "ML - Mali", "MM - Birmânia", "MN - Mongólia", "MO - Macao", "MP - Ilhas Marianas do Norte", "MQ - Martinica", "MR - Mauritânia", "MS - Montserrat", "MT - Malta", "mu – Ilhas Maurício", "MV - Maldivas", "MW - Malawi", "MX - México", "MY - Malásia", "MZ - Moçambique", "NA - Namíbia", "NC - Nova Caledônia", "NE - Níger", "NF - Ilha Norfolk", "NG - Nigéria", "NI - Nicarágua", "NL - Holanda", "NO - Noruega", "NP - Nepal", "NR - Nauru", "NU - Niue", "NZ - Nova Zelândia", "OM - Omã", "PA - Panamá", "PE - Peru", "PF - Polinésia Francesa", "PG - Papua Nova Guiné", "PH - Filipinas", "PK - Paquistão", "PL - Polônia", "PM - Saint Pierre e Miquelon", "PN - Ilhas Pitcairn", "PR - Porto Rico", "PS - Faixa de Gaza", "PS - Cisjordânia", "PT - Portugal", "PW - Palau", "PY - Paraguai", "QA - Qatar", "RE - Reunião", "RO - Romênia", "RS - Sérvia", "RU - Rússia", "RW - Ruanda", "SA - Arábia Saudita", "SB - Ilhas Salomão", "SC - Seicheles", "SD - Sudão", "SE - Suécia", "SG - Cingapura", "SH - Santa Helena, Ascensão e Tristão da Cunha", "SI - Eslovênia", "SJ - Svalbard", "SK - Eslováquia", "SL - Serra Leoa", "SM - San Marino", "SN - Senegal", "SO - Somália", "SR - Suriname", "SS - Sudão do Sul", "ST - São Tomé e Príncipe", "SV - El Salvador", "SX - São Martinho", "SY - Síria", "SZ - Suazilândia", "TC - Ilhas Turks e Caicos", "TD - Chad", "TF - Sul da França e Antártica", "TG - Togo", "TH - Tailândia", "TJ - Tadjiquistão", "TK - Toquelau", "TL - Timor-Leste", "TM - Turcomenistão", "TN - Tunísia", "TO - Tonga", "TR - Turquia", "TT - Trinidad e Tobago", "TV - Tuvalu", "TW - Taiwan", "TZ - Tanzânia", "UA - Ucrânia", "UG - Uganda", "UM - Ilhas Menores Distantes dos Estados Unidos", "US - Estados Unidos", "UY - Uruguai", "UZ - Uzbequistão", "VA - Santa Sé (Cidade do Vaticano)", "VC - São Vicente e Granadinas", "VE - Venezuela", "VG - Ilhas Virgens Britânicas", "VI - Ilhas Virgens Americanas", "VN - Vietnã", "VU - Vanuatu", "WF - Ilhas Wallis e Futuna", "WS - Samoa", "XK - Kosovo", "YE - Iêmen", "YT - Maiote", "ZA - África do Sul", "ZM - Zâmbia", "ZW - Zimbábue" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField2)
                                    .addGap(110, 110, 110)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManutencaoEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManutencaoEquipe dialog = new ManutencaoEquipe(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
