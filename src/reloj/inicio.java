/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import com.mysql.jdbc.Connection;

/**
 *
 * @author Mauricio
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // Da fromato a la hora
    SimpleDateFormat formato = new SimpleDateFormat("hh:mm");
    // Da formato de fecha
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    // Bandera para empleado
    boolean si;
    // Orden de insertar horas
    String horRegis;
    // Nombre del empleado
    String nombres;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFondo = new javax.swing.JPanel();
        jTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jEntrada = new javax.swing.JButton();
        jSalida = new javax.swing.JButton();
        jNumeroT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RELOJ CHECADOR");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setText("Reloj Checador");

        javax.swing.GroupLayout jTituloLayout = new javax.swing.GroupLayout(jTitulo);
        jTitulo.setLayout(jTituloLayout);
        jTituloLayout.setHorizontalGroup(
            jTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTituloLayout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jTituloLayout.setVerticalGroup(
            jTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTituloLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jEntrada.setText("Entrada");
        jEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntradaActionPerformed(evt);
            }
        });

        jSalida.setText("Salida");
        jSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalidaActionPerformed(evt);
            }
        });

        jNumeroT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumeroTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setText("Numero de trabajador:");

        javax.swing.GroupLayout jFondoLayout = new javax.swing.GroupLayout(jFondo);
        jFondo.setLayout(jFondoLayout);
        jFondoLayout.setHorizontalGroup(
            jFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jFondoLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(jFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFondoLayout.createSequentialGroup()
                        .addComponent(jEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(jSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFondoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jNumeroT, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jFondoLayout.setVerticalGroup(
            jFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFondoLayout.createSequentialGroup()
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(jFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumeroT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalidaActionPerformed
        // TODO add your handling code here:
        si=false;
        Date hora=new Date();
        String numero = this.jNumeroT.getText();
        String dia=sdf.format(hora),horita=formato.format(hora);
        try
        {
            //Conexion a la bse de datos
            Connection con;
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sae","root","");
            // Creación de instancia
            Statement stant=con.createStatement();
            //Ejecutar sql
            ResultSet r=stant.executeQuery("select * from EMPLEADO");
            while(r.next())
            {if(r.getString("noEmp").equals(numero)){si=true;nombres=r.getString("nomEmp");break;};}
            if(si)
            {
                System.out.println(dia);
                horRegis="update registros set horSal='"+horita+"' where noEmp="+numero+" and fechaReg='"+dia+"'";
                stant.executeUpdate(horRegis);
                JOptionPane.showMessageDialog(null, "Adios: "+nombres+"\nHora de Salida: "+horita, "Salida", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {JOptionPane.showMessageDialog(null, "Numero de empleado incorrecto, intente de nuevo", "ERROR", JOptionPane.INFORMATION_MESSAGE);}
            this.jNumeroT.setText("");
        }catch(Exception ex){System.out.println("Error: "+ex);}
    }//GEN-LAST:event_jSalidaActionPerformed

    private void jEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntradaActionPerformed
        // TODO add your handling code here:
        si=false;
        Date hora=new Date();
        String numero = this.jNumeroT.getText();
        String dia=sdf.format(hora),horita=formato.format(hora);
        try
        {
            //Conexion a la bse de datos
            Connection con;
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sae","root","");
            // Creación de instancia
            Statement stant=con.createStatement();
            //Ejecutar sql
            ResultSet r=stant.executeQuery("select * from EMPLEADO");
            while(r.next())
            {if(r.getString("noEmp").equals(numero)){si=true;nombres=r.getString("nomEmp");break;};}
            if(si)           
            {
                horRegis="insert into registros value("+numero+",'"+dia+"','"+horita+"','xxxx')";
                stant.executeUpdate(horRegis);
                JOptionPane.showMessageDialog(null, "Bienvenido: "+nombres+"\nHora de entrada: "+horita, "Entrada", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {JOptionPane.showMessageDialog(null, "Numero de empleado incorrecto, intente de nuevo", "ERROR", JOptionPane.INFORMATION_MESSAGE);}
            this.jNumeroT.setText("");
        }catch(Exception ex){JOptionPane.showMessageDialog(null, "Hay un problema con algo, por favor, intente más tarde", "ERROR", JOptionPane.WARNING_MESSAGE);}
    }//GEN-LAST:event_jEntradaActionPerformed

    private void jNumeroTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumeroTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNumeroTActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jEntrada;
    private javax.swing.JPanel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jNumeroT;
    private javax.swing.JButton jSalida;
    private javax.swing.JPanel jTitulo;
    // End of variables declaration//GEN-END:variables
}
