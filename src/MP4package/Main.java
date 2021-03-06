package MP4package;

import game.Game;
import gameobjects.Room;
import globals.Direction;
import javax.swing.JOptionPane;
//Wayne Waffles Trevor Waffles
/**
 * Main is the main implementation of the Adventure Game
 *
 * @author Wayne A. Campbell
 * @version 1.2 - 4/8/2015
 */
public class Main extends javax.swing.JFrame {

    private final Game game;
    /*  sets the pickUpBtn to false
     Prints text for enterance
     updates buttons based on directions being able to move in*/

    public Main() {
        initComponents();
        game = new Game();
        updateEntrance();
        buttonUpdate();
    }

    /**
     * updateOutput handles the output onto the screen
     *
     * @param roomNumber, current room
     * @return void
     */
    void updateOutput(int roomNumber) {
        String s;
        String i = " ";
        Room r = game.getPlayer().getRoom();
        if (roomNumber == Direction.NOEXIT) {
            s = "No Exit";
        } else {

            s = r.getName() + " (" + r.getDescription() + ") " + "\n";
            if (r.getFirstTime()) {
                s += r.getLongDescription();
                r.setFirstTimeFalse();

            }
            //Checks for item found
            if (r.getItem() != 0) {
                i = "Item Found: " + r.getItemString();
            } else {
            }

        }
        //Outputs the text into the textarea
        outputTA.setText(s + "\n" + i);

        //Cheks winning condition when at the Inn
        if ("room3".equals(r.getName())) {
            if (game.winGame()) {
                JOptionPane.showMessageDialog(this, "You have collected every Item, You have won the game!");

            } else {
                if (r.getFirstTime()) {
                    outputTA.append("Come back when you have all the items, kid. ");
                }
            }
        }

    }

    /**
     * Prints out the long description of a room, only the first time visited
     */
    void updateOutputLongDescription() {
        Room r = game.getPlayer().getRoom();
        String s = r.getLongDescription();
        outputTA.append("\n\n" + s + "\n");
    }

    /**
     * Prints out the text area for the first time.
     */
    void updateEntrance() {
        outputTA.setText("Room1" + " ("
                + "Enterance" + ")" + "\n"
                + "After driving along for hours, you arrive at the Pokagon State Park." + "\n"
                + "There is a Gatehouse to the west. ");

    }

    /**
     * Updates the Buttons by using the game.updateBtn keeping track of the
     * directions being able to move.
     *
     * @return void
     */
    void buttonUpdate() {
        if (game.updateBtn('N')) {
            wc_northBtn.setEnabled(false);
        } else {
            wc_northBtn.setEnabled(true);
        }

        if (game.updateBtn('S')) {
            wc_southBtn.setEnabled(false);
        } else {
            wc_southBtn.setEnabled(true);
        }

        if (game.updateBtn('W')) {
            wc_westBtn.setEnabled(false);
        } else {
            wc_westBtn.setEnabled(true);
        }

        if (game.updateBtn('E')) {
            wc_eastBtn.setEnabled(false);
        } else {
            wc_eastBtn.setEnabled(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wc_northBtn = new javax.swing.JButton();
        wc_westBtn = new javax.swing.JButton();
        wc_eastBtn = new javax.swing.JButton();
        wc_southBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTA = new javax.swing.JTextArea();
        wc_enterTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wc_northBtn.setText("North");
        wc_northBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wc_northBtnActionPerformed(evt);
            }
        });

        wc_westBtn.setText("West");
        wc_westBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wc_westBtnActionPerformed(evt);
            }
        });

        wc_eastBtn.setText("East");
        wc_eastBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wc_eastBtnActionPerformed(evt);
            }
        });

        wc_southBtn.setText("South");
        wc_southBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wc_southBtnActionPerformed(evt);
            }
        });

        outputTA.setColumns(20);
        outputTA.setRows(5);
        outputTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                outputTAKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(outputTA);

        wc_enterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wc_enterTFActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Command:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jLabel2.setText("Escape......To Pokagon!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wc_enterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wc_westBtn)
                                .addGap(73, 73, 73)
                                .addComponent(wc_eastBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wc_southBtn)
                                    .addComponent(wc_northBtn)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(wc_northBtn)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wc_eastBtn)
                            .addComponent(wc_westBtn))
                        .addGap(19, 19, 19)
                        .addComponent(wc_southBtn)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wc_enterTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wc_northBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wc_northBtnActionPerformed

    }//GEN-LAST:event_wc_northBtnActionPerformed

    private void wc_eastBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wc_eastBtnActionPerformed

    }//GEN-LAST:event_wc_eastBtnActionPerformed

    private void wc_westBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wc_westBtnActionPerformed

    }//GEN-LAST:event_wc_westBtnActionPerformed

    private void wc_southBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wc_southBtnActionPerformed

    }//GEN-LAST:event_wc_southBtnActionPerformed

    private void outputTAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outputTAKeyPressed

    }//GEN-LAST:event_outputTAKeyPressed

    private void wc_enterTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wc_enterTFActionPerformed
        String inputText = wc_enterTF.getText();
        String toUpperCase = inputText.toUpperCase();
        Room r = game.getPlayer().getRoom();
        String itemStr = r.getItemString();
        switch (toUpperCase) {
            case "GO NORTH":
            case "MOVE NORTH":
            case "NORTH":
                updateOutput(game.movePlayerTo(Direction.NORTH));
                wc_enterTF.setText("");
                break;
            case "GO SOUTH":
            case "MOVE SOUTH":
            case "SOUTH":
                updateOutput(game.movePlayerTo(Direction.SOUTH));
                wc_enterTF.setText("");
                break;
            case "GO WEST":
            case "MOVE WEST":
            case "WEST":
                updateOutput(game.movePlayerTo(Direction.WEST));
                wc_enterTF.setText("");
                break;
            case "GO EAST":
            case "MOVE EST":
            case "EAST":
                updateOutput(game.movePlayerTo(Direction.EAST));
                wc_enterTF.setText("");
                break;
            case "LOOK":
                updateOutputLongDescription();
                wc_enterTF.setText("");
                break;
            case "INVENTORY":
                outputTA.append(game.printItemArray());
                wc_enterTF.setText("");
                break;
            case "TAKE":
                game.transferItem();
                outputTA.append("\n\n" + "You have picked up the: " + itemStr);
                wc_enterTF.setText("");
                break;
            case "DROP":
                outputTA.append("\n\n What Item would you like to drop?");
                outputTA.append(game.printItemArray());
                outputTA.append("");
                wc_enterTF.setText("");
                break;

            case "PINE CONE":
                if (game.isItem(1)) {
                    game.removeItem(1);
                    outputTA.append("\n\n Dropped: Pine Cone");
                } else {
                    outputTA.append("\n\nItem not found.");
                }
                break;
            case "PARKING RECEIPT":
                if (game.isItem(2)) {
                    game.removeItem(2);
                    outputTA.append("\n\n Dropped: Parking Receipt");
                } else {
                    outputTA.append("\n\nItem not found.");
                }
                break;
            case "CATTAIL":
                if (game.isItem(3)) {
                    game.removeItem(3);
                    outputTA.append("\n\n Dropped: Cattail");
                } else {
                    outputTA.append("\n\nItem not found.");
                }
                break;
            case "BOAT":
                if (game.isItem(4)) {
                    game.removeItem(4);
                    outputTA.append("\n\n Dropped: Boat");
                } else {
                    outputTA.append("\n\nItem not found.");
                }
                break;
            case "CANTEEN":
                if (game.isItem(5)) {
                    game.removeItem(5);
                    outputTA.append("\n\n Dropped: Canteen");
                } else {
                    outputTA.append("\n\nItem not found.");
                }
                break;
            case "BLUEBIRD":
                if (game.isItem(6)) {
                    game.removeItem(6);
                    outputTA.append("\n\n Dropped: Bluebird");
                } else {
                    outputTA.append("\n\nItem not found.");
                }
                break;
            case "RUSTED KEY":
                if (game.isItem(7)) {
                    game.removeItem(7);
                    outputTA.append("\n\n Dropped: Rusted Key");
                } else {
                    outputTA.append("\n\nItem not found.");
                }
                break;
            case "MAP":
                if (game.isItem(8)) {
                    game.removeItem(8);
                    outputTA.append("\n\n Dropped: Map");
                } else {
                    outputTA.append("\n\nItem not found.");
                }
                break;

            case "SCORE":
                outputTA.append("\n\nThe way to win, is to have all the items when you visit the Inn.\n"
                        + "You have not won the game.\n");
                break;

            case "QUIT":
                System.exit(0);
                break;

            default:
                break;
        }
        wc_enterTF.setText("");
        buttonUpdate();
    }//GEN-LAST:event_wc_enterTFActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputTA;
    private javax.swing.JButton wc_eastBtn;
    private javax.swing.JTextField wc_enterTF;
    private javax.swing.JButton wc_northBtn;
    private javax.swing.JButton wc_southBtn;
    private javax.swing.JButton wc_westBtn;
    // End of variables declaration//GEN-END:variables
}
