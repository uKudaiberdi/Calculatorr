package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private double firstVar, secondVar;
    private Boolean isClickOperation = false;
    private String operation;
    private Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
        share = findViewById(R.id.sharebtn);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }


    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                //клинкул на единицу
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("1");
                }else if (isClickOperation){
                    tvResult.setText("1");
                }else {
                    tvResult.append("1");
                }
                isClickOperation = false;
                break;
            case R.id.btn_two:
                //кликнул на двойку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("2");
                }else if (isClickOperation){
                    tvResult.setText("2");
                }else {
                    tvResult.append("2");
                }
                isClickOperation = false;
                break;
            case R.id.btn_three:
                //кликнул на тройку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("3");
                }else if (isClickOperation){
                    tvResult.setText("3");
                }else {
                    tvResult.append("3");
                }
                isClickOperation = false;
                break;
            case R.id.btn_four:
                //кликнул на четверку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("4");
                }else if (isClickOperation){
                    tvResult.setText("4");
                }else {
                    tvResult.append("4");
                }
                isClickOperation = false;
                break;
            case R.id.btn_five:
                //кликнул на пятерку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("5");
                }else if (isClickOperation){
                    tvResult.setText("5");
                }else {
                    tvResult.append("5");
                }
                isClickOperation = false;
                break;
            case R.id.btn_six:
                //кликнул на шестерку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("6");
                }else if (isClickOperation){
                    tvResult.setText("6");
                }else {
                    tvResult.append("6");
                }
                isClickOperation = false;
                break;
            case R.id.btn_seven:
                //кликнул на семерку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("7");
                }else if (isClickOperation){
                    tvResult.setText("7");
                }else {
                    tvResult.append("7");
                }
                isClickOperation = false;
                break;
            case R.id.btn_eight:
                //кликнул на восьмерку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("8");
                }else if (isClickOperation){
                    tvResult.setText("8");
                }else {
                    tvResult.append("8");
                }
                isClickOperation = false;
                break;
            case R.id.btn_nine:
                // кликнул на девятку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("9");
                }else if (isClickOperation){
                    tvResult.setText("9");
                }else {
                    tvResult.append("9");
                }
                isClickOperation = false;
                break;
            case R.id.btn_null:
                //кликнул на ноль
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("0");
                }else if (isClickOperation){
                    tvResult.setText("0");
                }else {
                    tvResult.append("0");
                }
                isClickOperation = false;
                break;
            case R.id.btn_tochka:
                if (!tvResult.getText().toString().contains(".")){
                    tvResult.append(".");
                }
                break;
            case R.id.btn_clear:
                tvResult.setText("0");
                break;
            case R.id.btn_plus_minus:
                firstVar = Double.parseDouble(tvResult.getText().toString());
                Double result = Double.valueOf(0);
                result = firstVar *= -1;
                tvResult.setText(result.toString());
                break;
            case R.id.btn_procent:

                double no = Double.parseDouble(tvResult.getText().toString())/100;
                tvResult.setText(no+"");

                isClickOperation = true;

        }
    }

    public void onOperationClick(View view) {

        switch (view.getId()) {
            case R.id.btn_plus:
                firstVar = Double.parseDouble(tvResult.getText().toString());
                isClickOperation = true;
                operation = "+";
                break;
            case R.id.btn_minus:
                firstVar = Double.parseDouble(tvResult.getText().toString());
                isClickOperation = true;
                operation = "-";
                break;
            case R.id.btn_multiplication:
                firstVar =  Double.parseDouble(tvResult.getText().toString());
                isClickOperation = true;
                operation = "*";
                break;

            case R.id.btn_division:
                firstVar =Double.parseDouble(tvResult.getText().toString());
                isClickOperation = true;
                operation = "÷";
                break;
            case R.id.btn_equal:
                secondVar = Double.parseDouble(tvResult.getText().toString());
                Double result = Double.valueOf(0);
                share.setVisibility(View.INVISIBLE);
                switch (operation){
                    case "+":
                        result =  firstVar + secondVar;
                        break;
                    case "-":
                        result = firstVar - secondVar;
                        break;
                    case "*":
                        result =  firstVar * secondVar;
                        break;
                    case "÷":
                        result = firstVar / secondVar;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + operation);
                }

                tvResult.setText(result.toString());
                isClickOperation = true;
                break;



        }
    }
}
