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

import nl.tudelft.simulation.housinggame.data.Tables;
import nl.tudelft.simulation.housinggame.data.tables.records.UserRecord;

public class SqlUtils
{

    public static Connection dbConnection() throws SQLException, ClassNotFoundException
    {
        String jdbcURL = "jdbc:mysql://localhost:3306/housinggame";
        String dbUser = "housinggame";
        String dbPassword = "tudHouse#4";

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
    }

    public static UserRecord readUserFromUserId(final CommonData data, final int userId)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        return dslContext.selectFrom(Tables.USER).where(Tables.USER.ID.eq(userId)).fetchAny();
    }

    public static UserRecord readUserFromUsername(final CommonData data, final String username)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        return dslContext.selectFrom(Tables.USER).where(Tables.USER.USERNAME.eq(username)).fetchAny();
    }

    public static <R extends org.jooq.UpdatableRecord<R>> R readRecordFromId(final CommonData data, final Table<R> table,
            final int recordId)
    {
        return readRecordFromId(data.getDataSource(), table, recordId);
    }

    @SuppressWarnings("unchecked")
    public static <R extends org.jooq.UpdatableRecord<R>> R readRecordFromId(final DataSource dataSource, final Table<R> table,
            final int recordId)
    {
        DSLContext dslContext = DSL.using(dataSource, SQLDialect.MYSQL);
        return dslContext.selectFrom(table).where(((TableField<R, Integer>) table.field("id")).eq(recordId)).fetchOne();
    }

}
