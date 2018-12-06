package com.yoliveira.onlinestore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import com.yoliveira.onlinestore.repositorio.IRepositorio;
import com.yoliveira.onlinestore.repositorio.MarcaRepositorio;
import com.yoliveira.onlinestore.repositorio.ProcessadorRepositorio;
import com.yoliveira.onlinestore.repositorio.SistemaRepositorio;

public class CadastroActivity extends AppCompatActivity {

    private Spinner spinnerMarcas;
    private Spinner spinnerSistema;
    private Spinner spinnerProcessador;
    private Switch switchUsado;
    private RadioGroup radioGrouptipo;
    private TextView textViewMemoria;
    private SeekBar seekBarMemoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

    spinnerMarcas =(Spinner) findViewById(R.id.form_spinner_marca);
    popularSpinner(spinnerMarcas,new MarcaRepositorio());

        spinnerSistema =(Spinner) findViewById(R.id.form_spinner_sistema);
        popularSpinner(spinnerSistema,new SistemaRepositorio());

        spinnerProcessador =(Spinner) findViewById(R.id.form_spinner_Processador);
        popularSpinner(spinnerProcessador,new ProcessadorRepositorio());

        switchUsado=(Switch)findViewById(R.id.form_switch_usado);
        radioGrouptipo=(RadioGroup) findViewById(R.id.form_radiogroup_tipo);

        textViewMemoria=(TextView)findViewById(R.id.form_textview_memoria);
        seekBarMemoria=(SeekBar)findViewById(R.id.form_seekbar_memoria);
        seekBarMemoria.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int value, boolean fromUser) {
                textViewMemoria.setText(calcularValorSeekBar(value));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    private String calcularValorSeekBar(int valor){
        if(valor==0){
            return "sem memoria RAM";

        }else{
            return Integer.toString(valor)+"GB";
        }

    }



    private void popularSpinner(Spinner spinner, IRepositorio repositorio){

        ArrayAdapter<String>spinnerArrayAdapter=new ArrayAdapter<String>(
            this,
                R.layout.spinner_item,
                repositorio.listar()
        );
        spinnerArrayAdapter.setDropDownViewResource(
                R.layout.spinner_item
        );
        spinner.setAdapter(spinnerArrayAdapter);
    }








}
