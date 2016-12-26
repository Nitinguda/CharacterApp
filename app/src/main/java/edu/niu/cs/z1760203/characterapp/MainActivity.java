package edu.niu.cs.z1760203.characterapp;

import android.app.Activity;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {


    private LinearLayout gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //capturing screen objects
    gallery = (LinearLayout)findViewById(R.id.galleryLayout);
        fillGallery();

    }

    //method to fill the gallery with images

    private void fillGallery(){

        ImageButton buttonItem;

        for (int count = 0; count < CharacterInfo.description.length;count++){


            buttonItem = new ImageButton(this);

            Character character = new Character(CharacterInfo.description[count],CharacterInfo.id[count]);

            buttonItem.setContentDescription(character.getCharacterDesc());

            buttonItem.setImageDrawable(ResourcesCompat.getDrawable(getResources(), character.getCharacterID(), null));

            buttonItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String desc = (String) v.getContentDescription();
                    Toast.makeText(v.getContext(),desc, Toast.LENGTH_SHORT).show();


                }//onclick ends
            });//onclickListener ends

            gallery.addView(buttonItem);

        }//for ends

    }//gallery ends

}//main ends
