package com.example.lstviewdataaapter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link one#newInstance} factory method to
 * create an instance of this fragment.
 */
public class one extends Fragment {
    Button add,sub,mul,div;
    EditText n1,n2;
    Double ans=0.0;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public one() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment one.
     */
    // TODO: Rename and change types and number of parameters
    public static one newInstance(String param1, String param2) {
        one fragment = new one();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_one, container, false);
        add=v.findViewById(R.id.btnadd);
        sub=v.findViewById(R.id.btnsub);
        mul=v.findViewById(R.id.btnmul);
        div=v.findViewById(R.id.btndiv);
        n1=v.findViewById(R.id.txtnum1);
        n2=v.findViewById(R.id.txtnum2);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1= Double.valueOf(n1.getText().toString());
                Double num2= Double.valueOf(n2.getText().toString());
                ans=num1+num2;
                Bundle bundle = new Bundle();
                bundle.putDouble("ans",ans);
                two frgment = new two();
                frgment.setArguments(bundle);
                getChildFragmentManager().beginTransaction().replace(R.id.layout,frgment).commit();
            }
        });
         return v;
    }
}