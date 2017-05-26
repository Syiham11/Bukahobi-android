package net.ridhoperdana.bukahobi_android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class CreateThreadActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name, content, tags,community;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_thread);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        name = (EditText)findViewById(R.id.etThreadName);
        content = (EditText)findViewById(R.id.etThreadDesc);
        tags = (EditText)findViewById(R.id.etCommunityTags);
        community = (EditText)findViewById(R.id.etCommunity);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab : get();break;
        }
    }

    private void get() {
        if(name.getText().length() == 0 || content.getText().length() == 0 ||tags.getText().length() == 0 || community.getText().length() == 0){
            if (name.getText().length() == 0){
                name.setError("Nama Diskusi tidak boleh kosong");
            }
            if (content.getText().length() == 0){
                content.setError("Balasan harus diisi");
            }
            if (tags.getText().length() == 0){
                tags.setError("Isi tag minimal 1");
            }
            if (community.getText().length()==0){
                community.setError("Oi isiii");
            }
        }else {
            String tagsText = tags.getText().toString();
            tagsText = tagsText.replaceAll(" ","");
            String[] tag = tagsText.split(",");
            for (int i = 0;i<tag.length;i++) {
                Log.d("" + i, tag[i]);
            }
        }
    }

}
