package com.example.android.harrypotter;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    String participants_name;
    double sum;
    static final String score = "score";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * This method is called when the start button is clicked.
     */
    public void start(View view) {
        ScrollView scrollView = (ScrollView) findViewById(R.id.activity_main);
        View name = findViewById(R.id.name);
        scrollView.smoothScrollTo(0, name.getBottom());
    }
    /**
     * This method calculates the points for the first question
     */
    public void check_the_first() {
        EditText answer_one = (EditText) findViewById(R.id.first_question);
        String answer = answer_one.getText().toString();
        Log.i("answer is", answer);

        if (answer.equalsIgnoreCase(getString(R.string.first_answer))) {
            sum += 1;
            answer_one.setText(R.string.correct_message);
            answer_one.setTextColor(ContextCompat.getColor(this, R.color.correctColor));
        }
        else{
            answer_one.setText(R.string.incorrect_message);
            answer_one.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }
    }
    /**
     * This method calculates the points for the second question
    */
    public void check_the_second() {
        CheckBox lavanda_checkbox = (CheckBox) findViewById(R.id.lavanda_checkbox);
        boolean lavanda_checked = lavanda_checkbox.isChecked();

        CheckBox ginny_checkbox = (CheckBox) findViewById(R.id.ginny_checkbox);
        boolean ginny_checked = ginny_checkbox.isChecked();

        CheckBox padma_checkbox = (CheckBox) findViewById(R.id.padma_checkbox);
        boolean padma_checked = padma_checkbox.isChecked();

        CheckBox parvati_checkbox = (CheckBox) findViewById(R.id.parvati_checkbox);
        boolean parvati_checked = parvati_checkbox.isChecked();

        CheckBox pancy_checkbox = (CheckBox) findViewById(R.id.pancy_checkbox);
        boolean pancy_checked = pancy_checkbox.isChecked();

        if (lavanda_checked) {
            lavanda_checkbox.setText(R.string.lavanda_message);
            lavanda_checkbox.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }
        else{
            lavanda_checkbox.setText(R.string.correct_message);
            lavanda_checkbox.setTextColor(ContextCompat.getColor(this, R.color.correctColor));
            sum += 0.2;
            Log.i("lavanda ", "" + sum);
        }
        if (parvati_checked) {
            parvati_checkbox.setText(R.string.parvati_message);
            parvati_checkbox.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }
        else{
            parvati_checkbox.setText(R.string.correct_message);
            parvati_checkbox.setTextColor(ContextCompat.getColor(this, R.color.correctColor));
            sum += 0.2;
            Log.i("parvati ", "" + sum);
        }
        if (padma_checked) {
            padma_checkbox.setText(R.string.correct_message);
            padma_checkbox.setTextColor(ContextCompat.getColor(this, R.color.correctColor));
            sum += 0.2;
            Log.i("padma ", "" + sum);
        }
        else{
            padma_checkbox.setText(R.string.padma_message);
            padma_checkbox.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }
        if (ginny_checked) {
            ginny_checkbox.setText(R.string.ginny_message);
            ginny_checkbox.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }
        else{
            ginny_checkbox.setText(R.string.correct_message);
            ginny_checkbox.setTextColor(ContextCompat.getColor(this, R.color.correctColor));

            sum += 0.2;
            Log.i("ginni ", "" + sum);
        }
        if (pancy_checked) {
            pancy_checkbox.setText(R.string.correct_message);
            pancy_checkbox.setTextColor(ContextCompat.getColor(this, R.color.correctColor));
            sum += 0.2;
            Log.i("pancy ", "" + sum);
        }
        else{
            pancy_checkbox.setText(R.string.pancy_message);
            pancy_checkbox.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }
    }
    /**
     * This method calculates the points for the third question
     */
    public void check_the_third() {
        EditText answer_one = (EditText) findViewById(R.id.third_question);
        String answer = answer_one.getText().toString();
        Log.i("answer is", answer);

        if (answer.equalsIgnoreCase(getString(R.string.third_answer))) {
            sum += 1;
            answer_one.setText(R.string.correct_message);
            answer_one.setTextColor(ContextCompat.getColor(this, R.color.correctColor));
        }
        else{
            answer_one.setText(R.string.incorrect_message);
            answer_one.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }
    }

    /**
     * This method calculates the points for the fourth question
     */
    public void check_the_fourth()
    {
        RadioButton tiara_button = (RadioButton) findViewById(R.id.tiara);
        boolean tiara_checked = tiara_button.isChecked();

        RadioButton nagini_button = (RadioButton) findViewById(R.id.nagini);
        boolean nagini_checked = nagini_button.isChecked();

        RadioButton sword_button = (RadioButton) findViewById(R.id.sword);
        boolean sword_checked = sword_button.isChecked();

        RadioButton diary_button = (RadioButton) findViewById(R.id.diary);
        boolean diary_checked = diary_button.isChecked();


        if (sword_checked) {
            sword_button.setText(R.string.correct_message);
            sword_button.setTextColor(ContextCompat.getColor(this, R.color.correctColor));
            sum += 1;
        }
        else if (nagini_checked) {
            nagini_button.setText(R.string.incorrect_message);
            nagini_button.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }
        if (tiara_checked) {
            sword_button.setText(R.string.correct_message);
            tiara_button.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }
        if (diary_checked) {
            diary_button.setText(R.string.correct_message);
            diary_button.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }

    }

    /**
     * This method calculates the points for the fifth question
     */
    public void check_the_fifth() {
        EditText answer_one = (EditText) findViewById(R.id.fifth_question);
        String answer = answer_one.getText().toString();
        Log.i("answer is", answer);

        if (answer.equalsIgnoreCase(getString(R.string.fifth_answer))) {
            sum += 1;
            answer_one.setText(R.string.correct_message);
            answer_one.setTextColor(ContextCompat.getColor(this, R.color.correctColor));
        }
        else{
            answer_one.setText(R.string.incorrect_message);
            answer_one.setTextColor(ContextCompat.getColor(this, R.color.mistakeColor));
        }
    }
    /**
     * This method displays the result
     */
    public void submit(View view) {
        sum = 0.0;
        check_the_first();
        check_the_second();
        check_the_third();
        check_the_fourth();
        check_the_fifth();

        createMessage();

    }

    /**
     * This method creates the result message
     */
    public void createMessage(){
        String message;
        EditText nameTextfield = (EditText) findViewById(R.id.name);
        message = nameTextfield.getText().toString() + '\n';
        if (sum > 4.7){
            message += getString(R.string.message_one, "" + String.format("%.3f", sum));
        }
        else if (sum > 2.7) {
            message += getString(R.string.message_two, "" + String.format("%.3f", sum));
        }
        else {
            message += getString(R.string.message_three, "" + String.format("%.3f", sum));
        }
        displayResult(message);
    }

    public void displayResult(String message) {
        TextView quantityTextView = (TextView) findViewById(R.id.result);
        quantityTextView.setText(message);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
