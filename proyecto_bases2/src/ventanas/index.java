/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;


import java.util.Date;

import javax.swing.*;
import javax.swing.JSpinner.DefaultEditor;

/**
 *
 * @author johan
 */
public class index extends javax.swing.JFrame {

    metodos metodo = new metodos();

    public index() {
        initComponents();
        this.setLocationRelativeTo(null);
        metodo.cargar_combo(codprogramas, "cod_programa", "programa");
        //se cargan los equipos disponibles
        metodo.cargar_combo(equipo, "cod_equipo", "equipo");
      // no se deja que el usuario digite valores erroneos solo puede elgir los valores del 6 al 16 en la hora y del 1 al 59 en los minutos
        ((DefaultEditor) horaentr.getEditor()).getTextField().setEditable(false);
        ((DefaultEditor) minutoentr.getEditor()).getTextField().setEditable(false);
        ((DefaultEditor) horasal.getEditor()).getTextField().setEditable(false);
        ((DefaultEditor) minutosal.getEditor()).getTextField().setEditable(false);
        //formato fecha
      
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        titulocabecera = new javax.swing.JLabel();
        cabecera = new javax.swing.JLabel();
        TXTCODIGO = new javax.swing.JTextField();
        nombest1 = new javax.swing.JLabel();
        txtnombe1 = new javax.swing.JTextField();
        datosest = new javax.swing.JLabel();
        txtapelest1 = new javax.swing.JLabel();
        txtapel1 = new javax.swing.JTextField();
        codprogramas = new javax.swing.JComboBox<>();
        codigo1 = new javax.swing.JLabel();
        datosest1 = new javax.swing.JLabel();
        nombest2 = new javax.swing.JLabel();
        nombest3 = new javax.swing.JLabel();
        equipo = new javax.swing.JComboBox<>();
        nombest4 = new javax.swing.JLabel();
        nombest6 = new javax.swing.JLabel();
        nombest7 = new javax.swing.JLabel();
        software = new javax.swing.JComboBox<>();
        reservar = new javax.swing.JButton();
        codigo3 = new javax.swing.JLabel();
        codigo4 = new javax.swing.JLabel();
        nombprog = new javax.swing.JLabel();
        INFOCIER = new javax.swing.JButton();
        sistemaop = new javax.swing.JLabel();
        nombest5 = new javax.swing.JLabel();
        nombresal = new javax.swing.JLabel();
        nombreeq = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        nombest8 = new javax.swing.JLabel();
        nombest9 = new javax.swing.JLabel();
        horaentr = new javax.swing.JSpinner();
        nombest10 = new javax.swing.JLabel();
        minutoentr = new javax.swing.JSpinner();
        horasal = new javax.swing.JSpinner();
        minutosal = new javax.swing.JSpinner();
        nombest11 = new javax.swing.JLabel();
        nombest12 = new javax.swing.JLabel();
        nombest13 = new javax.swing.JLabel();
        nombresft = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(java.awt.Color.white);
        salir.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        salir.setForeground(java.awt.Color.red);
        salir.setText("salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, -1, -1));

        titulocabecera.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        titulocabecera.setForeground(java.awt.Color.white);
        titulocabecera.setText("SALAS CIER UNIVERSIDAD DE LOS LLANOS ");
        getContentPane().add(titulocabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        cabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDOCABEcERa.png"))); // NOI18N
        getContentPane().add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));
        getContentPane().add(TXTCODIGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 230, 30));

        nombest1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        nombest1.setForeground(java.awt.Color.red);
        nombest1.setText("OPERATIVO");
        getContentPane().add(nombest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        txtnombe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombe1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 230, 30));

        datosest.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        datosest.setForeground(java.awt.Color.red);
        datosest.setText("DATOS RESERVA ");
        getContentPane().add(datosest, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, 60));

        txtapelest1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        txtapelest1.setForeground(java.awt.Color.red);
        txtapelest1.setText("APELLIDOS: ");
        getContentPane().add(txtapelest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(txtapel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 230, 30));

        codprogramas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codprogramasActionPerformed(evt);
            }
        });
        getContentPane().add(codprogramas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 230, 30));

        codigo1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        codigo1.setForeground(java.awt.Color.red);
        codigo1.setText("CÓDIGO: ");
        getContentPane().add(codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 40));

        datosest1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        datosest1.setForeground(java.awt.Color.red);
        datosest1.setText("DATOS  DEL ESTUDIANTE");
        getContentPane().add(datosest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 40));

        nombest2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombest2.setForeground(java.awt.Color.red);
        nombest2.setText("NOMBRE: ");
        getContentPane().add(nombest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        nombest3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombest3.setForeground(java.awt.Color.red);
        nombest3.setText("HORA SALIDA");
        getContentPane().add(nombest3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, -1, -1));

        equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoActionPerformed(evt);
            }
        });
        getContentPane().add(equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 190, 30));

        nombest4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        nombest4.setForeground(java.awt.Color.red);
        nombest4.setText("UTILIZAR");
        getContentPane().add(nombest4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        nombest6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombest6.setForeground(java.awt.Color.red);
        nombest6.setText("EQUIPO:");
        getContentPane().add(nombest6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        nombest7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        nombest7.setForeground(java.awt.Color.red);
        nombest7.setText("SOFTWARE A");
        getContentPane().add(nombest7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        software.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        software.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softwareActionPerformed(evt);
            }
        });
        getContentPane().add(software, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 190, 30));

        reservar.setBackground(java.awt.Color.red);
        reservar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        reservar.setForeground(java.awt.Color.white);
        reservar.setText("HACER RESERVA");
        reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarActionPerformed(evt);
            }
        });
        getContentPane().add(reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        codigo3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        codigo3.setForeground(java.awt.Color.red);
        codigo3.setText("CÓDIGO");
        getContentPane().add(codigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 40));

        codigo4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        codigo4.setForeground(java.awt.Color.red);
        codigo4.setText("PROGRAMA ");
        getContentPane().add(codigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 40));

        nombprog.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombprog.setForeground(java.awt.Color.black);
        nombprog.setText("NOMBRE PROG");
        getContentPane().add(nombprog, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 370, 30));

        INFOCIER.setBackground(java.awt.Color.red);
        INFOCIER.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        INFOCIER.setForeground(java.awt.Color.white);
        INFOCIER.setText("¿QUÉ ES EL CIER?");
        INFOCIER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INFOCIERActionPerformed(evt);
            }
        });
        getContentPane().add(INFOCIER, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, 200, -1));

        sistemaop.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        sistemaop.setForeground(java.awt.Color.black);
        sistemaop.setText("NOMBRE SO");
        getContentPane().add(sistemaop, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 180, 30));

        nombest5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombest5.setForeground(java.awt.Color.red);
        nombest5.setText("SISTEMA ");
        getContentPane().add(nombest5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        nombresal.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombresal.setForeground(java.awt.Color.black);
        nombresal.setText("NOMBRE SALA");
        getContentPane().add(nombresal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 220, 30));

        nombreeq.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombreeq.setForeground(java.awt.Color.black);
        nombreeq.setText("NOMBRE EQUIPO");
        getContentPane().add(nombreeq, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 210, 30));

        fecha.setDateFormatString("yyyy/MM/d");
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, 190, -1));

        nombest8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombest8.setForeground(java.awt.Color.red);
        nombest8.setText(":");
        getContentPane().add(nombest8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 40, 20));

        nombest9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombest9.setForeground(java.awt.Color.red);
        nombest9.setText("FECHA");
        getContentPane().add(nombest9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, -1, -1));

        horaentr.setModel(new javax.swing.SpinnerNumberModel(6, 6, 16, 1));
        horaentr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(horaentr, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, 50, -1));

        nombest10.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombest10.setForeground(java.awt.Color.red);
        nombest10.setText("HORA ENTRADA");
        getContentPane().add(nombest10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, -1, -1));

        minutoentr.setModel(new javax.swing.SpinnerNumberModel(1, 1, 59, 1));
        getContentPane().add(minutoentr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, 50, -1));

        horasal.setModel(new javax.swing.SpinnerNumberModel(6, 6, 18, 1));
        getContentPane().add(horasal, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 290, 50, -1));

        minutosal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 59, 1));
        getContentPane().add(minutosal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 50, -1));

        nombest11.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombest11.setForeground(java.awt.Color.red);
        nombest11.setText("SALA:");
        getContentPane().add(nombest11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        nombest12.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombest12.setForeground(java.awt.Color.red);
        nombest12.setText(":");
        getContentPane().add(nombest12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 290, 40, 20));

        nombest13.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombest13.setForeground(java.awt.Color.red);
        nombest13.setText(":");
        getContentPane().add(nombest13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 210, 40, 20));

        nombresft.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        nombresft.setForeground(java.awt.Color.black);
        nombresft.setText("NOMBRE STF");
        getContentPane().add(nombresft, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 210, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void txtnombe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombe1ActionPerformed

    private void INFOCIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INFOCIERActionPerformed
        JOptionPane.showMessageDialog(null, ""
                //               + "Los Centros de Innovación Educativa Regional CIER, son un proyecto del Ministerio de Educación \n"
                + " cuyo principal objetivo es la producción de contenidos educativos digitales acordes con el contexto \n"
                + " y las necesidades de la comunidad educativa del país de acuerdo a unas directrices de calidad  \n"
                + "establecidas que faciliten procesos de gestión, uso y reuso por parte de los docentes y estudiantes.\n"
                + "\n"
                + "Estos centros están ubicados en 5 ciudades del país y son operados logísticamente por instituciones de \n "
                + "educación superior, como parte de una alianza regional conformada a su vez por entidades territoriales, \n"
                + " otras instituciones de educación superior de la región y empresas del sector productivo. \n");
    }//GEN-LAST:event_INFOCIERActionPerformed

    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
        Date dateFromDateChooser = fecha.getDate();
        String dateString = String.format("%1$tY/%1$tm/%1$td", dateFromDateChooser);
       
        String nombre = txtnombe1.getText();
        String apellido = txtapel1.getText();
        String codigo = TXTCODIGO.getText();
       String cod_programa=codprogramas.getSelectedItem().toString();
        String codigo_equipo=equipo.getSelectedItem().toString();
        int hora_entrada=Integer.parseInt(horaentr.getValue().toString());
        int hora_salida=Integer.parseInt(horasal.getValue().toString());
        int minuto_entrada=Integer.parseInt(minutoentr.getValue().toString());
        int minuto_salida=Integer.parseInt(minutosal.getValue().toString());
        String horaentr=hora_entrada+":"+minuto_entrada;
        String horasal=hora_salida+":"+minuto_salida;
        String software = nombresft.getText();
        
        
       //primero se valida todos los datos no exedan el tamaño definido en la base de datos
       metodo.validar_atributo(nombre,"nombre",20);// se valida el tamaño del nombre
       metodo.validar_atributo(codigo,"código",10);// se valida el tamaño del codigo
       metodo.validar_atributo(apellido,"apellido",20);// se valida el tamaño del apellido
       metodo.validar_fecha(dateString);//se valida que se digite la fecha 
       metodo.validar_insercion_horas(hora_entrada, hora_salida, minuto_entrada, minuto_salida);
       
       //
       
       //insercon de datos para reservar el equipo 
       
       metodo.insertar_estudiante(codigo,cod_programa, nombre, apellido);
         
       metodo.hacer_reserva(codigo, codigo_equipo, dateString,horaentr,horasal,software);
       
        
        
    }//GEN-LAST:event_reservarActionPerformed

    private void codprogramasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codprogramasActionPerformed
        String cod_combo = codprogramas.getSelectedItem().toString();
        metodo.cargar_textos(nombprog, "nomb_programa", cod_combo, "programa", "cod_programa");//cargo el nombre del programa

    }//GEN-LAST:event_codprogramasActionPerformed


    private void equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoActionPerformed

        String cod_combo = equipo.getSelectedItem().toString();
        metodo.cargar_textos(nombreeq, "distintivo", cod_combo, "equipo", "cod_equipo");
        // se cargan elsistema operativo que tiene el equipo sellecionado 
        metodo.cargar_textos(sistemaop, "cod_sistema_op", cod_combo, "equipo", "cod_equipo");
        // se cargan el software que tiene el equipo  seleccionado 
        
        metodo.cargar_combo(software, "cod_software", "cod_equipo",cod_combo, "instalado");
        
        // se carga la sala a la que pertenecen un equipo 
        metodo.cargar_textos(nombresal,"nombre_sala","equipo","sala","cod_sala","cod_equipo",cod_combo);
       // se carga el sistema operativo que tiene un equipo
        metodo.cargar_textos(sistemaop,"nombre_so","equipo","sistema_operativo", "cod_sistema_op","cod_equipo", cod_combo);
        
       
    }//GEN-LAST:event_equipoActionPerformed

    private void softwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softwareActionPerformed
         Object  cod_combo2 =software.getSelectedItem();
        
        if(cod_combo2!=null){
        metodo.cargar_textos(nombresft,"nombre_software","version_software", cod_combo2.toString(),"software","cod_software");
        }
        
        
    }//GEN-LAST:event_softwareActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INFOCIER;
    private javax.swing.JTextField TXTCODIGO;
    private javax.swing.JLabel cabecera;
    private javax.swing.JLabel codigo1;
    private javax.swing.JLabel codigo3;
    private javax.swing.JLabel codigo4;
    private javax.swing.JComboBox<String> codprogramas;
    private javax.swing.JLabel datosest;
    private javax.swing.JLabel datosest1;
    private javax.swing.JComboBox<String> equipo;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JSpinner horaentr;
    private javax.swing.JSpinner horasal;
    private javax.swing.JSpinner minutoentr;
    private javax.swing.JSpinner minutosal;
    private javax.swing.JLabel nombest1;
    private javax.swing.JLabel nombest10;
    private javax.swing.JLabel nombest11;
    private javax.swing.JLabel nombest12;
    private javax.swing.JLabel nombest13;
    private javax.swing.JLabel nombest2;
    private javax.swing.JLabel nombest3;
    private javax.swing.JLabel nombest4;
    private javax.swing.JLabel nombest5;
    private javax.swing.JLabel nombest6;
    private javax.swing.JLabel nombest7;
    private javax.swing.JLabel nombest8;
    private javax.swing.JLabel nombest9;
    private javax.swing.JLabel nombprog;
    private javax.swing.JLabel nombreeq;
    private javax.swing.JLabel nombresal;
    private javax.swing.JLabel nombresft;
    private javax.swing.JButton reservar;
    private javax.swing.JButton salir;
    private javax.swing.JLabel sistemaop;
    private javax.swing.JComboBox<String> software;
    private javax.swing.JLabel titulocabecera;
    private javax.swing.JTextField txtapel1;
    private javax.swing.JLabel txtapelest1;
    private javax.swing.JTextField txtnombe1;
    // End of variables declaration//GEN-END:variables
}
