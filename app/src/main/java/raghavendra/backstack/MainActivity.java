package raghavendra.backstack;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.fragment.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements FragmentA.OnFragmentInteractionListener {
//now try to do ur experiment witj setretaininstance
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, FragmentA.newInstance())
                     // .addToBackStack(null)
                        .commit();

    }


    @Override
    public void onFragmentClick() {
        System.out.println("----------------------------- onFragmentInteraction");

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, FragmentB1.newInstance())
                .addToBackStack(null)
                .commit();
    }
}
