/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package framesgps;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author mgarc
 */
public class MemoriaSemantica2 extends javax.swing.JFrame {

    /**
     * CreatesMemoriaSemantica2rm Colores
     */
    //Se crean los objetos de las clases a usar
    Menu men;
    Interact inter = new Interact();
    Player pl = new Player();
    Rand ra = new Rand();
    Imagen im = new Imagen();
    //Se crean los objetos a usar
    JButton [] botImg = new JButton[5];
    JButton [] botCol;
    JButton pres;
    JButton seg;
    boolean seleccionando = false;
    int [] vals;
    int cont = 0;
    int gen = 0;
    int aciertos = 0;
    int errores = 0;
    
    public MemoriaSemantica2() {
        initComponents();
        //Se establecen los valores del frame
        this.setLocationRelativeTo(null);   //Centrar
        this.setTitle("Memoria Semantica2");    //Titulo
        im.setIconGeneral(this);    //Icono
        
        int[] rand = ra.getNumeros(5);  //Array de valores aleatorios entre 1-5
        
        vals = rand;    //Uso global
        
        //Se crea el color de fondo
        Color color = new Color(102, 189, 230);
        getContentPane().setBackground(color);  //Se establece el color de fondo
        
        //Se crea un arreglo con los nombres de imagen a usar
        String [] noms = {"diente.png","flor.png","estrella.png","arbol.png","manzana.png"};
        
        //Se crea un arreglo con los botones a usar para imagenes
        JButton [] bots = {jButton1,jButton2,jButton3,jButton4,jButton5};
        
        botImg = bots;  //Uso global
        
        //Se crea un arreglo para los botones a usar para colores
        JButton [] col = {jButton6,jButton7,jButton8,jButton9,jButton10,jButton11,jButton12};
        
        botCol = col;   //Uso global
        
        //Se establecen los iconos de los botones
        im.setIconBoton(rand, noms, bots, 200,150);
        
        //Se establece el icono del boton menu
        im.setImageBoton(200, 100, "BotonMenu.png", jButton13);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton6.setBackground(new java.awt.Color(255, 153, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 204, 0));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 102, 255));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 0, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 0));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(102, 0, 204));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton13.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel1.setText("Errores:");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        pl.click(); //Sonido de click
        inter.setRanking("Colores", errores);   //Se guarda el ranking
        men = new Menu();   //Se inicializa el menu
        inter.back(men,this);   //Se abre menu, se cierra este frame
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        presBotonColor(jButton11);  //Se verifica la presión de un botón de color
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);   //Se deshabilitan los botones restantes
            }
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       presBoton(jButton1);  //Se verifica la presión de un botón de imagen
       if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        presBotonColor(jButton7);  //Se verifica la presión de un botón de color
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        presBotonColor(jButton6);  //Se verifica la presión de un botón de color
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        presBotonColor(jButton9);  //Se verifica la presión de un botón de color
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        presBotonColor(jButton10);  //Se verifica la presión de un botón de color
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        presBotonColor(jButton8);  //Se verifica la presión de un botón de color
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        presBotonColor(jButton12);  //Se verifica la presión de un botón de color
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        presBoton(jButton2);  //Se verifica la presión de un botón de imagen
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        presBoton(jButton3);  //Se verifica la presión de un botón de imagen
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        presBoton(jButton4);  //Se verifica la presión de un botón de imagen
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        presBoton(jButton5);  //Se verifica la presión de un botón de imagen
        if(aciertos==5){    //Si los acietos son 5
            pl.victoria();  //Sonido de victoria
            JOptionPane.showMessageDialog(rootPane, "BUEN TRABAJO!!");  //Mensaje
            for(int i=0;i<botCol.length;i++){
                botCol[i].setEnabled(false);    //Se deshabilitan los botones restantes
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    //Metodo para verificar presion de boton de color
    public void presBotonColor(JButton but){
        pl.click(); //Sonido de click
        boolean espareja;
        if(cont==0){    //Si no hay botones presionados
            pres = but; //Se establece como el primer boton presionado
            pres.setEnabled(false); //Se deshabilita
            cont++; //Se aumenta el contador de botones presionados
        }
        else{   //Si ya hay botones presionados
            seg = but;  //Se establece como el segundo
            seg.setEnabled(false);  //Se deshabilita
            //Revisa si los botones se corresponden, siendo el color un valor de posición y el otro
            //valor debe hacer referencia a un botón de imagen y devolver su valor en vals
            espareja = inter.getColorCorr(inter.getPosBoton(botCol, seg),vals[inter.getPosBoton(botImg, pres)]);
            if(espareja){   //Si son pareja
                pl.acierto();   //Sonido de acierto
                aciertos++; //Aumentan los aciertos
            }
            else{
                pl.error(); //Sonido de error
                errores++;  //Aumenan los errores
                this.jLabel2.setText(errores+"");   //Se escriben los errores
            }
            inter.accPareja(espareja, pres, seg);   //Se habilitan o deshabilitan los botones
            cont = 0;   //Se devuelve el contador a 0
        }
    }
    
    //Metodo para verificar presion de botón de imagen
    public void presBoton(JButton but){
        pl.click(); //Sonido de click
        boolean espareja;
        if(cont==0){    //Si no hay botones presionados
            pres = but; //Se establece como el primer boton presionado
            pres.setEnabled(false); //Se deshabilita
            cont++; //Se aumenta el contador de botones presionados
        }
        else{   //Si ya hay botones presionados
            seg = but;  //Se establece como el segundo
            seg.setEnabled(false);  //Se deshabilita
            cont++; //Se aumenta el contador de botones presionados
            //Revisa si los botones se corresponden, siendo el color un valor de posición y el otro
            //valor debe hacer referencia a un botón de imagen y devolver su valor en vals
            espareja = inter.getColorCorr(inter.getPosBoton(botCol, pres),vals[inter.getPosBoton(botImg, seg)]);
            if(espareja){   //Si son pareja
                pl.acierto();   //Sonido de acierto
                aciertos++; //Aumentan los aciertos
            }
            else{
                pl.error(); //Sonido de error
                errores++;  //Aumenan los errores
                this.jLabel2.setText(errores+"");   //Se escriben los errores
            }
            inter.accPareja(espareja, pres, seg);   //Se habilitan o deshabilitan los botones
            cont = 0;   //Se devuelve el contador a 0
        }
    }
    /*
    public void parejaColor(){
        switch(color)
    }
      */  
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
            java.util.logging.Logger.getLogger(MemoriaSemantica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoriaSemantica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoriaSemantica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoriaSemantica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoriaSemantica2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
