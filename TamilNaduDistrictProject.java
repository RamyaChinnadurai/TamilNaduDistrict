import javax.swing.JLabel;
class TamilNaduDistrictProject extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
String St1="";
String St2="";
private JLabel jLabel3;
        public TamilNaduDistrictProject() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextfield1 = new javax.swing.JTextField();
        jTextfield2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("    Welcome to Tamil Nadu District !!!!");

        jLabel2.setText("     Enter Your District and  Click the Button ");
        
        jLabel3.setText("Your District Details");

        jButton1.setText("CHECK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextfield1ActionPerformed(evt);
            }
        });

        jTextfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextfield2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextfield1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
   St1=jTextfield1.getText();
        if (St1.equals("Ariyalur"))
   {
        	jLabel3.setText("<html> Headquarters:Ariyalur\nArea(Km2):1944\nPopulation (2011):752,481\nTaluks (Sub-Division):	Ariyalur, Udayarpalayam, Sendurai</html>");
    }else if (St1.equals("Karur")) {
					
                        jLabel3.setText("<html>Headquarters:Karur\nArea(Km2): 2902\nPopulation (2011):1,076,588\nTaluks (Sub-Division):  Aravakurichi, Karur, Krishnarayapuram, Kulithalai</html>");
		}
    else if (St1.equals("Nagapattinam")) {
			
		                jLabel3.setText("<html>Headquarters:Nagapattinam\nArea(Km2):2,416\nPopulation (2011):	1,614,069\nTaluks (Sub-Division):  Kilvelur, Kuthalam, Mayiladuthurai, Nagapattinam, Sirkazhi, Tharangambadi, Thirukkuvalai, Vedaranyam</html>");
		}else if (St1.equals("Perambalur")) {
		
			            jLabel3.setText("<html>Headquarters:Perambalur\nArea(Km2):1,748\nPopulation (2011):	564,511\nTaluks (Sub-Division): Perambalur</html>");
		}else if (St1.equals("Pudhukkottai")) {
		
			            jLabel3.setText("<html>Headquarters:Pudukkottai\nArea(Km2):4,652\nPopulation (2011):	1,618,725\nTaluks (Sub-Division):  Pudukkottai, Gandarvakottai, Ilupur, Kulatur, Tirumayam, Alangudi, Arangthangi, Avudaiyarkoil, Manamelkudi</html>");
		}else if (St1.equals("Thanjavur")) {
		
		                 jLabel3.setText("<html>Headquarters:Thanjavur\nArea(Km2):3,477\nPopulation (2011):	2,402,781\nTaluks (Sub-Division):  Kumbakonam, Orathanadu, Papanasam, Pattukkottai, Peravurani, Thanjavur, Thiruvaiyaru, Thiruvidaimarudur</html>");
		}else if (St1.equals("Thiruchirappalli")) {
		
			              jLabel3.setText("<html>Headquarters:Tiruchirappalli\nArea(Km2):4,508\nPopulation (2011):	2,713,858\nTaluks (Sub-Division):  Manapparai, Srirangam, Tiruchirapalli, Lalgudi, Manachanallu, Thuraiyur, Musiri, Thottiyam</html>");
		}else if (St1.equals("Tiruvarur")) {
		
			              jLabel3.setText("<html>Headquarters:Tiruvarur\nArea(Km2):2,379\nPopulation (2011):	1,268,094\nTaluks (Sub-Division):  Kudavasal, Mannargudi, Nannilam, Needamangalam, Thiruthiraipoondi, Tiruvarur, Valangaiman</html>");
		}else if (St1.equals("Dharmapuri")) {
		
			              jLabel3.setText("<html>Headquarters:Dharmapuri\nArea(Km2):4,527\nPopulation (2011):	1,502,900\nTaluks (Sub-Division):  Dharmapuri, Palacode, Pennagaram, Harur and Pappireddipatti</html>");
		}else if (St1.equals("Coimbatore")) {
		
			              jLabel3.setText("<html>Headquarters:Coimbatore\nArea(Km2):4,642\nPopulation (2011):	3,472,578\nTaluks (Sub-Division):  Mettupalayam, Coimbatore-North, Coimbatore-South, Sulur, Pollachi, Valparai</html>");
		}else if (St1.equals("Erode")) {
		
			               jLabel3.setText("<html>Headquarters:Erode\nArea(Km2):5,692\nPopulation (2011):	2,259,608\nTaluks (Sub-Division):  Bhavani taluk, Erode taluk, Gobichettipalayam taluk, Perundurai taluk, Sathyamangalam</html>");
		}else if (St1.equals("Krishnagiri")) {
		
			                jLabel3.setText("<html>Headquarters:Krishnagiri\nArea(Km2):5,091\nPopulation (2011):	1,883,731\nTaluks (Sub-Division):  Krishnagiri, Hosur, Pochampalli, Uthangarai, Denkanikottai</html>");
		}else if (St1.equals("Namakkal")) {
		
			                jLabel3.setText("<html>Headquarters:Namakkal\nArea(Km2):3,402\nPopulation (2011):	1,721,179\nTaluks (Sub-Division):  Namakkal, Velur, Tiruchengode, Rasipuram</html>");
		}else if (St1.equals("The Nilgiris")) {
		
			                jLabel3.setText("<html>Headquarters:Udagamandalam\nArea(Km2):2,552\nPopulation (2011):	735,071\nTaluks (Sub-Division):  Udagamandalam</html>");
		}else if (St1.equals("Tirupur")) {
		
		                    jLabel3.setText("<html>Headquarters:Tirupur\nArea(Km2): 5,192\nPopulation (2011):	2,471,222\nTaluks (Sub-Division):  Tiruppur, Avinashi, Palladam, Dharapuram, Kangayam, Udumalaipet, Madathukulam</html>");
		}else if (St1.equals("Salem")) {
		
			                jLabel3.setText("<html>Headquarters:Salem\nArea(Km2): 5,249\nPopulation (2011):	3,480,008\nTaluks (Sub-Division):  Attur, Edappadi, Gangavalli, Mettur, Omalur, Salem, Sankagiri, Valapady, Yercaud</html>");
		}else if (St1.equals("Dindigul")) {
		
			                jLabel3.setText("<html>Headquarters:Dindigul\nArea(Km2):6,054\nPopulation (2011):	2,161,367\nTaluks (Sub-Division):  Dindigul, Kodaikanal, Natham taluk, Athoor taluk, Nilakottai taluk, Oddanchathiram taluk, Palani taluk, Vedasandhur taluk, Kodaikanal taluk.</html>");
		}else if (St1.equals("Kanyakumari")) {
		
			                jLabel3.setText("<html>Headquarters:Nagercoil\nArea(Km2):1,685\nPopulation (2011):	1,863,174\nTaluks (Sub-Division):  Agastheeswaram, Kalkovil, Vilavancode, Thovalai</html>");
		}else if (St1.equals("Madurai")) {
		
		         	 jLabel3.setText("<html>Headquarters:Madurai\nArea(Km2):3,695\nPopulation (2011):	3,041,038\nTaluks (Sub-Division):  Madurai North, Madurai South, Melur, Tirumangalam, Periyur, Usilampatti, Vadipatti</html>");
		}else if (St1.equals("Ramanathapuram")) {
		
		      	 jLabel3.setText("<html>Headquarters:Ramanathapuram\nArea(Km2):4,180\nPopulation (2011):	1,337,560\nTaluks (Sub-Division):  Ramanathapuram, Tiruvadanai, Rameswaram, Paramakudi, Mudukulathur, Kamuthi, Kadaladi</html>");
		}else if (St1.equals("Sivagangai")) {
		
			 jLabel3.setText("<html>Headquarters:Sivaganga\nArea(Km2):4,140\nPopulation (2011):	1,341,250\nTaluks (Sub-Division):  Sivaganga</html>");
		}else if (St1.equals("Theni")) {
		
			 jLabel3.setText("<html>Headquarters:Theni\nArea(Km2):2,872\nPopulation (2011):	1,243,684\nTaluks (Sub-Division):  Theni, Periyakulam, Andipatti, Bodinayakkanur, Uthamapalayam</html>");
		}else if (St1.equals("Thoothukudi")) {
		
			 jLabel3.setText("<html>Headquarters:Thoothukudi\nArea(Km2):4,599\nPopulation (2011):	1,738,376\nTaluks (Sub-Division):  Tuticorin, Thiruchendur, Sathankulam, Srivaikundam, Ottapidaram, Kovilpatti, Ettayapuram, Vilathikulam</html>");
		}else if (St1.equals("Tirunelveli")) {
		
			 jLabel3.setText("<html>Headquarters:Tirunelveli\nArea(Km2):6,709\nPopulation (2011):3,072,880\n (Sub-Division):	Alangulam, Ambasamudram, Nanguneri, Palayamkottai, Tenkasi, Shenkottai, Radhapuram, Sankarankoil, Sivagiri, Tirunelveli, VeerakeralamputhurTaluks</html>");
		}else if (St1.equals("Virudhunagar")) {
		
			 jLabel3.setText("<html>Headquarters:Virudhunagar\nArea(Km2):4,280\nPopulation (2011):	1,943,309\nTaluks (Sub-Division):  Aruppukkottai, Kariapatti, Rajapalayam, Sattur taluk, Sivakasi, Srivilliputhur, Tiruchuli, Virudhunagar</html>");
		}else if (St1.equals("Chennai")) {
		
			 jLabel3.setText("<html>Headquarters:Chennai\nArea(km2): 174\nPopulation (2011): 4,681,087\nTaluks (Sub-Division): Egmore-Nungambakkam taluk, Mylapore-Triplicane taluk, Mambalam-Guindy taluk, Fort-Tondiarpet taluk, Perambur-Purasawalkam taluk</html>");
		}else if (St1.equals("Cuddalore")) {
		
			 jLabel3.setText("<html>Headquarters: Cuddalore\nArea(km2): 3705\nPopulation (2011)    : 2,600,880\nTaluks (Sub-Division): Cuddalore, Panruti, Chidambaram, Kattumannarkoil, Vriddachalam, Titakudi,neyveli,nellikupam</html>");
		}else if (St1.equals("Kanchipuram")) {
		
			 jLabel3.setText("<html>Headquarters:Kanchipuram\nArea(km2): 4305\nPopulation (2011): 3,990,897\nTaluks (Sub-Division): Chengalpattu, Cheyyur, Tambaram, Madurantakam, Sriperumbudur, Kanchipuram, Thirukazhukundram, Uthiramerur</html>");
		}else if (St1.equals("Tiruvallur")) {
		
			 jLabel3.setText("<html>Headquarters: Tiruvallur\nArea(km2): 3552\nPopulation (2011): 3,725,697\nTaluks (Sub-Division): Ambattur, Gummidipoondi, Pallipattu, Ponneri, Poonamallee, Tiruvallur, Uthukkottai</html>");
		}else if (St1.equals("Tiruvannamalai")) {
		
			 jLabel3.setText("<html>Headquarters: Tiruvannamalai\nArea(km2): 6188\nPopulation (2011)    : 3,468,965\nTaluks (Sub-Division): Thiruvannamalai, kizh-Pennathur, kalasapakkam, Javadi Hills, polur, Chengam, Thandarampattu, Arani, Vandavasi, Cheyyar.</html>");
		}else if (St1.equals("Vellore")) {
		
			 jLabel3.setText("<html>Headquarters: Vellore\nArea(km2): 6081\nPopulation (2011)    : 3,928,106\nTaluks (Sub-Division): Pallikonda, Arcot, Ambur, Vaniyambadi, Tiruppattur, Walajapet, Katpadi, Thiruvalam, Gudiyatham.</html>");
		}else if (St1.equals("Viluppuram")) {
		
			 jLabel3.setText("<html>Headquarters: Viluppuram\nArea(km2): 7185\nPopulation (2011)    : 3,463,284\nTaluks (Sub-Division): Kallakurichi, Sankarapuram, Ulundurpettai, Tirukoilur, Gingee, Vanur taluk, Villupuram, Tindivanam</html>");
		}else {
			jLabel3.setText("The Entered City is not District");
		}
		
    }
 
    private void jTextfield1ActionPerformed(java.awt.event.ActionEvent evt) {
            
    }

    private void jTextfield2ActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TamilNaduDistrictProject().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextfield1;
    private javax.swing.JTextField jTextfield2;
 
}
