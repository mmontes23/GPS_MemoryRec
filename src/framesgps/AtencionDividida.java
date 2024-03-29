/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framesgps;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.JButton;

/**
 *
 * @author ERIK
 */
public class AtencionDividida extends javax.swing.JFrame {
    char c;
    int a;
    //Creacion de arreglos para valores y para strings
    char[] valor= new char[9];
    int[] valorint = new int[9];
    String[]valors= new String[9];
    String[]valorints= new String[9];
    
    int cont=0;
    
    //variables boton para el metodo revisar
    JButton pres;
    JButton seg;
    
    //contador de aciertos
    int aciertos = 0;
    /**
     * Creates new form AtencionDividida
     */
    //creacion del objeto de la clase interact
    Interact inter = new Interact();
    //objeto de menu
    Menu men;
    //reproductor de sonido
    Player pl = new Player();
    //contador de errores
    int errores = 0;
    
    public AtencionDividida() {
        initComponents();
        //declaracion de objeto imagen 
        Imagen im = new Imagen();
        
        //declaracion de objetos random
        Rand ra = new Rand();
        Random rnd = new Random();
        
        //informacion del frame
        this.setLocationRelativeTo(null);
        this.setTitle("Atencion dividida");
        im.setIconGeneral(this);
        
        
        //Creacion de lista de caracteres, se llena con las letras de A a Z
        List<Character> sequence = new ArrayList<>();
       for (char c = 'A' ; c <= 'Z' ; c++) {
       sequence.add(c);
        }
       //la lista se reacomoda en orden aleatorio y 
       //al arreglo valor se le asignan los primeros valores de 
       //la lista sequence
       /*
       si no funciona descomenta esto
        for (int i = 0; i < 9; i++) {
            valor[i] = sequence.get(i);
        }*/
        Collections.shuffle(sequence);
        for (int i = 0; i < 9; i++) {
            valor[i] = sequence.get(i);
        }
        
        //Se crea un set de int al que se le asignan valores random entre 1 y 9
        Set<Integer>set = new LinkedHashSet<Integer>();
        while (set.size() < 9) {
         set.add(rnd.nextInt(9)+1);
      }
        
        //el set se convierte en un arreglo
       valorint = set.stream().mapToInt(Integer::intValue).toArray();;
       
       //los elementos de valor se convierten en string y se asignan a valors
        for (int i = 0; i < 9; i++) {
            jTable1.setValueAt(valor[i], 0, i);
            valors[i]=valor[i]+"";
        }
        
        //los elementos de valorint se convierten en string 
        //y se asignan a valorints
        for (int i = 0; i < 9; i++) {
            jTable1.setValueAt(valorint[i], 1, i);
            valorints[i]=valorint[i]+"";
        }
        //-----------------------------------------------------------------------
        //arreglo de botones para las letras que irán en la izquiera
        JButton [] botonesL = {boton1,boton2,boton3,boton4,
                              boton5,boton6,boton7,boton8,
                              boton9};
        
        //un arreglo de enteros que recibe valores aleatorios del 1 al 9
        int [] posicionesL = ra.getNumeros(9);
        
        im.setTextBoton(posicionesL, valors, botonesL);
        
        //arreglo de botones para los numeros que irán en la derecha
        JButton [] botonesN = {boton10,boton11,boton12,boton13,
                              boton14,boton15,boton16,boton17,
                              boton18};
        
        //un arreglo de enteros que recibe valores aleatorios del 1 al 9
        int [] posicionesN = ra.getNumeros(9);
        //llamada al metodo para escribir texto en los botones aleatoriamente
        im.setTextBoton(posicionesN, valorints, botonesN);
        //---------------------------------------------------------------------------
         
        //tamaño de los renglones de la tabla
        jTable1.setRowHeight(60);
        //nombre del frame
        String menu = "BotonMenu.png";
        //posicionamiento de la imagen en el boton del menú
        im.setImageBoton(194,60,menu, botonMenu);
        //cambio de color del frame
        Color color = new Color(102, 189, 230);
        getContentPane().setBackground(color);
    }
    
    public void Revisa(JButton but){
        //reproduccion del audio "click"
        pl.click();
        //variable boolean para el resultado de las comáraciones
        boolean espareja;
         
        if(cont==0){
            //variable pres igualada al boton que recibe como argumento
            pres = but;
            //el boton presionado se desactiva
            pres.setEnabled(false);
            //el contador aumenta
            cont++;
        }
        else{
            //variable pres igualada al boton que recibe como argumento
            seg = but;
            //el boton presionado se desactiva
            seg.setEnabled(false);
            //llamada al metodo esPareja enviando ambos arreglos de string
            //y los textos de ambos botones presionados
            espareja = inter.getPareja(valors, valorints, pres.getText(), seg.getText());
            
            if(espareja){
                //reproduccion del audio acierto
                pl.acierto();
                //aumenta el contador de aciertos
                aciertos++;
                
                if(aciertos==9){
                    //reproduccion del sonido de victoria
                    pl.victoria();
                }
            }
            else{
                //reproduccion del sonido de error
                pl.error();
                //aumento de contador de errores y su muestra en la label
                errores++;
                this.jLabel3.setText("Errores: "+errores);
            }
            //cont reseteado a 0
            inter.accPareja(espareja, pres, seg);
            cont = 0;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonMenu = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        boton17 = new javax.swing.JButton();
        boton18 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 659));
        setPreferredSize(new java.awt.Dimension(800, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 95, 611, 140));

        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(botonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 194, 60));

        boton3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton3.setText("jButton4");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 149, 32));

        boton4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton4.setText("jButton5");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 149, 32));

        boton5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton5.setText("jButton6");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 149, 32));

        boton6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton6.setText("jButton7");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 149, 32));

        boton7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton7.setText("jButton8");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 149, 32));

        boton8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton8.setText("jButton9");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 149, 32));

        boton9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton9.setText("jButton10");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 149, 33));

        boton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton1.setText("jButton2");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 149, 32));

        boton2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton2.setText("jButton3");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 149, 32));

        boton10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton10.setText("jButton9");
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });
        getContentPane().add(boton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 130, 32));

        boton11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton11.setText("jButton10");
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });
        getContentPane().add(boton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, 130, 33));

        boton12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton12.setText("jButton2");
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });
        getContentPane().add(boton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 130, 32));

        boton13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton13.setText("jButton3");
        boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton13ActionPerformed(evt);
            }
        });
        getContentPane().add(boton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 130, 32));

        boton14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton14.setText("jButton4");
        boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton14ActionPerformed(evt);
            }
        });
        getContentPane().add(boton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 130, 32));

        boton15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton15.setText("jButton5");
        boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton15ActionPerformed(evt);
            }
        });
        getContentPane().add(boton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 130, 32));

        boton16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton16.setText("jButton6");
        boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton16ActionPerformed(evt);
            }
        });
        getContentPane().add(boton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 130, 32));

        boton17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton17.setText("jButton7");
        boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton17ActionPerformed(evt);
            }
        });
        getContentPane().add(boton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 130, 32));

        boton18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton18.setText("jButton8");
        boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton18ActionPerformed(evt);
            }
        });
        getContentPane().add(boton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 130, 32));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Segun la tabla");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("empareja cada letra con su numero");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel3.setText("Errores: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        //reproduccion del sonido de click
        pl.click();
        //escribir en el arcivo el nombre de la actividad y cantidad de errores
        inter.setRanking("At_Dividida",errores);
        //regresar al menú
        men = new Menu();
        inter.back(men, this);
    }//GEN-LAST:event_botonMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed
 
    /*todos los botones siguientes llaman al metodo Revisa enviando como
    argumento el boton que es presionado*/
    
    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        Revisa(boton1);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        Revisa(boton2);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        Revisa(boton3);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        Revisa(boton4);
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        Revisa(boton5);
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        Revisa(boton6);
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        Revisa(boton7);
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        Revisa(boton8);
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        Revisa(boton9);
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        Revisa(boton12);
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
        Revisa(boton13);
    }//GEN-LAST:event_boton13ActionPerformed

    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
        Revisa(boton14);
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
        Revisa(boton15);
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton16ActionPerformed
        Revisa(boton16);
    }//GEN-LAST:event_boton16ActionPerformed

    private void boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton17ActionPerformed
        Revisa(boton17);
    }//GEN-LAST:event_boton17ActionPerformed

    private void boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton18ActionPerformed
        Revisa(boton18);
    }//GEN-LAST:event_boton18ActionPerformed

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
        Revisa(boton10);
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        Revisa(boton11);
    }//GEN-LAST:event_boton11ActionPerformed

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
            java.util.logging.Logger.getLogger(AtencionDividida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtencionDividida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtencionDividida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtencionDividida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtencionDividida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton17;
    private javax.swing.JButton boton18;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
