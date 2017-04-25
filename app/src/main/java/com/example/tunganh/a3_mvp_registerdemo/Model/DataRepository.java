package com.example.tunganh.a3_mvp_registerdemo.Model;

/**
 * Created by TungAnh on 4/25/17.
 */
public class DataRepository implements DataSource {
    private DataSource mLocalDataSource;

    public DataRepository(DataSource localDataSource) {
        mLocalDataSource = localDataSource;
    }

    @Override
    public void validate(String id, String pw, CallBack callBack) {
        mLocalDataSource.validate(id, pw, callBack);
    }
}
