package nl.tudelft.simulation.housinggame.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;

public class SqlUtils
{

    private SqlUtils()
    {
        // utility class
    }

    public static Connection dbConnection() throws SQLException, ClassNotFoundException
    {
        String jdbcURL = "jdbc:mysql://localhost:3306/housinggame";
        String dbUser = "housinggame";
        String dbPassword = "tudHouse#4";

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
    }

    @SuppressWarnings("unchecked")
    public static <R extends org.jooq.UpdatableRecord<R>> R readRecordFromId(final DataSource dataSource, final Table<R> table,
            final int recordId)
    {
        DSLContext dslContext = DSL.using(dataSource, SQLDialect.MYSQL);
        return dslContext.selectFrom(table).where(((TableField<R, Integer>) table.field("id")).eq(recordId)).fetchOne();
    }

}
