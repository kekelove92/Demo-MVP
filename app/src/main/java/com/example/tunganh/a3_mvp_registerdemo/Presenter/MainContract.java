package com.example.tunganh.a3_mvp_registerdemo.Presenter;

/**
 * Created by TungAnh on 4/25/17.
 */
public interface MainContract {
    interface View{
        void onRegisterSuccess();
        void onRegisterFalse();
    }

    interface Presenter{
        void register(String id, String pw);
    }


}
