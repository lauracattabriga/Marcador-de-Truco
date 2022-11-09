package com.example.basquete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int TIME_A = 1;
    private final int TIME_B = 2;

    private final int PONTOS_PARA_ZERO = 0;
    private final int PONTOS_PARA_DOIS = 2;
    private final int PONTOS_PARA_QUATRO = 4;
    private final int PONTOS_PARA_OITO = 8;
    private final int PONTOS_PARA_DEZ = 10;
    private final int PONTOS_PARA_DOZE = 12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increasePointInPlayer(int playerNumber, int point){

        TextView pontuacao_jogador = null;

        if (playerNumber == TIME_A){
            pontuacao_jogador = (TextView) findViewById(R.id.jogador1_pts);
        } else {
            pontuacao_jogador = (TextView) findViewById(R.id.jogador2_pts);
        }

        int pontuacao = Integer.parseInt((String) pontuacao_jogador.getText());
        pontuacao += point;

        pontuacao_jogador.setText(String.valueOf(pontuacao));

        Log.d("BUTTON", playerNumber + " | " + point);
    }
    public void increaseOneInPlayerOne(View view) {
        increasePointInPlayer(TIME_A, PONTOS_PARA_DOIS);
    }

    public void increaseThreeInPlayerOne(View view) {
        increasePointInPlayer(TIME_A, PONTOS_PARA_QUATRO);
    }

    public void increaseSixInPlayerOne(View view) {
        increasePointInPlayer(TIME_A, PONTOS_PARA_OITO);
    }

    public void increaseNineInPlayerOne(View view) {
        increasePointInPlayer(TIME_A, PONTOS_PARA_DEZ);
    }

    public void increaseTwelveInPlayerOne(View view) {
        increasePointInPlayer(TIME_A, PONTOS_PARA_DOZE);
    }

    public void increaseOneInPlayerTwo(View view) {
        increasePointInPlayer(TIME_B, PONTOS_PARA_DOIS);
    }

    public void increaseThreeInPlayerTwo(View view) {
        increasePointInPlayer(TIME_B, PONTOS_PARA_QUATRO);
    }

    public void increaseSixInPlayerTwo(View view) {
        increasePointInPlayer(TIME_B, PONTOS_PARA_OITO);
    }

    public void increaseNineInPlayerTwo(View view) {
        increasePointInPlayer(TIME_B, PONTOS_PARA_DEZ);
    }

    public void increaseTwelveInPlayerTwo(View view) {
        increasePointInPlayer(TIME_B, PONTOS_PARA_DOZE);
    }

    public void resetScore(View view) {
        TextView playerOneScore = (TextView) findViewById(R.id.jogador1_pts);
        playerOneScore.setText("" + PONTOS_PARA_ZERO);
        TextView playerTwoScore = (TextView) findViewById(R.id.jogador2_pts);
        playerTwoScore.setText("" + PONTOS_PARA_ZERO);
    }

}
