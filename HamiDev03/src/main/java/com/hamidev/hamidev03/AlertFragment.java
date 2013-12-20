package com.hamidev.hamidev03;



import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 *
 */
public class AlertFragment extends DialogFragment {

    private String title;
    private String message;

    public AlertFragment() {
        // Required empty public constructor
    }

    public AlertFragment(String title, String message) {
        this.title = title;
        this.message = message;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder theBuilder = new AlertDialog.Builder(getActivity());
        theBuilder.setTitle(this.title).setMessage(this.message);
        return theBuilder.create();
    }
}
