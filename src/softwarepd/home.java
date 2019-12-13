/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarepd;

import AppPackage.AnimationClass;
import java.awt.Color;
import pd_InterfacesGraficas.pd_perfil;



/**
Propiedad: Colectiva de uso gratuito público
Desarrollado por: Sebastian Viscarra, Autor y compilador del proyecto PX para red social discreta de aplicación.
Todo el contenido de esta aplicación excepto los logos de PD y PX design son 100% editables para todo el desarrollo colectivo de cualquier usuario de información.
Así como su libre edición y utilización es 100% responsabilidad de cada usuario como utilice o mal utilice esta plataforma para fines comerciales o lucrativos. 
El contenido de esta plataforma está disponible desde su origen de forma libre y gratuita y de ser vendido o redistribuido por usuarios externos que no den soporte a sus clientes, 
PD y PX design no se hace responsable de dar soporte a ningún usuario que haya obtenido esta plataforma desde otro medio. 
Usted puede aprender como realizar esta plataforma desde su origen hasta su final de forma pratica 100% gratuita en el siguiente enlace:
https://www.youtube.com/watch?v=nqPzNS-pARY&list=PLshdAl3NxgtfaAB1Ef2I4McKfEulp6P9i
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        
        ////////////// Interfaces Graficas /////////
        btnOcultarBarra.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
        panelNotificacionInferior.setVisible(false);//// TAG : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
        panelUsuarios.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
        panelComunidad.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
        BarraInfo.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
        notificacion2.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*

        ////////////// Interfaces Graficas /////////
   
        this.setLocationRelativeTo(null);
    }
    
    /////// INS /////////
   /// Interfaces ///////
   pd_InterfacesGraficas.pd_perfil perfil = new pd_InterfacesGraficas.pd_perfil();
   pd_InterfacesGraficas.pd_CarritoDeCompra carrito = new pd_InterfacesGraficas.pd_CarritoDeCompra();
   
    
    
    
    
    
    
    //////////////// Interfaces graficas /////////////////
    //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    //// Comentario: este tag esta añadido a las ordenes que estan relacionadas con el contenido grafico de la aplicacion
    //// y no obstaculiza ninguna logica ni metodo en este programa
   
    
   // Metodos de Visualizacion de Interfaces de la plataforma
   // comentario: estos metodos solo visualizan contenido grafico de interfaces externas.
   void MostrarInterface_pd_perfil(){
         panelPrincipal.removeAll();
         panelPrincipal.add(perfil);
         panelPrincipal.repaint();
         panelPrincipal.updateUI();
         panelPrincipal.revalidate();
         perfil.setVisible(true);
   
   }  //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
   void MostrarInterface_pd_CarritoDeCompra(){
         panelPrincipal.removeAll();
         panelPrincipal.add(carrito);
         panelPrincipal.repaint();
         panelPrincipal.updateUI();
         panelPrincipal.revalidate();
         carrito.setVisible(true);
   
   }  //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    
    
    
    
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        panelInferior = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        panelNotificaciones_superior = new javax.swing.JPanel();
        panelNotificacionInferior = new javax.swing.JPanel();
        intArticulo = new javax.swing.JLabel();
        intSolicitud = new javax.swing.JLabel();
        intMensaje = new javax.swing.JLabel();
        solicitudes = new javax.swing.JLabel();
        mensajes = new javax.swing.JLabel();
        articulos = new javax.swing.JLabel();
        btnSolicitudes = new javax.swing.JButton();
        btnMensajes = new javax.swing.JButton();
        btnArticulos = new javax.swing.JButton();
        PanelGeneralNavegacion = new javax.swing.JPanel();
        btn_categoria = new javax.swing.JButton();
        btn_emprendedores = new javax.swing.JButton();
        btn_inversionista = new javax.swing.JButton();
        panelComunidad = new javax.swing.JPanel();
        btnForo = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnDebut = new javax.swing.JButton();
        btnDisenos = new javax.swing.JButton();
        foro = new javax.swing.JLabel();
        debut = new javax.swing.JLabel();
        categorias = new javax.swing.JLabel();
        design = new javax.swing.JLabel();
        panelUsuarios = new javax.swing.JPanel();
        btngraphic = new javax.swing.JButton();
        btnBuscarAmigos = new javax.swing.JButton();
        btnDevelopers = new javax.swing.JButton();
        graphic = new javax.swing.JLabel();
        amigos = new javax.swing.JLabel();
        developers = new javax.swing.JLabel();
        LOGO = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BarraInfo = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        btnperfil = new javax.swing.JButton();
        btnopciones = new javax.swing.JButton();
        Tu_Saldo = new javax.swing.JLabel();
        moneda = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        separator2 = new javax.swing.JLabel();
        separator1 = new javax.swing.JLabel();
        separator3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGeneral.setBackground(new java.awt.Color(24, 24, 24));
        panelGeneral.setForeground(new java.awt.Color(24, 24, 24));
        panelGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelGeneralMouseEntered(evt);
            }
        });

        panelInferior.setBackground(new java.awt.Color(24, 24, 24));

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        panelPrincipal.setBackground(new java.awt.Color(28, 28, 28));
        panelPrincipal.setLayout(new javax.swing.BoxLayout(panelPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        panelSuperior.setBackground(new java.awt.Color(24, 24, 24));
        panelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSuperiorMouseEntered(evt);
            }
        });

        panelNotificaciones_superior.setBackground(new java.awt.Color(24, 24, 24));
        panelNotificaciones_superior.setOpaque(false);
        panelNotificaciones_superior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNotificacionInferior.setBackground(new java.awt.Color(51, 51, 51));
        panelNotificacionInferior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelNotificacionInferiorMouseEntered(evt);
            }
        });
        panelNotificacionInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        intArticulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        intArticulo.setForeground(new java.awt.Color(51, 153, 255));
        intArticulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intArticulo.setText("&");
        panelNotificacionInferior.add(intArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 56, 30, 20));

        intSolicitud.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        intSolicitud.setForeground(new java.awt.Color(51, 153, 255));
        intSolicitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intSolicitud.setText("&");
        panelNotificacionInferior.add(intSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 4, 30, 20));

        intMensaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        intMensaje.setForeground(new java.awt.Color(51, 153, 255));
        intMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intMensaje.setText("&");
        panelNotificacionInferior.add(intMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 30, 30, 20));

        solicitudes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        solicitudes.setForeground(new java.awt.Color(153, 153, 153));
        solicitudes.setText("Solicitudes nuevas");
        panelNotificacionInferior.add(solicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 4, 120, 20));

        mensajes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mensajes.setForeground(new java.awt.Color(153, 153, 153));
        mensajes.setText("Mensajes nuevos");
        panelNotificacionInferior.add(mensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 24, 120, 30));

        articulos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        articulos.setForeground(new java.awt.Color(153, 153, 153));
        articulos.setText("Articulos nuevos");
        panelNotificacionInferior.add(articulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 56, 120, 20));

        btnSolicitudes.setBorder(null);
        btnSolicitudes.setBorderPainted(false);
        btnSolicitudes.setContentAreaFilled(false);
        btnSolicitudes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btnsolicitudes2.png"))); // NOI18N
        btnSolicitudes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btnsolicitudes2.png"))); // NOI18N
        btnSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSolicitudesMouseExited(evt);
            }
        });
        panelNotificacionInferior.add(btnSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 26));

        btnMensajes.setBorder(null);
        btnMensajes.setBorderPainted(false);
        btnMensajes.setContentAreaFilled(false);
        btnMensajes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btnsolicitudes2.png"))); // NOI18N
        btnMensajes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btnsolicitudes2.png"))); // NOI18N
        btnMensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMensajesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMensajesMouseExited(evt);
            }
        });
        panelNotificacionInferior.add(btnMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 170, 26));

        btnArticulos.setBorder(null);
        btnArticulos.setBorderPainted(false);
        btnArticulos.setContentAreaFilled(false);
        btnArticulos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btnsolicitudes2.png"))); // NOI18N
        btnArticulos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btnsolicitudes2.png"))); // NOI18N
        btnArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnArticulosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnArticulosMouseExited(evt);
            }
        });
        panelNotificacionInferior.add(btnArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 170, 26));

        panelNotificaciones_superior.add(panelNotificacionInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 80));

        PanelGeneralNavegacion.setOpaque(false);
        PanelGeneralNavegacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelGeneralNavegacionMouseEntered(evt);
            }
        });
        PanelGeneralNavegacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_categoria.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btn_categoria.setForeground(new java.awt.Color(184, 184, 184));
        btn_categoria.setText("Categorias");
        btn_categoria.setBorder(null);
        btn_categoria.setBorderPainted(false);
        btn_categoria.setContentAreaFilled(false);
        btn_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_categoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_categoriaMouseExited(evt);
            }
        });
        btn_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categoriaActionPerformed(evt);
            }
        });
        PanelGeneralNavegacion.add(btn_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        btn_emprendedores.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btn_emprendedores.setForeground(new java.awt.Color(184, 184, 184));
        btn_emprendedores.setText("Emprendedores");
        btn_emprendedores.setBorder(null);
        btn_emprendedores.setBorderPainted(false);
        btn_emprendedores.setContentAreaFilled(false);
        btn_emprendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_emprendedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_emprendedoresMouseExited(evt);
            }
        });
        btn_emprendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emprendedoresActionPerformed(evt);
            }
        });
        PanelGeneralNavegacion.add(btn_emprendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 0, 80, 30));

        btn_inversionista.setBackground(new java.awt.Color(255, 255, 255));
        btn_inversionista.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btn_inversionista.setForeground(new java.awt.Color(184, 184, 184));
        btn_inversionista.setText("Inversionistas");
        btn_inversionista.setBorder(null);
        btn_inversionista.setBorderPainted(false);
        btn_inversionista.setContentAreaFilled(false);
        btn_inversionista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inversionistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inversionistaMouseExited(evt);
            }
        });
        PanelGeneralNavegacion.add(btn_inversionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 0, 80, 30));

        panelComunidad.setBackground(new java.awt.Color(28, 28, 28));
        panelComunidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelComunidadMouseEntered(evt);
            }
        });
        panelComunidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnForo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select1.png"))); // NOI18N
        btnForo.setBorder(null);
        btnForo.setBorderPainted(false);
        btnForo.setContentAreaFilled(false);
        btnForo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnForo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnForo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnForo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnForoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnForoMouseExited(evt);
            }
        });
        panelComunidad.add(btnForo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, 3, 60, 20));

        btnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select1.png"))); // NOI18N
        btnCategorias.setBorder(null);
        btnCategorias.setBorderPainted(false);
        btnCategorias.setContentAreaFilled(false);
        btnCategorias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCategorias.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnCategorias.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseExited(evt);
            }
        });
        panelComunidad.add(btnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 3, 110, 20));

        btnDebut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select1.png"))); // NOI18N
        btnDebut.setBorder(null);
        btnDebut.setBorderPainted(false);
        btnDebut.setContentAreaFilled(false);
        btnDebut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDebut.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnDebut.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnDebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDebutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDebutMouseExited(evt);
            }
        });
        panelComunidad.add(btnDebut, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, 28, 110, 20));

        btnDisenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select1.png"))); // NOI18N
        btnDisenos.setBorder(null);
        btnDisenos.setBorderPainted(false);
        btnDisenos.setContentAreaFilled(false);
        btnDisenos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDisenos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnDisenos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnDisenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDisenosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDisenosMouseExited(evt);
            }
        });
        panelComunidad.add(btnDisenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, 52, 110, 20));

        foro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        foro.setForeground(new java.awt.Color(153, 153, 153));
        foro.setText("Tecnologia");
        foro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                foroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                foroMouseExited(evt);
            }
        });
        panelComunidad.add(foro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 3, 60, 20));

        debut.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        debut.setForeground(new java.awt.Color(153, 153, 153));
        debut.setText("Cultura");
        debut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                debutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                debutMouseExited(evt);
            }
        });
        panelComunidad.add(debut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 23, 80, 30));

        categorias.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        categorias.setForeground(new java.awt.Color(153, 153, 153));
        categorias.setText("Marketing");
        categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoriasMouseExited(evt);
            }
        });
        panelComunidad.add(categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 3, 90, 20));

        design.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        design.setForeground(new java.awt.Color(153, 153, 153));
        design.setText("Manualidades");
        design.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                designMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                designMouseExited(evt);
            }
        });
        panelComunidad.add(design, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 48, 90, 30));

        PanelGeneralNavegacion.add(panelComunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 260, 80));

        panelUsuarios.setBackground(new java.awt.Color(28, 28, 28));
        panelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelUsuariosMouseEntered(evt);
            }
        });
        panelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btngraphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select1.png"))); // NOI18N
        btngraphic.setBorder(null);
        btngraphic.setBorderPainted(false);
        btngraphic.setContentAreaFilled(false);
        btngraphic.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btngraphic.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btngraphic.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btngraphic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btngraphicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btngraphicMouseExited(evt);
            }
        });
        panelUsuarios.add(btngraphic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, 3, 160, 20));

        btnBuscarAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select1.png"))); // NOI18N
        btnBuscarAmigos.setBorder(null);
        btnBuscarAmigos.setBorderPainted(false);
        btnBuscarAmigos.setContentAreaFilled(false);
        btnBuscarAmigos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarAmigos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnBuscarAmigos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnBuscarAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarAmigosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarAmigosMouseExited(evt);
            }
        });
        panelUsuarios.add(btnBuscarAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, 28, 170, 20));

        btnDevelopers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select1.png"))); // NOI18N
        btnDevelopers.setText("Proyectos asociados");
        btnDevelopers.setBorder(null);
        btnDevelopers.setBorderPainted(false);
        btnDevelopers.setContentAreaFilled(false);
        btnDevelopers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDevelopers.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnDevelopers.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/select2.png"))); // NOI18N
        btnDevelopers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDevelopersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDevelopersMouseExited(evt);
            }
        });
        panelUsuarios.add(btnDevelopers, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, 52, 160, 20));

        graphic.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        graphic.setForeground(new java.awt.Color(153, 153, 153));
        graphic.setText("Tipo de inversionista ");
        graphic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graphicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graphicMouseExited(evt);
            }
        });
        panelUsuarios.add(graphic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 3, 110, 20));

        amigos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        amigos.setForeground(new java.awt.Color(153, 153, 153));
        amigos.setText(" Buscar Proyectos");
        amigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                amigosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                amigosMouseExited(evt);
            }
        });
        panelUsuarios.add(amigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 23, 100, 30));

        developers.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        developers.setForeground(new java.awt.Color(153, 153, 153));
        developers.setText("Proyectos asociados");
        developers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                developersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                developersMouseExited(evt);
            }
        });
        panelUsuarios.add(developers, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 48, 150, 30));

        PanelGeneralNavegacion.add(panelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 180, 80));

        LOGO.setBackground(new java.awt.Color(28, 28, 28));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_perfil/lOGO.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ORG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Emprendedores");

        javax.swing.GroupLayout LOGOLayout = new javax.swing.GroupLayout(LOGO);
        LOGO.setLayout(LOGOLayout);
        LOGOLayout.setHorizontalGroup(
            LOGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGOLayout.createSequentialGroup()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LOGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LOGOLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
        );
        LOGOLayout.setVerticalGroup(
            LOGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(LOGOLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(PanelGeneralNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                    .addGap(0, 715, Short.MAX_VALUE)
                    .addComponent(panelNotificaciones_superior, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSuperiorLayout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(676, Short.MAX_VALUE)))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGeneralNavegacion, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSuperiorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelNotificaciones_superior, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        BarraInfo.setBackground(new java.awt.Color(30, 30, 30));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btncerrarsesion1.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btncerrarsesion2.png"))); // NOI18N
        exit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btncerrarsesion2.png"))); // NOI18N

        btnperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btnperfil1.png"))); // NOI18N
        btnperfil.setBorder(null);
        btnperfil.setBorderPainted(false);
        btnperfil.setContentAreaFilled(false);
        btnperfil.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btnperfil2.png"))); // NOI18N
        btnperfil.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btnperfil2.png"))); // NOI18N
        btnperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperfilActionPerformed(evt);
            }
        });

        btnopciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btncfg1.png"))); // NOI18N
        btnopciones.setBorder(null);
        btnopciones.setBorderPainted(false);
        btnopciones.setContentAreaFilled(false);
        btnopciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btncfg2.png"))); // NOI18N
        btnopciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/btncfg2.png"))); // NOI18N

        Tu_Saldo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Tu_Saldo.setForeground(new java.awt.Color(204, 204, 204));
        Tu_Saldo.setText("Cartera");

        moneda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        moneda.setForeground(new java.awt.Color(102, 102, 102));
        moneda.setText("USD$");

        saldo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        saldo.setForeground(new java.awt.Color(204, 204, 204));
        saldo.setText("0.000");
        saldo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        separator2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separator2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/separator.png"))); // NOI18N

        separator1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separator1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/separator.png"))); // NOI18N

        separator3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separator3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_home/separator.png"))); // NOI18N

        javax.swing.GroupLayout BarraInfoLayout = new javax.swing.GroupLayout(BarraInfo);
        BarraInfo.setLayout(BarraInfoLayout);
        BarraInfoLayout.setHorizontalGroup(
            BarraInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(BarraInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraInfoLayout.createSequentialGroup()
                        .addComponent(moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Tu_Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(BarraInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraInfoLayout.createSequentialGroup()
                    .addContainerGap(783, Short.MAX_VALUE)
                    .addComponent(separator3)
                    .addGap(220, 220, 220)))
        );
        BarraInfoLayout.setVerticalGroup(
            BarraInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraInfoLayout.createSequentialGroup()
                .addGroup(BarraInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BarraInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BarraInfoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Tu_Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(BarraInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(separator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnperfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnopciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(BarraInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BarraInfoLayout.createSequentialGroup()
                    .addComponent(separator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BarraInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoriaActionPerformed
BarraInfo.setVisible(false); // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btn_categoriaActionPerformed

    private void btn_inversionistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inversionistaMouseEntered
panelUsuarios.setVisible(false);  // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
panelComunidad.setVisible(false); btn_inversionista.setForeground(new Color(255,255,255));    // TAG : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btn_inversionistaMouseEntered

    private void btn_inversionistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inversionistaMouseExited
btn_inversionista.setForeground(new Color(184,184,184)); // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btn_inversionistaMouseExited

    private void btn_emprendedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_emprendedoresMouseEntered
panelComunidad.setVisible(false); btn_emprendedores.setForeground(new Color(255,255,255));// TAG : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
panelUsuarios.setVisible(true);// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btn_emprendedoresMouseEntered

    private void btn_emprendedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_emprendedoresMouseExited
btn_emprendedores.setForeground(new Color(184,184,184));  // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btn_emprendedoresMouseExited

    private void btn_categoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_categoriaMouseEntered

         btn_categoria.setForeground(new Color(255,255,255));// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
         panelComunidad.setVisible(true);// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
         panelUsuarios.setVisible(false);// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btn_categoriaMouseEntered

    private void btn_categoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_categoriaMouseExited
btn_categoria.setForeground(new Color(184,184,184)); // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btn_categoriaMouseExited

    private void panelSuperiorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseEntered
pd_InterfacesGraficas.pd_perfil.jButton7.setVisible(false);   panelNotificacionInferior.setVisible(false); // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
 panelComunidad.setVisible(false); // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
 panelUsuarios.setVisible(false);// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_panelSuperiorMouseEntered

    private void panelNotificacionInferiorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNotificacionInferiorMouseEntered
panelNotificacionInferior.setVisible(true);  // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_panelNotificacionInferiorMouseEntered

    private void PanelGeneralNavegacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGeneralNavegacionMouseEntered
panelNotificacionInferior.setVisible(false);  panelComunidad.setVisible(false);  // TAG : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_PanelGeneralNavegacionMouseEntered

    private void panelComunidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelComunidadMouseEntered
 panelComunidad.setVisible(true);   // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_panelComunidadMouseEntered

    private void foroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foroMouseEntered
     // TODO add your handling code here:
    }//GEN-LAST:event_foroMouseEntered

    private void foroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foroMouseExited
           // TODO add your handling code here:
    }//GEN-LAST:event_foroMouseExited

    private void debutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_debutMouseEntered

    private void debutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_debutMouseExited

    private void categoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriasMouseEntered

    private void categoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriasMouseExited

    private void designMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_designMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_designMouseEntered

    private void designMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_designMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_designMouseExited

    private void btnForoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForoMouseEntered
foro.setForeground(new Color(255,255,255));  // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnForoMouseEntered

    private void btnForoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForoMouseExited
foro.setForeground(new Color(153,153,153));  // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnForoMouseExited

    private void btnDebutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDebutMouseEntered
debut.setForeground(new Color(255,255,255));   // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnDebutMouseEntered

    private void btnDebutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDebutMouseExited
debut.setForeground(new Color(153,153,153));     // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnDebutMouseExited

    private void btnCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseEntered
categorias.setForeground(new Color(255,255,255));   // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnCategoriasMouseEntered

    private void btnDisenosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisenosMouseEntered
design.setForeground(new Color(255,255,255)); // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnDisenosMouseEntered

    private void btnCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseExited
categorias.setForeground(new Color(153,153,153)); // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnCategoriasMouseExited

    private void btnDisenosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisenosMouseExited
design.setForeground(new Color(153,153,153));   // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnDisenosMouseExited

    private void btnSolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitudesMouseEntered
  solicitudes.setForeground(new Color(255,255,255)); // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnSolicitudesMouseEntered

    private void btnSolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitudesMouseExited
solicitudes.setForeground(new Color(153,153,153));    // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnSolicitudesMouseExited

    private void btnMensajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMensajesMouseEntered
 mensajes.setForeground(new Color(255,255,255));     // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnMensajesMouseEntered

    private void btnMensajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMensajesMouseExited
mensajes.setForeground(new Color(153,153,153));     // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnMensajesMouseExited

    private void btnArticulosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArticulosMouseEntered
 articulos.setForeground(new Color(255,255,255));    // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnArticulosMouseEntered

    private void btnArticulosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArticulosMouseExited
articulos.setForeground(new Color(153,153,153));     // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnArticulosMouseExited

    private void btngraphicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraphicMouseEntered
graphic.setForeground(new Color(255,255,255));      // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btngraphicMouseEntered

    private void btngraphicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraphicMouseExited
graphic.setForeground(new Color(153,153,153));      // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btngraphicMouseExited

    private void btnBuscarAmigosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAmigosMouseEntered
amigos.setForeground(new Color(255,255,255));       // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnBuscarAmigosMouseEntered

    private void btnBuscarAmigosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAmigosMouseExited
amigos.setForeground(new Color(153,153,153));       // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnBuscarAmigosMouseExited

    private void btnDevelopersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevelopersMouseEntered
developers.setForeground(new Color(255,255,255));      // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnDevelopersMouseEntered

    private void btnDevelopersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevelopersMouseExited
developers.setForeground(new Color(153,153,153));      // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnDevelopersMouseExited

    private void graphicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graphicMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_graphicMouseEntered

    private void graphicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graphicMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_graphicMouseExited

    private void amigosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amigosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_amigosMouseEntered

    private void amigosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amigosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_amigosMouseExited

    private void developersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developersMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_developersMouseEntered

    private void developersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developersMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_developersMouseExited

    private void panelUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuariosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelUsuariosMouseEntered

    private void panelGeneralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGeneralMouseEntered
panelUsuarios.setVisible(false);  // TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
panelComunidad.setVisible(false);// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_panelGeneralMouseEntered

   
    
         
    private void btnperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperfilActionPerformed
MostrarInterface_pd_perfil();  //TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*

////// Animacion de componente grafico UPgrade2Baners////////
    AnimationClass banersUPgrade2 = new AnimationClass();
    banersUPgrade2.jLabelXLeft(1,-3090, 15, 2, pd_perfil.banersUPgrade3);
   
        
    }//GEN-LAST:event_btnperfilActionPerformed

    private void btn_emprendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emprendedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_emprendedoresActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraInfo;
    private javax.swing.JPanel LOGO;
    private javax.swing.JPanel PanelGeneralNavegacion;
    private javax.swing.JLabel Tu_Saldo;
    private javax.swing.JLabel amigos;
    private javax.swing.JLabel articulos;
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnBuscarAmigos;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnDebut;
    private javax.swing.JButton btnDevelopers;
    private javax.swing.JButton btnDisenos;
    private javax.swing.JButton btnForo;
    private javax.swing.JButton btnMensajes;
    private javax.swing.JButton btnSolicitudes;
    private javax.swing.JButton btn_categoria;
    private javax.swing.JButton btn_emprendedores;
    private javax.swing.JButton btn_inversionista;
    private javax.swing.JButton btngraphic;
    private javax.swing.JButton btnopciones;
    private javax.swing.JButton btnperfil;
    private javax.swing.JLabel categorias;
    private javax.swing.JLabel debut;
    private javax.swing.JLabel design;
    private javax.swing.JLabel developers;
    private javax.swing.JButton exit;
    private javax.swing.JLabel foro;
    private javax.swing.JLabel graphic;
    private javax.swing.JLabel intArticulo;
    private javax.swing.JLabel intMensaje;
    private javax.swing.JLabel intSolicitud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mensajes;
    private javax.swing.JLabel moneda;
    private javax.swing.JPanel panelComunidad;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelNotificacionInferior;
    private javax.swing.JPanel panelNotificaciones_superior;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JLabel saldo;
    private javax.swing.JLabel separator1;
    private javax.swing.JLabel separator2;
    private javax.swing.JLabel separator3;
    private javax.swing.JLabel solicitudes;
    // End of variables declaration//GEN-END:variables
}
