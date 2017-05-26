package net.ridhoperdana.bukahobi_android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class CreateCommunityActivity extends AppCompatActivity implements View.OnClickListener{

    EditText name,desc,tags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_community);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        name = (EditText)findViewById(R.id.etComName);
        desc = (EditText)findViewById(R.id.etComDesc);
        tags = (EditText)findViewById(R.id.etTags);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab : get();break;
        }
    }

    private void get() {
        if(name.getText().length() == 0 || desc.getText().length() == 0 ||tags.getText().length() == 0 ){
            if (name.getText().length() == 0){
                name.setError("Nama Komunitas tidak boleh null");
            }
            if (desc.getText().length() == 0){
                desc.setError("Deskripsi komunitas harus diisi");
            }
            if (tags.getText().length() == 0){
                tags.setError("Isi tag minimal 1");
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
