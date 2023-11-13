package Philosoper;

// import com.sun.org.apache.xpath.internal.axes.OneStepIterator;
import java.awt.*;
import javax.swing.GroupLayout.*;
import javax.swing.*;

public class MainFram extends javax.swing.JFrame {

        public MainFram() {
                initComponents();
        }

        public void initComponents() {

                one = new javax.swing.JPanel();
                two = new javax.swing.JPanel();
                three = new javax.swing.JPanel();
                four = new javax.swing.JPanel();
                five = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jPanel3 = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Dining Philosopher");
                // getContentPane().setBackground(Color.darkGray);

                one.setBackground(new java.awt.Color(255, 255, 255));

                one.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

                javax.swing.GroupLayout oneLayout = new javax.swing.GroupLayout(one);
                one.setLayout(oneLayout);
                oneLayout.setHorizontalGroup(
                                oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 160, Short.MAX_VALUE));
                oneLayout.setVerticalGroup(
                                oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 26, Short.MAX_VALUE));

                two.setBackground(new java.awt.Color(255, 255, 255));

                javax.swing.GroupLayout twoLayout = new javax.swing.GroupLayout(two);
                two.setLayout(twoLayout);
                twoLayout.setHorizontalGroup(
                                twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 160, Short.MAX_VALUE));
                twoLayout.setVerticalGroup(
                                twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 26, Short.MAX_VALUE));

                three.setBackground(new java.awt.Color(255, 255, 255));

                javax.swing.GroupLayout threeLayout = new javax.swing.GroupLayout(three);
                three.setLayout(threeLayout);
                threeLayout.setHorizontalGroup(
                                threeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 160, Short.MAX_VALUE));
                threeLayout.setVerticalGroup(
                                threeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 26, Short.MAX_VALUE));

                four.setBackground(new java.awt.Color(255, 255, 255));

                javax.swing.GroupLayout fourLayout = new javax.swing.GroupLayout(four);
                four.setLayout(fourLayout);
                fourLayout.setHorizontalGroup(
                                fourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 160, Short.MAX_VALUE));
                fourLayout.setVerticalGroup(
                                fourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 26, Short.MAX_VALUE));

                javax.swing.GroupLayout fiveLayout = new javax.swing.GroupLayout(five);

                five.setBackground(new java.awt.Color(10, 10, 255));
                five.setLayout(fiveLayout);
                fiveLayout.setHorizontalGroup(
                                fiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 160, Short.MAX_VALUE));
                fiveLayout.setVerticalGroup(
                                fiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 26, Short.MAX_VALUE));

                one.setBackground(java.awt.Color.red);
                two.setBackground(java.awt.Color.blue);
                three.setBackground(java.awt.Color.green);
                four.setBackground(java.awt.Color.yellow);
                five.setBackground(java.awt.Color.orange);

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p1T.jpg")));

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p2T.jpg")));

                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p3T.jpg")));

                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p4T.jpg")));

                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p5T.jpg")));

                jPanel1.setBackground(java.awt.Color.yellow);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 21, Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 18, Short.MAX_VALUE));

                jPanel2.setBackground(java.awt.Color.red);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 21, Short.MAX_VALUE));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 18, Short.MAX_VALUE));

                jPanel3.setBackground(java.awt.Color.green);

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 21, Short.MAX_VALUE));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(10, 18, Short.MAX_VALUE));

                jLabel6.setText("Eating");

                jLabel7.setText("Hungry");

                jLabel8.setText("Thinking");

                jLabel9.setText("Philosopher 4 ate " + p4 + " times ");

                jLabel10.setText("Philosopher 5 ate " + p5 + " times ");

                jLabel11.setText("Philosopher 1 ate " + p1 + " times ");

                jLabel12.setText("Philosopher 2 ate " + p2 + " times ");

                jLabel13.setText("Philosopher 3 ate " + p3 + " times ");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(385, 385, 385)
                                                                                .addComponent(jLabel1,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                385, 385, 385)
                                                                                .addComponent(one,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))

                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(600, 600, 600)
                                                                                .addComponent(jLabel2,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                600,
                                                                                                600,
                                                                                                600)
                                                                                .addComponent(two,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(512, 512, 512)
                                                                                .addComponent(jLabel3,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                512, 512, 512)
                                                                                .addComponent(three,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(235, 235, 235)
                                                                                .addComponent(jLabel4,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                235, 235, 235)
                                                                                .addComponent(four,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(170, 170, 170)
                                                                                .addComponent(jLabel5,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                170, 170, 170)
                                                                                .addComponent(five,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(jPanel1,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(10, 10, 10))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(jPanel2,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(jPanel3,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(40, 40, 40)
                                                                                .addComponent(jLabel6,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(40, 40, 40)
                                                                                .addComponent(jLabel7,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(40, 40, 40)
                                                                                .addComponent(jLabel8,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(900, 900, 900)
                                                                                .addComponent(jLabel9,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(900, 900, 900)
                                                                                .addComponent(jLabel10,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(900, 900, 900)
                                                                                .addComponent(jLabel11,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(900, 900, 900)
                                                                                .addComponent(jLabel12,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(900, 900, 900)
                                                                                .addComponent(jLabel13,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))));

                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(
                                                                                220, 220, 220)
                                                                .addComponent(one, GroupLayout.PREFERRED_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(270, 270, 270)
                                                                                .addComponent(jLabel2,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                446,
                                                                                                446,
                                                                                                446)
                                                                                .addComponent(two,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(545, 545, 545)
                                                                                .addComponent(jLabel3,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                721, 721, 721)
                                                                                .addComponent(three,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(545, 545, 545)
                                                                                .addComponent(jLabel4,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                721, 721, 721)
                                                                                .addComponent(four,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(270, 270, 270)
                                                                                .addComponent(jLabel5,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                446, 446, 446)
                                                                                .addComponent(five,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(jPanel1,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(40, 40, 40)
                                                                                .addComponent(jPanel2,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(70, 70, 70)
                                                                                .addComponent(jPanel3,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(jLabel6,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(40, 40, 40)
                                                                                .addComponent(jLabel7,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(70, 70, 70)
                                                                                .addComponent(jLabel8,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(270, 270, 270)
                                                                                .addComponent(jLabel9,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(290, 290, 290)
                                                                                .addComponent(jLabel10,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(210, 210, 210)
                                                                                .addComponent(jLabel11,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(230, 230, 230)
                                                                                .addComponent(jLabel12,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(250, 250, 250)
                                                                                .addComponent(jLabel13,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))));

                setSize(1100, 800);

                Toolkit toolKit = getToolkit();
		Dimension size = toolKit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        }// </editor-fold>//GEN-END:initComponents

        /**
         * @param args the command line arguments
         */

        public final int HUNGRY = 1;
        public final int EATING = 2;

        void setPosition(int pos, int status) {
                if (pos == 0) {
                        if (status == HUNGRY) {
                                one.setBackground(Color.red);
                                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p1T.jpg")));

                        } else if (status == EATING) {
                                one.setBackground(Color.yellow);
                                p1 = p1 + 1;
                                jLabel11.setText("Philosopher 1 ate " + p1 + " times");
                                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p1E.jpg")));

                        } else {
                                one.setBackground(Color.green);
                                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p1T.jpg")));
                        }
                }

                else if (pos == 1) {
                        if (status == HUNGRY) {
                                two.setBackground(Color.red);
                                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p2T.jpg")));

                        } else if (status == EATING) {
                                two.setBackground(Color.yellow);
                                p2 = p2 + 1;
                                jLabel12.setText("Philosopher 2 ate " + p2 + " times");
                                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p2E.jpg")));
                        } else {
                                two.setBackground(Color.green);
                                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p2T.jpg")));
                        }
                } else if (pos == 2) {
                        if (status == HUNGRY) {
                                three.setBackground(Color.red);
                                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p3T.jpg")));

                        } else if (status == EATING) {
                                three.setBackground(Color.yellow);
                                p3 = p3 + 1;
                                jLabel13.setText("Philosopher 3 ate " + p3 + " times");
                                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p3E.jpg")));
                        } else {
                                three.setBackground(Color.green);

                                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p3T.jpg")));
                        }
                } else if (pos == 3) {
                        if (status == HUNGRY) {
                                four.setBackground(Color.red);
                                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p4T.jpg")));

                        } else if (status == EATING) {
                                four.setBackground(Color.yellow);
                                p4 = p4 + 1;
                                jLabel9.setText("Philosopher 4 ate " + p4 + " times");
                                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p4E.jpg")));
                        } else {
                                four.setBackground(Color.green);
                                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p4T.jpg")));
                        }
                } else {
                        if (status == HUNGRY) {

                                five.setBackground(Color.red);
                                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p5T.jpg")));

                        } else if (status == EATING) {
                                five.setBackground(Color.yellow);
                                p5 = p5 + 1;
                                jLabel10.setText("Philosopher 5 ate " + p5 + " times");
                                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p5E.jpg")));
                        } else {
                                five.setBackground(Color.green);
                                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p5T.jpg")));
                        }

                }

        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        public javax.swing.JPanel one;
        public javax.swing.JPanel two;
        public javax.swing.JPanel three;
        public javax.swing.JPanel five;
        public javax.swing.JPanel four;
        public javax.swing.JLabel jLabel1;
        public javax.swing.JLabel jLabel2;
        public javax.swing.JLabel jLabel3;
        public javax.swing.JLabel jLabel4;
        public javax.swing.JLabel jLabel5;
        public javax.swing.JLabel jLabel6;
        public javax.swing.JLabel jLabel7;
        public javax.swing.JLabel jLabel8;
        public javax.swing.JLabel jLabel9;
        public javax.swing.JLabel jLabel10;
        public javax.swing.JLabel jLabel11;
        public javax.swing.JLabel jLabel12;
        public javax.swing.JLabel jLabel13;
        public javax.swing.JPanel jPanel1;
        public javax.swing.JPanel jPanel2;
        public javax.swing.JPanel jPanel3;
        public static int p1 = 0;
        public static int p2 = 0;
        public static int p3 = 0;
        public static int p4 = 0;
        public static int p5 = 0;
        // End of variables declaration//GEN-END:variables

}
