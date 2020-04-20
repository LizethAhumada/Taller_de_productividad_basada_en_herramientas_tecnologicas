package PAIM;

import PAIM.frmPrincipal;
import PAIM.pdf;
import com.itextpdf.text.DocumentException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class reporte extends javax.swing.JFrame {

    private File ruta_destino;

    /**
     * Creates new form reporte
     */
    public reporte() {
         
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField44 = new javax.swing.JTextField();
        jColorChooser1 = new javax.swing.JColorChooser();
        canvas1 = new java.awt.Canvas();
        jLabel59 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        reportepanel = new javax.swing.JPanel();
        BotonImprimir = new javax.swing.JButton();
        cuadroproyecto = new javax.swing.JPanel();
        contrato0 = new javax.swing.JLabel();
        txtcontrato = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtproyect = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Semaforo = new javax.swing.JTextField();
        calc = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        M1 = new javax.swing.JTextField();
        M2 = new javax.swing.JTextField();
        M3 = new javax.swing.JTextField();
        M4 = new javax.swing.JTextField();
        M8 = new javax.swing.JTextField();
        M7 = new javax.swing.JTextField();
        M6 = new javax.swing.JTextField();
        M5 = new javax.swing.JTextField();
        M9 = new javax.swing.JTextField();
        M10 = new javax.swing.JTextField();
        M11 = new javax.swing.JTextField();
        M12 = new javax.swing.JTextField();
        M16 = new javax.swing.JTextField();
        M15 = new javax.swing.JTextField();
        M14 = new javax.swing.JTextField();
        M13 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        fechaflu = new javax.swing.JTextField();
        CompaniFlu = new javax.swing.JTextField();
        RepoFlui = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        Mues = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtipoProduct = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PressOp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PressMaxOp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TempOpe = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtsubsi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtregion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtplanta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtinst = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUDC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRed = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUbiTec = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtNoSAP = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreatxtDescrip = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        MetoRIE = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        RepoRIE = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        FechRIE = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Cons = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        NivRI = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Prob = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ProxInspec = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        RepoINTE = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        FechaINTEg = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        POMPOIN = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtVUE = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        FPME = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtUbica = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        FechaRep = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        RepoREP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaTipo = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        UltimaInspe = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TecnInspec = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        ReportUI = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtCompañia = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtMaterial = new javax.swing.JTextField();
        textEsfucendencia = new javax.swing.JTextField();
        txtcodiseño = new javax.swing.JTextField();
        txtPresdiseño = new javax.swing.JTextField();
        txtempdiseño = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAnioConst = new javax.swing.JTextField();

        jTextField44.setText("jTextField44");

        jLabel59.setText("CONSECUENCIA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 69, 83));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 69, 83));

        BotonImprimir.setText("PDF");
        BotonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonImprimirActionPerformed(evt);
            }
        });

        cuadroproyecto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Proyecto"));

        contrato0.setText("No.Contrato:");

        txtcontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontratoActionPerformed(evt);
            }
        });

        jLabel32.setText("Titulo del proyecto:");

        txtproyect.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        javax.swing.GroupLayout cuadroproyectoLayout = new javax.swing.GroupLayout(cuadroproyecto);
        cuadroproyecto.setLayout(cuadroproyectoLayout);
        cuadroproyectoLayout.setHorizontalGroup(
            cuadroproyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuadroproyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cuadroproyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuadroproyectoLayout.createSequentialGroup()
                        .addComponent(contrato0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcontrato))
                    .addGroup(cuadroproyectoLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtproyect, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cuadroproyectoLayout.setVerticalGroup(
            cuadroproyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuadroproyectoLayout.createSequentialGroup()
                .addGroup(cuadroproyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrato0)
                    .addComponent(txtcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cuadroproyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtproyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAIM/logpemex.png"))); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))), "MATRIZ DE RIESGO"));

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel31.setText("Nivel de riesgo:");

        Semaforo.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Semaforo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Semaforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemaforoActionPerformed(evt);
            }
        });

        calc.setText("Calc.");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M1.setBackground(new java.awt.Color(255, 204, 51));
        M1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M2.setBackground(new java.awt.Color(255, 204, 51));
        M2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M3.setBackground(new java.awt.Color(255, 0, 0));
        M3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M4.setBackground(new java.awt.Color(255, 0, 0));
        M4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M8.setBackground(new java.awt.Color(255, 0, 0));
        M8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M7.setBackground(new java.awt.Color(255, 204, 51));
        M7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M6.setBackground(new java.awt.Color(255, 204, 52));
        M6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M5.setBackground(new java.awt.Color(51, 255, 0));
        M5.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        M5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M9.setBackground(new java.awt.Color(51, 255, 0));
        M9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M10.setBackground(new java.awt.Color(255, 204, 51));
        M10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M11.setBackground(new java.awt.Color(255, 204, 51));
        M11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M12.setBackground(new java.awt.Color(255, 204, 51));
        M12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M16.setBackground(new java.awt.Color(255, 204, 51));
        M16.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M15.setBackground(new java.awt.Color(51, 255, 0));
        M15.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M14.setBackground(new java.awt.Color(51, 255, 0));
        M14.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        M13.setBackground(new java.awt.Color(51, 255, 0));
        M13.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        M13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        M13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAIM/letra.png"))); // NOI18N

        jLabel60.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel60.setText("CONSECUENCIA");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Semaforo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calc))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Semaforo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "MONITOREO DE FLUIDO"));

        jLabel47.setText("No. de Ultimo Reporte");

        jLabel49.setText("Compañia:");

        jLabel57.setText("Fecha de Reporte");

        fechaflu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechafluActionPerformed(evt);
            }
        });

        jLabel53.setText("Punto de Toma de Muestra:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel54))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel50))
            .addComponent(jLabel49)
            .addComponent(jLabel47)
            .addComponent(jLabel57)
            .addComponent(jLabel53)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(CompaniFlu, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fechaflu, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Mues, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(RepoFlui, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RepoFlui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompaniFlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaflu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel54))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DE OPERACION"));

        jLabel9.setText("Tipo producto: ");

        txtipoProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtipoProductActionPerformed(evt);
            }
        });

        jLabel10.setText("Presion de Operacion(kg/cm2):");

        PressOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PressOpActionPerformed(evt);
            }
        });

        jLabel11.setText("Presion Max. de Operacion(kg/cm2):");

        PressMaxOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PressMaxOpActionPerformed(evt);
            }
        });

        jLabel13.setText("Temperatura de Operacion(ºC):");

        TempOpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempOpeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtipoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PressOp, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PressMaxOp))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TempOpe)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtipoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(PressOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(PressMaxOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TempOpe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS GENERALES"));

        jLabel1.setText("Subsidiaria");

        jLabel2.setText("Region:");

        txtregion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregionActionPerformed(evt);
            }
        });

        jLabel3.setText("Planta:");

        txtplanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplantaActionPerformed(evt);
            }
        });

        jLabel4.setText("Instalacion:");

        jLabel5.setText("UDC:");

        txtUDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUDCActionPerformed(evt);
            }
        });

        jLabel6.setText("Red o equipo:");

        txtRed.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedActionPerformed(evt);
            }
        });

        jLabel7.setText("Descripcion:");

        txtUbiTec.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtUbiTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbiTecActionPerformed(evt);
            }
        });

        jLabel8.setText("Ubicacion Tecnica:");

        jLabel34.setText("No.SAP");

        AreatxtDescrip.setColumns(20);
        AreatxtDescrip.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        AreatxtDescrip.setRows(5);
        jScrollPane2.setViewportView(AreatxtDescrip);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtinst, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUDC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsubsi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtregion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtplanta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRed))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUbiTec, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoSAP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtsubsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtinst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtUDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUbiTec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txtNoSAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DE RIESGO"));

        jLabel14.setText("Metodologia de Riesgo:");

        MetoRIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetoRIEActionPerformed(evt);
            }
        });

        jLabel15.setText("No.Reporte:");

        jLabel16.setText("Fecha:");

        FechRIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechRIEActionPerformed(evt);
            }
        });

        jLabel17.setText("Consecuencia:");

        jLabel18.setText("Nivel de Riesgo:");

        NivRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NivRIActionPerformed(evt);
            }
        });

        jLabel33.setText("Probabilidad:");

        jLabel21.setText("Prox. Inspeccion:");

        ProxInspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProxInspecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(2, 2, 2)
                        .addComponent(NivRI, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProxInspec))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel33))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RepoRIE, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechRIE, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(Prob, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cons))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MetoRIE)))
                .addGap(2, 2, 2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(MetoRIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(RepoRIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(FechRIE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(Prob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(Cons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NivRI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(ProxInspec))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "INTEGRIDAD"));

        jLabel26.setText("No.Reporte:");

        jLabel27.setText("Fecha: ");

        FechaINTEg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaINTEgActionPerformed(evt);
            }
        });

        jLabel28.setText("PMPO(Kg/cm2):");

        jLabel29.setText("VUE(años):");

        jLabel30.setText("FPME:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RepoINTE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(POMPOIN, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FPME))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaINTEg)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(RepoINTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(FechaINTEg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txtVUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(POMPOIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FPME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DE REPARACION"));

        jLabel42.setText("Ubicacion:");

        txtUbica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicaActionPerformed(evt);
            }
        });

        jLabel43.setText("Tipo:");

        jLabel45.setText("Fecha:");

        jLabel46.setText("No.Reporte:");

        TxtAreaTipo.setColumns(20);
        TxtAreaTipo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        TxtAreaTipo.setRows(5);
        jScrollPane1.setViewportView(TxtAreaTipo);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(14, 14, 14)
                        .addComponent(txtUbica, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaRep))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(411, 411, 411)
                                .addComponent(jLabel44)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RepoREP)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUbica, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45)
                        .addComponent(FechaRep, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(RepoREP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel41))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel44))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ULTIMA INSPECCION"));

        UltimaInspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimaInspeActionPerformed(evt);
            }
        });

        jLabel23.setText("Tecnicas de inspeccion:");

        jLabel24.setText("No.Reporte:");

        jLabel40.setText("Fecha: ");

        jLabel22.setText("Compañia:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReportUI))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TecnInspec))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UltimaInspe, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCompañia)))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(UltimaInspe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(TecnInspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(ReportUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25))
        );

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAIM/pro.png"))); // NOI18N

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DE DISEÑO"));

        jLabel35.setText("Material:");

        jLabel36.setText("Codigo de diseño:");

        jLabel37.setText("Presion de diseño(kg/cm2):");

        jLabel38.setText("Temperatura de diseño(ºC):");

        jLabel39.setText("Esfuerzo de cedencia (PSI):");

        txtMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaterialActionPerformed(evt);
            }
        });

        txtcodiseño.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtcodiseño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodiseñoActionPerformed(evt);
            }
        });

        jLabel12.setText("Año Construccion");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtempdiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnioConst))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPresdiseño))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textEsfucendencia)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(textEsfucendencia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtcodiseño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(txtPresdiseño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtempdiseño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtAnioConst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout reportepanelLayout = new javax.swing.GroupLayout(reportepanel);
        reportepanel.setLayout(reportepanelLayout);
        reportepanelLayout.setHorizontalGroup(
            reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportepanelLayout.createSequentialGroup()
                        .addGroup(reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reportepanelLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(BotonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(reportepanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel52)
                        .addGap(30, 30, 30)
                        .addComponent(cuadroproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel48)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        reportepanelLayout.setVerticalGroup(
            reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportepanelLayout.createSequentialGroup()
                .addGroup(reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportepanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel52))
                    .addGroup(reportepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cuadroproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel48)
                        .addGap(9, 9, 9)))
                .addGroup(reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportepanelLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(reportepanelLayout.createSequentialGroup()
                        .addGroup(reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reportepanelLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(reportepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BotonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))
                            .addGroup(reportepanelLayout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1046, 1046, 1046)
                .addComponent(jLabel51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(reportepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtipoProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtipoProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtipoProductActionPerformed

    private void PressOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PressOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PressOpActionPerformed

    private void PressMaxOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PressMaxOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PressMaxOpActionPerformed

    private void TempOpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempOpeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TempOpeActionPerformed

    private void MetoRIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetoRIEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MetoRIEActionPerformed

    private void FechRIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechRIEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechRIEActionPerformed

    private void NivRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NivRIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NivRIActionPerformed

    private void FechaINTEgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaINTEgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaINTEgActionPerformed

    private void UltimaInspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimaInspeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UltimaInspeActionPerformed

    private void txtcontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontratoActionPerformed

    private void txtUbicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicaActionPerformed

    private void fechafluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechafluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechafluActionPerformed

    private void txtplantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplantaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtplantaActionPerformed

    private void txtUDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUDCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUDCActionPerformed

    private void txtRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedActionPerformed

    private void txtUbiTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbiTecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbiTecActionPerformed

    private void BotonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonImprimirActionPerformed
   
  //Parte para guardar la imagen del reporte 
  try{
          SaveScreemShot(reportepanel,"Reporte.png");       
  }  
   catch(Exception e) {
   }
    
       // Parte para boton pdf
       
      pdf pdf=new pdf();  
      // pdf.crear_PDF
      
        try {
            // Ingresamos la imagen
            pdf.crear_PDF("reporte.pdf"); 
            
        } catch (IOException ex) { 
            Logger.getLogger(reporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
     
    }//GEN-LAST:event_BotonImprimirActionPerformed

    private void txtcodiseñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodiseñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodiseñoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        // frmPrincipal b = new frmPrincipal();  // muestra la pantalla principal sin cerrar el reporte 
       // b.show();
        //(INACTIVO PORQUE SE NECESITA QUE SE CIERRE EL REPORTE
        
        
         dispose(); // muestra la pantalla principal cerrando el reporte 
         
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ProxInspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProxInspecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProxInspecActionPerformed

    private void txtregionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtregionActionPerformed

    private void txtMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaterialActionPerformed

    private void SemaforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemaforoActionPerformed
       
     
                
    }//GEN-LAST:event_SemaforoActionPerformed

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        
// Boton para darle color a la matriz de riesgo 

// y que se ponga la x en cada uno de los cuadros 

    if(reporte.Cons.getText().equals("MENOR")&& reporte.Prob.getText().equals("DESPRECIABLE")){
            M13.setText("X");
            Semaforo.setBackground(Color.GREEN);
            Semaforo.setText("BAJO");
        }
        
       if(reporte.Cons.getText().equals("MENOR")&& reporte.Prob.getText().equals("BAJO")){
            M9.setText("X");
            Semaforo.setBackground(Color.GREEN);
            Semaforo.setText("BAJO");
        }
       
       
       if(reporte.Cons.getText().equals("MENOR")&& reporte.Prob.getText().equals("MEDIO")){
            
            M5.setText("X");
            Semaforo.setBackground(Color.GREEN);
            Semaforo.setText("BAJO");
        }
       
       if(reporte.Cons.getText().equals("MENOR")&& reporte.Prob.getText().equals("ALTO")){
            
            M1.setText("X");
            Semaforo.setBackground(Color.orange);
            Semaforo.setText("MEDIO");
        }
        
       if(reporte.Cons.getText().equals("MODERADO")&& reporte.Prob.getText().equals("DESPRECIABLE")){
            
            M14.setText("X");
            Semaforo.setBackground(Color.GREEN);
            Semaforo.setText("BAJO");
        }
       
       if(reporte.Cons.getText().equals("MODERADO")&& reporte.Prob.getText().equals("BAJO")){
            
            M10.setText("X");
            Semaforo.setBackground(Color.orange);
            Semaforo.setText("MEDIO");
        }
        if(reporte.Cons.getText().equals("MODERADO")&& reporte.Prob.getText().equals("MEDIO")){
            
            M6.setText("X");
            Semaforo.setBackground(Color.orange);
            Semaforo.setText("MEDIO");
        }
        if(reporte.Cons.getText().equals("MODERADO")&& reporte.Prob.getText().equals("ALTO")){
            
            M2.setText("X");
            Semaforo.setBackground(Color.orange);
            Semaforo.setText("MEDIO");
        }
        
        if(reporte.Cons.getText().equals("GRAVE")&& reporte.Prob.getText().equals("DESPRECIABLE")){
            
            M15.setText("X");
            Semaforo.setBackground(Color.GREEN);
            Semaforo.setText("BAJO");
        }
        
        if(reporte.Cons.getText().equals("GRAVE")&& reporte.Prob.getText().equals("BAJO")){
            
            M11.setText("X");
            Semaforo.setBackground(Color.orange);
            Semaforo.setText("MEDIO");
        }
        
        if(reporte.Cons.getText().equals("GRAVE")&& reporte.Prob.getText().equals("MEDIO")){
            
            M7.setText("X");
            Semaforo.setBackground(Color.orange);
            Semaforo.setText("MEDIO");
        }
        
        if(reporte.Cons.getText().equals("GRAVE")&& reporte.Prob.getText().equals("ALTO")){
           
            M3.setText("X");
            Semaforo.setBackground(Color.RED);
            Semaforo.setText("ALTO");
        }
        
        if(reporte.Cons.getText().equals("CATASTROFICA")&& reporte.Prob.getText().equals("DESPRECIABLE")){
            
            M16.setText("X");
            Semaforo.setBackground(Color.orange);
            Semaforo.setText("MEDIO");
        }
        
        if(reporte.Cons.getText().equals("CATASTROFICA")&& reporte.Prob.getText().equals("BAJO")){
            
            M12.setText("X");
            Semaforo.setBackground(Color.orange);
            Semaforo.setText("MEDIO");
        }
        
        if(reporte.Cons.getText().equals("CATASTROFICA")&& reporte.Prob.getText().equals("MEDIO")){
            
            M8.setText("X");
            Semaforo.setBackground(Color.RED);
            Semaforo.setText("ALTO");
        }
       
        if(reporte.Cons.getText().equals("CATASTROFICA")&& reporte.Prob.getText().equals("ALTO")){
            
            M4.setText("X");
            Semaforo.setBackground(Color.RED);
            Semaforo.setText("ALTO");
        }
        
        
        
       /* if(reporte.NivRI.getText().equals("BAJO")){
            Semaforo.setBackground(Color.GREEN);
            Semaforo.setText("BAJO");
        }
        if(reporte.NivRI.getText().equals("MEDIO")){
            Semaforo.setBackground(Color.YELLOW);
            Semaforo.setText("MEDIO");
        }
        if(reporte.NivRI.getText().equals("ALTO")){
            Semaforo.setBackground(Color.red);
            Semaforo.setText("ALTO");
        } */
        
    }//GEN-LAST:event_calcActionPerformed

    private void M13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M13ActionPerformed
      
  
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
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reporte().setVisible(true);
            }
        });

    }
    
    //METODO PARA TOMAR LA CAPTURA DE PANTALLA DEL JFRAME "REPORTE" 
     public static BufferedImage getScreemShot(Component component){
        
   BufferedImage image = new BufferedImage(component.getWidth(),component.getHeight(), BufferedImage.TYPE_INT_RGB);
         component.paint(image.getGraphics());
         return image;
         
    }
    
     //METODO PARA GUARDAR LA CAPTURA DE PANTALLA DEL JFRAME "REPORTE"
     public static void SaveScreemShot(Component component,String filename) throws Exception{
     
         BufferedImage img = getScreemShot(component); 
            ImageIO.write(img,"png",new File (filename));
         
     }
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea AreatxtDescrip;
    private javax.swing.JButton BotonImprimir;
    public static javax.swing.JTextField CompaniFlu;
    public static javax.swing.JTextField Cons;
    public static javax.swing.JTextField FPME;
    public static javax.swing.JTextField FechRIE;
    public static javax.swing.JTextField FechaINTEg;
    public static javax.swing.JTextField FechaRep;
    private javax.swing.JTextField M1;
    private javax.swing.JTextField M10;
    private javax.swing.JTextField M11;
    private javax.swing.JTextField M12;
    private javax.swing.JTextField M13;
    private javax.swing.JTextField M14;
    private javax.swing.JTextField M15;
    private javax.swing.JTextField M16;
    private javax.swing.JTextField M2;
    private javax.swing.JTextField M3;
    private javax.swing.JTextField M4;
    private javax.swing.JTextField M5;
    private javax.swing.JTextField M6;
    private javax.swing.JTextField M7;
    private javax.swing.JTextField M8;
    private javax.swing.JTextField M9;
    public static javax.swing.JTextField MetoRIE;
    public static javax.swing.JTextField Mues;
    public static javax.swing.JTextField NivRI;
    public static javax.swing.JTextField POMPOIN;
    public static javax.swing.JTextField PressMaxOp;
    public static javax.swing.JTextField PressOp;
    public static javax.swing.JTextField Prob;
    public static javax.swing.JTextField ProxInspec;
    public static javax.swing.JTextField RepoFlui;
    public static javax.swing.JTextField RepoINTE;
    public static javax.swing.JTextField RepoREP;
    public static javax.swing.JTextField RepoRIE;
    public static javax.swing.JTextField ReportUI;
    private javax.swing.JTextField Semaforo;
    public static javax.swing.JTextField TecnInspec;
    public static javax.swing.JTextField TempOpe;
    public static javax.swing.JTextArea TxtAreaTipo;
    public static javax.swing.JTextField UltimaInspe;
    private javax.swing.JButton calc;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel contrato0;
    public static javax.swing.JPanel cuadroproyecto;
    public static javax.swing.JTextField fechaflu;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JPanel jPanel7;
    public static javax.swing.JPanel jPanel8;
    public static javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JPanel reportepanel;
    public static javax.swing.JTextField textEsfucendencia;
    public static javax.swing.JTextField txtAnioConst;
    public static javax.swing.JTextField txtCompañia;
    public static javax.swing.JTextField txtMaterial;
    public static javax.swing.JTextField txtNoSAP;
    public static javax.swing.JTextField txtPresdiseño;
    public static javax.swing.JTextField txtRed;
    public static javax.swing.JTextField txtUDC;
    public static javax.swing.JTextField txtUbiTec;
    public static javax.swing.JTextField txtUbica;
    public static javax.swing.JTextField txtVUE;
    public static javax.swing.JTextField txtcodiseño;
    public static javax.swing.JTextField txtcontrato;
    public static javax.swing.JTextField txtempdiseño;
    public static javax.swing.JTextField txtinst;
    public static javax.swing.JTextField txtipoProduct;
    public static javax.swing.JTextField txtplanta;
    public static javax.swing.JTextField txtproyect;
    public static javax.swing.JTextField txtregion;
    public static javax.swing.JTextField txtsubsi;
    // End of variables declaration//GEN-END:variables

}
