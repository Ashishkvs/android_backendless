package datazi.com.backendless;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.backendless.Backendless;

public class MainActivity extends AppCompatActivity {
    public static final String APP_ID="A4458B7E-1DBA-3988-FF34-7AEFE8860500";
    public static final String SECRET_KEY="90E840B5-84FF-693B-FF2B-97A4C644B100";
    public static final String VERSION="4.0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Backendless.initApp(this,APP_ID,SECRET_KEY);

        //load Fragment
        loadFragment(new MenuFragment());
    }
    //FRAGMENT
    public boolean loadFragment(Fragment fragment){
        if(fragment !=null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
