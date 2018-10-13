package com.example.matheus.projetopreparo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    RadioGroup verifSoma;
    RadioButton subtrai; //= findViewById(R.id.radio_div);
    RadioButton soma; //=  findViewById(R.id.radio_soma);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Resultado(this);
    }

    public void Resultado (View view)
    {

        int sinal;
        EditText valor = findViewById(R.id.valor);
        //Log.i("ERRO", valor.getText().toString());
//        if(valor.equals(""))
//        valor.setText(0);
        int nValor = Integer.valueOf(valor.getText().toString()); // COMO PASSAR P FLOAT?


        EditText seuSaldo = findViewById(R.id.sal);
        //    if(seuSaldo.equals(""))
        //          valor.setText(0);
        int nSaldo = Integer.valueOf(seuSaldo.getText().toString()); // COMO PASSAR P FLOAT?
        sinal = somaOuNao(view);

        nSaldo = nSaldo + (nValor * sinal);


        seuSaldo.setText(String.valueOf(nSaldo)); //


        //Mostra o "onde"
        EditText onde =  (EditText) findViewById(R.id.Onde);
        TextView mostraOnde = (TextView) findViewById(R.id.mostraOnde);
        mostraOnde.setText(onde.getText());

        //Mostra o "valor"
        TextView mostraValor = (TextView) findViewById(R.id.mostraValor);
        mostraValor.setText(valor.getText());

        onde.setText(" ");
        valor.setText(" ");
    }

    public int somaOuNao (View view) //SE PASSAR POR PARAMETRO O SOMDIV DA ERRO NA CHAMADA LA
    {
        int somDiv=0;
        verifSoma = findViewById(R.id.radio);

        RadioButton r = findViewById(R.id.radio_div);
        int radioVeriSub = verifSoma.getCheckedRadioButtonId();
        //  int radioVeriSoma = verifSoma.getCheckedRadioButtonId();
        subtrai = findViewById(radioVeriSub);
        //soma = findViewById(radioVeriSoma);

        if(r.isSelected())
            somDiv = -1;

        else
            somDiv = 1;

//        if(soma.isSelected())
//            somDiv = 1;

        return somDiv;
    }

}


