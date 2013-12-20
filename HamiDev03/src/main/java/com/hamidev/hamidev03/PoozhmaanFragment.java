package com.hamidev.hamidev03;



import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 *
 */
public class PoozhmaanFragment extends DialogFragment {


    public PoozhmaanFragment() {
        // Required empty public constructor
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder poozhmaanBuilder = new AlertDialog.Builder(getActivity());
        poozhmaanBuilder.setTitle(getString(R.string.poozhmaan_fragment_title))
        .setMessage(((Button)getActivity().getSupportFragmentManager().findFragmentByTag("mainPlaceholderFragment").getView().findViewById(R.id.button)).getText());

        return poozhmaanBuilder.create();
    }
}
