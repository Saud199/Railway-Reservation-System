
package railwayreservationsystem;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

public class  MainProgram {

    public static void main(String[] args) {
        
        SplashScreen splash = new SplashScreen();
        splash.setLocationRelativeTo(null);
        splash.setVisible(true);
        
        Login loginScreen = new Login();
        
        try {
            
            for (int i =0 ; i<=100 ; i++) {
                Thread.sleep(40);
                splash.loadingnum.setText(Integer.toString(i)+"%");
                splash.loadingbar.setValue(i);
                
                if (i==100) {
                    splash.dispose();
                    loginScreen.setLocationRelativeTo(null);
                    loginScreen.setVisible(true);
                }
           
            }
            
        } catch (Exception e) {
            
        }
        
        
    }

}
    



