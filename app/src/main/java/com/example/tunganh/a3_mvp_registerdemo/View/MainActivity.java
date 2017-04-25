package com.example.tunganh.a3_mvp_registerdemo.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tunganh.a3_mvp_registerdemo.Presenter.MainContract;
import com.example.tunganh.a3_mvp_registerdemo.Presenter.MainPresenter;
import com.example.tunganh.a3_mvp_registerdemo.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mPresenter;
    ListView mListView;
    EditText edit_id;
    EditText edit_pw;
    Button btn_Reg;
    ArrayAdapter<String> mAdapter;
    ArrayList<String> arrUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
        mPresenter = new MainPresenter(this);


    }

    private void addEvents() {
        btn_Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = edit_id.getText().toString();
                String pw = edit_pw.getText().toString();
                mPresenter.register(id,pw);
                arrUser.add(0,id + "\n"+ pw);
                mAdapter.notifyDataSetChanged();
            }
        });
    }

    private void addControls() {

        edit_id = (EditText) findViewById(R.id.edit_ID);
        edit_pw = (EditText) findViewById(R.id.edit_PW);
        btn_Reg = (Button) findViewById(R.id.btn_reg);
        mListView = (ListView) findViewById(R.id.lv_user);
        arrUser = new ArrayList<>();
         mAdapter = new ArrayAdapter<String>(this,android.R.layout
            .simple_list_item_1,arrUser);
        mListView.setAdapter(mAdapter);

    }



    @Override
    public void onRegisterSuccess() {
        String id = edit_id.getText().toString();
        String pw = edit_pw.getText().toString();
        Toast.makeText(MainActivity.this,"Register Success !!!" +
                                        "\n" + "id: " + id +
                                        "\n" + "pw: "+ pw,
                                        Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRegisterFalse() {
        Toast.makeText(this, "Register False!!! "+ "Id and pw cannot blank", Toast.LENGTH_SHORT)
            .show();
    }
}
