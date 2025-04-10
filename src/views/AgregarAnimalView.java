
package views;

import domain.Carnivoro;
import domain.Especie;
import domain.Herbivoro;
import domain.Mamifero;
import domain.Pais;
import domain.Sector;
import domain.TipoAlimentacion;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AgregarAnimalView extends javax.swing.JFrame {

 
    public AgregarAnimalView() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fillComboBox();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        txt_edad = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        cb_especie = new javax.swing.JComboBox<>();
        cb_sector = new javax.swing.JComboBox<>();
        cb_pais = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        label_tipo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_alimento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel1.setText("Agregar Animal");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Edad:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Peso:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Especie:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Sector:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Pais:");

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        txt_peso.setMinimumSize(new java.awt.Dimension(95, 22));

        cb_especie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_especie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_especieActionPerformed(evt);
            }
        });

        cb_sector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tipo:");

        label_tipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Alimento fijo:");

        txt_alimento.setMinimumSize(new java.awt.Dimension(95, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_peso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_sector, javax.swing.GroupLayout.Alignment.LEADING, 0, 95, Short.MAX_VALUE)
                            .addComponent(cb_especie, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_edad)
                            .addComponent(cb_pais, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(label_tipo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_alimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 192, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(189, 189, 189))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_salir)
                                .addGap(18, 18, 18)
                                .addComponent(btn_guardar)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_especie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(label_tipo))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_sector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_alimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_especieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_especieActionPerformed
        this.setTipo();
    }//GEN-LAST:event_cb_especieActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (this.camposCompletos()) {
            try {
                this.guardarAnimal();
                JOptionPane.showMessageDialog(this, "Animal cargado correctamente");
                this.vaciarCampos();
            } catch (InvalidPropertiesFormatException ex) {
                Logger.getLogger(AgregarAnimalView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else JOptionPane.showMessageDialog(this, "Asegurate que todos los campos esten completos");
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void fillComboBox(){
        cb_especie.removeAllItems();
        cb_pais.removeAllItems();
        cb_sector.removeAllItems();
        ArrayList<Especie> especies = Controlador.getEspecies();
        ArrayList<Sector> sectores = Controlador.getSectores();
        ArrayList<Pais> paises = Controlador.getPaises();
        
        for (Especie especy : especies) {
            cb_especie.addItem(especy.getNombre());
        }
//        for (Sector sector : sectores) {
//            cb_sector.addItem(""+sector.getNumero());
//        }
        
        for (Pais pais : paises) {
            cb_pais.addItem(pais.getNombre());
        }
        
//        cb_especie.addActionListener(x -> {
//            String especie = (String) cb_especie.getSelectedItem();
//            Especie e = null;
//            for (Especie especy : especies) {
//                if(especy.getNombre().equals(especie)) e=especy;
//            }
//            
//            cb_sector.removeAllItems();
//            
//            for(Sector sec : sectores){
//                if (sec.getTipoAlimentacion() == e.getTipoAlimentacion()) {
//                    cb_sector.addItem(""+sec.getNumero());
//                }
//            }
//            
//        });  
    }
    
    public int getEdad() {
        try {
            return Integer.parseInt(txt_edad.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números enteros para la edad.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
    
    public double getPeso() {
        try {
            return Double.parseDouble(txt_peso.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el peso.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public Especie getEspecie(){
        //return (String)cb_especie.getSelectedItem();
        String especie =(String)cb_especie.getSelectedItem();
        ArrayList<Especie> especies = Controlador.getEspecies();
        
        for (Especie e : especies) {
            if (e.getNombre().equals(especie)) {
                return e;
            }
        }
        return null;
    }
    
    public Sector getSector(){
        ArrayList<Sector> sectores = Controlador.getSectores();
        int sector = Integer.parseInt(""+cb_sector.getSelectedItem());
        
        for (Sector sec : sectores) {
            if(sec.getNumero() == sector) return sec;
        }
        
        return null;
    }
    
    public Pais getPais(){
        return new Pais((String)cb_pais.getSelectedItem());
    }
    
    public double getAlimentoFijo(){
        Double alimento = 0.0;
        if(this.getEspecie().getTipoAlimentacion().esHerbivoro()) alimento=Double.parseDouble(txt_alimento.getText());
        return alimento ;
    }
    
    public void setTipo(){
        Especie e = this.getEspecie();
        ArrayList<Sector> sectores = Controlador.getSectores();
        if (e == null || e.getTipoAlimentacion() == null) {
            label_tipo.setText("");
            return;
        }
        if (e.getTipoAlimentacion().esCarnivoro()) {
            label_tipo.setText("CARNIVORO");
            txt_alimento.setEnabled(false);
            txt_alimento.setText("");
            
            cb_sector.removeAllItems();
            for(Sector sec : sectores){
                if (sec.getTipoAlimentacion() == e.getTipoAlimentacion()) {
                    cb_sector.addItem(""+sec.getNumero());
                }
            }
        }
        if (e.getTipoAlimentacion().esHerbivoro()) {
            label_tipo.setText("HERBIVORO");
            txt_alimento.setEnabled(true);
            
            cb_sector.removeAllItems();
            for(Sector sec : sectores){
                if (sec.getTipoAlimentacion() == e.getTipoAlimentacion()) {
                    cb_sector.addItem(""+sec.getNumero());
                }
            }
        }  
    }
    
    public void vaciarCampos(){
        txt_edad.setText("");
        txt_peso.setText("");
        txt_alimento.setText("");
        cb_especie.setSelectedIndex(0);
        cb_sector.setSelectedIndex(0);
        cb_pais.setSelectedIndex(0);
    }
    
    public boolean camposCompletos(){
        if(this.getEspecie().getTipoAlimentacion() == TipoAlimentacion.HERBIVORO) return !txt_edad.getText().equals("") && !txt_peso.getText().equals("") && !txt_alimento.getText().equals("") && getPeso()!=-1 && getEdad()!=-1;
        else return !txt_edad.getText().equals("") && !txt_peso.getText().equals("") && getPeso()!=-1 && getEdad()!=-1;
    }
    
    public void guardarAnimal() throws InvalidPropertiesFormatException{
        Mamifero m;
        
        if(this.getEspecie().getTipoAlimentacion().esCarnivoro()){
            m = new Carnivoro(this.getEdad(),this.getPeso(),this.getEspecie(),this.getSector(),this.getPais());  
        }
        else{
            m = new Herbivoro(this.getEdad(), this.getPeso(), this.getEspecie(), this.getSector(), this.getAlimentoFijo(), this.getPais());
        }
        
        Controlador.guardarAnimales(m);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cb_especie;
    private javax.swing.JComboBox<String> cb_pais;
    private javax.swing.JComboBox<String> cb_sector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_tipo;
    private javax.swing.JTextField txt_alimento;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_peso;
    // End of variables declaration//GEN-END:variables

}
