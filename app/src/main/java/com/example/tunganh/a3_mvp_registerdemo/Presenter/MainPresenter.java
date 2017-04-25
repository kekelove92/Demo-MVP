package com.example.tunganh.a3_mvp_registerdemo.Presenter;

import com.example.tunganh.a3_mvp_registerdemo.Model.DataRepository;
import com.example.tunganh.a3_mvp_registerdemo.Model.DataSource;
import com.example.tunganh.a3_mvp_registerdemo.Model.LocalDataSource;

/**
 * Created by TungAnh on 4/25/17.
 */
public class MainPresenter implements MainContract.Presenter {
    private DataSource mRepository;
    private MainContract.View mView;

    public MainPresenter (MainContract.View view){
        mRepository = new DataRepository(new LocalDataSource());
        this.mView = view;
    }

    @Override
    public void register(String id, String pw) {
        mRepository.validate(id, pw, new DataSource.CallBack() {
            @Override
            public void RegisterSuccess() {
                mView.onRegisterSuccess();
            }

            @Override
            public void RegisterFalse() {
                mView.onRegisterFalse();
            }
        });
    }
}
