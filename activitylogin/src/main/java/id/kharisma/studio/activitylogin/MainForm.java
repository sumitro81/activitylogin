package id.kharisma.studio.activitylogin;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainForm extends AppCompatActivity {

    Button btnExit, btnLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form);

        btnExit = (Button) findViewById(R.id.btnExit);
        btnLogOut = (Button) findViewById(R.id.btnLogOut);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainForm.this);
                builder.setMessage("Do you want to Continue Log Out?")
                        .setTitle("Warning!")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast t = Toast.makeText(getApplicationContext(), "Tombol 'YES' dipilih", Toast.LENGTH_SHORT);
                                t.show();
                            setContentView(R.layout.activity_main);}})

                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast t = Toast.makeText(getApplicationContext(), "Tombol 'NO' dipilih", Toast.LENGTH_SHORT);
                                t.show();}});


                                AlertDialog alert = builder.create();
                                alert.show();
                            }

            });
    }
}
