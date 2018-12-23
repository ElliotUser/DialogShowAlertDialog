package robot.mr.dialogshowalertdialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Идентифекатор диалогового окна AlertDialog с кнопками
    private final int IDD_THREE_BUTTONS = 0;

    Button buttonShowDialog;

    AlertDialog.Builder ad;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShowDialog = (Button) findViewById(R.id.buttonShow);
        buttonShowDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        showDialog(IDD_THREE_BUTTONS);
    }

    protected Dialog onCreateDialog(int id){
        switch(id){
            case IDD_THREE_BUTTONS:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Выберите правильный ответ")
                        .setCancelable(false)
                        .setPositiveButton("Мяу", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                        .setNeutralButton("Гав", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                        .setNegativeButton("Не хочу", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                return builder.create();
            default:
                    return null;
        }
    }
}
