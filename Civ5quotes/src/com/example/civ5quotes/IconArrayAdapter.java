package com.example.civ5quotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class IconArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
 
	public IconArrayAdapter(Context context, String[] values) {
		super(context, R.layout.icon_list, values);
		this.context = context;
		this.values = values;
	}
 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.icon_list, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);
 
		// Change icon based on name
		String s = values[position];
 
		System.out.println(s);
 
		String temp = s.toLowerCase();
		temp = temp.trim().replaceAll("\\s","");
		
		if(QuotePageActivity.currentCiv == 5)
			temp = "raw/tech5_" + temp;
		else
			temp = "raw/tech_" + temp;
		
		if ( checkAudioFile(temp)) {
			imageView.setImageResource(R.drawable.audio_icon);
		} else {
			imageView.setImageResource(R.drawable.audio_icon_cancel);
		}
 
		return rowView;
	}
	public boolean checkAudioFile(String name){
		if(context.getResources().getIdentifier(name, null, context.getPackageName()) != 0)
				return true;
		return false;
	}
}