package netbeansgui;

import java.awt.Color;

/**
 *
 * @author Lucas Wiebe-Dembowski
 */
public class GUI extends javax.swing.JFrame implements userinterface.UserInterface{

    usercommandhandler.UserCommandHandler myUserCommandHandler;
    boolean LED1ButtonCurrentState = false;
    boolean LED2ButtonCurrentState = false;
    boolean LED3ButtonCurrentState = false;
    boolean LED4ButtonCurrentState = false;

    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Open = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        portName = new javax.swing.JTextField();
        setPortNameButton = new javax.swing.JButton();
        Messages = new java.awt.TextArea();
        stopCode = new javax.swing.JTextField();
        setStopCodeButton = new javax.swing.JButton();
        listPorts = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        Start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Open.setText("Open Port");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });

        Close.setText("Close Port");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        jLabel4.setText("Messages");

        portName.setText("COM6");
        portName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portNameActionPerformed(evt);
            }
        });

        setPortNameButton.setText("Set Port Name");
        setPortNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPortNameButtonActionPerformed(evt);
            }
        });

        stopCode.setText("CRLF");
        stopCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopCodeActionPerformed(evt);
            }
        });

        setStopCodeButton.setText("Set Stop Code");
        setStopCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStopCodeButtonActionPerformed(evt);
            }
        });

        listPorts.setText("List Available Serial Ports");
        listPorts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPortsActionPerformed(evt);
            }
        });

        Stop.setText("Stop");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });

        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Open)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Close))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(quit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(listPorts)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(portName, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(stopCode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(setPortNameButton)
                                    .addComponent(setStopCodeButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Start)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Stop)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Messages, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Open)
                    .addComponent(Close)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Stop)
                            .addComponent(Start))
                        .addGap(76, 76, 76)
                        .addComponent(listPorts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(portName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setPortNameButton))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stopCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setStopCodeButton))
                        .addGap(18, 18, 18)
                        .addComponent(quit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Messages, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        myUserCommandHandler.handleUserCommand("open");
    }//GEN-LAST:event_OpenActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        myUserCommandHandler.handleUserCommand("close");
    }//GEN-LAST:event_CloseActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        myUserCommandHandler.handleUserCommand("q");
    }//GEN-LAST:event_quitActionPerformed

    private void setPortNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPortNameButtonActionPerformed
        myUserCommandHandler.handleUserCommand("portName " + portName.getText());
    }//GEN-LAST:event_setPortNameButtonActionPerformed

    private void portNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portNameActionPerformed

    private void stopCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopCodeActionPerformed

    private void setStopCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStopCodeButtonActionPerformed
        myUserCommandHandler.handleUserCommand("stopCode " + stopCode.getText());
    }//GEN-LAST:event_setStopCodeButtonActionPerformed

    private void listPortsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPortsActionPerformed
        myUserCommandHandler.handleUserCommand("listPorts");
    }//GEN-LAST:event_listPortsActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        myUserCommandHandler.handleUserCommand("stop");
    }//GEN-LAST:event_StopActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        myUserCommandHandler.handleUserCommand("start");
    }//GEN-LAST:event_StartActionPerformed

    public void setCommand(usercommandhandler.UserCommandHandler myUserCommandHandler) {
        this.myUserCommandHandler = myUserCommandHandler;
    }
    
    @Override
    public void update(String theMessage){
        Messages.append(theMessage + "\n");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private java.awt.TextArea Messages;
    private javax.swing.JButton Open;
    private javax.swing.JButton Start;
    private javax.swing.JButton Stop;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton listPorts;
    private javax.swing.JTextField portName;
    private javax.swing.JButton quit;
    private javax.swing.JButton setPortNameButton;
    private javax.swing.JButton setStopCodeButton;
    private javax.swing.JTextField stopCode;
    // End of variables declaration//GEN-END:variables
}
