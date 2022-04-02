package uqac.dim.soundsgood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;

public class MainActivity extends AppCompatActivity {

    private View selectedBeat = null;

    ActivityResultLauncher<Intent> activityLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if(result.getResultCode() == RESULT_OK){
                        Intent intent = result.getData();

                        if(intent != null) {
                            //extract data

                        }
                    }
                }
            }
    );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public void openActivityListeMusique() {
        Intent intent = new Intent(this, ListeMusique.class);
        activityLauncher.launch(intent);
    }

    public void openActivityParametres() {
        Intent intent = new Intent(this, Parametres.class);
        activityLauncher.launch(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.menu_ListeMusique:
                Log.i("DIM", "VOICI VOTRE LISTE DE MUSIQUE!");
                openActivityListeMusique();

                return true;

            case R.id.menu_Parametre:
                Log.i("DIM", "VOICI LES PARAMETRES!");
                openActivityParametres();

                return true;

            case R.id.menu_Interface_Principal:

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void SelectBeat (View view)
    {

        if(selectedBeat != null)
        {
            deselectColor(selectedBeat);
        }

        selectedBeat = view;

        selectColor(selectedBeat);
    }


    //remet la couleur déhighlightée quand tu cliques ailleurs
    public void deselectColor(View view)
    {
        Drawable selectedForeground = view.getForeground();

        if (selectedForeground == getDrawable(R.color.blank_selected))
            selectedBeat.setForeground(getDrawable(R.color.blank_unselected));

        else if (selectedForeground == getDrawable(R.color.do_selected))
            selectedBeat.setForeground(getDrawable(R.color.do_unselected));

        else if (selectedForeground == getDrawable(R.color.do_diese_selected))
            selectedBeat.setForeground(getDrawable(R.color.do_diese_unselected));

        else if (selectedForeground == getDrawable(R.color.re_selected))
            selectedBeat.setForeground(getDrawable(R.color.re_unselected));

        else if (selectedForeground == getDrawable(R.color.re_diese_selected))
            selectedBeat.setForeground(getDrawable(R.color.re_diese_unselected));

        else if (selectedForeground == getDrawable(R.color.mi_selected))
            selectedBeat.setForeground(getDrawable(R.color.mi_unselected));

        else if (selectedForeground == getDrawable(R.color.fa_selected))
            selectedBeat.setForeground(getDrawable(R.color.fa_unselected));

        else if (selectedForeground == getDrawable(R.color.fa_diese_selected))
            selectedBeat.setForeground(getDrawable(R.color.fa_diese_unselected));

        else if (selectedForeground == getDrawable(R.color.sol_selected))
            selectedBeat.setForeground(getDrawable(R.color.si_unselected));

        else if (selectedForeground == getDrawable(R.color.sol_diese_selected))
            selectedBeat.setForeground(getDrawable(R.color.si_unselected));

        else if (selectedForeground == getDrawable(R.color.la_selected))
            selectedBeat.setForeground(getDrawable(R.color.la_unselected));

        else if (selectedForeground == getDrawable(R.color.la_diese_selected))
            selectedBeat.setForeground(getDrawable(R.color.la_diese_unselected));

        else if (selectedForeground == getDrawable(R.color.si_selected))
            selectedBeat.setForeground(getDrawable(R.color.si_unselected));

        else if (selectedForeground == getDrawable(R.color.custom_selected))
            selectedBeat.setForeground(getDrawable(R.color.custom_unselected));
    }


    //switche la couleur quand tu cliques sur un endroit de la trame
    public void selectColor(View view)
    {
        Drawable selectedForeground = view.getForeground();

        if (selectedForeground == getDrawable(R.color.blank_unselected))
            selectedBeat.setForeground(getDrawable(R.color.blank_selected));

        else if (selectedForeground == getDrawable(R.color.do_unselected))
            selectedBeat.setForeground(getDrawable(R.color.do_selected));

        else if (selectedForeground == getDrawable(R.color.do_diese_unselected))
            selectedBeat.setForeground(getDrawable(R.color.do_diese_selected));

        else if (selectedForeground == getDrawable(R.color.re_unselected))
            selectedBeat.setForeground(getDrawable(R.color.re_selected));

        else if (selectedForeground == getDrawable(R.color.re_diese_unselected))
            selectedBeat.setForeground(getDrawable(R.color.re_diese_selected));

        else if (selectedForeground == getDrawable(R.color.mi_unselected))
            selectedBeat.setForeground(getDrawable(R.color.mi_selected));

        else if (selectedForeground == getDrawable(R.color.fa_unselected))
            selectedBeat.setForeground(getDrawable(R.color.fa_selected));

        else if (selectedForeground == getDrawable(R.color.fa_diese_unselected))
            selectedBeat.setForeground(getDrawable(R.color.fa_diese_selected));

        else if (selectedForeground == getDrawable(R.color.sol_unselected))
            selectedBeat.setForeground(getDrawable(R.color.sol_selected));

        else if (selectedForeground == getDrawable(R.color.sol_diese_unselected))
            selectedBeat.setForeground(getDrawable(R.color.sol_diese_selected));

        else if (selectedForeground == getDrawable(R.color.la_unselected))
            selectedBeat.setForeground(getDrawable(R.color.la_selected));

        else if (selectedForeground == getDrawable(R.color.la_diese_unselected))
            selectedBeat.setForeground(getDrawable(R.color.la_diese_selected));

        else if (selectedForeground == getDrawable(R.color.si_unselected))
            selectedBeat.setForeground(getDrawable(R.color.si_selected));

        else if (selectedForeground == getDrawable(R.color.custom_unselected))
            selectedBeat.setForeground(getDrawable(R.color.custom_selected));
    }

    public void selectNote(View view)
    {
        if (selectedBeat == null)
        {
            //jouer la note
            return;
        }

        switch(view.getId())
        {
            case R.id.Do:
               selectedBeat.setForeground(getDrawable(R.color.do_selected));
               break;

            case R.id.Re:
                selectedBeat.setForeground(getDrawable(R.color.re_selected));
                break;
        }
    }
}