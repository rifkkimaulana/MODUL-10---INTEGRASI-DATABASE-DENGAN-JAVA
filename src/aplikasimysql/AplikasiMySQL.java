
package aplikasimysql;

import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rifki Maulana
 */

public class AplikasiMySQL {

    public static void main(String[] args) {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            System.out.println("Berhasil meregistrasi driver");
        }
        catch(SQLException ex) {
            System.out.println("Gagal meregistrais driver");
            System.out.println("Pesan : " +ex.getMessage());
        }
    }
    
}
