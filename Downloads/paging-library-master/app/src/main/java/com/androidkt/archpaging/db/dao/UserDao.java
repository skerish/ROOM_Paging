package com.androidkt.archpaging.db.dao;

import androidx.paging.DataSource;
import androidx.paging.LivePagedListProvider;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.androidkt.archpaging.User;

import java.util.List;

@Dao
public interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<User> users);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User... user);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateUser(User... user);

    @Query("delete from user where user_id = :id")
    int deleteUser(int id);

    @Query("SELECT * FROM User")
    DataSource.Factory<Integer,User> usersByFirstName();

}
