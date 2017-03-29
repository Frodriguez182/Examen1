package com.fernando.rodriguez.taller2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    private EditText quantity;
    private Spinner material, dije, tipo;
    private ArrayAdapter<String> adapter;
    private RadioButton usd, cop;
    private TextView answ1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerMaterial = (Spinner) findViewById(R.id.Material_spinner);
        ArrayAdapter<CharSequence> adapterMaterial = ArrayAdapter.createFromResource(this,
                R.array.material_array, android.R.layout.simple_spinner_item);
        adapterMaterial.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMaterial.setAdapter(adapterMaterial);

        Spinner spinnerDije = (Spinner) findViewById(R.id.Dije_spinner);
        ArrayAdapter<CharSequence> adapterDije = ArrayAdapter.createFromResource(this,
                R.array.dije_array, android.R.layout.simple_spinner_item);
        adapterDije.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDije.setAdapter(adapterDije);

        Spinner spinnerType = (Spinner) findViewById(R.id.Type_spinner);
        ArrayAdapter<CharSequence> adapterType = ArrayAdapter.createFromResource(this,
                R.array.type_array, android.R.layout.simple_spinner_item);
        adapterType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerType.setAdapter(adapterType);

        quantity = (EditText)findViewById(R.id.txtQuantity);
        material = (Spinner)findViewById(R.id.Material_spinner);
        dije = (Spinner)findViewById(R.id.Dije_spinner);
        tipo = (Spinner)findViewById(R.id.Type_spinner);
        usd = (RadioButton)findViewById(R.id.radioButtonUSD);
        cop = (RadioButton)findViewById(R.id.radioButtonCOP);
    }

    public void ejecutar(View v){
        double costo;
        costo=this.calcular();
        answ1 = (TextView) findViewById(R.id.txtValorFinal);
        answ1.setText("$"+costo);
    }

    public double calcular(){
        String calMaterial, calDije, calType, calCurrency="";
        double calQuantity, calValorFinal;

        calQuantity = Double.parseDouble(quantity.getText().toString().trim());
        calMaterial = material.getSelectedItem().toString().trim();
        calDije = dije.getSelectedItem().toString().trim();
        calType = tipo.getSelectedItem().toString().trim();

        if (usd.isChecked()){
            calCurrency = "Dolar";
        }else{
            calCurrency = "Peso";
        }

        if (calMaterial.equals("Cuero")){
            if (calDije.equals("Martillo")){
                if (calType.equals("Oro") || calType.equals("Oro Rosa")){
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=100*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=320000*calQuantity;
                        return calValorFinal;
                    }
                }else if (calType.equals("Plata")){
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=80*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=256000*calQuantity;
                        return calValorFinal;
                    }
                }else{
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=70*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=224000*calQuantity;
                        return calValorFinal;
                    }
                }
            }else{
                if (calType.equals("Oro") || calType.equals("Oro Rosa")){
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=120*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=384000*calQuantity;
                        return calValorFinal;
                    }
                }else if (calType.equals("Plata")){
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=100*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=320000*calQuantity;
                        return calValorFinal;
                    }
                }else{
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=90*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=288000*calQuantity;
                        return calValorFinal;
                    }
                }
            }
        }else{
            if (calDije.equals("Martillo")){
                if (calType.equals("Oro") || calType.equals("Oro Rosa")){
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=90*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=288000*calQuantity;
                        return calValorFinal;
                    }
                }else if (calType.equals("Plata")){
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=70*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=224000*calQuantity;
                        return calValorFinal;
                    }
                }else{
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=50*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=160000*calQuantity;
                        return calValorFinal;
                    }
                }
            }else{
                if (calType.equals("Oro") || calType.equals("Oro Rosa")){
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=110*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=352000*calQuantity;
                        return calValorFinal;
                    }
                }else if (calType.equals("Plata")){
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=90*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=288000*calQuantity;
                        return calValorFinal;
                    }
                }else{
                    if (calCurrency.equals("Dolar")){
                        calValorFinal=80*calQuantity;
                        return calValorFinal;
                    }else{
                        calValorFinal=256000*calQuantity;
                        return calValorFinal;
                    }
                }
            }
        }


    }

    public void limpiar(View v){
        quantity.setText("");
        answ1.setText("");

        quantity.setFocusable(true);
    }


}
