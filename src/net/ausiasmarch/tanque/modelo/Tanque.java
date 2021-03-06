/*
 * Tanque.java
 */
package net.ausiasmarch.tanque.modelo;

/**
 * Clase que representa un Tanque de agua
 * @author  Luis
 */
public class Tanque extends javax.swing.JPanel {

   EstadoTanque estado;
    /**
     * Crea un tanque de agua
     */
    public Tanque() 
    {
        
        initComponents();
        estado = EstadoTanque.VACIO;
        jLabelVacio.setVisible(true);
        jLabelMedio.setVisible(false);
        jLabelLleno.setVisible(false);

    }
    /*llena el tanque dependiendo de  si ... est� vacio lo pone medio, y si est� medio lo pone lleno */
    public void llenarMedio ()
    {
    
       switch (estado)
        {
          case VACIO:
            
            jLabelVacio.setVisible(false);
            jLabelMedio.setVisible(true);
            jLabelLleno.setVisible(false);
             estado = EstadoTanque.MEDIO;
            break;
                
          case MEDIO:
            
            jLabelVacio.setVisible(false);
            jLabelMedio.setVisible(true);
            jLabelLleno.setVisible(false);
            estado = EstadoTanque.LLENO;
              
        }
    
    }
    /* vacia el tanque dependiendo de ... si est� LLENO lo pone a MEDIO, y si est� MEDIO lo pone VACIO.*/

    public void vaciarMedio ()
    {
        
       switch (estado)
        {
          case LLENO:
            
            jLabelVacio.setVisible(false);
            jLabelMedio.setVisible(false);
            jLabelLleno.setVisible(true);
             estado = EstadoTanque.MEDIO;
            break;
                
          case MEDIO:
            
            jLabelVacio.setVisible(false);
            jLabelMedio.setVisible(true);
            jLabelLleno.setVisible(false);
            estado = EstadoTanque.VACIO;
       }      
    }
 
    public EstadoTanque
            
    
    
    
    
    
    

    
     /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLleno = new javax.swing.JLabel();
        jLabelMedio = new javax.swing.JLabel();
        jLabelVacio = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/tanque/img/Lleno.png"))); // NOI18N
        add(jLabelLleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/tanque/img/Medio.png"))); // NOI18N
        add(jLabelMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/tanque/img/Vacio.png"))); // NOI18N
        add(jLabelVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLleno;
    private javax.swing.JLabel jLabelMedio;
    private javax.swing.JLabel jLabelVacio;
    // End of variables declaration//GEN-END:variables
}
