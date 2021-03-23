/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.vista;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import seguridad.datos.PerfilDAO;
import seguridad.dominio.Perfil;
import seguridad.datos.UsuarioDAO;
import seguridad.dominio.Usuario;
import seguridad.datos.Asignacion_Usuario_PerfilDAO;
import seguridad.dominio.Asignacion_Usuario_Perfil;


/**
 *
 * @author Santiago Martinez
 */
public class Asignacion_usuario_Perfil1 extends javax.swing.JInternalFrame {

      public void llenadoDeCombos() {
       PerfilDAO empleadoDAO = new PerfilDAO();
      List<Perfil> empleados = empleadoDAO.listar();
      cbox_perfiles.addItem("");
      for (int i = 0; i < empleados.size(); i++) {
         cbox_perfiles.addItem(Integer.toString(empleados.get(i).getPk_id_perfil()));
     
       }
   
    }
     

     
   public void llenadoDeTablas() {
 
            DefaultTableModel modelo1 = new DefaultTableModel();
          modelo1 = new DefaultTableModel();
          modelo1.addColumn("ID Usuario");
          modelo1.addColumn("NOMBRE");
        UsuarioDAO asignaciondao = new UsuarioDAO();
        List<Usuario> asignaciones = asignaciondao.select();
        TablaPerfiles.setModel(modelo1);
        String[] dato = new String[2];
        for (int i = 0; i < asignaciones.size(); i++) {
            dato[0] = (Integer.toString(asignaciones.get(i).getId_usuario()));
            dato[1] = asignaciones.get(i).getNombre_usuario();

            modelo1.addRow(dato);
        }
    }

    /**
     * Creates new form Asignacion_Perfil_usuario
     */
    public Asignacion_usuario_Perfil1() {
        initComponents();
        llenadoDeCombos();
       llenadoDeTablas();

                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbox_perfiles = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        BtnAyuda = new javax.swing.JButton();
        TxtAñadir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAsignacion = new javax.swing.JTable();
        label8 = new javax.swing.JLabel();
        BotonConsultar = new javax.swing.JButton();
        TxtConsulta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPerfiles = new javax.swing.JTable();
        BtnMovervarias = new javax.swing.JButton();
        BtnMoveruna = new javax.swing.JButton();
        btnQuitarVarias = new javax.swing.JButton();
        Btnquitar = new javax.swing.JButton();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Asignacion Usuario a Perfil");
        setVisible(true);

        cbox_perfiles.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_perfiles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbox_perfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_perfilesActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegistrar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        BtnAyuda.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        BtnAyuda.setText("AYUDA");
        BtnAyuda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAyudaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel1.setText("Agregar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        label4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label4.setText("Asignaciones:");

        label6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label6.setText("Perfiles Disponibles:");

        TablaAsignacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TablaAsignacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TablaAsignacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaAsignacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAsignacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaAsignacion);

        label8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label8.setText("Asignar:");

        BotonConsultar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonConsultar.setText("?");
        BotonConsultar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarActionPerformed(evt);
            }
        });

        TablaPerfiles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TablaPerfiles.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TablaPerfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID  Usuario", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaPerfiles);

        BtnMovervarias.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        BtnMovervarias.setText(">>");
        BtnMovervarias.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnMovervarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMovervariasActionPerformed(evt);
            }
        });

        BtnMoveruna.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        BtnMoveruna.setText(">");
        BtnMoveruna.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnMoveruna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMoverunaActionPerformed(evt);
            }
        });

        btnQuitarVarias.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        btnQuitarVarias.setText("<<");
        btnQuitarVarias.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnQuitarVarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarVariasActionPerformed(evt);
            }
        });

        Btnquitar.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Btnquitar.setText("<");
        Btnquitar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Btnquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnquitarActionPerformed(evt);
            }
        });

        label9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label9.setText("Quitar:");

        label10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label10.setText("Agregar:");

        label7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label7.setText("Usuarios Disponibles:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbox_perfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BotonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(BtnMovervarias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(BtnMoveruna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnQuitarVarias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Btnquitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(429, 429, 429)
                                .addComponent(label10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label4)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6)
                    .addComponent(cbox_perfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConsultar)
                    .addComponent(TxtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label10)
                            .addComponent(label8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label7)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(BtnMoveruna)
                                .addGap(18, 18, 18)
                                .addComponent(BtnMovervarias)
                                .addGap(16, 16, 16)
                                .addComponent(label9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btnquitar)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuitarVarias))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_perfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_perfilesActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_perfilesActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Asignacion_Usuario_PerfilDAO Asignacion = new Asignacion_Usuario_PerfilDAO();
        Asignacion_Usuario_Perfil AsignacionINsertar = new Asignacion_Usuario_Perfil();

        AsignacionINsertar.setPK_id_perfil(cbox_perfiles.getSelectedItem().toString());
        AsignacionINsertar.setPK_id_usuario(TxtAñadir.getText());

        Asignacion.insert(AsignacionINsertar);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void BtnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAyudaActionPerformed
        // TODO add your handling code here:
        try {
            if ((new File("src\\main\\java\\seguridad\\ayuda\\AyudaAsignacionPerfilesAUsuarios.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\seguridad\\ayuda\\AyudaAsignacionPerfilesAUsuarios.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }//GEN-LAST:event_BtnAyudaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    
    DefaultTableModel tb = (DefaultTableModel) TablaAsignacion.getModel();
        int eliminar = TablaAsignacion.getRowCount()-1;
        for (int i = eliminar; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
     
    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void BotonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarActionPerformed
        // TODO add your handling code here:
         String valor=cbox_perfiles.getSelectedItem().toString();
        int val =Integer.parseInt(valor);
        PerfilDAO perfilDAO = new PerfilDAO();
        Perfil perfilconsultar = new Perfil();
        perfilconsultar.setPk_id_perfil(val);
        perfilconsultar=perfilDAO.query(perfilconsultar);
        if (perfilconsultar.getPk_id_perfil()!=0) {
            TxtConsulta.setText(perfilconsultar.getNombre_perfil());
        }

          
    }//GEN-LAST:event_BotonConsultarActionPerformed

    private void BtnMoverunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMoverunaActionPerformed
        // TODO add your handling code here:
        
        int [] tabla=TablaPerfiles.getSelectedRows();
        Object [] row = new Object[2];
        DefaultTableModel model = (DefaultTableModel)TablaAsignacion.getModel();
        DefaultTableModel model1 = (DefaultTableModel)TablaPerfiles.getModel();
        for (int i=0; i < tabla.length; i++)
        {
            row[0] = model1.getValueAt(tabla[i], 0);
            row[0] = model1.getValueAt(tabla[i], 0);
            model.addRow(row);
            
        }
         
    }//GEN-LAST:event_BtnMoverunaActionPerformed

    private void BtnMovervariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMovervariasActionPerformed
        // TODO add your handling code here:
       DefaultTableModel tabla = (DefaultTableModel)TablaPerfiles.getModel();

        Object[] row = new Object[2];

        DefaultTableModel tabla1 = (DefaultTableModel)  TablaAsignacion.getModel();
        for(int i = 0; i< tabla.getRowCount();i++){
            row [0] = tabla.getValueAt(i,0);

            tabla1.addRow(row);
        }
    }//GEN-LAST:event_BtnMovervariasActionPerformed

    private void BtnquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnquitarActionPerformed
        // TODO add your handling code here:
        
                int tabla = TablaAsignacion.getSelectedRow();
        if(tabla != -1) {
            int modelIndex = TablaAsignacion.convertRowIndexToModel(tabla); 
            DefaultTableModel model = (DefaultTableModel)TablaAsignacion.getModel();
            model.removeRow(modelIndex);
        }
    }//GEN-LAST:event_BtnquitarActionPerformed

    private void btnQuitarVariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarVariasActionPerformed
        // TODO add your handling code here:
       DefaultTableModel tb = (DefaultTableModel) TablaAsignacion.getModel();
        int eliminar = TablaAsignacion.getRowCount()-1;
        for (int i = eliminar; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
     
    
    }//GEN-LAST:event_btnQuitarVariasActionPerformed

    private void TablaAsignacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAsignacionMouseClicked
        // TODO add your handling code here:
        int seleccionar = TablaAsignacion.rowAtPoint(evt.getPoint());
        TxtAñadir.setText(String.valueOf(TablaAsignacion.getValueAt(seleccionar, 0)));
    }//GEN-LAST:event_TablaAsignacionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultar;
    private javax.swing.JButton BtnAyuda;
    private javax.swing.JButton BtnMoveruna;
    private javax.swing.JButton BtnMovervarias;
    private javax.swing.JButton Btnquitar;
    private javax.swing.JTable TablaAsignacion;
    private javax.swing.JTable TablaPerfiles;
    private javax.swing.JTextField TxtAñadir;
    private javax.swing.JTextField TxtConsulta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnQuitarVarias;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_perfiles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    // End of variables declaration//GEN-END:variables
}
