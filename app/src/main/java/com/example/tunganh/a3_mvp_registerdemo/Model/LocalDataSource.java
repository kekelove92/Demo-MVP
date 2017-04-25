package com.example.tunganh.a3_mvp_registerdemo.Model;

/**
 * Created by TungAnh on 4/25/17.
 */
public class LocalDataSource implements DataSource{
    @Override
    public void validate(String id, String pw, CallBack callBack) {
        boolean isCorrect = true;
        if (id.isEmpty() || pw.isEmpty()){
            isCorrect = false;
        } if (isCorrect){
            callBack.RegisterSuccess();
        } else
            callBack.RegisterFalse();
    }
}
