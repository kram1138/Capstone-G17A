package pcbluetoothtest;
 
/**
 * @author Lucas Wiebe-Dembowski
 */
public class PcBluetoothTest {
    final static boolean USING_GUI = true;
   
    public static void main(String[] args) {
        serialcom.SerialCom myCom = new serialcom.SerialCom("COM5");
        
        if(USING_GUI){
            final netbeansgui.GUI myUI = new netbeansgui.GUI();
            
            usercommandhandler.UserCommandHandler myCommand = new usercommandhandler.UserCommandHandler(myUI, myCom);
            myUI.setCommand(myCommand);
        
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                   myUI.setVisible(true);
                }
            });
        
        }else{
            final standardio.StandardIO myUI = new standardio.StandardIO();
            
            usercommandhandler.UserCommandHandler myCommand = new usercommandhandler.UserCommandHandler(myUI, myCom);
            myUI.setCommand(myCommand);
        
            Thread theUIThread = new Thread(myUI);
            theUIThread.start();
        }

        System.out.println("UI Thread started.");
   }
}
