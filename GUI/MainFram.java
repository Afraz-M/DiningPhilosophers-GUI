package GUI;

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

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p1.jpg")));

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p2.jpg")));

                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p3.jpg")));

                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p4.jpg")));

                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/p5.jpg")));

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

                jLabel9.setText("Philosopher 1 ate " + p1 + " times ");

                jLabel10.setText("Philosopher 2 ate " + p2 + " times ");

                jLabel11.setText("Philosopher 3 ate " + p3 + " times ");

                jLabel12.setText("Philosopher 4 ate " + p4 + " times ");

                jLabel13.setText("Philosopher 5 ate " + p5 + " times ");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(675, 675, 675)
                                                                                .addComponent(jLabel1,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                675, 675, 675)
                                                                                .addComponent(one,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(175, 175, 175)
                                                                                                .addComponent(jLabel2,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(
                                                                                                                175,
                                                                                                                175,
                                                                                                                175)
                                                                                                .addComponent(two,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(825, 825, 825)
                                                                                .addComponent(jLabel3,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                825, 825, 825)
                                                                                .addComponent(three,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(525, 525, 525)
                                                                                .addComponent(jLabel4,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                525, 525, 525)
                                                                                .addComponent(four,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(360, 360, 360)
                                                                                .addComponent(jLabel5,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                360, 360, 360)
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
                                                                                .addGap(1340, 1340, 1340)
                                                                                .addComponent(jLabel9,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(1340, 1340, 1340)
                                                                                .addComponent(jLabel10,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(1340, 1340, 1340)
                                                                                .addComponent(jLabel11,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(1340, 1340, 1340)
                                                                                .addComponent(jLabel12,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(1340, 1340, 1340)
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
                                                                                GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(30, 30, 30)
                                                                                                .addComponent(jLabel2,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(
                                                                                                                206,
                                                                                                                206,
                                                                                                                206)
                                                                                                .addComponent(two,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(575, 575, 575)
                                                                                .addComponent(jLabel3,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                751, 751, 751)
                                                                                .addComponent(three,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(575, 575, 575)
                                                                                .addComponent(jLabel4,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(
                                                                                                751, 751, 751)
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
                                                                                .addGap(70, 70, 70)
                                                                                .addComponent(jLabel9,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(90, 90, 90)
                                                                                .addComponent(jLabel10,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(110, 110, 110)
                                                                                .addComponent(jLabel11,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(130, 130, 130)
                                                                                .addComponent(jLabel12,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(150, 150, 150)
                                                                                .addComponent(jLabel13,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)

                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))));

                pack();
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

                        } else if (status == EATING) {
                                one.setBackground(Color.yellow);
                                p1 = p1 + 1;
                                jLabel9.setText("Philosopher 1 ate " + p1 + " times");

                        } else {
                                one.setBackground(Color.green);

                        }
                }

                else if (pos == 1) {
                        if (status == HUNGRY) {
                                two.setBackground(Color.red);

                        } else if (status == EATING) {
                                two.setBackground(Color.yellow);
                                p2 = p2 + 1;
                                jLabel10.setText("Philosopher 2 ate " + p2 + " times");
                        } else {
                                two.setBackground(Color.green);

                        }
                } else if (pos == 2) {
                        if (status == HUNGRY) {
                                three.setBackground(Color.red);

                        } else if (status == EATING) {
                                three.setBackground(Color.yellow);
                                p3 = p3 + 1;
                                jLabel11.setText("Philosopher 3 ate " + p3 + " times");
                        } else {
                                three.setBackground(Color.green);

                        }
                } else if (pos == 3) {
                        if (status == HUNGRY) {
                                four.setBackground(Color.red);

                        } else if (status == EATING) {
                                four.setBackground(Color.yellow);
                                p4 = p4 + 1;
                                jLabel12.setText("Philosopher 4 ate " + p4 + " times");
                        } else {
                                four.setBackground(Color.green);

                        }
                } else {
                        if (status == HUNGRY) {

                                five.setBackground(Color.red);

                        } else if (status == EATING) {
                                five.setBackground(Color.yellow);
                                p5 = p5 + 1;
                                jLabel13.setText("Philosopher 5 ate " + p5 + " times");
                        } else {
                                five.setBackground(Color.green);

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
