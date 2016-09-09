package guipackage;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miaryvard
 */
public class ClientConnectGUI1 extends javax.swing.JFrame
{

    ClientProxy clientproxy = new ClientProxy();
    Socket s;

    /**
     * Creates new form ClientConnectGUI1
     */
    public ClientConnectGUI1()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        msgField = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        ipText = new java.awt.TextField();
        ipLabel = new java.awt.Label();
        portText = new java.awt.TextField();
        portLabel = new java.awt.Label();
        connectBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgArea = new javax.swing.JTextArea();
        onlineLabel = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        recieverField = new javax.swing.JTextField();
        resLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        users = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 237, 237));

        msgField.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        msgField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                msgFieldActionPerformed(evt);
            }
        });

        sendBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        sendBtn.setText("SEND");
        sendBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sendBtnActionPerformed(evt);
            }
        });

        ipText.setBackground(new java.awt.Color(255, 255, 255));
        ipText.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        ipText.setName(""); // NOI18N
        ipText.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ipTextActionPerformed(evt);
            }
        });

        ipLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        ipLabel.setText("IP:");

        portText.setBackground(new java.awt.Color(255, 255, 255));
        portText.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        portText.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                portTextActionPerformed(evt);
            }
        });

        portLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        portLabel.setText("Port:");

        connectBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        connectBtn.setText("Connect");
        connectBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                connectBtnActionPerformed(evt);
            }
        });

        msgArea.setBackground(new java.awt.Color(246, 245, 245));
        msgArea.setColumns(20);
        msgArea.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        msgArea.setRows(5);
        msgArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        msgArea.addContainerListener(new java.awt.event.ContainerAdapter()
        {
            public void componentAdded(java.awt.event.ContainerEvent evt)
            {
                msgAreaComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(msgArea);

        onlineLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        onlineLabel.setText("Online users:");

        loginField.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        loginField.setText("anonym");

        loginLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        loginLabel.setText("Login name:");

        recieverField.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        recieverField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                recieverFieldActionPerformed(evt);
            }
        });

        resLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        resLabel.setText("Recievers: ");

        jButton1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBounds(new java.awt.Rectangle(-10000, -10000, 10, 10));

        users.setBackground(new java.awt.Color(244, 241, 241));
        users.setColumns(20);
        users.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 13)); // NOI18N
        users.setRows(5);
        users.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(users);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(onlineLabel)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(resLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recieverField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 274, Short.MAX_VALUE))
                                    .addComponent(msgField))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(portLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ipText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(loginLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(connectBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(loginLabel)
                                .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(connectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ipText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ipLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(portLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(onlineLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recieverField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        msgField.getAccessibleContext().setAccessibleName("jText");
        ipText.getAccessibleContext().setAccessibleName("ipText");
        ipLabel.getAccessibleContext().setAccessibleName("IP");
        portText.getAccessibleContext().setAccessibleName("portText");
        portLabel.getAccessibleContext().setAccessibleName("Port");
        portLabel.getAccessibleContext().setAccessibleDescription("");
        connectBtn.getAccessibleContext().setAccessibleName("ConnectButton");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        try
        {
            clientproxy.logout();
        } catch (IOException ex)
        {
            Logger.getLogger(ClientConnectGUI1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void recieverFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_recieverFieldActionPerformed
    {//GEN-HEADEREND:event_recieverFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recieverFieldActionPerformed

    private void msgAreaComponentAdded(java.awt.event.ContainerEvent evt)//GEN-FIRST:event_msgAreaComponentAdded
    {//GEN-HEADEREND:event_msgAreaComponentAdded

    }//GEN-LAST:event_msgAreaComponentAdded

    private void connectBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_connectBtnActionPerformed
    {//GEN-HEADEREND:event_connectBtnActionPerformed

        try
        {
            String ip = ipText.getText();
            int port = Integer.parseInt(portText.getText());
            clientproxy = new ClientProxy();
            s = clientproxy.connect(ip, port);
            clientproxy.registrerObserver(this);
            clientproxy.start();
            clientproxy.login(loginField.getText());
        } catch (IOException ex)
        {
            Logger.getLogger(ClientConnectGUI1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_connectBtnActionPerformed

    private void portTextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_portTextActionPerformed
    {//GEN-HEADEREND:event_portTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portTextActionPerformed

    private void ipTextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ipTextActionPerformed
    {//GEN-HEADEREND:event_ipTextActionPerformed

    }//GEN-LAST:event_ipTextActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sendBtnActionPerformed
    {//GEN-HEADEREND:event_sendBtnActionPerformed
        try
        {
            //            writer = new PrintWriter(s.getOutputStream(), true);
            //            writer.println(sendText.getText());
            clientproxy.sendMSG(recieverField.getText(), msgField.getText());
            msgField.setText("");
        } catch (IOException ex)
        {
            Logger.getLogger(ClientConnectGUI1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sendBtnActionPerformed

    private void msgFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_msgFieldActionPerformed
    {//GEN-HEADEREND:event_msgFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ClientConnectGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ClientConnectGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ClientConnectGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ClientConnectGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ClientConnectGUI1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectBtn;
    private java.awt.Label ipLabel;
    private java.awt.TextField ipText;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField loginField;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextArea msgArea;
    private javax.swing.JTextField msgField;
    private javax.swing.JLabel onlineLabel;
    private java.awt.Label portLabel;
    private java.awt.TextField portText;
    private javax.swing.JTextField recieverField;
    private javax.swing.JLabel resLabel;
    private javax.swing.JButton sendBtn;
    private javax.swing.JTextArea users;
    // End of variables declaration//GEN-END:variables

    void userlistupdated(String[] list)
    {
        String st="";
        for (String user : list)
        {
            st += user+"\n";
        }
        users.setText(st);
    }

    void msgupdatet(String user, String msg)
    {
        msgArea.append(user + ":" + msg + "\n");
    }

}
