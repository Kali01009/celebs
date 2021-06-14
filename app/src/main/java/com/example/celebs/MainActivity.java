package com.example.celebs;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public
class MainActivity extends AppCompatActivity {

    Button firstChoice, secChoice, thirdChoice;
    TextView total;
    Drawable scott, bruce, jason;
    ImageView imageView;
    int       biggin = 1, score = 0;

    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        imageView = ( ImageView ) findViewById ( R.id.images );


        firstChoice = ( Button ) findViewById ( R.id.choice1 );
        secChoice   = ( Button ) findViewById ( R.id.choice2 );
        thirdChoice = ( Button ) findViewById ( R.id.choice3 );
        total       = ( TextView ) findViewById ( R.id.total );

        int[] pictures = { R.drawable.bruce , R.drawable.scott , R.drawable.jason };

        bruce = getDrawable ( pictures[ 0 ] );
        scott = getDrawable ( pictures[ 1 ] );
        jason = getDrawable ( pictures[ 2 ] );
        imageView.setImageResource ( R.drawable.bruce );

    }


    public
    void choice1 ( View view ) {
        if ( biggin == 1 ) {

            imageView.setImageResource ( R.drawable.scott );
            Toast.makeText ( this , "correct" , Toast.LENGTH_SHORT ).show ( );
            biggin += 1;
            score = score + 1;
        }
        else if ( biggin == 2 ) {
            imageView.setImageResource ( R.drawable.jason );
            Toast.makeText ( this , "wrong" , Toast.LENGTH_SHORT ).show ( );
            biggin += 1;
        }
        else if ( biggin == 3 ) {
            Toast.makeText ( this , "wrong" , Toast.LENGTH_SHORT ).show ( );
            biggin += 1;


        }

    }

    public
    void choice2 ( View view ) {
        if ( biggin == 1 ) {

            imageView.setImageResource ( R.drawable.scott );
            Toast.makeText ( this , "wrong" , Toast.LENGTH_SHORT ).show ( );
            biggin += 1;

        }
        else if ( biggin == 2 ) {
            imageView.setImageResource ( R.drawable.jason );
            Toast.makeText ( this , "correct" , Toast.LENGTH_SHORT ).show ( );
            biggin += 1;
            score = score + 1;

        }
        else if ( biggin == 3 ) {
            imageView.setImageResource ( R.drawable.bg5 );
            Toast.makeText ( this , "wrong" , Toast.LENGTH_SHORT ).show ( );
            biggin += 1;

        }


    }

    public
    void choice3 ( View view ) {
        if ( biggin == 1 ) {
            imageView.setImageResource ( R.drawable.scott );
            Toast.makeText ( this , "wrong" , Toast.LENGTH_SHORT ).show ( );
            biggin += 1;
        }
        else if ( biggin == 2 ) {
            imageView.setImageResource ( R.drawable.jason );
            Toast.makeText ( this , "wrong" , Toast.LENGTH_SHORT ).show ( );
            biggin += 1;
        }
        else if ( biggin == 3 ) {
            imageView.setImageResource ( R.drawable.bg5 );
            Toast.makeText ( this , "correct" + score , Toast.LENGTH_SHORT ).show ( );
            biggin += 1;
            score = score + 1;

        }
    }

    public
    void sum ( View view ) {
        if ( biggin == 4 ) {

            total.setText ("your score is: "  + score );
            Toast.makeText ( this , "Score is" , Toast.LENGTH_SHORT ).show ( );
        }


    }
}