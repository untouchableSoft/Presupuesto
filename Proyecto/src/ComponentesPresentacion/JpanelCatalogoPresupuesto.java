/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentesPresentacion;

import ComponenteClase.CatalogoPresupuesto;
import ComponenteDatos.BDCatalogoPresupuesto;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mega-Mic
 */
public class JpanelCatalogoPresupuesto extends javax.swing.JPanel {

    /**
     * Creates new form JpanelCatalogoPresupuesto
     */
    public JpanelCatalogoPresupuesto() {
        initComponents();
        MostrarCatalogoPresupuesto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        btNuevo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableCatalogo = new javax.swing.JTable();
        btActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel8.setBackground(new java.awt.Color(0, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Registrar Catálogo de Presupuesto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel27.setText("Código:");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 30, -1, -1));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(204, 204, 255));
        txtCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel8.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 25, 70, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel28.setText("Nombre:");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(204, 204, 255));
        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel8.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 55, 220, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.setBackground(new java.awt.Color(204, 204, 255));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane4.setViewportView(txtDescripcion);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 55, 280, 50));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Descripcion:");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        btNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/nuevo icono.png"))); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Editar.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Guardar.png"))); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.setEnabled(false);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        btBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Buscar.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jTableCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Descripción"
            }
        ));
        jTableCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCatalogoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableCatalogo);

        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/actualizar.png"))); // NOI18N
        btActualizar.setOpaque(false);
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar)
                    .addComponent(btNuevo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBuscar)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void borrar(){
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtNombre.setText("");
    }
    
    private void habilitartxt(boolean estado){
        txtDescripcion.setEditable(estado);
        txtNombre.setEditable(estado);
    }
    
    private String generarCodigo() throws SQLException{
        String cod="PRE-";
        String concat = cod.concat(String.valueOf(BDCatalogoPresupuesto.buscarMaxCatalogoPresupuesto()+1));
        return concat;
    }
    
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        borrar();
        try {
            txtCodigo.setText(generarCodigo());
        } catch (SQLException ex) {
            Logger.getLogger(JpanelCatalogoPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
        }
        habilitartxt(true);
        btGuardar.setEnabled(true);
        btNuevo.setEnabled(false);
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        borrar();
        habilitartxt(false);
        btNuevo.setEnabled(true);
        btGuardar.setEnabled(false);
        btEditar.setEnabled(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        CatalogoPresupuesto CP = new CatalogoPresupuesto() {};
        boolean existencia = true;
        try {
            existencia = BDCatalogoPresupuesto.buscarExistenciaCatalogoPresupuesto(txtCodigo.getText());
        } catch (SQLException ex) {
            Logger.getLogger(JpanelMantenimientoCicloContable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(txtDescripcion.isEditable()){
            if(txtCodigo.getText().isEmpty()==false & txtNombre.getText().isEmpty()==false){
                if(existencia==false){
                    CP.setCodCatalogoPresupuesto(txtCodigo.getText());
                    CP.setNomCatalogoPresupuesto(txtNombre.getText());
                    CP.setDescripcionCatalogoPresupuesto(txtDescripcion.getText());
                    try {
                        BDCatalogoPresupuesto.insertarCatalogoPresupuesto(CP);
                        borrar();
                        habilitartxt(false);
                        btGuardar.setEnabled(false);
                        btNuevo.setEnabled(true);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "Error BD: " + e.getMessage());
                    }
                    JOptionPane.showMessageDialog(this, "Se Agregó Correctamente!!");
                }else{
                    JOptionPane.showMessageDialog(this, "Este Periodo Contable existe.");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Campos Vacios.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Presione el boton nuevo.");
        }            
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        habilitartxt(false);
        borrar();
        MostrarCatalogoPresupuesto();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        habilitartxt(false);
        borrar();
        MostrarCatalogoPresupuesto();
    }//GEN-LAST:event_btActualizarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            MostrarCatalogoPresupuesto(); 
            habilitartxt(false);
            borrar();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jTableCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCatalogoMouseClicked
        habilitartxt(true);
        btEditar.setEnabled(true);
        int fila=jTableCatalogo.getSelectedRow();
        txtCodigo.setText(jTableCatalogo.getValueAt(fila, 0).toString());
        txtNombre.setText(jTableCatalogo.getValueAt(fila, 1).toString());
        txtDescripcion.setText(jTableCatalogo.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_jTableCatalogoMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int fila=jTableCatalogo.getSelectedRow();
        CatalogoPresupuesto CP;   
        if(jTableCatalogo.getSelectedRow()>=0){
            try {
                CP= BDCatalogoPresupuesto.buscarCatalogoPresupuesto(txtCodigo.getText());
                CP.setNomCatalogoPresupuesto(txtNombre.getText());
                CP.setDescripcionCatalogoPresupuesto(txtDescripcion.getText());

                BDCatalogoPresupuesto.actualizarCatalogoPresupuesto(CP);
                JOptionPane.showMessageDialog(this, " [ Datos Actualizados ]");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            borrar();
            btEditar.setEnabled(false);
        } else{
            JOptionPane.showMessageDialog(this, "Seleccione el dato que desea editar ");
        } 
    }//GEN-LAST:event_btEditarActionPerformed

    private void MostrarCatalogoPresupuesto(){
        btGuardar.setEnabled(false);
        btEditar.setEnabled(false);
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            String titulos[] = {"Código", "Nombre", "Descripción"};
            modelo.setColumnIdentifiers(titulos);
            
            if(true==txtBuscar.getText().isEmpty()){
                for (CatalogoPresupuesto CP : BDCatalogoPresupuesto.mostrarCatalogoPresupuesto()) {
                    String Datos[] = {CP.getCodCatalogoPresupuesto(), CP.getNomCatalogoPresupuesto(),
                    CP.getDescripcionCatalogoPresupuesto()};
                    modelo.addRow(Datos);
                }
            }else{
                for (CatalogoPresupuesto CP : BDCatalogoPresupuesto.mostrarCatalogoPresupuesto(txtBuscar.getText())) {
                    String Datos[] = {CP.getCodCatalogoPresupuesto(), CP.getNomCatalogoPresupuesto(),
                    CP.getDescripcionCatalogoPresupuesto()};
                    modelo.addRow(Datos);
                }
            }
            jTableCatalogo.setModel(modelo);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableCatalogo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
