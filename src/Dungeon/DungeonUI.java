package Dungeon;

 //@author Eric 
public class DungeonUI extends javax.swing.JFrame 
{
    // These variables are used by the program
    public static int position = 1;
    public static boolean key = false;
    public static String [] Room = new String [9];
    public static String command;
    // Creates new form DungeonUI and sets the key picture to be invisible
    public DungeonUI() 
    {
        initComponents();
        jLabel4.setVisible(false);
    }

    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eric\\Pictures\\sword.png")); // NOI18N

        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("The Dungeon of Why Are You Even in Here");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eric\\Pictures\\sword.png")); // NOI18N

        button.setText("Enter");
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPress(evt);
            }
        });
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInputOutput(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setRows(8);
        textArea.setText("Any text that consists of all capitals is a command that you can enter. First you should CLEAR YOUR MIND.");
        textArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textArea);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eric\\Pictures\\Key.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed

    }//GEN-LAST:event_textFieldActionPerformed
// When the player presses the enter button, player action according to their input is calculated
    private void buttonPress(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPress
        // Players input for textField
        command = textField.getText();
        command = command.toUpperCase();
        
        // The text that is displayed to the character dpending on which room they are in.
        Room[0]="You stumble upon a locked chest and it appears that there is no way to open it."
                + " You should head SOUTH and continue to look around.";
        Room[1] = "You have entered a dungeon unlike any other, one that smells"
                + " of bones and chicken strips. You have only one option, head"
                + " SOUTH, deeper into the dungeon";
        Room[2]="This hallway leads to a dead end, but wait, there's seems to be a key buried in the ground."
                + " You can TAKE THE KEY and head SOUTH.";
        Room[3] = "The walls have golden bricks and gleam with beauty, you seem"
                + " to be approaching something amazing. You can head NORTH or SOUTH.";
        Room[4] = "As you walk down the long hallway, you notice various portraits"
                + " hanging from the walls, sadly they are all damaged and you can"
                + " barely make out each image. You can continue to head SOUTH or head"
                + " back NORTH.";
        Room[5] = "Wow, a muddy hallway. You can continue NORTH or head back SOUTH.";
        Room[6] = "As you turn down the nicer of the two hallways, a foul odour"
                + " becomes apparent. You can continue down the hall by heading NORTH or head EAST.";
        Room[7] = "You have reached a split hallway, you can either head EAST or WEST.";
        Room[8] = "There are no bricks in this hallway, as the walls are made"
                + " with mud and clay. You can head WEST or NORTH";
        // If the player has the key, two rooms will now provide a different experience.
        if (key == true)
        {
            Room[0]="There's is a locked chest, but you may have the key for it,"
                    + " do you wish to OPEN THE CHEST? You may also head SOUTH.";
            Room[2]="This is the room you found the key in... Yup, it's fine empty"
                    + " room. You can head SOUTH.";
        }    
        // Player is told they are mad if they don't enter an actual command
        if ((!"NORTH".equals(command))&&(!"SOUTH".equals(command))&&(!"EAST".equals(command))&&(!"WEST".equals(command))&&(!"TAKE THE KEY".equals(command))&&(!"OPEN THE CHEST".equals(command))&&(!"CLEAR YOUR MIND".equals(command)))
        {
            textArea.setText("You are mad, watch what you say, you should CLEAR YOUR MIND.");
        }
        // If the player enters an actual command, the program will continue
        if (("NORTH".equals(command))||("SOUTH".equals(command))||("EAST".equals(command))||("WEST".equals(command))||("TAKE THE KEY".equals(command))||("OPEN THE CHEST".equals(command))||("CLEAR YOUR MIND".equals(command)))
        {
            if (("OPEN THE CHEST".equals(command))&&(position == 0)&&(key == true))
            {
                textArea.setText("Congratulations, there was a little warlock within the chest, since you released him, he turned you into a chicken, now you can live the rest of your life happily as a chicken!");
                textField.disable();
            }
            //You take the key and more options are available, the key picture also shows that you have the key
            if (("TAKE THE KEY".equals(command))&&(position == 2))
            {
                key = true;
                // Resets the text of your room
                textArea.setText(Room[position]);
                jLabel4.setVisible(true);
            }
            // Shows the text of the current room you are in
            if ("CLEAR YOUR MIND".equals(command))
            {
                textArea.setText(Room[position]);
            }
            // If player inputs a direction, it is sent to TraverseDungeon
            if (("NORTH".equals(command))||("SOUTH".equals(command))||("EAST".equals(command))||("WEST".equals(command)))
            {
                TraverseDungeon(command);
                textArea.setText(Room[position]);
            }
        }
    }//GEN-LAST:event_buttonPress

    private void buttonInputOutput(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInputOutput
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonInputOutput

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DungeonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DungeonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DungeonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DungeonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new DungeonUI().setVisible(true);
            }
        });
    }
   
    // This function handles how the player moves through the dungeon and keeps track of their position also allowing them to only move in certain directions
    public static int TraverseDungeon(String text)
    {
        if (("NORTH".equals(text))&&((position >= 3)&&(position <= 8)))
        {
            position = position - 3;
        }
        if (("SOUTH".equals(text))&&((position >= 0)&&(position <= 5)))
        {
            position = position + 3;
        }
        if (("EAST".equals(text))&&((position == 6)||(position == 7)))
        {
            position = position + 1;
        }
        if (("WEST".equals(text))&&((position == 7)||(position == 8)))
        {
            position = position -1;
        }
        
        return position;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea textArea;
    public javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}