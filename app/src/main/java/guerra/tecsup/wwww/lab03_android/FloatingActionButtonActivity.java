package guerra.tecsup.wwww.lab03_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FloatingActionButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);
    }
    public void action(View view){
        Toast.makeText(this, "FAB Action!", Toast.LENGTH_SHORT).show();
    }

}
