package com.androidkt.archpaging.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.androidkt.archpaging.User;
import com.androidkt.archpaging.db.dao.UserDao;

@Database(entities = {User.class}, version = 1)
abstract public class AppDatabase extends RoomDatabase {

    public static final String DATABASE_NAME = "UserDb";

    public abstract UserDao userDao();

    // The creation of Database occurs in MainActivity.java

}
