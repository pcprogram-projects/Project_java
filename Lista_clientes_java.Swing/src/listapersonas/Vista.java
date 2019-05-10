
package listapersonas;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;




@SuppressWarnings("unused")
public class Vista extends javax.swing.JFrame {

    String Nombre="";
    String Apellido="";
    String Edad="";
    String Telefono="";
    String Id="";

    
    ArrayList<Persona> lista=new ArrayList<Persona>();
    public Vista() {
        initComponents();
        
      
	jTablePersona.addMouseListener(new MouseAdapter() {
		DefaultTableModel model=new DefaultTableModel();
		
		public void mouseClicked(MouseEvent e) {
			int i =jTablePersona.getSelectedRow();
			    Nombre=(jTablePersona.getValueAt(i,0)).toString();
			    Apellido=(jTablePersona.getValueAt(i,1)).toString();
			    Edad=(jTablePersona.getValueAt(i,2)).toString();
			    Telefono=(jTablePersona.getValueAt(i,3)).toString();
                             Id=(jTablePersona.getValueAt(i,4)).toString();
		}   
	});

        
        
        
        
    }

   private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        BtnRegistrar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersona = new javax.swing.JTable();
        BtnEliminar = new javax.swing.JToggleButton();
        BtnEditar = new javax.swing.JToggleButton();
        txtEditarNombre = new javax.swing.JTextField();
        txtEditarApellido = new javax.swing.JTextField();
        txtEditarEdad = new javax.swing.JTextField();
        txtEditarTelefono = new javax.swing.JTextField();
        txtEditarId = new javax.swing.JLabel();
        BtnTerminarEdicion = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Edad");

        jLabel4.setText("Telefono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtApellido)
                    .addComponent(txtNombre))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        jTablePersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido ", "Edad", "Telefono", "Id"
            }
        	    ));
        jScrollPane1.setViewportView(jTablePersona);

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        txtEditarId.setText("Id");

        BtnTerminarEdicion.setText("Terminar Edicion");
        BtnTerminarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTerminarEdicionActionPerformed(evt);
           
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(txtEditarId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEditarApellido)
                                    .addComponent(txtEditarTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(BtnTerminarEdicion)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnRegistrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(BtnEliminar)
                        .addGap(37, 37, 37)
                        .addComponent(BtnEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarId))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnTerminarEdicion)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
                         
           

		try{

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String ruta="jdbc:mysql://localhost:3306/ListaPersona";

			Connection conexion= DriverManager.getConnection(ruta, "root","");
			conexion.setAutoCommit(false);
			Statement st= conexion.createStatement();
			String query ="INSERT INTO persona (Nombre,Apellido,Edad,Telefono,Id) "
					+ "values('"+txtNombre.getText()+"','"+txtApellido.getText()+"','"+txtEdad.getText()+"','"+txtTelefono.getText()+"','"+txtId.getText()+"')";
	
			st.executeUpdate(query);

			conexion.commit();
			st.close();
			conexion.close();

		}catch(Exception ex){

			System.out.println("Te falla algo:"+ex.getMessage());
	}
		

    	
    	
    	
        
        Persona person=new Persona(txtId.getText(),txtNombre.getText(),txtApellido.getText(),txtEdad.getText(),txtTelefono.getText());
        lista.add(person);
        
        Mostrar();
       txtNombre.setText("");
       txtApellido.setText("");
       txtEdad.setText("");
       txtTelefono.setText("");
       txtId.setText("");
    }

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	  try{

   			Class.forName("com.mysql.jdbc.Driver").newInstance();

   			String ruta="jdbc:mysql://localhost:3306/ListaPersona";

   			Connection conexion= DriverManager.getConnection(ruta, "root","");
   			conexion.setAutoCommit(false);
   			Statement st= conexion.createStatement();
   			String borrar ="DELETE FROM persona where Id='"+Id+"'";
   		    st.executeUpdate(borrar);


            conexion.commit();
   			st.close();
   			conexion.close();
   	
        }catch(Exception ex){
               
   			System.out.println("Te falla algo:"+ex.getMessage());
   	} 
    	
    	
        for(int i=0;i<lista.size();i++){
           if(Nombre==lista.get(i).getNombre()){
               lista.remove(i);
           }
        }
        
            String Matriz[][]=new String[lista.size()][5];
      
      for(int i=0;i<lista.size();i++){
          Matriz[i][0]=lista.get(i).getNombre();
           Matriz[i][1]=lista.get(i).getApellido();
           Matriz[i][2]=lista.get(i).getEdad();
           Matriz[i][3]=lista.get(i).getTelefono();
            Matriz[i][4]=lista.get(i).getId();
      }
      
     
        jTablePersona.setModel(new javax.swing.table.DefaultTableModel(
           Matriz,
            new String [] {
                "Nombre", "Apellido ", "Edad", "Telefono","Id"
            }
        ));
    
        
        
     
    }

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {
    	 txtEditarNombre.setText(Nombre);
         txtEditarApellido.setText(Apellido);
         txtEditarEdad.setText(Edad);
         txtEditarTelefono.setText(Telefono);
          txtEditarId.setText(Id);
    	

        
    }

    private void BtnTerminarEdicionActionPerformed(java.awt.event.ActionEvent evt) {
      
        
        
        try{

   			Class.forName("com.mysql.jdbc.Driver").newInstance();

   			String ruta="jdbc:mysql://localhost:3306/ListaPersona";

   			Connection conexion= DriverManager.getConnection(ruta, "root","");
   			conexion.setAutoCommit(false);
   			Statement st= conexion.createStatement();
   			String actualizar ="UPDATE persona SET Id='"+txtEditarId.getText()+"', Nombre='"+txtEditarNombre.getText()+"', Apellido='"+txtEditarApellido.getText()+"', Edad='"+txtEditarEdad.getText()+"' , Telefono='"+txtEditarTelefono.getText()+"' where Id='"+txtEditarId.getText()+"'";
   			st.executeUpdate(actualizar);


            conexion.commit();
   			st.close();
   			conexion.close();
   	
        }catch(Exception ex){
               
   			System.out.println("Te falla algo:"+ex.getMessage());
   	} 

        for(int i=0;i<lista.size();i++){
            if(txtEditarId.getText()==lista.get(i).getId()){
                
                lista.get(i).setNombre(txtEditarNombre.getText());
                lista.get(i).setApellido(txtEditarApellido.getText());
                lista.get(i).setEdad(txtEditarEdad.getText());
                lista.get(i).setTelefono(txtEditarTelefono.getText());
                lista.get(i).setId(txtEditarId.getText());
                
            }
        }
        
        txtEditarNombre.setText("");
        txtEditarApellido.setText("");
        txtEditarEdad.setText("");
        txtEditarTelefono.setText("");
        txtEditarId.setText("");
        
        
 String Matriz[][]=new String[lista.size()][5];
      
      for(int i=0;i<lista.size();i++){
          Matriz[i][0]=lista.get(i).getNombre();
           Matriz[i][1]=lista.get(i).getApellido();
           Matriz[i][2]=lista.get(i).getEdad();
           Matriz[i][3]=lista.get(i).getTelefono();
            Matriz[i][4]=lista.get(i).getId();
      }
     
    
        jTablePersona.setModel(new javax.swing.table.DefaultTableModel(
           Matriz,
            new String [] {
                "Nombre", "Apellido ", "Edad", "Telefono","Id"
            }
           
       
        ));  
        
        
        
        
    
        
        
        
    }
   public void Mostrar(){
      
        String Matriz[][]=new String[lista.size()][5];
      
      for(int i=0;i<lista.size();i++){
          Matriz[i][0]=lista.get(i).getNombre();
           Matriz[i][1]=lista.get(i).getApellido();
           Matriz[i][2]=lista.get(i).getEdad();
           Matriz[i][3]=lista.get(i).getTelefono();
           Matriz[i][4]=lista.get(i).getId();
      }
      
      
        jTablePersona.setModel(new javax.swing.table.DefaultTableModel(
           Matriz,
            new String [] {
                "Nombre", "Apellido ", "Edad", "Telefono","id"
            }
        ));
  }
   
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnEditar;
    private javax.swing.JToggleButton BtnEliminar;
    private javax.swing.JToggleButton BtnRegistrar;
    private javax.swing.JToggleButton BtnTerminarEdicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePersona;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEditarApellido;
    private javax.swing.JTextField txtEditarEdad;
    private javax.swing.JLabel txtEditarId;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtEditarTelefono;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
