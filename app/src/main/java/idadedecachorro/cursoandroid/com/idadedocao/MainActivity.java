package idadedecachorro.cursoandroid.com.idadedocao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView  resultadoIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.caixaTextoId);
        botaoIdade=findViewById(R.id.botaoIdadeId);
        resultadoIdade=findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar o que foi digitado
                String textoDigitado = caixaTexto.getText().toString();

                if(textoDigitado.isEmpty() || Integer.parseInt(textoDigitado) < 1) {
                    //String vazia sem qualquer valor (mensagem de erro)
                    resultadoIdade.setText("Idade invalida!");
                }
                else{
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int valorResultadoFinal = valorDigitado * 7;

                    resultadoIdade.setText("A idade do cao em anos humanos é: " + valorResultadoFinal + "anos.");



                }
            }
        });

    }
}
