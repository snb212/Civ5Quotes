package com.example.civ5quotes;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private ArrayList<String> quoteList = new ArrayList<String>();
	private String[] elements = {};
	public final static String EXTRA_MESSAGE = "com.example.civ5quotes.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		populateQuoteList();

		ListView lv = (ListView) findViewById(R.id.elementList);
		elements = quoteList.toArray(new String[quoteList.size()]);
		lv.setAdapter(new ArrayAdapter<String>(this.getApplicationContext(),
				R.layout.custom_list_item, elements));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void populateQuoteList() {
		quoteList.add("Quote 1");
		quoteList.add("Quote 2");
	}

	public void quoteClick(View view) {
		// starts a new activity based on the quote clicked
	
		
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);

	}
}
