package sg.edu.rp.c346.id22022096.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // obtain sharedpreference instance
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        // create a sharedpreference editor by calling edit()
        SharedPreferences.Editor prefEdit = prefs.edit();
        // set a key-value pair in the editor
        prefEdit.putString("greetings", "hello!");
        // call commit() to save the changes made to the sharedpreference
        prefEdit.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // obtain sharedpreference instance
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        // retrieve the saved data from sharedpreference with a default value if no matching data
        String msg = prefs.getString("greetings","no greetings name");
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG);
        //toast.show();

    }
}