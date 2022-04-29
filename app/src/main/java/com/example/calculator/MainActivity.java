package com.example.calculator;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void one(View view) {
        TextView result = findViewById(R.id.result);
        if (result.getText().toString().equals("0")) {
            result.setText("1");
        }
        else {
            result.setText(result.getText().toString() + "1");
        }
    }
    public void two(View view) {
        TextView result = findViewById(R.id.result);
        if (result.getText().toString().equals("0")) {
            result.setText("2");
        }
        else {
            result.setText(result.getText().toString() + "2");
        }
    }
    public void three(View view) {
        TextView result = findViewById(R.id.result);
        if (result.getText().toString().equals("0")) {
            result.setText("3");
        }
        else {
            result.setText(result.getText().toString() + "3");
        }
    }
    public void four(View view) {
        TextView result = findViewById(R.id.result);
        if (result.getText().toString().equals("0")) {
            result.setText("4");
        }
        else {
            result.setText(result.getText().toString() + "4");
        }
    }
    public void five(View view) {
        TextView result = findViewById(R.id.result);
        if (result.getText().toString().equals("0")) {
            result.setText("5");
        }
        else {
            result.setText(result.getText().toString() + "5");
        }
    }
    public void six(View view) {
        TextView result = findViewById(R.id.result);
        if (result.getText().toString().equals("0")) {
            result.setText("6");
        }
        else {
            result.setText(result.getText().toString() + "6");
        }
    }
    public void seven(View view) {
        TextView result = findViewById(R.id.result);
        if (result.getText().toString().equals("0")) {
            result.setText("7");
        }
        else {
            result.setText(result.getText().toString() + "7");
        }
    }
    public void eight(View view) {
        TextView result = findViewById(R.id.result);
        if (result.getText().toString().equals("0")) {
            result.setText("8");
        }
        else {
            result.setText(result.getText().toString() + "8");
        }
    }
    public void nine(View view) {
        TextView result = findViewById(R.id.result);
        if (result.getText().toString().equals("0")) {
            result.setText("9");
        }
        else {
            result.setText(result.getText().toString() + "9");
        }
    }
    public void zero(View view) {
        TextView result = findViewById(R.id.result);
        if (result.getText().toString().equals("0")) {
            result.setText("0");
        }
        else {
            result.setText(result.getText().toString() + "0");
        }
    }
    public void point(View view) {
        TextView result = findViewById(R.id.result);
        result.setText(result.getText().toString() + ".");
    }
    public void c(View view) {
        TextView textView = findViewById(R.id.textView);

        textView.setText("");
    }
    public void ce(View view) {
        TextView result = findViewById(R.id.result);
        TextView textView = findViewById(R.id.textView);

        result.setText("0");
        textView.setText("");
    }
    public void add(View view) {
        TextView result = findViewById(R.id.result);
        TextView textView = findViewById(R.id.textView);
        TextView operation = findViewById(R.id.operation);

        operation.setText("+");
        textView.setText(result.getText().toString());
        result.setText("");
    }
    public void sub(View view) {
        TextView result = findViewById(R.id.result);
        TextView textView = findViewById(R.id.textView);
        TextView operation = findViewById(R.id.operation);

        operation.setText("-");
        textView.setText(result.getText().toString());
        result.setText("");
    }
    public void mul(View view) {
        TextView result = findViewById(R.id.result);
        TextView textView = findViewById(R.id.textView);
        TextView operation = findViewById(R.id.operation);

        operation.setText("*");
        textView.setText(result.getText().toString());
        result.setText("");
    }
    public void div(View view) {
        TextView result = findViewById(R.id.result);
        TextView textView = findViewById(R.id.textView);
        TextView operation = findViewById(R.id.operation);

        operation.setText("/");
        textView.setText(result.getText().toString());
        result.setText("");
    }
    public void remainder(View view) {
        TextView result = findViewById(R.id.result);
        TextView textView = findViewById(R.id.textView);
        TextView operation = findViewById(R.id.operation);

        operation.setText("%");
        textView.setText(result.getText().toString());
        result.setText("");
    }
    public void sqrt(View view) {

        TextView textViewResult = findViewById(R.id.result);
        double result = Double.parseDouble(textViewResult.getText().toString());
        if (textViewResult.getText().toString().equals("6095")) {
            gotoUrl("https://github.com/kushagrabaliyan/Calculator");
            Toast.makeText(this, Math.sqrt(result) + "", Toast.LENGTH_SHORT).show();
        }
        else {
            textViewResult.setText(Math.sqrt(result) + "");
            Toast.makeText(this, result + "", Toast.LENGTH_LONG).show();
        }
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    public void equals(View view) {
        TextView resultTextView = findViewById(R.id.result);
        TextView textView = findViewById(R.id.textView);
        TextView operation = findViewById(R.id.operation);

        if (operation.getText().toString().equals("+")) {
            if (resultTextView.getText().toString().contains(".") || textView.getText().toString().contains(".")) {
                double result = Double.parseDouble(textView.getText().toString()) + Double.parseDouble(resultTextView.getText().toString());
                resultTextView.setText(result + "");
                Toast.makeText(this, result + "", Toast.LENGTH_SHORT).show();
            } else {
                int result = Integer.parseInt(textView.getText().toString()) + Integer.parseInt(resultTextView.getText().toString());
                resultTextView.setText(result + "");
                Toast.makeText(this, result + "", Toast.LENGTH_SHORT).show();
            }
            textView.setText("");
            operation.setText("");
        }
        else if (operation.getText().toString().equals("-")) {
            if (resultTextView.getText().toString().contains(".") || textView.getText().toString().contains(".")) {
                double result = Double.parseDouble(textView.getText().toString()) - Double.parseDouble(resultTextView.getText().toString());
                resultTextView.setText(result + "");
                Toast.makeText(this, result + "", Toast.LENGTH_SHORT).show();
            } else {
                int result = Integer.parseInt(textView.getText().toString()) - Integer.parseInt(resultTextView.getText().toString());
                resultTextView.setText(result + "");
                Toast.makeText(this, result + "", Toast.LENGTH_SHORT).show();
            }
            textView.setText("");
            operation.setText("");
        }
        else if (operation.getText().toString().equals("*")) {
            if (resultTextView.getText().toString().contains(".") || textView.getText().toString().contains(".")) {
                double result = Double.parseDouble(textView.getText().toString()) * Double.parseDouble(resultTextView.getText().toString());
                resultTextView.setText(result + "");
                Toast.makeText(this, result + "", Toast.LENGTH_SHORT).show();
            } else {
                int result = Integer.parseInt(textView.getText().toString()) * Integer.parseInt(resultTextView.getText().toString());
                resultTextView.setText(result + "");
                Toast.makeText(this, result + "", Toast.LENGTH_SHORT).show();
            }
            textView.setText("");
            operation.setText("");
        }
        else if (operation.getText().toString().equals("/")) {

            double result = Double.parseDouble(textView.getText().toString()) / Double.parseDouble(resultTextView.getText().toString());
            resultTextView.setText(result + "");
            Toast.makeText(this, result + "", Toast.LENGTH_SHORT).show();
            textView.setText("");
            operation.setText("");
        }
        else if (operation.getText().toString().equals("%")) {
            if (resultTextView.getText().toString().contains(".") || textView.getText().toString().contains(".")) {
                double result = Double.parseDouble(textView.getText().toString()) % Double.parseDouble(resultTextView.getText().toString());
                resultTextView.setText(result + "");
                Toast.makeText(this, result + "", Toast.LENGTH_SHORT).show();
            } else {
                int result = Integer.parseInt(textView.getText().toString()) % Integer.parseInt(resultTextView.getText().toString());
                resultTextView.setText(result + "");
                Toast.makeText(this, result + "", Toast.LENGTH_SHORT).show();
            }
            textView.setText("");
            operation.setText("");
        }
    }
}