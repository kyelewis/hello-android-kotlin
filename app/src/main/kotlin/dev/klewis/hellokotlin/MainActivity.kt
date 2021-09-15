package dev.klewis.hellokotlin

import android.os.Bundle
import android.widget.TextView
import android.app.Activity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

	val ctx = getApplicationContext();

	val textView = TextView(ctx);
	textView.text = "Hello, Kotlin!";
	setContentView(textView);
    }
}
