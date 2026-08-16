package org.utl.dsm504.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
Button btnMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnMensaje = findViewById(R.id.btnMensaje);
        spinner = findViewById(R.id.spinner);

        //Llenar al inniciar
        llenarSpinner();

        //Aciiones del boton
        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarSeleccionado();
            }
        });
        


    }

    private void mostrarSeleccionado() {
        Usuario usuario = (Usuario) spinner.getSelectedItem();
        String mensaje = "El id seleccionado es: " + usuario.getId() + "  y pertenece al usuario: " + usuario.getNombre();
        Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();
    }

    private void llenarSpinner() {
        //Creamos una lista de tipo clase usuario para alkmacenar una lista,
        // Con todoa los datos de la clase Usuario
        ArrayList<Usuario> usuarios = new ArrayList<>();

        //Llenamos la lista
        usuarios.add(new Usuario(1, "Juan Pablo", "Rea", "Cano"));
        usuarios.add(new Usuario( 2, "Michelle", "Garcia", "Olavarria"));
        usuarios.add(new Usuario( 3, "Daniel", "Garcia", "Olvarria"));
        usuarios.add(new Usuario( 4, "Sarai", "Perez", "Marques"));
        usuarios.add(new Usuario( 5, "Jonathan", "Herrera", "Hernandez"));
        usuarios.add(new Usuario( 6, "Isaac", "Rea", "Perez"));

        //Mandar los datos al spinner
        ArrayAdapter<Usuario> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,usuarios);

        //mandar el adaptador al spinner
        spinner.setAdapter(adapter);
//Mostrar sugerencia
        spinner.setPrompt(getString(R.string.seleccion_user));

    }
}