package registrationui;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CourseFactory extends javax.swing.JFrame {
    LinkedList <Course>  cList =new LinkedList<Course>();
    
    //newly added in V2.0 starts
    static CourseFactory instance=null;
    IExtraFeeCalculator efc;
    IDiscountStrategy ids=null;
    //newly added in V2.0 ends
    
    public CourseFactory() {
        initComponents();
        Course c= new Course();
        c.setId("CSE327");
        c.setTitle("SOFTWARE ENGINEERING");
        c.setCredit(3);
        c.setTutionPerCredit(4500);
        cList.add(c);
        Course c1= new Course();
        c1.setId("CSE338");
        c1.setTitle("NETWORKING");
        c1.setCredit(3);
        c1.setTutionPerCredit(4500);
        cList.add(c1);
        Course c2= new Course();
        c2.setId("CSE332");
        c2.setTitle("Computer Architechture");
        c2.setCredit(3);
        c2.setTutionPerCredit(4500);
        cList.add(c2);
        Course c3= new Course();
        c3.setId("CSE419");
        c3.setTitle("DATA MINING");
        c3.setCredit(3);
        c3.setTutionPerCredit(4500);
        cList.add(c3);
    }
    //newly added in V2.0 starts
    public static synchronized CourseFactory getInstance(){
        if(instance==null){
            instance= new CourseFactory();
        }
        return instance;
    }
    
    public IExtraFeeCalculator getExtraFeeCalculator(){
        File configFile = new File("config.properties");
        if(efc == null){
            try {
                FileReader reader = new FileReader(configFile);
                Properties props = new Properties();
                props.load(reader);

                String className = props.getProperty("extraFee");

//              System.out.print("Host name is: " + className);
                try {
                    try {
                        return efc=(IExtraFeeCalculator)Class.forName(className).newInstance();
                    } catch (InstantiationException ex) {
                        Logger.getLogger(CourseFactory.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(CourseFactory.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CourseFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
               System.out.println("not found");
            } catch (IOException ex) {
               System.out.println("I/O error");
            }
                    
        }
        return efc;
    }
       
//    public IDiscountStrategy  getDiscount(String policy) {
//        if(ids==null){
//            try {
//                try {
//                    ids=(IDiscountStrategy)Class.forName(policy).newInstance();
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(CourseFactory.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } catch (InstantiationException ex) {
//                Logger.getLogger(CourseFactory.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                Logger.getLogger(CourseFactory.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        return ids;
//    }   

    //newly added in V2.0 ends
    public Course getCourse(String id){
        Course c1=null;
        if(cList.isEmpty()){
            return c1;
        }
        else{
            for(Course c:cList){
                if(id.equals(c.getId()))
                    return c;
            }
        }
        return c1;
    }
    public void delCourse(String id){
        if(cList.isEmpty()){
            delMsg.setText("Database is empty");
            delNoti.setVisible(true);
        }
        else{
            for(Course c:cList){
                if(id.equals(c.getId())){                    
                   cList.remove(c);
                   delMsg.setText(c.getTitle()+" IS DELETED");
                   delNoti.setVisible(true);
                }
                else{
                    delMsg.setText("Course Does not exist !");
                    delNoti.setVisible(true);
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conf = new javax.swing.JDialog();
        msg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        no = new javax.swing.JButton();
        yes = new javax.swing.JButton();
        check = new javax.swing.JDialog();
        cId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        checkPerform = new javax.swing.JButton();
        courseDetails = new javax.swing.JDialog();
        notFound = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        showId = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        showTitle = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        showCredit = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        showFee = new javax.swing.JLabel();
        deleteCourse = new javax.swing.JDialog();
        delCourseCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        delPerform = new javax.swing.JButton();
        delNoti = new javax.swing.JDialog();
        delMsg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        courseId = new javax.swing.JTextField();
        courseTitle = new javax.swing.JTextField();
        courseCredit = new javax.swing.JTextField();
        courseTutionPerCredit = new javax.swing.JTextField();
        addCourse = new javax.swing.JButton();
        checkCourse = new javax.swing.JButton();
        deleteCoure = new javax.swing.JButton();

        conf.setMaximumSize(new java.awt.Dimension(300, 200));
        conf.setMinimumSize(new java.awt.Dimension(300, 200));
        conf.setModal(true);
        conf.setPreferredSize(new java.awt.Dimension(300, 200));
        conf.setResizable(false);
        conf.setLocationRelativeTo(null);

        msg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        msg.setForeground(new java.awt.Color(0, 204, 0));
        msg.setText("MSG");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Do you want to add more?");

        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        yes.setText("Yes");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout confLayout = new javax.swing.GroupLayout(conf.getContentPane());
        conf.getContentPane().setLayout(confLayout);
        confLayout.setHorizontalGroup(
            confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(no)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yes)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        confLayout.setVerticalGroup(
            confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msg)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no)
                    .addComponent(yes))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        check.setMaximumSize(new java.awt.Dimension(300, 200));
        check.setMinimumSize(new java.awt.Dimension(300, 150));
        check.setPreferredSize(new java.awt.Dimension(300, 150));
        check.setLocationRelativeTo(null);

        jLabel7.setText("Course Code");

        checkPerform.setText("Check");
        checkPerform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPerformActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checkLayout = new javax.swing.GroupLayout(check.getContentPane());
        check.getContentPane().setLayout(checkLayout);
        checkLayout.setHorizontalGroup(
            checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(checkLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(checkPerform)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        checkLayout.setVerticalGroup(
            checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(checkPerform)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        courseDetails.setMaximumSize(new java.awt.Dimension(300, 200));
        courseDetails.setMinimumSize(new java.awt.Dimension(300, 200));
        courseDetails.setPreferredSize(new java.awt.Dimension(300, 200));
        courseDetails.setLocationRelativeTo(null);

        notFound.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        notFound.setText("Course Details");

        jLabel9.setText("Course ID:");

        jLabel10.setText("Course Title:");

        jLabel11.setText("Course Credit:");

        jLabel13.setText("Course Fee:");

        javax.swing.GroupLayout courseDetailsLayout = new javax.swing.GroupLayout(courseDetails.getContentPane());
        courseDetails.getContentPane().setLayout(courseDetailsLayout);
        courseDetailsLayout.setHorizontalGroup(
            courseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseDetailsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(courseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notFound)
                    .addGroup(courseDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showTitle))
                    .addGroup(courseDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showId))
                    .addGroup(courseDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showCredit))
                    .addGroup(courseDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showFee)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        courseDetailsLayout.setVerticalGroup(
            courseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notFound)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(courseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(showId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(courseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(showTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(courseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(showCredit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(courseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(showFee))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deleteCourse.setMinimumSize(new java.awt.Dimension(300, 150));
        deleteCourse.setPreferredSize(new java.awt.Dimension(300, 150));
        deleteCourse.setLocationRelativeTo(null);

        jLabel8.setText("Course Code");

        delPerform.setText("Delete");
        delPerform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delPerformActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteCourseLayout = new javax.swing.GroupLayout(deleteCourse.getContentPane());
        deleteCourse.getContentPane().setLayout(deleteCourseLayout);
        deleteCourseLayout.setHorizontalGroup(
            deleteCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(deleteCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(deleteCourseLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(delPerform)))
                .addGap(119, 119, 119))
        );
        deleteCourseLayout.setVerticalGroup(
            deleteCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteCourseLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(deleteCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(delPerform)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        delNoti.setMinimumSize(new java.awt.Dimension(300, 150));
        delNoti.setPreferredSize(new java.awt.Dimension(300, 150));
        delNoti.setLocationRelativeTo(null);

        delMsg.setText("Del");

        javax.swing.GroupLayout delNotiLayout = new javax.swing.GroupLayout(delNoti.getContentPane());
        delNoti.getContentPane().setLayout(delNotiLayout);
        delNotiLayout.setHorizontalGroup(
            delNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delNotiLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(delMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );
        delNotiLayout.setVerticalGroup(
            delNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delNotiLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(delMsg)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Course Manger");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Course Manager");

        jLabel2.setText("Course ID");

        jLabel3.setText("Course Title");

        jLabel4.setText("Course Credit");

        jLabel5.setText("Course Tution Per Credit");

        addCourse.setText("Add Course");
        addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseActionPerformed(evt);
            }
        });

        checkCourse.setText("Check Course");
        checkCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCourseActionPerformed(evt);
            }
        });

        deleteCoure.setText("Delete Course");
        deleteCoure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCoureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseCredit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(courseTutionPerCredit))
                            .addComponent(courseTitle)
                            .addComponent(courseId))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(addCourse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteCoure)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(courseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(courseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(courseCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(courseTutionPerCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteCoure)
                            .addComponent(checkCourse)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addCourse)
                        .addContainerGap(44, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(354, 292));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseActionPerformed
       Course c= new Course();
      
       c.setId(courseId.getText());
       c.setTitle(courseTitle.getText());
       c.setCredit(Integer.parseInt(courseCredit.getText()));
       c.setTutionPerCredit(Integer.parseInt(courseTutionPerCredit.getText()));
      
       cList.add(c);
       msg.setText(c.getId()+" is Added Successfully");
       conf.setVisible(true);

    }//GEN-LAST:event_addCourseActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        courseId.setText("");
        courseTitle.setText("");
        courseCredit.setText("");
        courseTutionPerCredit.setText("");
        conf.dispose();
        
    }//GEN-LAST:event_yesActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        courseId.setText("");
        courseTitle.setText("");
        courseCredit.setText("");
        courseTutionPerCredit.setText("");
        conf.dispose();
        for(Course c: cList){
           System.out.println(c.getId());
        }
    }//GEN-LAST:event_noActionPerformed

    private void checkCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCourseActionPerformed
//        getExtraFeeCalculator();
        check.setVisible(true);
        
    }//GEN-LAST:event_checkCourseActionPerformed

    private void checkPerformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPerformActionPerformed
        String id=cId.getText();
        Course c;     
        c=getCourse(id);  
        if(c == null){
            check.dispose();
            courseDetails.setVisible(true);
            notFound.setText("No matched found");
            showId.setText("");
            showTitle.setText("");
            showCredit.setText("");
            showFee.setText("");
        }
        else {
            check.dispose();
            courseDetails.setVisible(true);
            notFound.setText("Course Details");
            showId.setText(c.getId());
            showTitle.setText(c.getTitle());
            showCredit.setText(String.valueOf(c.getCredit()));
            showFee.setText(String.valueOf(c.getSubTotal()));   
        }
    }//GEN-LAST:event_checkPerformActionPerformed

    private void deleteCoureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCoureActionPerformed
        deleteCourse.setVisible(true);
    }//GEN-LAST:event_deleteCoureActionPerformed

    private void delPerformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delPerformActionPerformed
        delCourse(delCourseCode.getText());
        deleteCourse.dispose();
    }//GEN-LAST:event_delPerformActionPerformed
    
    public static void main(String args[]) {
//        CourseFactory cf= new CourseFactory();
//        cf.getExtraFeeCalculator();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseFactory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourse;
    private javax.swing.JTextField cId;
    private javax.swing.JDialog check;
    private javax.swing.JButton checkCourse;
    private javax.swing.JButton checkPerform;
    private javax.swing.JDialog conf;
    private javax.swing.JTextField courseCredit;
    private javax.swing.JDialog courseDetails;
    private javax.swing.JTextField courseId;
    private javax.swing.JTextField courseTitle;
    private javax.swing.JTextField courseTutionPerCredit;
    private javax.swing.JTextField delCourseCode;
    private javax.swing.JLabel delMsg;
    private javax.swing.JDialog delNoti;
    private javax.swing.JButton delPerform;
    private javax.swing.JButton deleteCoure;
    private javax.swing.JDialog deleteCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msg;
    private javax.swing.JButton no;
    private javax.swing.JLabel notFound;
    private javax.swing.JLabel showCredit;
    private javax.swing.JLabel showFee;
    private javax.swing.JLabel showId;
    private javax.swing.JLabel showTitle;
    private javax.swing.JButton yes;
    // End of variables declaration//GEN-END:variables
}
