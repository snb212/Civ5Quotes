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
		quoteList.add("Agriculture");
		quoteList.add("Animal Husbandry");
		quoteList.add("Archaeology");
		quoteList.add("Archery");
		quoteList.add("Astronomy");
		quoteList.add("Atomic Theory");
		quoteList.add("Banking");
		quoteList.add("Biology");
		quoteList.add("Bronze Working");
		quoteList.add("Calendar");
		quoteList.add("Chemistry");
		quoteList.add("Chivalry");
		quoteList.add("Civil Service");
		quoteList.add("Combustion");
		quoteList.add("Compass");
		quoteList.add("Computers");
		quoteList.add("Construction");
		quoteList.add("Currency");
		quoteList.add("Dynamite");
		quoteList.add("Economics");
		quoteList.add("Ecology");
		quoteList.add("Education");
		quoteList.add("Electricity");
		quoteList.add("Electronics");
		quoteList.add("Engineering");
		quoteList.add("Fertilizer");
		quoteList.add("Flight");
		quoteList.add("Future Tech");
		quoteList.add("Globalization");
		quoteList.add("Gunpowder");
		quoteList.add("Horseback Riding");
		quoteList.add("Iron Working");
		quoteList.add("Lasers");
		quoteList.add("Machinery");
		quoteList.add("Masonry");
		quoteList.add("Mass Media");
		quoteList.add("Mathematics");
		quoteList.add("Metal Casting");
		quoteList.add("Metallurgy");
		quoteList.add("Military Science");
		quoteList.add("Mining");
		quoteList.add("Nanotechnology");
		quoteList.add("Navigation");
		quoteList.add("Nuclear Fission");
		quoteList.add("Nuclear Fusion");
		quoteList.add("Optics");
		quoteList.add("Particle Physics");
		quoteList.add("Penicillin");
		quoteList.add("Philosophy");
		quoteList.add("Physics");
		quoteList.add("Plastics");
		quoteList.add("Pottery");
		quoteList.add("Printing Press");
		quoteList.add("Radar");
		quoteList.add("Radio");
		quoteList.add("Railroad");
		quoteList.add("Refrigeration");
		quoteList.add("Replaceable Parts");
		quoteList.add("Rifling");
		quoteList.add("Robotics");
		quoteList.add("Rocketry");
		quoteList.add("Sailing");
		quoteList.add("Satellites");
		quoteList.add("Scientific Theory");
		quoteList.add("Stealth");
		quoteList.add("Steam Power");
		quoteList.add("Steel");
		quoteList.add("Telegraph");
		quoteList.add("Theology");
		quoteList.add("Trapping");
		quoteList.add("The Wheel");
		quoteList.add("Writing");

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
		//table.put("Acoustics", "Their rising all at once was as the sound of a thunder heard remote");
		//table.put("Advanced Ballistics", "Once the rockets are up, who cares where they come down?");
		//Generated Values
		table.put("Acoustics", "Their rising all at once was as the sound of a thunder heard remote. ,--Milton  ");
		table.put("Advanced Ballistics", "Once the rockets are up, who cares where they come down? ,--Tom Hehrer  ");
		table.put("Agriculture", "Where tillage begins, other arts follow. The farmers therefore are the founders of human civilization. ,--Daniel Webster  ");
		table.put("Animal Husbandry", "Thou salt not muzzle the ox when he treadeth out the corn. ,--The Bible  Deuteronomy  25:4");
		table.put("Archaeology", "Those who cannot remember the past are condemned to repeat it. ,--George Santayana  ");
		table.put("Archery", "The haft of the arrow had been feathered with one of the eagle's own plumes. We often give our enemies the means of our own destruction. ,--Aesop  ");
		table.put("Astronomy", "Joyfully to the breeze royal Odysseus spread his sail, and with his rudder skillfully he steered. ,--Homer  ");
		table.put("Atomic Theory", "The unleashed power of the atom has changed everything save our modes of thinking, and we thus drift toward unparalleled catastrophes. ,--Albert Einstein  ");
		table.put("Banking", "Happiness: a good bank account, a good cook and a good digestion. ,--Jean Jacques Rousseau  ");
		table.put("Biology", "If the brain were so simple we could understand it, we would be so simple we couldn't. ,--Lyall Watson  ");
		table.put("Bronze Working", "Here Hector entered, with a spear eleven cubits long in his hand; the bronze point gleamed in front of him, and was fastened to the shaft of the spear by a ring of gold. ,--Homer  ");
		table.put("Calendar", "So teach us to number our days, so that we may apply our hearts unto wisdom. ,--The Bible  Psalms  90:12");
		table.put("Chemistry", "Wherever we look, the work of the chemist has raised the level of our civilization and has increased the productive capacity of our nation. ,--Calvin Coolidge  ");
		table.put("Chivalry", "Who pulleth out this sword of this stone and anvil, is rightwise king born of all England ,--Malory  ");
		table.put("Civil Service", "The only thing that saves us from the bureaucracy is its inefficiency. ,--Eugene McCarthy  ");
		table.put("Combustion", "Any man who can drive safely while kissing a pretty girl is simply not giving the kiss the attention it deserves. ,--Albert Einstein  ");
		table.put("Compass", "I find the great thing in this world is not so much where we stand, as in what direction we are moving. ,--Oliver Wendell Holmes  ");
		table.put("Computers", "Computer are like Old Testament gods: lots of rules and no mercy. ,--Joseph Campbell  ");
		table.put("Construction", "Three things are to be looked to in a building: that it stand on the right spot; that it be securely founded; that it be successfully executed. ,--Johann Wolfgang von Goethe  ");
		table.put("Currency", "Better is bread with a happy heart/Than wealth with vexation. ,--Amenemope  ");
		table.put("Dynamite", "As soon as men decide that all means are permitted to fight an evil, then their good becomes indistinguishable from the evil that they set out to destroy. ,--Christopher Dawson  ");
		table.put("Economics", "Compound interest is the most powerful force in the universe. ,--Albert Einstein  ");
		table.put("Ecology", "Only within the moment of time represented by the present century as one species, man, acquired significant power to alter the nature of his world. ,--Rachel Carson  ");
		table.put("Education", "Education is the best provision for old age. ,--Aristotle  ");
		table.put("Electricity", "Is it a fact - or have I dreamt it - that, by means of electricity, the world of matter has become a great nerve, vibrating thousands of miles in a breathless point of time? ,--Nathaniel Hawthorne  ");
		table.put("Electronics", "There's a basic principle about consumer electronics: it gets more powerful all the time and it gets cheaper all the time. ,--Trip Hawkins  ");
		table.put("Engineering", "Instrumental or mechanical sciencce is the noblest and, above all others, the most useful. ,--Leonardo da Vinci  ");
		table.put("Fertilizer", "The nation that destroys its soil destroys itself. ,--Franklin Delano Roosevelt  ");
		table.put("Flight", "Aeronautics was neither an industry nor a science. It was a miracle. ,--Igor Sikorsky  ");
		table.put("Future Tech", "I think we all agree, the past is over. ,--George W. Bush  ");
		table.put("Globalization", "The new electronic interdependence recreates the world in the image of a global village. ,--Marshall McLuhan  ");
		table.put("Gunpowder", "The day when two army corps can annihilate each other in one second, all civilized nations, it is to be hoped, will recoil from war and discharge their troops. ,--Alfred Nobel  ");
		table.put("Horseback Riding", "My kingdom for a horse! ,--Shakespeare (Richard III)  ");
		table.put("Iron Working", "Do not wait to strike 'til the iron is hot; but make it hot by striking. ,--William Butler Yeats  ");
		table.put("Lasers", "The night is far spent, the day is at hand; let us therefore cast off the works of darkness, and let us put on the armor of light. ,--The Holy Bible: Romans  13:12 ");
		table.put("Machinery", "The press is the best instrument for enlightening the mind of man, and improving him as a rational, moral and social being. ,--Thomas Jefferson  ");
		table.put("Masonry", "How happy are those whose walls already rise! ,--Virgil  ");
		table.put("Mass Media", "The speed of communication is wondrous to behold. It is also true that speed can multiply the distribution of information that we know to be untrue. ,--Edward R. Murrow  ");
		table.put("Mathematics", "Mathematics is the gate and key to the sciences. ,--Roger Bacon  ");
		table.put("Metal Casting", "When pieces of bronze or gold or iron break, the metal-smith welds them together again in the fire, and the bond is established. ,--Sri Guru Granth Sahib  ");
		table.put("Metallurgy", "There never was a good knife made of bad steel. ,--Benjamin Franklin  ");
		table.put("Military Science", "Wars may be fought with weapons, but they are won by men. It is the spirit of the men who follow and of the man who leads that gains the victory. ,--George S. Patton  ");
		table.put("Mining", "The meek shall inherit the Earth, but not its mineral rights. ,--J. Paul Getty  ");
		table.put("Nanotechnology", "The impact of nanotechnology is expected to exceed the impact the electronics revolution has had on our lives. ,--Richard Schwartz  ");
		table.put("Navigation", "The winds and the waves are always on the side of the ablest navigators. ,--Edward Gibbon  ");
		table.put("Nuclear Fission", "I am become Death, the destroyer of worlds. ,--J. Robert Oppenheimer  ");
		table.put("Nuclear Fusion", "The release of atomic energy has not created a new problem. It has merely made more urgent the necessity of solving an existing one. ,--Albert Einstein  ");
		table.put("Optics", "He made an instrument to know/If the moon shine at full or no. ,--Samuel Butler  ");
		table.put("Particle Physics", "Every particle of matter is attracted by or gravitates to every other particle of matter with a force inversely proportional to the squares of their distances. ,--Isaac Newton  ");
		table.put("Penicillin", "In nothing do men more nearly approach the gods than in giving health to men. ,--Cicero  ");
		table.put("Philosophy", "There is only one good, knowledge, and one evil, ignorance. ,--Socrates  ");
		table.put("Physics", "Measure what is measurable, and make measurable what is not so. ,--Galileo  ");
		table.put("Plastics", "Ben, I want to say one word to you, just one word: plastics. ,--Buck Henry and Calder Willingham  The Graduate ");
		table.put("Pottery", "Shall the clay say to him that fashioneth it, What makest thou? ,--The Bible  Isaiah  45:9");
		table.put("Printing Press", "It is a newspaper's duty to print the news and raise hell. ,--The Chicago Times  ");
		table.put("Radar", "Vision is the art of seeing things invisible. ,--Jonathan Swift  ");
		table.put("Radio", "The whole country was tied together by radio. We all experienced the same heroes and comedians and singers. They were giants. ,--Woody Allen  ");
		table.put("Railroad", "The introduction of so powerful an agent as steam to a carriage on wheels will make a great change in the situation of man. ,--Thomas Jefferson  ");
		table.put("Refrigeration", "And homeless near a thousand homes I stood, and near a thousand tables pined and wanted food. ,--William Wordsworth  ");
		table.put("Replaceable Parts", "Nothing is particularly hard if you divide it into small jobs. ,--Henry Ford  ");
		table.put("Rifling", "It is well that war is so terrible, or we should grow too fond of it. ,--Robert E. Lee  ");
		table.put("Robotics", "1. A robot may not injure a human being or, through inaction, allow a human being to come to harm.,2. A robot must obey any orders given to it by human beings, except where such orders would conflict with the First Law.,3. A robot must protect its own existence as long as such protection does not conflict with the First or Second Law. ,--Isaac Asimov  ");
		table.put("Rocketry", "A good rule for rocket experimenters to follow is this: always assume that it will explode. ,--Astronautics Magazine 1937 ");
		table.put("Sailing", "He who commands the sea has command of everything. ,--Themistocles  ");
		table.put("Satellites", "Now, somehow, in some new way, the sky seemed almost alien. ,--Lyndon B. Johnson  ");
		table.put("Scientific Theory", "Every great advance in science has issues from a new audacity of imagination. ,--John Dewey  ");
		table.put("Stealth", "Be extremely subtle, even to the point of formlessness. Be extremely mysterious, even to the point of soundlessness. Thereby you can be the director of the opponent's fate. ,--Sun Tzu  ");
		table.put("Steam Power", "The nations of the West hope that by means of steam communications all the world will become as one family. ,--Townsend Harris  ");
		table.put("Steel", "John Henry said to his Captain: 'A man ain't nothin' but a man,/And before I'll let your steam drill beat me down,/I'll die with the hammer in my hand. ,--Anonymous: The Ballad of John Henry  the Steel-Drivin' Man ");
		table.put("Telegraph", "I once sent a dozen of my friends a telegram saying 'flee at once - all is discovered.' They all left town immediately. ,--Mark Twain  ");
		table.put("Theology", "Three things are necessary for the salvation of man: to know what he ought to believe; to know what he ought to desire; and to know what he ought to do. ,--St. Thomas Aquinas  ");
		table.put("Trapping", "Even brute beasts and wandering birds do not fall for the same traps or nets twice. ,--Saint Jerome  ");
		table.put("The Wheel", "Wisdom and virtue are like the two wheels of a cart. ,--Japanese Proverb  ");
		table.put("Writing", "He who destroys a good book kills reason itself. ,--John Milton  ");

		
		return table;
	}
}
