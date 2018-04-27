package aaa.bbb.ccc09.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import aaa.bbb.ccc09.R;
import libs.mjn.prettydialog.PrettyDialog;
import libs.mjn.prettydialog.PrettyDialogCallback;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void startGame(View view) {
        Intent startGame = new Intent(this, GameActivity.class);
        startActivity(startGame);
    }

    public void openAbout(View view) {
        PrettyDialog dialog = new PrettyDialog(this);
        dialog.setIcon(R.drawable.pdlg_icon_info)
                .setAnimationEnabled(true)
                .addButton("OK", R.color.pdlg_color_white, R.color.pdlg_color_green, new PrettyDialogCallback() {
                    @Override
                    public void onClick() {
                        dialog.dismiss();

                    }
                })
                .setTitle(getString(R.string.rules_title))
                .setMessage(getString(R.string.rules)).show();

    }
}
