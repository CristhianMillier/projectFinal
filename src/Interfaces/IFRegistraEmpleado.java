package Interfaces;

import Clases.Empleado;
import Coneccion_BD.InsertarBD;
import Modelo.Tamaño_TextField;
import javax.swing.JOptionPane;

public class IFRegistraEmpleado extends javax.swing.JInternalFrame {

    private String sexo, user, contra = "";
    private int telef = 0;

    public IFRegistraEmpleado() {
        initComponents();
        this.validar_tamañoTexto();
        this.cargar_combo_cargo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtGuardar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jTextFieldDirecc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTelef1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTelef2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTelef3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Registro Empleado");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jbtGuardar.setBackground(new java.awt.Color(0, 0, 0));
        jbtGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbtGuardar.setForeground(java.awt.Color.white);
        jbtGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardaa.png"))); // NOI18N
        jbtGuardar.setText("Guardar");
        jbtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGuardarActionPerformed(evt);
            }
        });

        jbtCancelar.setBackground(java.awt.Color.red);
        jbtCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbtCancelar.setForeground(java.awt.Color.white);
        jbtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jbtSalir.setBackground(new java.awt.Color(0, 0, 0));
        jbtSalir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbtSalir.setForeground(java.awt.Color.white);
        jbtSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida-de-emergencia.png"))); // NOI18N
        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Cargo:");

        jComboBoxCargo.setBackground(new java.awt.Color(0, 0, 51));
        jComboBoxCargo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Horario:");

        jComboBoxHorario.setBackground(new java.awt.Color(0, 0, 51));
        jComboBoxHorario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "8hr", "4hr" }));
        jComboBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHorarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Sexo:");

        jComboBoxSexo.setBackground(new java.awt.Color(0, 0, 51));
        jComboBoxSexo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Femenino", "Masculino" }));

        jTextFieldDirecc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Dirección:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Teléfono:");

        jTextFieldTelef1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldTelef1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelef1KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("-");

        jTextFieldTelef2.setToolTipText("");
        jTextFieldTelef2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelef2KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("-");

        jTextFieldTelef3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldTelef3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelef3KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("DNI:");

        jTextFieldDni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Apellidos:");

        jTextFieldApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Nombres:");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDni)
                                    .addComponent(jTextFieldDirecc)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldTelef1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldTelef2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldTelef3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jbtGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jbtSalir)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTelef1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jTextFieldTelef2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jTextFieldTelef3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDirecc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtGuardar)
                    .addComponent(jbtCancelar)
                    .addComponent(jbtSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGuardarActionPerformed
        if (this.validar() == 0) {
            JOptionPane.showMessageDialog(this, "Porfavor!!!\nComplete todos los campos", "Validar Llenado", JOptionPane.WARNING_MESSAGE);
        } else {
            this.definirSexo_Telef_user_contra();
            Empleado objE = new Empleado(this.jTextFieldNombre.getText(),
                    this.jTextFieldApellido.getText(),
                    Integer.parseInt(this.jTextFieldDni.getText()),
                    this.telef,
                    this.jTextFieldDirecc.getText(),
                    this.sexo,
                    this.jComboBoxHorario.getSelectedItem().toString(),
                    this.jComboBoxCargo.getSelectedItem().toString(),
                    this.user,
                    this.contra);
            try {
                InsertarBD ins = new InsertarBD();
                ins.agregar_Empleado(objE);
                Escritorio.cargar_datos_Empleado();
                if (this.user.equals("null")) {
                    JOptionPane.showMessageDialog(this, "Inserción exitosa!!!\n", "Inserción", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Su usuario para el empleado " + this.jTextFieldNombre.getText()
                            + "\n Usuario: " + this.user + "\n Contraseña: " + this.contra, "Inserción", JOptionPane.INFORMATION_MESSAGE);
                }
                this.limpiar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR: \n" + e.getMessage(), "Error BD", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtGuardarActionPerformed

    private void jComboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHorarioActionPerformed
        this.cargar_combo_cargo();
    }//GEN-LAST:event_jComboBoxHorarioActionPerformed

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        this.validar_llenado(evt, 2);
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jTextFieldTelef1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelef1KeyTyped
        this.validar_llenado(evt, 1);
    }//GEN-LAST:event_jTextFieldTelef1KeyTyped

    private void jTextFieldTelef2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelef2KeyTyped
        this.validar_llenado(evt, 1);
    }//GEN-LAST:event_jTextFieldTelef2KeyTyped

    private void jTextFieldTelef3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelef3KeyTyped
        this.validar_llenado(evt, 1);
    }//GEN-LAST:event_jTextFieldTelef3KeyTyped

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JComboBox<String> jComboBoxHorario;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDirecc;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelef1;
    private javax.swing.JTextField jTextFieldTelef2;
    private javax.swing.JTextField jTextFieldTelef3;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtGuardar;
    private javax.swing.JButton jbtSalir;
    // End of variables declaration//GEN-END:variables

    private void cargar_combo_cargo() {
        String obt = this.jComboBoxHorario.getSelectedItem().toString();
        switch (obt) {
            case "-Seleccione-":
                this.jComboBoxCargo.removeAllItems();
                this.jComboBoxCargo.addItem("-Seleccione-");
                this.jComboBoxCargo.addItem("Cajera");
                this.jComboBoxCargo.addItem("Mecánico");
                this.jComboBoxCargo.addItem("Vendedor");
                break;
            case "8hr":
                this.jComboBoxCargo.removeAllItems();
                this.jComboBoxCargo.addItem("-Seleccione-");
                this.jComboBoxCargo.addItem("Cajera");
                this.jComboBoxCargo.addItem("Mecánico");
                this.jComboBoxCargo.addItem("Vendedor");
                break;
            case "4hr":
                this.jComboBoxCargo.removeAllItems();
                this.jComboBoxCargo.addItem("-Seleccione-");
                this.jComboBoxCargo.addItem("Practicante");
                break;
            default: break;
        }
    }

    private int validar() {
        int lleno = 0;
        if (this.jTextFieldNombre.getText().trim().equals("")
                || this.jTextFieldApellido.getText().trim().equals("")
                || this.jTextFieldDni.getText().trim().equals("")
                || this.jTextFieldTelef1.getText().trim().equals("") || this.jTextFieldTelef1.getText().trim().length() < 3
                || this.jTextFieldTelef2.getText().trim().equals("") || this.jTextFieldTelef2.getText().trim().length() < 3
                || this.jTextFieldTelef3.getText().trim().equals("") || this.jTextFieldTelef3.getText().trim().length() < 3
                || this.jTextFieldDirecc.getText().trim().equals("")
                || this.jComboBoxSexo.getSelectedIndex() == 0
                || this.jComboBoxHorario.getSelectedIndex() == 0
                || this.jComboBoxCargo.getSelectedIndex() == 0) {

            return lleno;

        } else {
            lleno = 1;
        }
        return lleno;
    }

    private void definirSexo_Telef_user_contra() {
        String telef = this.jTextFieldTelef1.getText().trim();
        telef += this.jTextFieldTelef2.getText().trim();
        telef += this.jTextFieldTelef3.getText().trim();
        this.telef = Integer.parseInt(telef);

        if (this.jComboBoxSexo.getSelectedIndex() == 1) {
            sexo = "F";
        } else {
            sexo = "M";
        }
        if (this.jComboBoxCargo.getSelectedItem().equals("Mecánico")
                || this.jComboBoxCargo.getSelectedItem().equals("Practicante")) {
            this.user = "null";
            this.contra = "null";
        } else {
            String nomb = this.jTextFieldNombre.getText();
            String user = nomb.substring(0, 4);
            this.user = "CRIMO" + user.toLowerCase();
            this.contra = this.jTextFieldDni.getText();
        }
    }

    private void limpiar() {
        this.jTextFieldNombre.setText("");
        this.jTextFieldApellido.setText("");
        this.jTextFieldDni.setText("");
        this.jTextFieldTelef1.setText("");
        this.jTextFieldTelef2.setText("");
        this.jTextFieldTelef3.setText("");
        this.jTextFieldDirecc.setText("");
        this.jComboBoxSexo.setSelectedIndex(0);
        this.jComboBoxHorario.setSelectedIndex(0);
        this.jComboBoxCargo.setSelectedIndex(0);

        this.sexo = "";
        this.telef = 0;
        this.user = "";
        this.contra = "";
    }

    private void validar_llenado(java.awt.event.KeyEvent evt, int opc) {
        //opc: 1 es para ingresar solo números
        //opc: 2 es para ingresar solo letras
        if (opc == 1) {
            char validar = evt.getKeyChar();
            if (Character.isLetter(validar)) {
                getToolkit().beep(); //sonido de alerta
                evt.consume();
            }
        }
        if (opc == 2) {
            char validar = evt.getKeyChar();
            if (Character.isDigit(validar)) {
                getToolkit().beep(); //sonido de alerta
                evt.consume();
            }
        }
    }

    private void validar_tamañoTexto() {
        this.jTextFieldNombre.setDocument(new Tamaño_TextField(this.jTextFieldNombre, 25));
        this.jTextFieldApellido.setDocument(new Tamaño_TextField(this.jTextFieldApellido, 25));
        this.jTextFieldDni.setDocument(new Tamaño_TextField(this.jTextFieldDni, 8));
        this.jTextFieldTelef1.setDocument(new Tamaño_TextField(this.jTextFieldTelef1, 3));
        this.jTextFieldTelef2.setDocument(new Tamaño_TextField(this.jTextFieldTelef2, 3));
        this.jTextFieldTelef3.setDocument(new Tamaño_TextField(this.jTextFieldTelef3, 3));
        this.jTextFieldDirecc.setDocument(new Tamaño_TextField(this.jTextFieldDirecc, 50));
    }
}
