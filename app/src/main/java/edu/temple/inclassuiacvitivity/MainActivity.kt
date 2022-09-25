package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val changeButton = findViewById<Button>(R.id.changeButton)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        // Step 1: Populate array
        val numberArray = IntArray(100)

        for(i in numberArray.indices){
            numberArray[i] = i+1
        }

        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, numberArray.asList())


        // Step 2: Save selected text size
        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            )

                {
                //val textSize = parent!!getItemAtPosition(Position)
                val textSize = parent!!.getItemAtPosition(position).toString()
                }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        // Step 3: Change TextView to saved text size
        //changeButton.setOnClickListener
        changeButton.setOnClickListener()
        {
            val mParams = displayTextView.layoutParams as RelativeLayout.LayoutParams
            val mParams2 = spinner.onItemSelectedListener.toString()
            val mParams3 = displayTextView.textSize
            mParams.apply {
                //displayTextView.setTextSize(onMenuItemSelected(toString( )))
                displayTextView.setTextSize(mParams3)

            }
            //take the test value gotten
            //apply that text value to
            //textView.setTextSize(textvalue)
             //println(displayTextView.text)
            //displayTextView.setTextSize(spinner)

        }

    }
}




