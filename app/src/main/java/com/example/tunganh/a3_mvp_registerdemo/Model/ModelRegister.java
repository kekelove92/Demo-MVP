package com.example.tunganh.a3_mvp_registerdemo.Model;

/**
 * Created by TungAnh on 4/25/17.
 */
public class ModelRegister  {
    private String id;
    private String pw;

    public ModelRegister(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public ModelRegister() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
