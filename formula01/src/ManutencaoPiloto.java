/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class ManutencaoPiloto extends javax.swing.JDialog {

    /**
     * Creates new form ManutencaoPiloto
     */
    public ManutencaoPiloto(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manutenção Piloto");

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jButton1.setText("Adicionar");

        jButton2.setText("Alterar");

        jButton3.setText("Excluir");

        jButton4.setText("Cancelar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AD - Andorra", "AE - Emirados Árabes Unidos", "AF - Afeganistão", "AG - Antígua e Barbuda", "AI - Anguilla", "AL - Albânia", "AM - Armênia", "AO - Angola", "AQ - Antártica", "AR - Argentina", "AS - Samoa Americana", "AT - Áustria", "AU - Austrália", "AW - Aruba", "AZ - Azerbaijão", "BA - Bósnia e Herzegovina", "BB - Barbados", "BD - Bangladesh", "BE - Bélgica", "BF - Burkina Faso", "BG - Bulgária", "BH - Barém", "BI - Burundi", "BJ - Benin", "BL - São Bartolomeu", "BM - Bermuda", "BN - Brunei", "BO - Bolívia", "BR - Brasil", "BS - Bahamas", "BT - Butão", "BV - Ilha Bouvet", "BW - Botswana", "BY - Belarus", "BZ - Belize", "CA - Canadá", "CC - Ilhas Cocos (Keeling)", "CD - Congo, República Democrática do", "CF - República Centro-Africana", "CG - Congo, República do", "CH - Suíça", "CI - Costa do Marfim", "CK - Ilhas Cook", "CL - Chile", "CM - Camarões", "CN - China", "CO - Colômbia", "CR - Costa Rica", "CU - Cuba", "CV - Cabo Verde", "CW - Curaçao", "CX - Ilha Christmas", "CY - Chipre", "CZ - República Tcheca", "DE - Alemanha", "DJ - Djibuti", "DK - Dinamarca", "DM - Dominica", "DO - República Dominicana", "DZ - Argélia", "EC - Equador", "EE - Estônia", "EG - Egito", "EH - Saara Ocidental", "ER - Eritréia", "ES - Espanha", "ET - Etiópia", "FI - Finlândia", "FJ - Fiji", "FK - Ilhas Falkland (Malvinas)", "FM - Micronésia, Estados Federados da", "FO - Ilhas Feroe", "FR - França", "FX - França Metropolitana", "GA - Gabão", "GB - Reino Unido", "GD - Grenada", "GE - Geórgia", "GF - Guiana Francesa", "GG - Guernsey", "GH - Gana", "GI - Gibraltar", "GL - Greenland", "GM - Gâmbia", "GN - Guiné", "GP - Guadelupe", "GQ - Guiné Equatorial", "GR - Grécia", "GS - Geórgia do Sul e Ilhas", "GT - Guatemala", "GU - Guam", "GW - Guiné-Bissau", "GY - Guiana", "HK - Hong Kong", "HM - Ilhas Heard and McDonald", "HN - Honduras", "HR - Croácia", "HT - Haiti", "HU - Hungria", "ID - Indonésia", "IE - Irlanda", "IL - Israel", "IM - Ilha de Man", "IN - Índia", "IO - Território Britânico do Oceano Índico", "IQ - Iraque", "IR - Irã", "IS - Islândia", "IT - Itália", "JE - Jersey", "JM - Jamaica", "JO - Jordânia", "JP - Japão", "KE - Quênia", "KG - Quirguistão", "KH - Camboja", "KI - Kiribati", "KM - Cômoros", "KN - São Cristóvão e Nevis", "KP - Coreia do Norte", "KR - Coreia do Sul", "KW - Kuwait", "KY - Ilhas Caiman", "KZ - Cazaquistão", "LA - Laos", "LB - Líbano", "LC - Santa Lúcia", "LI - Liechtenstein", "LK - Sri Lanka", "LR - Libéria", "LS - Lesoto", "LT - Lituânia", "LU - Luxemburgo", "LV - Letônia", "LY - Líbia", "MA - Marrocos", "MC - Mônaco", "MD - Moldova", "ME - Montenegro", "MF - Saint Martin", "MG - Madagascar", "MH - Ilhas Marshall", "MK - Macedônia", "ML - Mali", "MM - Birmânia", "MN - Mongólia", "MO - Macao", "MP - Ilhas Marianas do Norte", "MQ - Martinica", "MR - Mauritânia", "MS - Montserrat", "MT - Malta", "mu – Ilhas Maurício", "MV - Maldivas", "MW - Malawi", "MX - México", "MY - Malásia", "MZ - Moçambique", "NA - Namíbia", "NC - Nova Caledônia", "NE - Níger", "NF - Ilha Norfolk", "NG - Nigéria", "NI - Nicarágua", "NL - Holanda", "NO - Noruega", "NP - Nepal", "NR - Nauru", "NU - Niue", "NZ - Nova Zelândia", "OM - Omã", "PA - Panamá", "PE - Peru", "PF - Polinésia Francesa", "PG - Papua Nova Guiné", "PH - Filipinas", "PK - Paquistão", "PL - Polônia", "PM - Saint Pierre e Miquelon", "PN - Ilhas Pitcairn", "PR - Porto Rico", "PS - Faixa de Gaza", "PS - Cisjordânia", "PT - Portugal", "PW - Palau", "PY - Paraguai", "QA - Qatar", "RE - Reunião", "RO - Romênia", "RS - Sérvia", "RU - Rússia", "RW - Ruanda", "SA - Arábia Saudita", "SB - Ilhas Salomão", "SC - Seicheles", "SD - Sudão", "SE - Suécia", "SG - Cingapura", "SH - Santa Helena, Ascensão e Tristão da Cunha", "SI - Eslovênia", "SJ - Svalbard", "SK - Eslováquia", "SL - Serra Leoa", "SM - San Marino", "SN - Senegal", "SO - Somália", "SR - Suriname", "SS - Sudão do Sul", "ST - São Tomé e Príncipe", "SV - El Salvador", "SX - São Martinho", "SY - Síria", "SZ - Suazilândia", "TC - Ilhas Turks e Caicos", "TD - Chad", "TF - Sul da França e Antártica", "TG - Togo", "TH - Tailândia", "TJ - Tadjiquistão", "TK - Toquelau", "TL - Timor-Leste", "TM - Turcomenistão", "TN - Tunísia", "TO - Tonga", "TR - Turquia", "TT - Trinidad e Tobago", "TV - Tuvalu", "TW - Taiwan", "TZ - Tanzânia", "UA - Ucrânia", "UG - Uganda", "UM - Ilhas Menores Distantes dos Estados Unidos", "US - Estados Unidos", "UY - Uruguai", "UZ - Uzbequistão", "VA - Santa Sé (Cidade do Vaticano)", "VC - São Vicente e Granadinas", "VE - Venezuela", "VG - Ilhas Virgens Britânicas", "VI - Ilhas Virgens Americanas", "VN - Vietnã", "VU - Vanuatu", "WF - Ilhas Wallis e Futuna", "WS - Samoa", "XK - Kosovo", "YE - Iêmen", "YT - Maiote", "ZA - África do Sul", "ZM - Zâmbia", "ZW - Zimbábue" }));
        jComboBox1.setActionCommand("AD - Andorra\nAE - Emirados Árabes Unidos\nAF - Afeganistão\nAG - Antígua e Barbuda\nAI - Anguilla\nAL - Albânia\nAM - Armênia\nAO - Angola\nAQ - Antártica\nAR - Argentina\nAS - Samoa Americana\nAT - Áustria\nAU - Austrália\nAW - Aruba\nAZ - Azerbaijão\nBA - Bósnia e Herzegovina\nBB - Barbados\nBD - Bangladesh\nBE - Bélgica\nBF - Burkina Faso\nBG - Bulgária\nBH - Barém\nBI - Burundi\nBJ - Benin\nBL - São Bartolomeu\nBM - Bermuda\nBN - Brunei\nBO - Bolívia\nBR - Brasil\nBS - Bahamas\nBT - Butão\nBV - Ilha Bouvet\nBW - Botswana\nBY - Belarus\nBZ - Belize\nCA - Canadá\nCC - Ilhas Cocos (Keeling)\nCD - Congo, República Democrática do\nCF - República Centro-Africana\nCG - Congo, República do\nCH - Suíça\nCI - Costa do Marfim\nCK - Ilhas Cook\nCL - Chile\nCM - Camarões\nCN - China\nCO - Colômbia\nCR - Costa Rica\nCU - Cuba\nCV - Cabo Verde\nCW - Curaçao\nCX - Ilha Christmas\nCY - Chipre\nCZ - República Tcheca\nDE - Alemanha\nDJ - Djibuti\nDK - Dinamarca\nDM - Dominica\nDO - República Dominicana\nDZ - Argélia\nEC - Equador\nEE - Estônia\nEG - Egito\nEH - Saara Ocidental\nER - Eritréia\nES - Espanha\nET - Etiópia\nFI - Finlândia\nFJ - Fiji\nFK - Ilhas Falkland (Malvinas)\nFM - Micronésia, Estados Federados da\nFO - Ilhas Feroe\nFR - França\nFX - França Metropolitana\nGA - Gabão\nGB - Reino Unido\nGD - Grenada\nGE - Geórgia\nGF - Guiana Francesa\nGG - Guernsey\nGH - Gana\nGI - Gibraltar\nGL - Greenland\nGM - Gâmbia\nGN - Guiné\nGP - Guadelupe\nGQ - Guiné Equatorial\nGR - Grécia\nGS - Geórgia do Sul e Ilhas\nGT - Guatemala\nGU - Guam\nGW - Guiné-Bissau\nGY - Guiana\nHK - Hong Kong\nHM - Ilhas Heard and McDonald\nHN - Honduras\nHR - Croácia\nHT - Haiti\nHU - Hungria\nID - Indonésia\nIE - Irlanda\nIL - Israel\nIM - Ilha de Man\nIN - Índia\nIO - Território Britânico do Oceano Índico\nIQ - Iraque\nIR - Irã\nIS - Islândia\nIT - Itália\nJE - Jersey\nJM - Jamaica\nJO - Jordânia\nJP - Japão\nKE - Quênia\nKG - Quirguistão\nKH - Camboja\nKI - Kiribati\nKM - Cômoros\nKN - São Cristóvão e Nevis\nKP - Coreia do Norte\nKR - Coreia do Sul\nKW - Kuwait\nKY - Ilhas Caiman\nKZ - Cazaquistão\nLA - Laos\nLB - Líbano\nLC - Santa Lúcia\nLI - Liechtenstein\nLK - Sri Lanka\nLR - Libéria\nLS - Lesoto\nLT - Lituânia\nLU - Luxemburgo\nLV - Letônia\nLY - Líbia\nMA - Marrocos\nMC - Mônaco\nMD - Moldova\nME - Montenegro\nMF - Saint Martin\nMG - Madagascar\nMH - Ilhas Marshall\nMK - Macedônia\nML - Mali\nMM - Birmânia\nMN - Mongólia\nMO - Macao\nMP - Ilhas Marianas do Norte\nMQ - Martinica\nMR - Mauritânia\nMS - Montserrat\nMT - Malta\nmu – Ilhas Maurício\nMV - Maldivas\nMW - Malawi\nMX - México\nMY - Malásia\nMZ - Moçambique\nNA - Namíbia\nNC - Nova Caledônia\nNE - Níger\nNF - Ilha Norfolk\nNG - Nigéria\nNI - Nicarágua\nNL - Holanda\nNO - Noruega\nNP - Nepal\nNR - Nauru\nNU - Niue\nNZ - Nova Zelândia\nOM - Omã\nPA - Panamá\nPE - Peru\nPF - Polinésia Francesa\nPG - Papua Nova Guiné\nPH - Filipinas\nPK - Paquistão\nPL - Polônia\nPM - Saint Pierre e Miquelon\nPN - Ilhas Pitcairn\nPR - Porto Rico\nPS - Faixa de Gaza\nPS - Cisjordânia\nPT - Portugal\nPW - Palau\nPY - Paraguai\nQA - Qatar\nRE - Reunião\nRO - Romênia\nRS - Sérvia\nRU - Rússia\nRW - Ruanda\nSA - Arábia Saudita\nSB - Ilhas Salomão\nSC - Seicheles\nSD - Sudão\nSE - Suécia\nSG - Cingapura\nSH - Santa Helena, Ascensão e Tristão da Cunha\nSI - Eslovênia\nSJ - Svalbard\nSK - Eslováquia\nSL - Serra Leoa\nSM - San Marino\nSN - Senegal\nSO - Somália\nSR - Suriname\nSS - Sudão do Sul\nST - São Tomé e Príncipe\nSV - El Salvador\nSX - São Martinho\nSY - Síria\nSZ - Suazilândia\nTC - Ilhas Turks e Caicos\nTD - Chad\nTF - Sul da França e Antártica\nTG - Togo\nTH - Tailândia\nTJ - Tadjiquistão\nTK - Toquelau\nTL - Timor-Leste\nTM - Turcomenistão\nTN - Tunísia\nTO - Tonga\nTR - Turquia\nTT - Trinidad e Tobago\nTV - Tuvalu\nTW - Taiwan\nTZ - Tanzânia\nUA - Ucrânia\nUG - Uganda\nUM - Ilhas Menores Distantes dos Estados Unidos\nUS - Estados Unidos\nUY - Uruguai\nUZ - Uzbequistão\nVA - Santa Sé (Cidade do Vaticano)\nVC - São Vicente e Granadinas\nVE - Venezuela\nVG - Ilhas Virgens Britânicas\nVI - Ilhas Virgens Americanas\nVN - Vietnã\nVU - Vanuatu\nWF - Ilhas Wallis e Futuna\nWS - Samoa\nXK - Kosovo\nYE - Iêmen\nYT - Maiote\nZA - África do Sul\nZM - Zâmbia\nZW - Zimbábue"); // NOI18N

        jLabel4.setText("Pais:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(0, 55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ManutencaoPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManutencaoPiloto dialog = new ManutencaoPiloto(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
