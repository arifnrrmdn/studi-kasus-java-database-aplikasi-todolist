package util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseUtil {

    private static HikariDataSource hikariDataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setUsername("root");
        config.setPassword("toor");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/belajar_java_todolist");

        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60_000);
        config.setMaxLifetime(60 * 60 * 100);

        hikariDataSource = new HikariDataSource(config);
    }

    public static HikariDataSource getHikariDataSource(){
        return hikariDataSource;
    }

}
