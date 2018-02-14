package datazi.com.backendless;


import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {


    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_menu,container,false);
        ListView listView=(ListView) view.findViewById(R.id.mainMenu);

        final ArrayList<String> arrayList=new ArrayList();
        arrayList.add("Register");
        arrayList.add("Login");

        ArrayAdapter<ArrayList> arrayAdapter=new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    if(position==0){
                        Intent intent=new Intent(getContext(),RegisterActivity.class);
                        startActivity(intent);
                    }
                    else if(position==1){
                        Toast.makeText(getContext(),arrayList.get(position),Toast.LENGTH_SHORT).show();

                    }
            }
        });
        return view;
    }

}
