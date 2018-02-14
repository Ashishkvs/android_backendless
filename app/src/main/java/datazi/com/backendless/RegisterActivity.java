package datazi.com.backendless;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //load fragment
        RegisterFragment registerFragment=new RegisterFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.registerContainer,registerFragment).commit();

    }
}
