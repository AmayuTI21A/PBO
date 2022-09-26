/* 
NAMA  : Angga Maulana Yusup
Kelas : TI21A
NIM   : 20210040002
*/
package JOptionPane;
import javax.swing.JOptionPane;
public class TugasSesi1NO2 {
    public static void main(String[] args) {
     String input ="";
        input = JOptionPane.showInputDialog("Anda sedang belajar apa ?");
        String Message = ( "Belajar " + input + " sangat mudah");
        JOptionPane.showMessageDialog(null, Message);        
    }
}