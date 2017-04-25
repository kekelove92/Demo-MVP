package com.example.tunganh.a3_mvp_registerdemo.Model;

/**
 * Created by TungAnh on 4/25/17.
 */
public interface DataSource {
    void validate(String id, String pw, CallBack callBack);
    interface CallBack{
        void RegisterSuccess();
        void RegisterFalse();
    }
}
