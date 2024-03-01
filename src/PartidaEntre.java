
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aeaya
 */
public class PartidaEntre extends javax.swing.JFrame {
ConexionDB conSQL = new ConexionDB();
    /**
     * Creates new form PartidaEntre
     */
    public PartidaEntre() {
        initComponents();
        
        cargarIDEquipo();
        cargarIDPartida();
         MostrarDatos();
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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));
        jPanel2.setLayout(null);

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(70, 300, 120, 50);

        jLabel1.setText("ID PARTIDA");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(31, 70, 100, 40);

        jLabel2.setText("EQUIPO 1");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(31, 150, 80, 30);

        jLabel3.setText("EQUIPO 2");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(27, 206, 80, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(150, 70, 90, 40);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(150, 150, 90, 40);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(150, 220, 90, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PARTIDA", "EQUIPO 1", "EQUIPO 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(410, 40, 452, 402);

        jButton2.setText("Atras");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(50, 400, 120, 40);

        jButton3.setText("Actualizar");
        jPanel2.add(jButton3);
        jButton3.setBounds(260, 280, 120, 40);

        jButton4.setText("Eliminar");
        jPanel2.add(jButton4);
        jButton4.setBounds(260, 350, 120, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 890, 540);

        setSize(new java.awt.Dimension(908, 552));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        
        boolean error = false;
    
    // Convertir el objeto seleccionado a String y luego a int
    int idpartida = Integer.parseInt((String) jComboBox1.getSelectedItem());
    int idequipo1 = Integer.parseInt((String) jComboBox2.getSelectedItem());
    int idequipo2 = Integer.parseInt((String) jComboBox3.getSelectedItem());
    
    try {
        String query = "INSERT INTO juego_Entre (ID_Partida, ID_Equipo1,ID_Equipo2) VALUES(?, ?, ?)";
        PreparedStatement pps = conSQL.prepareStatement(query);
        pps.setInt(1, idpartida);
        pps.setInt(2, idequipo1);
        pps.setInt(3, idequipo2);
  
        pps.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar los datos en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        error = true;
    }

    if (!error) {
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
    }
    
    MostrarDatos();
        
        
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed

        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2MousePressed

    
    private void cargarIDEquipo() {
    try (Connection conSQL = new ConexionDB().getConectarDB();
         Statement stmt = conSQL.createStatement()) {

        // Consulta para obtener los IDs de la tabla Equipos
        String query = "SELECT ID_Equipo FROM equipos";
        ResultSet resultSet = stmt.executeQuery(query);

        // Limpiar el JComboBox antes de agregar nuevos elementos
        jComboBox2.removeAllItems();
        jComboBox3.removeAllItems();

        // Agregar los IDs al JComboBox
        while (resultSet.next()) {
            int idEquipo = resultSet.getInt("ID_Equipo");
            jComboBox2.addItem("" + idEquipo);
            jComboBox3.addItem("" + idEquipo);
        }

        // Cerrar recursos
        resultSet.close();

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    
    
    private void cargarIDPartida() {
    try (Connection conSQL = new ConexionDB().getConectarDB();
         Statement stmt = conSQL.createStatement()) {

        // Consulta para obtener los IDs de la tabla Partidas
        String query = "SELECT ID_Partida FROM partida";
        try (ResultSet resultSet = stmt.executeQuery(query)) {

            // Limpiar el JComboBox antes de agregar nuevos elementos
            jComboBox1.removeAllItems();

            // Agregar los IDs al JComboBox
            while (resultSet.next()) {
                int idPartida = resultSet.getInt("ID_Partida");
                jComboBox1.addItem(String.valueOf(idPartida));
            }
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    
    
    private void LimpiarTabla(DefaultTableModel model) {
    int rowCount = model.getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
        model.removeRow(i);
    }
}
    
    private void mostrarDatosEnTabla(JTable tabla, DefaultTableModel modelo, String consultaSQL) {
    LimpiarTabla(modelo);

    try (Connection conSQL = new ConexionDB().getConectarDB();
         Statement stmt = conSQL.createStatement();
         ResultSet result = stmt.executeQuery(consultaSQL)) {

        while (result.next()) {
            int idpartida = result.getInt("ID_Partida");
            int idequipo1 = result.getInt("ID_Equipo1");
            int idequipo2 = result.getInt("ID_Equipo2");
            

            modelo.addRow(new Object[]{idpartida, idequipo1, idequipo2});
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al leer los datos desde la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
}
    
    void MostrarDatos() {
      
   DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      
   String query = "SELECT * FROM juego_entre"; // Reemplaza esto con tu consulta SQL real

    // Llamada al método para mostrar datos en jTable2
    mostrarDatosEnTabla(jTable1, model, query);
}
    
    
    
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
            java.util.logging.Logger.getLogger(PartidaEntre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartidaEntre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartidaEntre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartidaEntre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartidaEntre().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}