
package PAIM;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;                //Para exportar e importar
import java.io.File;         //Para exportar e importar
import java.io.IOException;              //Para exportar e importar
import java.util.ArrayList;    //Para exportar e importar
import java.util.List;     //Para exportar e importar
import java.util.Vector;          //Para exportar e importar
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class frmPrincipal extends javax.swing.JFrame {

    private static DefaultTableModel modelo;
    private TableRowSorter trsFiltro;
   

//para exportar
    private JFileChooser FileChooser = new JFileChooser();
    private Vector columna = new Vector();
    private Vector filas = new Vector();
    private static int tabla_ancho = 0;
    private static int tabla_alto = 0;

    
    public frmPrincipal() {
        initComponents();
        
        //Agrega columnas
        // columnas de las tablas
        
        modelo = new DefaultTableModel();
        // Datos Generales
        modelo.addColumn("No.contrato"); //0
        modelo.addColumn("Proyecto"); //1
        modelo.addColumn("Subsidiaria"); //2
        modelo.addColumn("Region");  //3
        modelo.addColumn("Planta"); //4
        modelo.addColumn("Instalacion");  //5
        modelo.addColumn("UDC"); //6
        modelo.addColumn("Red");  //7
        modelo.addColumn("No.SAP"); // 8
        modelo.addColumn("Ubicacion Tecnica"); //9
        modelo.addColumn("Descripcion"); //10
        

        //Datos  de diseño
        modelo.addColumn("Año construccion");  //11
        modelo.addColumn("Especificacion Material");  //12
        modelo.addColumn("Esfuerzo de cadencia"); //13
        modelo.addColumn("Codigo de diseño");  //14
        modelo.addColumn("Presion de diseño"); // 15
        modelo.addColumn("Temperatura de diseño"); //16
        
        //Datos de operacion
        modelo.addColumn("Presion de operacion"); //17
        modelo.addColumn("Presion max. de ope."); //18
        modelo.addColumn("Temperatura de operacion");  //19
        modelo.addColumn("Tipo de producto"); //20
        
        //Datos de ultima inspeccion
        modelo.addColumn("Fecha ultima inspec.");  //21
        modelo.addColumn("Compañia(UI)"); //22
        modelo.addColumn("Tecnicas de inspeccion"); //23
        modelo.addColumn("No.reporte (UI)"); //24
        
        //Datos de Integridad
        modelo.addColumn("No.reporte (INTE)"); //25
        modelo.addColumn("Fecha(Inte)"); //26
        modelo.addColumn("PMPO"); //27
        modelo.addColumn("VUE"); //28
        modelo.addColumn("FPME"); //29
        
        //Datos de Reparacion
        modelo.addColumn("Ubicacion"); //30
        modelo.addColumn("Tipo(REP)"); //31
        modelo.addColumn("Fecha(REP)");  //32
        modelo.addColumn("No.Reporte(REP)"); //33
        
        //Datos de Riesgo
        modelo.addColumn("Metodologia Riesgo"); //34
        modelo.addColumn("No.reporte(RIE)");//35
        modelo.addColumn("Fecha(RIE)"); //36
        modelo.addColumn("Probabilidad(RIE)"); //37
        modelo.addColumn("Consecuencia");//38
        modelo.addColumn("Nivel de riesgo"); //39
        modelo.addColumn("Prox Inspeccion");//40
         
        //Datos de Monitore de Fluido
        modelo.addColumn("No.Reporte Fluido"); //41
        modelo.addColumn("Compañia Fluido");  //42
        modelo.addColumn("Fecha de Reporte");  //43
        modelo.addColumn("Punto de toma de muestra"); //44
      
        this.tablaListado.setModel(modelo);
  
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContra = new javax.swing.JTextField();
        txtpro = new javax.swing.JTextField();
        txtsub = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtreg = new javax.swing.JTextField();
        txtplan = new javax.swing.JTextField();
        txtinstalacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUDC = new javax.swing.JTextField();
        txtRed = new javax.swing.JTextField();
        txtSap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        comboFiltro = new javax.swing.JComboBox();
        btnExportarTabla = new javax.swing.JButton();
        btnImportarTabla = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListado = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setText("Integrity Management System ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingresar Datos"));

        jLabel2.setText("No.Contrato:");

        jLabel3.setText("Proyecto:");

        jLabel4.setText("Subsidiaria: ");

        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });

        txtsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel8.setText("Region:");

        jLabel9.setText("Planta:");

        jLabel10.setText("Inst.:");

        txtinstalacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinstalacionActionPerformed(evt);
            }
        });

        jLabel11.setText("UDC:");

        jLabel12.setText("Red:");

        jLabel13.setText("No.SAP:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtContra, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(txtpro)
                    .addComponent(txtsub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtreg, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(txtinstalacion)
                    .addComponent(txtplan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSap, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(txtUDC, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRed, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(jLabel8)
                    .addComponent(txtreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtUDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtplan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtinstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtSap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Buscar Por:");

        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No.Contrato", "Planta", "Instalacion", "UDC", "Red", "Reporte(UI)", "Reporte(INTE)", "Fecha(INTE)", "PMPO", "VUE", "FPME", "Ubicacion", "Tipo(REP)", "Fecha(REP)", "Prox. Inspeccion", "Nivel de riesgo" }));
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        btnExportarTabla.setText("Exportar Excel");
        btnExportarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarTablaActionPerformed(evt);
            }
        });

        btnImportarTabla.setText("Importar Excel");
        btnImportarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarTablaActionPerformed(evt);
            }
        });

        jButton1.setText("Generar Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListado);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAIM/pro.png"))); // NOI18N

        Borrar.setText("Borrar Fila");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnExportarTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImportarTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 526, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExportarTabla)
                    .addComponent(btnImportarTabla)
                    .addComponent(jLabel6)
                    .addComponent(Borrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed
    
    
 

//Este metodo es opcionar por si tengo problemas que al ingresar datos
    //No le aparesca el scroll bar de la tabla
    
    private void configuroTabla() {
        
        tablaListado.getAutoResizeMode();
        tablaListado.tableChanged(null);
        tablaListado.setEnabled(true);
        tablaListado.setRowHeight(25);
        tablaListado.setRowMargin(4);
        tabla_ancho = modelo.getColumnCount() * 150; // modificando
        tabla_alto = modelo.getRowCount() * 25; // modificando
        tablaListado.setPreferredSize(new Dimension(tabla_ancho, tabla_alto));
        //tablaListado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //tablaListado.doLayout();
        
    }
    
   

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        //guardar la informacion en un nuevo archivo 
        //campos para guardar la informacion
        
//construccion
        
        String datos[] = new String[9];
        datos[0] = txtContra.getText(); // cuadros para ingresar los nuevos campos 
        datos[1] = txtpro.getText();
        datos[2] = txtsub.getText();
        datos[3] = txtreg.getText();
        datos[4]= txtplan.getText();
        datos [5] = txtinstalacion.getText(); 
        datos[6] = txtUDC.getText();
        datos[7] = txtRed.getText();
        datos[8] = txtSap.getText();
        
        modelo.addRow(datos);
        txtContra.setText("");
        txtpro.setText("");
        txtsub.setText("");
        txtreg.setText("");
        txtplan.setText("");
        txtinstalacion.setText("");
        txtUDC.setText("");
        txtRed.setText("");
        txtSap.setText("");
        
        txtContra.requestFocus();
        
      /*  txtpro.requestFocus();
        txtsub.requestFocus();
        txtreg.requestFocus();
        txtplan.requestFocus();
        txtinstalacion.requestFocus();     // para pasar los valores a la tabla lo dejo inactivo por el momento
        txtUDC.requestFocus();                      no es de utilidad
        txtRed.requestFocus();
        txtSap.requestFocus(); */
        
        //este es opcional
        //configuroTabla();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:¿
    }//GEN-LAST:event_txtContraActionPerformed

    public void filtro() { // Buscador 
        
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "No.contrato") {
            columnaABuscar = 0;
        }
        
        if (comboFiltro.getSelectedItem() == "Planta") {
            columnaABuscar = 4;
        }
        if (comboFiltro.getSelectedItem() == "Instalacion") {
            columnaABuscar = 5;
        }
        if (comboFiltro.getSelectedItem() == "UDC") {
            columnaABuscar = 6;
        }
        if (comboFiltro.getSelectedItem() == "Red") {
            columnaABuscar = 7;
        }
        
        if (comboFiltro.getSelectedItem() == "No.reporte(UI)") {
            columnaABuscar = 24;
        }
        if (comboFiltro.getSelectedItem() == "No.reporte(INTE)") {
            columnaABuscar = 25;
        }
        
        if (comboFiltro.getSelectedItem() == "Fecha(INTE)") {
            columnaABuscar = 26;
        }
        if (comboFiltro.getSelectedItem() == "PMPO") {
            columnaABuscar = 27;
        }
        if (comboFiltro.getSelectedItem() == "VUE") {
            columnaABuscar = 28;
        }
        if (comboFiltro.getSelectedItem() == "FPME") {
            columnaABuscar = 29;
        }
        if (comboFiltro.getSelectedItem() == "Ubicacion") {
            columnaABuscar = 30;
        }
        if (comboFiltro.getSelectedItem() == "Tipo(REP)") {
            columnaABuscar = 31;
        }
        if (comboFiltro.getSelectedItem() == "Fecha(REP)") {
            columnaABuscar = 32;
        }
       
        if (comboFiltro.getSelectedItem() == "Fecha(RIE)") {
            columnaABuscar = 35;
        }
       
        if (comboFiltro.getSelectedItem() == "Prox. Inspeccion") {
            columnaABuscar = 40;
        }
        
     if (comboFiltro.getSelectedItem() == "Nivel de riesgo") {
            columnaABuscar = 39;
        }
        
        //Con este código le indicamos que que busque en la columna que elijamos gracias al JComboBox.
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
    }

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
       
        txtFiltro.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablaListado.getModel());
        tablaListado.setRowSorter(trsFiltro);

    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnExportarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarTablaActionPerformed
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(frmPrincipal.this);

        if (opcion == JFileChooser.APPROVE_OPTION) {

            File dir = dialog.getSelectedFile();

            try {
                List<JTable> tb = new ArrayList<JTable>();
                tb.add(tablaListado);
                //-------------------
                export_excel excelExporter = new export_excel(tb, new File(dir.getAbsolutePath() + ".xls"));
                if (excelExporter.export()) {
                    JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnExportarTablaActionPerformed

    public void CrearTabla(File file) throws IOException {

        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(file);

            Sheet sheet = workbook.getSheet(0);
            columna.clear();

            for (int i = 0; i < sheet.getColumns(); i++) {
                Cell cell1 = sheet.getCell(i, 0);
                columna.add(cell1.getContents());
            }
            filas.clear();

            for (int j = 1; j < sheet.getRows(); j++) {

                Vector d = new Vector();

                for (int i = 0; i < sheet.getColumns(); i++) {

                    Cell cell = sheet.getCell(i, j);
                    d.add(cell.getContents());
                }
                d.add("\n");
                //filas.add(d);
                modelo.addRow(d);
            }

        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    private void btnImportarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarTablaActionPerformed
        
        FileChooser.showDialog(null, "Importar Hoja ");
        File file = FileChooser.getSelectedFile();
        if (!file.getName().endsWith("xls")) {

            JOptionPane.showMessageDialog(null, "Seleccione un archivo excel...", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                CrearTabla(file);
            } catch (IOException ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImportarTablaActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        reporte v = new reporte();  //Boton de Generar Reporte
        v.show();
      
      
        //pasar los parametros al "REPORTE"
    
        int filaseleccionada;

     try{
     
         filaseleccionada= tablaListado.getSelectedRow();
         
         if (filaseleccionada==-1){
         
             JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");

         }else{

             DefaultTableModel modelotabla=(DefaultTableModel) tablaListado.getModel();
           
             // Primera fila 
             String Contrato=(String)modelotabla.getValueAt(filaseleccionada, 0);  // numero 0 es la Columna en la que esta la informacion 
             String proyecto=(String) modelotabla.getValueAt(filaseleccionada, 1);  // proyecto es la variable en la que se guarda la informacion
             String subsidiaria=(String)modelotabla.getValueAt(filaseleccionada, 2);
             String Region=(String)modelotabla.getValueAt(filaseleccionada, 3);
             String Planta=(String)modelotabla.getValueAt(filaseleccionada, 4);
             String Instalacion=(String)modelotabla.getValueAt(filaseleccionada, 5);
             String UDC=(String)modelotabla.getValueAt(filaseleccionada, 6);
             String Red=(String)modelotabla.getValueAt(filaseleccionada, 7);
             String No_SAP=(String)modelotabla.getValueAt(filaseleccionada, 8);
             String UbiTecnica=(String)modelotabla.getValueAt(filaseleccionada, 9);
             String Descrip=(String)modelotabla.getValueAt(filaseleccionada, 10);
             
             String anioConst=(String)modelotabla.getValueAt(filaseleccionada, 11);
             String EspeMaterial=(String)modelotabla.getValueAt(filaseleccionada, 12);
             String Esfucaden=(String)modelotabla.getValueAt(filaseleccionada, 13);
             String Codiseño=(String)modelotabla.getValueAt(filaseleccionada, 14);
             String presdiseño=(String)modelotabla.getValueAt(filaseleccionada, 15);
             String tempdiseño=(String)modelotabla.getValueAt(filaseleccionada, 16);
             
             String pressOpe=(String)modelotabla.getValueAt(filaseleccionada, 17);
             String PressMaxOp=(String)modelotabla.getValueAt(filaseleccionada, 18);
             String TempOpe=(String)modelotabla.getValueAt(filaseleccionada, 19);
             String TipoProduc=(String)modelotabla.getValueAt(filaseleccionada, 20);
             
             
             String Fec_ult_inspec=(String)modelotabla.getValueAt(filaseleccionada, 21);
             String Compañia=(String)modelotabla.getValueAt(filaseleccionada, 22);
             String TecInspec=(String)modelotabla.getValueAt(filaseleccionada, 23);
             String No_RepUI=(String)modelotabla.getValueAt(filaseleccionada, 24);
             
             String No_RepINTE=(String)modelotabla.getValueAt(filaseleccionada, 25);
             String FechaINTE=(String)modelotabla.getValueAt(filaseleccionada,26);
             String PMPO=(String)modelotabla.getValueAt(filaseleccionada, 27);
             String VUE=(String)modelotabla.getValueAt(filaseleccionada, 28);
             String FPME=(String)modelotabla.getValueAt(filaseleccionada, 29);
             
             String Ubicacion=(String)modelotabla.getValueAt(filaseleccionada, 30);
             String TipoREP=(String)modelotabla.getValueAt(filaseleccionada, 31);
             String FechaREP=(String)modelotabla.getValueAt(filaseleccionada, 32);
             String No_REP=(String)modelotabla.getValueAt(filaseleccionada, 33);
             
             String MetoRies=(String)modelotabla.getValueAt(filaseleccionada, 34);
             String No_REP_RIE=(String)modelotabla.getValueAt(filaseleccionada, 35);
             String FechaRIE=(String)modelotabla.getValueAt(filaseleccionada, 36);
             String Proba=(String)modelotabla.getValueAt(filaseleccionada, 37);
             String Consec=(String)modelotabla.getValueAt(filaseleccionada, 38);
             String NiveRie=(String)modelotabla.getValueAt(filaseleccionada, 39);
             String ProxINS=(String)modelotabla.getValueAt(filaseleccionada, 40);
             
             String NoFlui=(String)modelotabla.getValueAt(filaseleccionada, 41);
             String CompFlui=(String)modelotabla.getValueAt(filaseleccionada, 42);
             String FechaFlui=(String)modelotabla.getValueAt(filaseleccionada, 43);
             String Muestra=(String)modelotabla.getValueAt(filaseleccionada, 44);
             
              
             
             // mandamos a llamar al reporte y el campo en donde se pondra
           
             //Datos generales
            reporte.txtcontrato.setText(Contrato);  
            reporte.txtproyect.setText(proyecto);
            reporte.txtsubsi.setText(subsidiaria);
            reporte.txtregion.setText(Region);
            reporte.txtplanta.setText(Planta);
            reporte.txtinst.setText(Instalacion);
            reporte.txtUbiTec.setText(UbiTecnica); 
            reporte.AreatxtDescrip.setText(Descrip);
            reporte.txtNoSAP.setText(No_SAP);
            reporte.txtRed.setText(Red);
            reporte.txtUDC.setText(UDC);
            
            //Datos de Diseño
            reporte.txtMaterial.setText(EspeMaterial);
            reporte.textEsfucendencia.setText(Esfucaden);
            reporte.txtcodiseño.setText(Codiseño);
            reporte.txtPresdiseño.setText(presdiseño);
            reporte.txtempdiseño.setText(tempdiseño);
            reporte.txtAnioConst.setText(anioConst);
            
            //Datos de Operacion
            reporte.txtipoProduct.setText(TipoProduc);
            reporte.PressOp.setText(pressOpe);
            reporte.PressMaxOp.setText(PressMaxOp);
            reporte.TempOpe.setText(TempOpe);
            
            //Datos de ultima inspeccion 
            reporte.UltimaInspe.setText(Fec_ult_inspec);
            reporte.txtCompañia.setText(Compañia);
            reporte.TecnInspec.setText(TecInspec);
            reporte.ReportUI.setText(No_RepUI);
            
            //Datos de integridad
            reporte.RepoINTE.setText(No_RepINTE);
            reporte.POMPOIN.setText(PMPO);
            reporte.txtVUE.setText(VUE);
            reporte.FechaINTEg.setText(FechaINTE);
            reporte.FPME.setText(FPME);
            
            //Datos de reparacion
            reporte.txtUbica.setText(Ubicacion);
            reporte.TxtAreaTipo.setText(TipoREP);
            reporte.FechaRep.setText(FechaREP);
            reporte.RepoREP.setText(No_REP);
            
            //Datos de Riesgo
            reporte.MetoRIE.setText(MetoRies);
            reporte.RepoRIE.setText(No_REP_RIE);
            reporte.FechRIE.setText(FechaRIE);
            reporte.Prob.setText(Proba);
            reporte.Cons.setText(Consec);
            reporte.NivRI.setText(NiveRie);
            reporte.ProxInspec.setText(ProxINS);
            
            //datos de fluido 
            reporte.RepoFlui.setText(NoFlui);
            reporte.CompaniFlu.setText(CompFlui);
            reporte.fechaflu.setText(FechaFlui);
            reporte.Mues.setText(Muestra);
            reporte.ProxInspec.setText(ProxINS);
          }

       }catch (HeadlessException ex){

             JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);

       }     
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void txtinstalacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinstalacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinstalacionActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
    // boton para eliminar las filas selecionadas 
    
    DefaultTableModel dtm = (DefaultTableModel) tablaListado.getModel(); 
 
        
          int a = tablaListado.getSelectedRow(); 
 
        
          if (a<0){ 
 
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla" ); 
 
         }else {

   int confirmar=JOptionPane.showConfirmDialog(null, "Esta seguro que desea Eliminar el registro? "); 
 
          
 if(JOptionPane.OK_OPTION==confirmar) {

                   dtm.removeRow(a); 
 
                  JOptionPane.showMessageDialog(null,"Registro Eliminado" );
 
            } 
 
        } 

    }//GEN-LAST:event_BorrarActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });


        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton btnExportarTabla;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImportarTabla;
    private javax.swing.JComboBox comboFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaListado;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtRed;
    private javax.swing.JTextField txtSap;
    private javax.swing.JTextField txtUDC;
    private javax.swing.JTextField txtinstalacion;
    private javax.swing.JTextField txtplan;
    private javax.swing.JTextField txtpro;
    private javax.swing.JTextField txtreg;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables
}
