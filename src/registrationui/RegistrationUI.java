
package registrationui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static registrationui.CourseFactory.instance;

public class RegistrationUI extends javax.swing.JFrame {
    RegisterCourseController rcc;
  
    public RegistrationUI() throws SQLException {
        initComponents();
        rcc= new RegisterCourseController();
        percentage.setText(String.valueOf(rcc.getTaxPercentage())+"%");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invalidWarning = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        courseRemove = new javax.swing.JDialog();
        removeErr = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        newReg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        courseId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        addCourse = new javax.swing.JButton();
        removeCourse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        taxCon = new javax.swing.JTextField("");
        jLabel5 = new javax.swing.JLabel();
        grandTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        percentage = new javax.swing.JLabel();
        academic = new javax.swing.JCheckBox();
        freedom = new javax.swing.JCheckBox();
        minority = new javax.swing.JCheckBox();
        policy = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        discount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        calDis = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        invalidWarning.setTitle("Warning");
        invalidWarning.setMinimumSize(new java.awt.Dimension(400, 150));
        invalidWarning.setLocationRelativeTo(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("INVALID COURSE CODE !");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Try Again with a valid code");

        javax.swing.GroupLayout invalidWarningLayout = new javax.swing.GroupLayout(invalidWarning.getContentPane());
        invalidWarning.getContentPane().setLayout(invalidWarningLayout);
        invalidWarningLayout.setHorizontalGroup(
            invalidWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invalidWarningLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(invalidWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(112, 112, 112))
        );
        invalidWarningLayout.setVerticalGroup(
            invalidWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invalidWarningLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        courseRemove.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        courseRemove.setTitle("Error");
        courseRemove.setMinimumSize(new java.awt.Dimension(300, 120));
        courseRemove.setModal(true);
        courseRemove.setResizable(false);
        courseRemove.setLocationRelativeTo(null);

        removeErr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        removeErr.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout courseRemoveLayout = new javax.swing.GroupLayout(courseRemove.getContentPane());
        courseRemove.getContentPane().setLayout(courseRemoveLayout);
        courseRemoveLayout.setHorizontalGroup(
            courseRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseRemoveLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(removeErr, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        courseRemoveLayout.setVerticalGroup(
            courseRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseRemoveLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(removeErr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Course Registration");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 354));

        newReg.setText("New Registration");
        newReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRegActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Course ID:");

        courseId.setForeground(new java.awt.Color(153, 153, 153));

        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL #", "Title", "Credit", "Tution/Credit", "Sub Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(courseTable);
        if (courseTable.getColumnModel().getColumnCount() > 0) {
            courseTable.getColumnModel().getColumn(0).setResizable(false);
            courseTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            courseTable.getColumnModel().getColumn(1).setResizable(false);
            courseTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            courseTable.getColumnModel().getColumn(2).setResizable(false);
            courseTable.getColumnModel().getColumn(2).setPreferredWidth(10);
            courseTable.getColumnModel().getColumn(3).setResizable(false);
            courseTable.getColumnModel().getColumn(3).setPreferredWidth(20);
            courseTable.getColumnModel().getColumn(4).setResizable(false);
            courseTable.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        addCourse.setText("ADD COURSE");
        addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseActionPerformed(evt);
            }
        });

        removeCourse.setText("REMOVE");
        removeCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCourseActionPerformed(evt);
            }
        });

        jLabel4.setText("Development Fee / BD Tax");

        taxCon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        taxCon.setEnabled(true);
        taxCon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Grand Total");

        grandTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        grandTotal.setEnabled(true);
        grandTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("Tk");

        jLabel7.setText("Tk");

        percentage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        academic.setBackground(new java.awt.Color(204, 204, 204));
        academic.setText("Academic Excellence");
        academic.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                academicStateChanged(evt);
            }
        });
        academic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academicActionPerformed(evt);
            }
        });

        freedom.setBackground(new java.awt.Color(204, 204, 204));
        freedom.setText("Freedom Fighter");
        freedom.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                freedomStateChanged(evt);
            }
        });
        freedom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freedomActionPerformed(evt);
            }
        });

        minority.setBackground(new java.awt.Color(204, 204, 204));
        minority.setText("Minority Group");
        minority.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                minorityStateChanged(evt);
            }
        });
        minority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minorityActionPerformed(evt);
            }
        });

        policy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Policy", "Best for NSU", "Best for Student" }));

        jLabel8.setText("Discount");

        discount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        discount.setEnabled(true);
        grandTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        discount.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setText("Tk");

        calDis.setText("Calculate Discount");
        calDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calDisActionPerformed(evt);
            }
        });

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newReg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(14, 14, 14)
                                .addComponent(courseId, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addCourse)
                                .addGap(18, 18, 18)
                                .addComponent(removeCourse))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(policy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(calDis)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(minority)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(academic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(taxCon, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(freedom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(278, 278, 278))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(newReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(courseId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCourse)
                    .addComponent(removeCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(taxCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(academic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freedom)
                    .addComponent(jLabel8)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(minority))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(policy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calDis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(652, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    public int getGrandTotal(){
        return Integer.valueOf(grandTotal.getText());
    }
    private void addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseActionPerformed
        String courseCode=courseId.getText();
        if(courseTable.getRowCount()>0){
            if(rcc.getCourse(courseCode)!= null){               
                    if(rcc.checkDubCourse(courseCode)){
                        removeErr.setText("Already Added");
                        courseRemove.setVisible(true);
                    }else{
                         rcc.addCourse(courseCode);                        
                         DefaultTableModel model= (DefaultTableModel) courseTable.getModel();
                         model.addRow(new Object[]{});        

                         int row=courseTable.getModel().getRowCount();
                         if(row > 1){
                             model.removeRow(row-1);
                         }
                         row=courseTable.getModel().getRowCount();
                         for(int i=row-1;i>=row-1;i--){
                            courseTable.getModel().setValueAt(i+1, i,0);   
                            courseTable.getModel().setValueAt(rcc.getCourse(courseId.getText()).getTitle(), i,1);    
                            courseTable.getModel().setValueAt(rcc.getCourse(courseId.getText()).getCredit(), i,2);   
                            courseTable.getModel().setValueAt(rcc.getCourse(courseId.getText()).getTutionPerCredit(), i,3);
                            courseTable.getModel().setValueAt(rcc.getCourse(courseId.getText()).getSubTotal(), i,4);
                            model.addRow(new Object[]{});
                            row=courseTable.getModel().getRowCount();
                            courseTable.getModel().setValueAt("Total: "+String.valueOf(rcc.getTotal()), row-1,4);
                         }                         
//                         grandTotal.setText(String.valueOf(rcc.getGrandTotal()));
                         taxCon.setText(String.valueOf(rcc.getExtraFeeAmount()));
                    }
                  

            }else {
                invalidWarning.setVisible(true);
            }
        }else{
            if(rcc.getCourse(courseCode)!= null){
                rcc.addCourse(courseCode);               
                DefaultTableModel model= (DefaultTableModel) courseTable.getModel();
                model.addRow(new Object[]{});        

                int row=courseTable.getModel().getRowCount();
                if(row > 1){
                    model.removeRow(row-1);
                } 
                row=courseTable.getModel().getRowCount();
                for(int i=row-1;i>=row-1;i--){
                    courseTable.getModel().setValueAt(i+1, i,0);   
                    courseTable.getModel().setValueAt(rcc.getCourse(courseId.getText()).getTitle(), i,1);    
                    courseTable.getModel().setValueAt(rcc.getCourse(courseId.getText()).getCredit(), i,2);   
                    courseTable.getModel().setValueAt(rcc.getCourse(courseId.getText()).getTutionPerCredit(), i,3);
                    courseTable.getModel().setValueAt(rcc.getCourse(courseId.getText()).getSubTotal(), i,4);
                    model.addRow(new Object[]{});
                    row=courseTable.getModel().getRowCount();
                    courseTable.getModel().setValueAt("Total: "+String.valueOf(rcc.getTotal()), row-1,4);
//                    grandTotal.setText(String.valueOf(rcc.getGrandTotal()));  
                    taxCon.setText(String.valueOf(rcc.getExtraFeeAmount()));
                }                  
            }else {
                invalidWarning.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_addCourseActionPerformed

    private void newRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRegActionPerformed
        DefaultTableModel model= (DefaultTableModel)courseTable.getModel();
        model.setRowCount(0);
        rcc.clearList();
        grandTotal.setText("");
        taxCon.setText("");
        
    }//GEN-LAST:event_newRegActionPerformed

    private void removeCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCourseActionPerformed
        DefaultTableModel model= (DefaultTableModel) courseTable.getModel();  
        if(model.getRowCount()!=0 && courseTable.getSelectedRow()!=-1){
            int row=courseTable.getModel().getRowCount();        
            if(!(model.getValueAt(courseTable.getSelectedRow(),4).toString().contains("Total"))){
                model.removeRow(row-1);//for deleting total to update new value
                rcc.removeCourse(model.getValueAt(courseTable.getSelectedRow(),1).toString());
                model.removeRow(courseTable.getSelectedRow());
                model.addRow(new Object[]{});
            }
            row= courseTable.getModel().getRowCount();
            if(row == 1){
               model.setRowCount(0);
            }else{
               courseTable.getModel().setValueAt("Total: "+String.valueOf(rcc.getTotal()), row-1,4);
//               grandTotal.setText(String.valueOf(rcc.getGrandTotal()));   
               taxCon.setText(String.valueOf(rcc.getExtraFeeAmount()));
            }
        }else if(model.getRowCount()!=0){            
            removeErr.setText("Select a course First");
            courseRemove.setVisible(true);
        }else{
            removeErr.setText("No Course is added yet");
            courseRemove.setVisible(true);
        }
    }//GEN-LAST:event_removeCourseActionPerformed

    private void minorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minorityActionPerformed
        if(minority.isSelected())
            rcc.addCompositeDiscount(rcc.getDiscountPloicy("registrationui.MinorityDiscount"));
        else{
            for(IDiscountStrategy ids:rcc.getCompositeDisocunt().disList)
            {
                if(ids.getClass().toString().equals("class registrationui.MinorityDiscount"))
                    rcc.getCompositeDisocunt().disList.remove(ids);
                    
            }
        }       
    }//GEN-LAST:event_minorityActionPerformed

    private void calDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calDisActionPerformed
        int discountAmount=0;
        if(
           (academic.isSelected() && freedom.isSelected())|| 
           (academic.isSelected() && minority.isSelected())||
           (freedom.isSelected() && minority.isSelected()) ||
           (freedom.isSelected() && academic.isSelected() && minority.isSelected())
          ){
            if(policy.getSelectedItem().equals("Best for NSU")){
              grandTotal.setText(String.valueOf(rcc.getGrandTotal()- rcc.bestForNsu().getDiscount(rcc.reg)));   
              discountAmount=rcc.bestForNsu().getDiscount(rcc.reg);
//            System.out.println("discount"+rcc.bestForNsu().getDiscount(rcc.reg));
            }
            else{ 
              grandTotal.setText(String.valueOf(rcc.getGrandTotal()- rcc.bestForStudent().getDiscount(rcc.reg)));            
              discountAmount=rcc.bestForStudent().getDiscount(rcc.reg);
            }
            
        }
        else if(academic.isSelected()){
            grandTotal.setText(String.valueOf(rcc.getGrandTotal()-rcc.getDiscount("registrationui.AcademicExcellenceDiscount")));
            discountAmount=rcc.getDiscount("registrationui.AcademicExcellenceDiscount");
        }
        else if(freedom.isSelected()){
            grandTotal.setText(String.valueOf(rcc.getGrandTotal()-rcc.getDiscount("registrationui.FreedomFighterDiscount")));
            discountAmount=rcc.getDiscount("registrationui.FreedomFighterDiscount");
        }
        else if(minority.isSelected()){
            grandTotal.setText(String.valueOf(rcc.getGrandTotal()-rcc.getDiscount("registrationui.MinorityDiscount"))); 
            discountAmount=rcc.getDiscount("registrationui.MinorityDiscount");
        }
        else {
            discountAmount=0;
        }
        
        ShowDiscount sd=new ShowDiscount();
        PopulateDisBox pdb= new PopulateDisBox();
        MakeSound ms= new MakeSound();
        
        sd.register(ms);
        sd.register(pdb);
        
        ms.setEvent(sd);
        pdb.setEvent(sd);
        
        sd.postMessage(String.valueOf(discountAmount));
    }//GEN-LAST:event_calDisActionPerformed

    private void academicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academicActionPerformed
       
      if(academic.isSelected())
        rcc.addCompositeDiscount(rcc.getDiscountPloicy("registrationui.AcademicExcellenceDiscount"));
        else{
            for(IDiscountStrategy ids:rcc.getCompositeDisocunt().disList)
            {
                if(ids.getClass().toString().equals("class registrationui.AcademicExcellenceDiscount"))
                    rcc.getCompositeDisocunt().disList.remove(ids);
            }
        }
    }//GEN-LAST:event_academicActionPerformed

    private void freedomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freedomActionPerformed
     if(freedom.isSelected())
        rcc.addCompositeDiscount(rcc.getDiscountPloicy("registrationui.FreedomFighterDiscount"));
        else{
            for(IDiscountStrategy ids:rcc.getCompositeDisocunt().disList)
            {
                if(ids.getClass().toString().equals("class registrationui.FreedomFighterDiscount"))
                    rcc.getCompositeDisocunt().disList.remove(ids);
            }
        }
    }//GEN-LAST:event_freedomActionPerformed

    private void academicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_academicStateChanged
       
    }//GEN-LAST:event_academicStateChanged

    private void freedomStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_freedomStateChanged
        
    }//GEN-LAST:event_freedomStateChanged

    private void minorityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_minorityStateChanged
        
    }//GEN-LAST:event_minorityStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PersistenceFacade pf= new PersistenceFacade();
            if((pf.put("asdas", this, RegistrationUI.class))>0){
                this.dispose(); 
                JOptionPane.showMessageDialog(null,"Successfully Added");                  
            }else{
                JOptionPane.showMessageDialog(null,"Some Error Occured ! Try Again.");  
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistrationUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrationUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox academic;
    private javax.swing.JButton addCourse;
    private javax.swing.JButton calDis;
    private javax.swing.JTextField courseId;
    private javax.swing.JDialog courseRemove;
    public static javax.swing.JTable courseTable;
    public static javax.swing.JTextField discount;
    private javax.swing.JCheckBox freedom;
    private javax.swing.JTextField grandTotal;
    private javax.swing.JDialog invalidWarning;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox minority;
    private javax.swing.JButton newReg;
    private javax.swing.JLabel percentage;
    private javax.swing.JComboBox<String> policy;
    private javax.swing.JButton removeCourse;
    private javax.swing.JLabel removeErr;
    public javax.swing.JTextField taxCon;
    // End of variables declaration//GEN-END:variables
}
