
package ComboCustom;

import java.awt.event.ItemEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ComboEditable extends javax.swing.JFrame {

    final JList list;
    String item="";
    Boolean editable=false;
    
    public ComboEditable() {
        initComponents();
        
       jComboBox1.setEditable(false);
       list=new JList(new DefaultListModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        saveBtn = new javax.swing.JButton();
        editableChk = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ProgrammingWizards Channel");

        jPanel1.setBackground(new java.awt.Color(45, 155, 193));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Man Utd", "Chelsea", "Liverpool", "Arsenal" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        editableChk.setText("Editable");
        editableChk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                editableChkItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editableChk)
                        .addGap(111, 111, 111))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addContainerGap(104, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addGap(97, 97, 97)
                .addComponent(editableChk)
                .addGap(17, 17, 17))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jLabel2)
                    .addGap(33, 33, 33)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    //GET SELECTED ITEM 
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {                                            
        if(evt.getStateChange()==ItemEvent.SELECTED)
        {
            ((DefaultListModel)list.getModel()).addElement(jComboBox1.getSelectedItem());
            item=jComboBox1.getSelectedItem().toString();
            
        }
    }                                           

    //SAVE
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
      jComboBox1.insertItemAt(item, 0);
    }                                       

    //CHECK STATE
    private void editableChkItemStateChanged(java.awt.event.ItemEvent evt) {                                             
       if(editableChk.isSelected())
       {
           editable=true;
       }else
       {
           editable=false;
       }
       
       jComboBox1.setEditable(editable);
    }                                            

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboEditable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     