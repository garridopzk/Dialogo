package com.example.dialogo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showDialogButton = findViewById(R.id.showDialogButton);
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Diálogo de Ejemplo");
        builder.setMessage("Desea Realizar el pedido.");
        builder.setPositiveButton("Aceptar pedido", (dialog, which) -> dialog.dismiss());
        builder.setNegativeButton("Cancelar pedido", (dialog, which) -> dialog.dismiss());
        builder.show();
    }
}
