package appewtc.masterung.pbrurun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, userEditText, passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton avata0RadioButton, avata1RadioButton,
            avata2RadioButton, avata3RadioButton, avata4RadioButton;
    private String nameString, userString, passwordString, avataString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        bindWidget();


    }   // Main Method

    private void bindWidget() {

        nameEditText = findViewById(R.id.editText);
        userEditText = findViewById(R.id.editText2);
        passwordEditText = findViewById(R.id.editText3);
        radioGroup = findViewById(R.id.ragAvata);
        avata0RadioButton = findViewById(R.id.radioButton);
        avata1RadioButton = findViewById(R.id.radioButton2);
        avata2RadioButton = findViewById(R.id.radioButton3);
        avata3RadioButton = findViewById(R.id.radioButton4);
        avata4RadioButton = findViewById(R.id.radioButton5);

    }   // bindWidget

    public void clickSignUpSign(View view) {

    }   // clickSign

}   // Main Class
