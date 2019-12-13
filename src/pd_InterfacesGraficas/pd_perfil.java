/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_InterfacesGraficas;

/**
 *
Propiedad: Colectiva de uso gratuito público
Desarrollado por: Sebastian Viscarra, Autor y compilador del proyecto PX para red social discreta de aplicación.
Todo el contenido de esta aplicación excepto los logos de PD y PX design son 100% editables para todo el desarrollo colectivo de cualquier usuario de información.
Así como su libre edición y utilización es 100% responsabilidad de cada usuario como utilice o mal utilice esta plataforma para fines comerciales o lucrativos. 
El contenido de esta plataforma está disponible desde su origen de forma libre y gratuita y de ser vendido o redistribuido por usuarios externos que no den soporte a sus clientes, 
PD y PX design no se hace responsable de dar soporte a ningún usuario que haya obtenido esta plataforma desde otro medio. 
Usted puede aprender como realizar esta plataforma desde su origen hasta su final de forma pratica 100% gratuita en el siguiente enlace:
https://www.youtube.com/watch?v=nqPzNS-pARY&list=PLshdAl3NxgtfaAB1Ef2I4McKfEulp6P9i
 */
public class pd_perfil extends javax.swing.JPanel {

    /**
     * Creates new form pd_perfil
     */
    public pd_perfil() {
        initComponents();
         UPgrade3.setVisible(false);     //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
         PanelUpgrade.setVisible(false);     //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
         jButton7.setVisible(false);   //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
         desplegablePerfil.setVisible(false); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }

    
    /////////////INSTANCIAS ////////////////
    //////// INTERFACES DE PLATAFORMA /////////////
    pd_InterfacesGraficas_Performance.PerformanceAmigos Pf_amigos = new pd_InterfacesGraficas_Performance.PerformanceAmigos();
    pd_InterfacesGraficas_Performance.PerformanceInsignias Pf_insignias = new pd_InterfacesGraficas_Performance.PerformanceInsignias();
    pd_InterfacesGraficas_Performance.PerformancePortafolio Pf_portafolio = new pd_InterfacesGraficas_Performance.PerformancePortafolio();
    pd_InterfacesGraficas_Performance.PerformanceTienda Pf_tienda = new pd_InterfacesGraficas_Performance.PerformanceTienda();
    //////////////// Interfaces graficas /////////////////
    //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    //// Comentario: este tag esta añadido a las ordenes que estan relacionadas con el contenido grafico de la aplicacion
    //// y no obstaculiza ninguna logica ni metodo en este programa
    
   // Metodos de Visualizacion de Interfaces de la plataforma
   // comentario: estos metodos solo visualizan contenido grafico de interfaces externas.
    void MostrarInterface_pf_amigos(){
   
        panelPerformanceGeneral.add(Pf_amigos);
        panelPerformanceGeneral.repaint();
        panelPerformanceGeneral.updateUI();
        panelPerformanceGeneral.revalidate();
        Pf_amigos.setVisible(true);
         
         
   
   }  //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    void MostrarInterface_pf_insignias(){
   
        panelPerformanceGeneral.add(Pf_insignias);
        panelPerformanceGeneral.repaint();
        panelPerformanceGeneral.updateUI();
        panelPerformanceGeneral.revalidate();
        Pf_insignias.setVisible(true);
         
         
   
   }  //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    void MostrarInterface_pf_portafolio(){
   
        panelPerformanceGeneral.add(Pf_portafolio);
        panelPerformanceGeneral.repaint();
        panelPerformanceGeneral.updateUI();
        panelPerformanceGeneral.revalidate();
        Pf_portafolio.setVisible(true);
         
         
   
   }  //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    void MostrarInterface_pf_TIENDA(){
   
        panelPerformanceGeneral.add(Pf_tienda);
        panelPerformanceGeneral.repaint();
        panelPerformanceGeneral.updateUI();
        panelPerformanceGeneral.revalidate();
        Pf_tienda.setVisible(true);
         
         
   
   }  //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    
    
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelPerfil_Scroll = new javax.swing.JScrollPane();
        PanelPefil_General = new javax.swing.JPanel();
        panelPerfil_seccion1 = new javax.swing.JPanel();
        panel_usuario = new javax.swing.JPanel();
        Insignia = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JLabel();
        avatar = new com.bolivia.label.CLabel();
        btnYoutube = new javax.swing.JButton();
        btnInst = new javax.swing.JButton();
        btnTwit = new javax.swing.JButton();
        btnTogle = new javax.swing.JButton();
        btnGit = new javax.swing.JButton();
        btnProyectos = new javax.swing.JButton();
        btnContacto = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnFace = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAgregarAmigo = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        desplegablePerfil = new javax.swing.JPanel();
        btnValorar = new javax.swing.JButton();
        btnReportar = new javax.swing.JButton();
        txtCategoriaDeNivel = new javax.swing.JLabel();
        txtNivel = new javax.swing.JLabel();
        txtprofesion = new javax.swing.JLabel();
        st4_OFF = new javax.swing.JLabel();
        st3_OFF = new javax.swing.JLabel();
        st5_OFF = new javax.swing.JLabel();
        st2_ON = new javax.swing.JLabel();
        st1_ON = new javax.swing.JLabel();
        txtIdentidad = new javax.swing.JLabel();
        CTDvaloraciones = new javax.swing.JLabel();
        contenedorInferior = new javax.swing.JLabel();
        contenedorPrinipal = new javax.swing.JLabel();
        CTDseguidores = new javax.swing.JLabel();
        CTDamigos = new javax.swing.JLabel();
        txtamigos = new javax.swing.JLabel();
        txtvaloraciones = new javax.swing.JLabel();
        txtseguidores = new javax.swing.JLabel();
        contenedorSuperior = new javax.swing.JLabel();
        contenedorInferior2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelPerformanceGeneral = new javax.swing.JPanel();
        PanelUpgrade = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        PanelUpgrade2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        banersUPgrade3 = new javax.swing.JLabel();
        UPgrade3 = new javax.swing.JPanel();

        PanelPrincipal.setBackground(new java.awt.Color(204, 51, 0));

        PanelPerfil_Scroll.setBorder(null);
        PanelPerfil_Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        PanelPefil_General.setBackground(new java.awt.Color(28, 28, 28));

        panelPerfil_seccion1.setBackground(new java.awt.Color(0, 204, 153));
        panelPerfil_seccion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPerfil_seccion1MouseEntered(evt);
            }
        });

        panel_usuario.setBackground(new java.awt.Color(34, 34, 34));
        panel_usuario.setOpaque(false);
        panel_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_usuarioMouseEntered(evt);
            }
        });
        panel_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Insignia.setBackground(new java.awt.Color(45, 45, 45));
        Insignia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insignia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/html5.png"))); // NOI18N
        Insignia.setOpaque(true);
        panel_usuario.add(Insignia, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 41, 70, 60));

        txtOcupacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOcupacion.setForeground(new java.awt.Color(153, 153, 153));
        txtOcupacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtOcupacion.setText("Empresa o ocupacion");
        panel_usuario.add(txtOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 300, -1));

        avatar.setBackground(new java.awt.Color(51, 51, 51));
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/Usuario.jpg"))); // NOI18N
        avatar.setText("");
        avatar.setLineColor(new java.awt.Color(34, 34, 34));
        panel_usuario.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 116, -1, -1));

        btnYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnYout1.png"))); // NOI18N
        btnYoutube.setBorder(null);
        btnYoutube.setBorderPainted(false);
        btnYoutube.setContentAreaFilled(false);
        btnYoutube.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnYout2.png"))); // NOI18N
        btnYoutube.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnYout2.png"))); // NOI18N
        panel_usuario.add(btnYoutube, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 40, 30));

        btnInst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnInsta1.png"))); // NOI18N
        btnInst.setBorder(null);
        btnInst.setBorderPainted(false);
        btnInst.setContentAreaFilled(false);
        btnInst.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnInsta2.png"))); // NOI18N
        btnInst.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnInsta2.png"))); // NOI18N
        panel_usuario.add(btnInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 40, 30));

        btnTwit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnTwiter1.png"))); // NOI18N
        btnTwit.setBorder(null);
        btnTwit.setBorderPainted(false);
        btnTwit.setContentAreaFilled(false);
        btnTwit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnTwiter2.png"))); // NOI18N
        btnTwit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnTwiter2.png"))); // NOI18N
        panel_usuario.add(btnTwit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 40, 30));

        btnTogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/desplegable1.png"))); // NOI18N
        btnTogle.setBorder(null);
        btnTogle.setBorderPainted(false);
        btnTogle.setContentAreaFilled(false);
        btnTogle.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/desplegable2.png"))); // NOI18N
        btnTogle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/desplegable2.png"))); // NOI18N
        btnTogle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTogleMouseEntered(evt);
            }
        });
        panel_usuario.add(btnTogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 35, 20, 20));

        btnGit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnGit1.png"))); // NOI18N
        btnGit.setBorder(null);
        btnGit.setBorderPainted(false);
        btnGit.setContentAreaFilled(false);
        btnGit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnGit2.png"))); // NOI18N
        btnGit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnGit2.png"))); // NOI18N
        panel_usuario.add(btnGit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 40, 30));

        btnProyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnProyecto1.png"))); // NOI18N
        btnProyectos.setBorder(null);
        btnProyectos.setBorderPainted(false);
        btnProyectos.setContentAreaFilled(false);
        btnProyectos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnProyecto2.png"))); // NOI18N
        btnProyectos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnProyecto2.png"))); // NOI18N
        panel_usuario.add(btnProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 310, 70, 60));

        btnContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnContacto1.png"))); // NOI18N
        btnContacto.setBorder(null);
        btnContacto.setBorderPainted(false);
        btnContacto.setContentAreaFilled(false);
        btnContacto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnContacto2.png"))); // NOI18N
        btnContacto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnContacto2.png"))); // NOI18N
        panel_usuario.add(btnContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 310, 70, 60));

        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnUsuario1.png"))); // NOI18N
        btnPrincipal.setBorder(null);
        btnPrincipal.setBorderPainted(false);
        btnPrincipal.setContentAreaFilled(false);
        btnPrincipal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnUsuario2.png"))); // NOI18N
        btnPrincipal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnUsuario2.png"))); // NOI18N
        panel_usuario.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 310, 70, 60));

        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnInventario1.png"))); // NOI18N
        btnInventario.setBorder(null);
        btnInventario.setBorderPainted(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnInventario2.png"))); // NOI18N
        btnInventario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnInventario2.png"))); // NOI18N
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        panel_usuario.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 310, 70, 60));

        btnFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnface1.png"))); // NOI18N
        btnFace.setBorder(null);
        btnFace.setBorderPainted(false);
        btnFace.setContentAreaFilled(false);
        btnFace.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnface2.png"))); // NOI18N
        btnFace.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/btnface2.png"))); // NOI18N
        panel_usuario.add(btnFace, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 40, 30));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/edit1.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/edit2.png"))); // NOI18N
        btnEdit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/edit2.png"))); // NOI18N
        panel_usuario.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 40, 30));

        btnAgregarAmigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/agregar1.png"))); // NOI18N
        btnAgregarAmigo.setBorder(null);
        btnAgregarAmigo.setBorderPainted(false);
        btnAgregarAmigo.setContentAreaFilled(false);
        btnAgregarAmigo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/agregar2.png"))); // NOI18N
        btnAgregarAmigo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/agregar2.png"))); // NOI18N
        panel_usuario.add(btnAgregarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 40, 30));

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/info1.png"))); // NOI18N
        btnInfo.setBorder(null);
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/info2.png"))); // NOI18N
        btnInfo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/info2.png"))); // NOI18N
        panel_usuario.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 30, 30));

        desplegablePerfil.setBackground(new java.awt.Color(51, 51, 51));
        desplegablePerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnValorar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/valorar1.jpg"))); // NOI18N
        btnValorar.setBorder(null);
        btnValorar.setBorderPainted(false);
        btnValorar.setContentAreaFilled(false);
        btnValorar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/valorar2.jpg"))); // NOI18N
        btnValorar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/valorar2.jpg"))); // NOI18N
        btnValorar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValorarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValorarMouseExited(evt);
            }
        });
        desplegablePerfil.add(btnValorar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 31));

        btnReportar.setBackground(new java.awt.Color(240, 240, 220));
        btnReportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/reportar1.jpg"))); // NOI18N
        btnReportar.setBorder(null);
        btnReportar.setBorderPainted(false);
        btnReportar.setContentAreaFilled(false);
        btnReportar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/reportar2.jpg"))); // NOI18N
        btnReportar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/reportar2.jpg"))); // NOI18N
        btnReportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportarMouseExited(evt);
            }
        });
        desplegablePerfil.add(btnReportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 30));

        panel_usuario.add(desplegablePerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, 60));

        txtCategoriaDeNivel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCategoriaDeNivel.setForeground(new java.awt.Color(51, 153, 255));
        txtCategoriaDeNivel.setText("Intermedio");
        panel_usuario.add(txtCategoriaDeNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, 20));

        txtNivel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNivel.setForeground(new java.awt.Color(102, 102, 102));
        txtNivel.setText("Nivel ");
        panel_usuario.add(txtNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 30, 20));

        txtprofesion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtprofesion.setForeground(new java.awt.Color(102, 102, 102));
        txtprofesion.setText("Diseñadora Web");
        panel_usuario.add(txtprofesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, 20));

        st4_OFF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st4_OFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/startOFF.png"))); // NOI18N
        panel_usuario.add(st4_OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 20, 20));

        st3_OFF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st3_OFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/startOFF.png"))); // NOI18N
        panel_usuario.add(st3_OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 40, 20));

        st5_OFF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st5_OFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/startOFF.png"))); // NOI18N
        panel_usuario.add(st5_OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 20, 20));

        st2_ON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st2_ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/startON.png"))); // NOI18N
        panel_usuario.add(st2_ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 20, 20));

        st1_ON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st1_ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/startON.png"))); // NOI18N
        panel_usuario.add(st1_ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 20, 20));

        txtIdentidad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtIdentidad.setForeground(new java.awt.Color(51, 153, 255));
        txtIdentidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIdentidad.setText("Identidad");
        panel_usuario.add(txtIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 215, 300, 30));

        CTDvaloraciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CTDvaloraciones.setForeground(new java.awt.Color(50, 186, 255));
        CTDvaloraciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CTDvaloraciones.setText("10");
        panel_usuario.add(CTDvaloraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 70, 30));

        contenedorInferior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedorInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/contenedorperfil2.png"))); // NOI18N
        panel_usuario.add(contenedorInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 400, 100));

        contenedorPrinipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedorPrinipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/contenedorperfil1.png"))); // NOI18N
        panel_usuario.add(contenedorPrinipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 310));

        CTDseguidores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CTDseguidores.setForeground(new java.awt.Color(50, 186, 255));
        CTDseguidores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CTDseguidores.setText("10");
        panel_usuario.add(CTDseguidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 60, 30));

        CTDamigos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CTDamigos.setForeground(new java.awt.Color(50, 186, 255));
        CTDamigos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CTDamigos.setText("10");
        panel_usuario.add(CTDamigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 60, 30));

        txtamigos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtamigos.setForeground(new java.awt.Color(255, 255, 255));
        txtamigos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtamigos.setText("Amigos");
        panel_usuario.add(txtamigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 80, 30));

        txtvaloraciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtvaloraciones.setForeground(new java.awt.Color(255, 255, 255));
        txtvaloraciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtvaloraciones.setText("Valoraciones");
        panel_usuario.add(txtvaloraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 90, 30));

        txtseguidores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtseguidores.setForeground(new java.awt.Color(255, 255, 255));
        txtseguidores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtseguidores.setText("Seguidores");
        panel_usuario.add(txtseguidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 80, 30));

        contenedorSuperior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedorSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/contenedorperfil2.png"))); // NOI18N
        panel_usuario.add(contenedorSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 120));

        contenedorInferior2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedorInferior2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/contenedorInferior2.png"))); // NOI18N
        panel_usuario.add(contenedorInferior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 320, 70));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/baner1.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/baner2.png"))); // NOI18N
        jButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/baner2.png"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/fondoDegradadoDer.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/fondoDegradadoIzq.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/fondoBanerPrueba4.jpg"))); // NOI18N

        javax.swing.GroupLayout panelPerfil_seccion1Layout = new javax.swing.GroupLayout(panelPerfil_seccion1);
        panelPerfil_seccion1.setLayout(panelPerfil_seccion1Layout);
        panelPerfil_seccion1Layout.setHorizontalGroup(
            panelPerfil_seccion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfil_seccion1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPerfil_seccion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPerfil_seccion1Layout.createSequentialGroup()
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 878, Short.MAX_VALUE)))
            .addGroup(panelPerfil_seccion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE))
            .addGroup(panelPerfil_seccion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE))
            .addGroup(panelPerfil_seccion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, Short.MAX_VALUE))
        );
        panelPerfil_seccion1Layout.setVerticalGroup(
            panelPerfil_seccion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfil_seccion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(panelPerfil_seccion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfil_seccion1Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(418, Short.MAX_VALUE)))
            .addGroup(panelPerfil_seccion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPerfil_seccion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPerfil_seccion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(28, 28, 28));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/seguidos1.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/seguidos2.png"))); // NOI18N
        jButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/seguidos2.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 8, 160, 85));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/seguidores1.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/seguidores2.png"))); // NOI18N
        jButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/seguidores2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 8, 189, 85));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/tienda1.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/tienda2.png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/tienda2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 8, 150, 85));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/portafolio1.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/portafolio2.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/portafolio2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 8, -1, 85));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/insignias1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/insignias2.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/insignias2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 8, 170, 85));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/amigos1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/amigos2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/amigos2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 8, 150, 85));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/barra.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 992, 100));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/edit1_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 70, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" Identidad Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 290, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("PERFORMANCE DE USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 320, 32));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelPerformanceGeneral.setBackground(new java.awt.Color(28, 28, 28));
        panelPerformanceGeneral.setLayout(new javax.swing.BoxLayout(panelPerformanceGeneral, javax.swing.BoxLayout.PAGE_AXIS));

        PanelUpgrade.setBackground(new java.awt.Color(204, 0, 153));
        PanelUpgrade.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N
        jButton8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Titulo el ImgArt");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/contenedorTransparenteDescripcion.png"))); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/ejemplo1correcto.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addGap(19, 19, 19)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 216, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 212, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 102));

        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N
        jButton9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Titulo del Img Art 2");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/contenedorTransparenteDescripcion.png"))); // NOI18N

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/ejemplo2correcto.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 211, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 212, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 153, 102));

        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N
        jButton10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Titulo del Art 3");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/contenedorTransparenteDescripcion.png"))); // NOI18N

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/ejemplo3correcto.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 213, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 212, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 153, 102));
        jPanel7.setPreferredSize(new java.awt.Dimension(0, 80));

        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N
        jButton11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/ejemplo4correcto.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 153, 102));

        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N
        jButton12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/ejemplo5correcto.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 153, 102));

        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N
        jButton13.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/btnImg.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/ejemplo6correcto.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PanelUpgradeLayout = new javax.swing.GroupLayout(PanelUpgrade);
        PanelUpgrade.setLayout(PanelUpgradeLayout);
        PanelUpgradeLayout.setHorizontalGroup(
            PanelUpgradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUpgradeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUpgradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelUpgradeLayout.setVerticalGroup(
            PanelUpgradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUpgradeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelUpgradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelUpgradeLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelUpgrade2.setBackground(new java.awt.Color(28, 28, 28));
        PanelUpgrade2.setLayout(null);

        jLabel20.setBackground(new java.awt.Color(28, 28, 28));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/marcoLamina2.png"))); // NOI18N
        PanelUpgrade2.add(jLabel20);
        jLabel20.setBounds(0, 0, 3000, 274);

        banersUPgrade3.setBackground(new java.awt.Color(28, 28, 28));
        banersUPgrade3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_UPgrade/banersAnimado.jpg"))); // NOI18N
        PanelUpgrade2.add(banersUPgrade3);
        banersUPgrade3.setBounds(1, 0, 4507, 280);

        javax.swing.GroupLayout UPgrade3Layout = new javax.swing.GroupLayout(UPgrade3);
        UPgrade3.setLayout(UPgrade3Layout);
        UPgrade3Layout.setHorizontalGroup(
            UPgrade3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        UPgrade3Layout.setVerticalGroup(
            UPgrade3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelPefil_GeneralLayout = new javax.swing.GroupLayout(PanelPefil_General);
        PanelPefil_General.setLayout(PanelPefil_GeneralLayout);
        PanelPefil_GeneralLayout.setHorizontalGroup(
            PanelPefil_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPerfil_seccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelUpgrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPefil_GeneralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPerformanceGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(UPgrade3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelUpgrade2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelPefil_GeneralLayout.setVerticalGroup(
            PanelPefil_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPefil_GeneralLayout.createSequentialGroup()
                .addComponent(panelPerfil_seccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelUpgrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UPgrade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelUpgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPerformanceGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelPerfil_Scroll.setViewportView(PanelPefil_General);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPerfil_Scroll)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPerfil_Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTogleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTogleMouseEntered
desplegablePerfil.setVisible(true);   //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*    
    }//GEN-LAST:event_btnTogleMouseEntered

    private void panelPerfil_seccion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPerfil_seccion1MouseEntered
desplegablePerfil.setVisible(false);   //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_panelPerfil_seccion1MouseEntered

    private void btnValorarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValorarMouseEntered
desplegablePerfil.setVisible(true);     //// TAG 1: *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnValorarMouseEntered

    private void btnReportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportarMouseEntered
desplegablePerfil.setVisible(true);       //// TAG 1: *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnReportarMouseEntered

    private void btnReportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportarMouseExited
desplegablePerfil.setVisible(false);        //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnReportarMouseExited

    private void btnValorarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValorarMouseExited
desplegablePerfil.setVisible(false);      //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnValorarMouseExited

    private void panel_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_usuarioMouseEntered

    }//GEN-LAST:event_panel_usuarioMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelPerformanceGeneral.removeAll();
        MostrarInterface_pf_amigos();   //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//PanelUpgrade.setVisible(true);   //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion* 
panelPerformanceGeneral.removeAll();
MostrarInterface_pf_insignias(); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion* 


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        panelPerformanceGeneral.removeAll();
        MostrarInterface_pf_portafolio();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
jButton7.setVisible(true);     //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
jButton7.setVisible(false);    //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_jLabel5MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
jButton7.setVisible(true);        //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_jButton7MouseEntered

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
                      
                                    // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    panelPerformanceGeneral.removeAll();
    //MostrarInterface_pf_TIENDA();
        
  pd_InterfacesGraficas_Performance.CrearTienda crear = new pd_InterfacesGraficas_Performance.CrearTienda(); 
  panelPerformanceGeneral.add(crear);
  panelPerformanceGeneral.revalidate();
  crear.setVisible(true);  
  
      
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

                // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CTDamigos;
    private javax.swing.JLabel CTDseguidores;
    private javax.swing.JLabel CTDvaloraciones;
    private javax.swing.JLabel Insignia;
    private javax.swing.JPanel PanelPefil_General;
    private javax.swing.JScrollPane PanelPerfil_Scroll;
    public static javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelUpgrade;
    private javax.swing.JPanel PanelUpgrade2;
    private javax.swing.JPanel UPgrade3;
    private com.bolivia.label.CLabel avatar;
    public static javax.swing.JLabel banersUPgrade3;
    private javax.swing.JButton btnAgregarAmigo;
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFace;
    private javax.swing.JButton btnGit;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInst;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnProyectos;
    private javax.swing.JButton btnReportar;
    private javax.swing.JButton btnTogle;
    private javax.swing.JButton btnTwit;
    private javax.swing.JButton btnValorar;
    private javax.swing.JButton btnYoutube;
    private javax.swing.JLabel contenedorInferior;
    private javax.swing.JLabel contenedorInferior2;
    private javax.swing.JLabel contenedorPrinipal;
    private javax.swing.JLabel contenedorSuperior;
    private javax.swing.JPanel desplegablePerfil;
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
    public static javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel panelPerfil_seccion1;
    public static javax.swing.JPanel panelPerformanceGeneral;
    private javax.swing.JPanel panel_usuario;
    private javax.swing.JLabel st1_ON;
    private javax.swing.JLabel st2_ON;
    private javax.swing.JLabel st3_OFF;
    private javax.swing.JLabel st4_OFF;
    private javax.swing.JLabel st5_OFF;
    private javax.swing.JLabel txtCategoriaDeNivel;
    private javax.swing.JLabel txtIdentidad;
    private javax.swing.JLabel txtNivel;
    private javax.swing.JLabel txtOcupacion;
    private javax.swing.JLabel txtamigos;
    private javax.swing.JLabel txtprofesion;
    private javax.swing.JLabel txtseguidores;
    private javax.swing.JLabel txtvaloraciones;
    // End of variables declaration//GEN-END:variables
}
