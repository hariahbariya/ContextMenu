package com.example.admin.contextmenu;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.btn);
        registerForContextMenu(button);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Choose Option");
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.option1:
                Toast.makeText(getApplicationContext(), "item 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.option2:
                Toast.makeText(getApplicationContext(), "item 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.optio3:
                Toast.makeText(getApplicationContext(), "item 3", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.option4:
                Toast.makeText(getApplicationContext(), "item 4", Toast.LENGTH_SHORT).show();
                return true;

                default:  return super.onContextItemSelected(item);
        }
    }
}
