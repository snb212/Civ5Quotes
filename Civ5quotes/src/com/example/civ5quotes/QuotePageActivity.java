package com.example.civ5quotes;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Hashtable;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class QuotePageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//getWindow().setBackgroundDrawableResource(R.drawable.quoteback);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quote_page);
		// Show the Up button in the action bar.
		setupActionBar();
		
		Intent intent = getIntent();
		String quote = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		//recieve hash table
		Hashtable<String, String> incomingHash = null;
		Serializable data = intent.getSerializableExtra("hash");
		//incomingHash = (Hashtable<String, String>)data;
		if (data != null) { 
			   incomingHash = new Hashtable<String, String>((HashMap<String, String>)data); 
			} 
		String[] quoteItem;
		quoteItem = decompileQuote(quote, incomingHash);
		TextView tv = (TextView) findViewById(R.id.quoteField);
		TextView author = (TextView) findViewById(R.id.authorField);
		//tv.setText(quote);
		tv.setText(quoteItem[1]);
		author.setText(quoteItem[2]);
		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quote_page, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public String[] decompileQuote(String name, Hashtable<String, String> table){
		String quote = null;
		String author = null;		
		String[] quoteSections = new String[3];
		String tableText = (table.get(name)).toString();
		for(int i = 0; i<tableText.length(); i++ ){
			if (tableText.charAt(i) == ','){
				quote = tableText.substring(0, i);
				author = tableText.substring(i+1, tableText.length());
			}
		quoteSections[0] = name;
		quoteSections[1] = quote;
		quoteSections[2] = author;
		
		}
		
		
		return quoteSections;
	}

}
