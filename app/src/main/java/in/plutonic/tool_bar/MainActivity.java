package in.plutonic.tool_bar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //This below line Represented BackActionbar to our ToolBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //this override method is for make a connection with menu layout.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    //this override method for make OnclickListener.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1_id){
            Toast.makeText(getApplicationContext(),"ITEM1",Toast.LENGTH_LONG).show();
        }

        else if (id == R.id.item2_id){
            Toast.makeText(getApplicationContext(),"ITEM2",Toast.LENGTH_LONG).show();
        }

        else if (id == R.id.item3_id){
            Toast.makeText(getApplicationContext(),"ITEM3",Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.search_id){
            Toast.makeText(getApplicationContext(),"Search Icon Clicked",Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.shopping_id){
            Toast.makeText(getApplicationContext(),"Shopping Icon Clicked",Toast.LENGTH_LONG).show();
        }
        //The Below else if condition for BackAction
        else if (id == android.R.id.home){
            //here i write finish() method because I want to leave from Apk
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
