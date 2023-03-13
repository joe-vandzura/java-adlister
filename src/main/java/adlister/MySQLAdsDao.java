package adlister;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private List<Ad> ads;
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("error connecting to database", e);
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ymir_joe.ads");
            while (rs.next()) {
                ads.add(new Ad(
                        rs.getLong("ad_id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
            return ads;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();
            String sql = String.format("INSERT INTO ads (title, description, user_id) VALUES ('%s', '%s', %d);", ad.getTitle(), ad.getDescription(), ad.getUserId());
            long results = stmt.executeUpdate(sql);
            return results;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                1,
                "playstation for sale",
                "This is a slightly used playstation"
        ));
        ads.add(new Ad(
                2,
                1,
                "Super Nintendo",
                "Get your game on with this old-school classic!"
        ));
        ads.add(new Ad(
                3,
                2,
                "Junior Java Developer Position",
                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
                4,
                2,
                "JavaScript Developer needed",
                "Must have strong Java skills"
        ));
        return ads;
    }
}
