import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class HelperDB extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "dbProj.db";
    private static final int DATABASE_VERSION = 1;
    private String strCreate, strDelete;

    public HelperDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        strCreate ="CREATE TABLE "+ Student.TABLE_STUDENTS;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
