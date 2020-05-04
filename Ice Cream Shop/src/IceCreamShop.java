
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sumit Kumar
 */

            // click on jLabel and performing operation, so iimplements MouseListener
public class IceCreamShop extends javax.swing.JFrame implements MouseListener{

    /**
     * Creates new form IceCreamShop
     */
    public IceCreamShop() {
        super("Ice Cream Shop");
        initComponents();
        
        // attach listener for all image
        jLabel2.addMouseListener(this);
        jLabel3.addMouseListener(this);
        jLabel4.addMouseListener(this);
        jLabel5.addMouseListener(this);
        jLabel6.addMouseListener(this);
        jLabel7.addMouseListener(this);
        jLabel8.addMouseListener(this);
        jLabel9.addMouseListener(this);
        jLabel10.addMouseListener(this);
        jLabel11.addMouseListener(this);
        
        
    }
    
    DefaultTableModel dtm = new DefaultTableModel();    // for set tabel data
    
    int quantity[] = new int[]{0,0,0,0,0,0,0,0,0,0};    // stores quantity in corresponding index according to item
    String item[] = new String[10];     // stores item name
    int finaltotal[] = new int[]{0,0,0,0,0,0,0,0,0,0};  // stores price in corresponding index according to item
    int sum = 0;    // final toal of all item
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Receipt_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Ice Cream Shop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(344, 344, 344))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\programs\\netbeans\\Ice Cream Shop\\img\\3-34281_strawberry-ice-cream-png-ice-cream-scoop-png.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\programs\\netbeans\\Ice Cream Shop\\img\\images (1).jpeg")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\programs\\netbeans\\Ice Cream Shop\\img\\images (3).jpeg")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("F:\\programs\\netbeans\\Ice Cream Shop\\img\\images.jpeg")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("F:\\programs\\netbeans\\Ice Cream Shop\\img\\chocklate.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ice Cream", jPanel2);

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\programs\\netbeans\\Ice Cream Shop\\img\\images (6).jpeg")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("F:\\programs\\netbeans\\Ice Cream Shop\\img\\download.jpeg")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("F:\\programs\\netbeans\\Ice Cream Shop\\img\\images (7).jpeg")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("F:\\programs\\netbeans\\Ice Cream Shop\\img\\images (4).jpeg")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("F:\\programs\\netbeans\\Ice Cream Shop\\img\\images (5).jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Drink", jPanel3);

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("Total");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        Receipt_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Receipt_Button.setText("Receipt");
        Receipt_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Receipt_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel12)
                                .addGap(30, 30, 30)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(Receipt_Button)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Receipt_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)))
                    .addComponent(jScrollPane2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // method calls when click on Receipt button
    private void Receipt_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Receipt_ButtonActionPerformed
        // TODO add your handling code here:
        
        
        Calendar timer = Calendar.getInstance();    // stores current time and date
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");  // time format
        tTime.format(timer.getTime());  // attatch 'time format' into current time(timer)
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM:YYYY");    // date format
        Tdate.format(timer.getTime());  // attatch 'date format' into current date(timer)
        
        int refs = 100 + (int) (Math.random()+5238);    // generate reference number randomly
        
        jTextArea1.setText("");     // clear all previous texts in receipt
        
                 // add new text into receipt
        jTextArea1.append("\t\tIce Cream Shop:\n"+
                "    Reference : \t\t"+refs+    // append 'reference number'
                "\n  ==============================================\n");
        
        for(int i=0;i<10;i++)   // all 10 items add into receipt
            if(quantity[i]!=0)  // if quantity are present or   item is selected by customer
                jTextArea1.append(" "+item[i]+":- \t Quantity : "+quantity[i]+"\t Total : "+finaltotal[i]+"Rs.\n");
      // add 'itemName', 'total quantity of particular item', 'total cost of particular item with respect to total quantity'
        jTextArea1.append("\n\t\t Grand Total : "+ sum +
                            "\n  ============================================== "+
                            "\n  Date : "+ Tdate.format(timer.getTime())+"\t" +     // add current date
                            "\t  Time : "+tTime.format(timer.getTime())+"\n"+       // add current date
                            "\n\n\t\t\t Thank you");
    }//GEN-LAST:event_Receipt_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(IceCreamShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IceCreamShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IceCreamShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IceCreamShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IceCreamShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Receipt_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
    // code run when you click any item
    @Override
    public void mouseClicked(MouseEvent me) {
        
        String name="";     // item name
        int price=0;    // item price
        int q=0;    // item quantity
        int total;  // total item price (price*quantity)
        
        if(me.getSource() == jLabel2)   // for strawberry
        {
            
            name = "Strawberry";
            price = 50;
            q = Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity")); // input dialog for taking quantity
            
                // assign these value into corresponding array
            item[0]=name;   
            quantity[0]+=q;
            finaltotal[0]+=50*q;
        }
        else if(me.getSource() == jLabel6)  // for chocklate
        {
            name = "Chocklate";
            price = 45;
            q = Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity"));
            item[1]=name;
            quantity[1]+=q;
            finaltotal[1]+=45*q;
        }
        else if(me.getSource() == jLabel3)
        {
            name = "Mix-up Flevor";
            price = 60;
            q = Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity"));
            item[2]=name;
            quantity[2]+=q;
            finaltotal[2]+=60*q;
        }
        else if(me.getSource() == jLabel4)
        {
            name = "Vanila";
            price = 40;
            q = Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity"));
            item[3]=name;
            quantity[3]+=q;
            finaltotal[3]+=40*q;
        }
        else if(me.getSource() == jLabel5)
        {
            name = "Vanila Cream";
            price = 45;
            q = Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity"));
            item[4]=name;
            quantity[4]+=q;
            finaltotal[4]+=45*q;
        }
        
        else if(me.getSource() == jLabel7)
        {
            name = "Strawberry Juice";
            price = 60;
            q = Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity"));
            item[5]=name;
            quantity[5]+=q;
            finaltotal[5]+=60*q;
        }
        else if(me.getSource() == jLabel8)
        {
            name = "Orange Juice";
            price = 40;
            q = Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity"));
            item[6]=name;
            quantity[6]+=q;
            finaltotal[6]+=40*q;
        }
        else if(me.getSource() == jLabel9)
        {
            name = "Coco Cola";
            price = 30;
            q = Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity"));
            item[7]=name;
            quantity[7]+=q;
            finaltotal[7]+=30*q;
        }
        else if(me.getSource() == jLabel10)
        {
            name = "Pepsi";
            price = 30;
            q = Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity"));
            item[8]=name;
            quantity[8]+=q;
            finaltotal[8]+=30*q;

        }
        else if(me.getSource() == jLabel11)
        {
            name = "Sprite";
            price = 25;
            q = Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity"));
            item[9]=name;
            quantity[9]+=q;
            finaltotal[9]+=25*q;
        }
        
        
        total = price*q;    // calculate cost of item according to its quantity 
        dtm = (DefaultTableModel)jTable1.getModel();    // reference of table for set data into table
        dtm.addRow(new Object[]     // attatcg row in table by the help of object we can also do this by vector
        {
            name,price,q,total
        }
                );
        sum =0;     // total cost of all item with there quantity

        for(int i=0;i<jTable1.getRowCount();i++)
            sum += Integer.parseInt(jTable1.getValueAt(i, 3).toString());   // calculate total cost row by row 

        jTextField1.setText(Integer.toString(sum));     // add total cost
        
        
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
     
    }

    @Override
    public void mouseReleased(MouseEvent me) {
     
    }

    @Override
    public void mouseEntered(MouseEvent me) {
     
    }

    @Override
    public void mouseExited(MouseEvent me) {
     
    }

        
}