package com.example.civ5quotes;

import java.util.ArrayList;
import java.util.Hashtable;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ArrayList<String> quoteList = new ArrayList<String>();
	private String[] elements = {};
	private final Context context = this;
	public final static String EXTRA_MESSAGE = "com.example.civ5quotes.MESSAGE";
	public Hashtable<String, String> quoteHash; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		populateQuoteList();
		quoteHash = populateHashtable();

		final ListView lv = (ListView) findViewById(R.id.listview);
		elements = quoteList.toArray(new String[quoteList.size()]);
		lv.setAdapter(new ArrayAdapter<String>(this.getApplicationContext(),
				R.layout.custom_list_item, elements));
		//this.removeView();
		//((ViewGroup)MainActivity.getParent()).removeallViews();
		lv.setOnItemClickListener(new OnItemClickListener(){
			public void onItemClick(AdapterView<?> arg0, View v, int position, long id){
				String quote = "Blue Moon";
				Intent intent = new Intent(context, QuotePageActivity.class);
				quote = (lv.getItemAtPosition(position)).toString();
				intent.putExtra(EXTRA_MESSAGE, quote);
				intent.putExtra("hash", quoteHash);
				startActivity(intent);
		     }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void populateQuoteList() {
		quoteList.add("Acoustics");
		quoteList.add("Advanced Ballistics");
	}

	public void quoteClick(View view) {
		// starts a new activity based on the quote clicked

		// String quote = "Blue Moon";
		// Intent intent = new Intent(this, QuotePageActivity.class);
		// intent.putExtra(EXTRA_MESSAGE, quote);
		// startActivity(intent);

	}
	public Hashtable<String, String> populateHashtable(){
		Hashtable <String, String> table = new Hashtable<String, String>(); 
		table.put("Acoustics", "Their rising all at once was as the sound of a thunder heard remote");
		table.put("Advanced Ballistics", "Once the rockets are up, who cares where they come down?");
		
		return table;
	}
}
