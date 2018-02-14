package datazi.com.backendless;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //load login fragment
        LoginFragment loginFragment=new LoginFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.login_fragment,loginFragment).commit();
    }
}
