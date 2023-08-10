
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baglanti {

    private String kullaniciAdi = "root";
    private String parola = "";

    private String dbIsmi = "demo";

    // uzak bir sunucuysa adresini vermeliyiz
    private String host = "localhost";
    private int port = 3306;

    private Connection connection;

    // sql sorgularını çalıştırmak için class
    private Statement statement;

    public Baglanti() {

        // jdbc:mysql://localhost:3306/demo"
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbIsmi;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, parola);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void calisanlariGetir() {
        String sorgu = "SELECT * FROM calisanlar";

        try {
            statement = (Statement) connection.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
