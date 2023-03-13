package adlister;

import javax.servlet.jsp.jstl.core.Config;
import java.sql.Connection;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) {

    }

    @Override
    public List<Ad> all() {
        return null;
    }
}
