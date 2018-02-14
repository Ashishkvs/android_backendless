package datazi.com.backendless;


import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoggedInFragment extends Fragment {


    public LoggedInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_logged_in,container,false);
        Button button=view.findViewById(R.id.logoutButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Backendless.UserService.logout(new AsyncCallback<Void>() {
                    @Override
                    public void handleResponse(Void response) {
                        Toast.makeText(getActivity(),"You are logged out",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getActivity(),MainActivity.class);
                        startActivity(intent);

                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {
                        Toast.makeText(getActivity(),"Failed to log out",Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
        return view;
    }

}
