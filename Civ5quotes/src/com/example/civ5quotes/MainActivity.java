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
import android.widget.TextView;

public class MainActivity extends Activity {
	private ArrayList<String> quoteList5 = new ArrayList<String>();
	private ArrayList<String> quoteList4 = new ArrayList<String>();
	private String[] elements = {};
	private final Context context = this;
	public final static String EXTRA_MESSAGE = "com.example.civ5quotes.MESSAGE";
	public Hashtable<String, String> quoteHash; 
	private ListView lv; 
	int currentCiv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//start with set Civ 5
		currentCiv = 5;
		populatequoteList5();
		quoteHash = populateHashtable5();
		
		elements = quoteList5.toArray(new String[quoteList5.size()]);
		
		lv = (ListView) findViewById(R.id.listview);
		lv.setAdapter(new ArrayAdapter<String>(this.getApplicationContext(),
				R.drawable.custom_list_item, elements));
		//this.removeView();
		//((ViewGroup)MainActivity.getParent()).removeallViews();
		lv.setOnItemClickListener(new OnItemClickListener(){
			public void onItemClick(AdapterView<?> arg0, View v, int position, long id){
				String quote = "Blue Moon";
				Intent intent = new Intent(context, QuotePageActivity.class);
				quote = (lv.getItemAtPosition(position)).toString();
				intent.putExtra(EXTRA_MESSAGE, quote);
				intent.putExtra("hash", quoteHash);
				intent.putExtra("civStatus", currentCiv);
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
	
	public void loadCiv4(View view){
		currentCiv = 4;
		TextView tv = (TextView) findViewById(R.id.civ_status);
		tv.setText("4");
		quoteList4.clear();
		populatequoteList4();
		quoteHash = populateHashtable4();
		elements = quoteList4.toArray(new String[quoteList4.size()]);
		lv.setAdapter(new ArrayAdapter<String>(this.getApplicationContext(),
				R.drawable.custom_list_item, elements));
	}
	public void loadCiv5(View view){
		currentCiv = 5;
		TextView tv = (TextView) findViewById(R.id.civ_status);
		tv.setText("5");
		quoteList5.clear();
		populatequoteList5();
		quoteHash = populateHashtable5();
		elements = quoteList5.toArray(new String[quoteList5.size()]);
		lv.setAdapter(new ArrayAdapter<String>(this.getApplicationContext(),
				R.drawable.custom_list_item, elements));
	}

	public void populatequoteList5() {
		quoteList5.add("Acoustics");
		quoteList5.add("Advanced Ballistics");
		quoteList5.add("Agriculture");
		quoteList5.add("Animal Husbandry");
		quoteList5.add("Archaeology");
		quoteList5.add("Archery");
		quoteList5.add("Astronomy");
		quoteList5.add("Atomic Theory");
		quoteList5.add("Banking");
		quoteList5.add("Biology");
		quoteList5.add("Bronze Working");
		quoteList5.add("Calendar");
		quoteList5.add("Chemistry");
		quoteList5.add("Chivalry");
		quoteList5.add("Civil Service");
		quoteList5.add("Combustion");
		quoteList5.add("Compass");
		quoteList5.add("Computers");
		quoteList5.add("Construction");
		quoteList5.add("Currency");
		quoteList5.add("Dynamite");
		quoteList5.add("Economics");
		quoteList5.add("Ecology");
		quoteList5.add("Education");
		quoteList5.add("Electricity");
		quoteList5.add("Electronics");
		quoteList5.add("Engineering");
		quoteList5.add("Fertilizer");
		quoteList5.add("Flight");
		quoteList5.add("Future Tech");
		quoteList5.add("Globalization");
		quoteList5.add("Gunpowder");
		quoteList5.add("Horseback Riding");
		quoteList5.add("Iron Working");
		quoteList5.add("Lasers");
		quoteList5.add("Machinery");
		quoteList5.add("Masonry");
		quoteList5.add("Mass Media");
		quoteList5.add("Mathematics");
		quoteList5.add("Metal Casting");
		quoteList5.add("Metallurgy");
		quoteList5.add("Military Science");
		quoteList5.add("Mining");
		quoteList5.add("Nanotechnology");
		quoteList5.add("Navigation");
		quoteList5.add("Nuclear Fission");
		quoteList5.add("Nuclear Fusion");
		quoteList5.add("Optics");
		quoteList5.add("Particle Physics");
		quoteList5.add("Penicillin");
		quoteList5.add("Philosophy");
		quoteList5.add("Physics");
		quoteList5.add("Plastics");
		quoteList5.add("Pottery");
		quoteList5.add("Printing Press");
		quoteList5.add("Radar");
		quoteList5.add("Radio");
		quoteList5.add("Railroad");
		quoteList5.add("Refrigeration");
		quoteList5.add("Replaceable Parts");
		quoteList5.add("Rifling");
		quoteList5.add("Robotics");
		quoteList5.add("Rocketry");
		quoteList5.add("Sailing");
		quoteList5.add("Satellites");
		quoteList5.add("Scientific Theory");
		quoteList5.add("Stealth");
		quoteList5.add("Steam Power");
		quoteList5.add("Steel");
		quoteList5.add("Telegraph");
		quoteList5.add("Theology");
		quoteList5.add("Trapping");
		quoteList5.add("The Wheel");
		quoteList5.add("Writing");

	}
	public void populatequoteList4() {
		quoteList4.add("Agriculture");
		quoteList4.add("Alphabet");
		quoteList4.add("Animal Husbandry");
		quoteList4.add("Archery");
		quoteList4.add("Artillery");
		quoteList4.add("Assembly Line");
		quoteList4.add("Astronomy");
		quoteList4.add("Banking");
		quoteList4.add("Biology");
		quoteList4.add("Bronze Working");
		quoteList4.add("Calendar");
		quoteList4.add("Chemistry");
		quoteList4.add("Civil Service");
		quoteList4.add("Code Of Laws");
		quoteList4.add("Combustion");
		quoteList4.add("Communism");
		quoteList4.add("Compass");
		quoteList4.add("Composites");
		quoteList4.add("Computers");
		quoteList4.add("Constitution");
		quoteList4.add("Construction");
		quoteList4.add("Corporation");
		quoteList4.add("Currency");
		quoteList4.add("Democracy");
		quoteList4.add("Divine Right");
		quoteList4.add("Drama");
		quoteList4.add("Ecology");
		quoteList4.add("Economics");
		quoteList4.add("Education");
		quoteList4.add("Electricity");
		quoteList4.add("Engineering");
		quoteList4.add("Fascism");
		quoteList4.add("Feudalism");
		quoteList4.add("Fiber Optics");
		quoteList4.add("Fishing");
		quoteList4.add("Fission");
		quoteList4.add("Flight");
		quoteList4.add("Fusion");
		quoteList4.add("Future Tech");
		quoteList4.add("Genetics");
		quoteList4.add("Guilds");
		quoteList4.add("Gunpowder");
		quoteList4.add("Horseback Riding");
		quoteList4.add("Hunting");
		quoteList4.add("Industrialism");
		quoteList4.add("Iron Working");
		quoteList4.add("Liberalism");
		quoteList4.add("Literature");
		quoteList4.add("Machinery");
		quoteList4.add("Masonry");
		quoteList4.add("Mass Media");
		quoteList4.add("Mathematics");
		quoteList4.add("Medicine");
		quoteList4.add("Meditation");
		quoteList4.add("Metal Casting");
		quoteList4.add("Military Tradition");
		quoteList4.add("Mining");
		quoteList4.add("Monarchy");
		quoteList4.add("Monotheism");
		quoteList4.add("Music");
		quoteList4.add("Mysticism");
		quoteList4.add("Nationalism");
		quoteList4.add("Optics");
		quoteList4.add("Paper");
		quoteList4.add("Philosophy");
		quoteList4.add("Physics");
		quoteList4.add("Plastics");
		quoteList4.add("Polytheism");
		quoteList4.add("Pottery");
		quoteList4.add("Priesthood");
		quoteList4.add("Printing Press");
		quoteList4.add("Radio");
		quoteList4.add("Railroad");
		quoteList4.add("Refrigeration");
		quoteList4.add("Replaceable Parts");
		quoteList4.add("Rifling");
		quoteList4.add("Robotics");
		quoteList4.add("Rocketry");
		quoteList4.add("Sailing");
		quoteList4.add("Satellites");
		quoteList4.add("Scientific Method");
		quoteList4.add("Steam Power");
		quoteList4.add("Steel");
		quoteList4.add("The Wheel");
		quoteList4.add("Theology");
		quoteList4.add("Writing");
	}

	public Hashtable<String, String> populateHashtable5(){
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
	public Hashtable<String, String> populateHashtable4(){
		Hashtable <String, String> table = new Hashtable<String, String>();
		table.put("Mysticism", "Nature herself has imprinted on the minds of all the idea of God. ,-- Cicero");
		table.put("Meditation", "Meditation brings wisdom; lack of meditation leaves ignorance. Know well what leads you forward and what holds you back. ,-- The Buddha");
		table.put("Polytheism", "Not at all similar are the race of the immortal gods and the race of men who walk upon the earth. ,-- Homer");
		table.put("Priesthood", "The Lord bless you and keep you; the Lord make His face to shine upon you and be gracious to you; the Lord lift up His countenance upon you and give you peace. ,-- The Bible, Numbers");
		table.put("Monotheism", "I am the Lord thy God. Thou shalt have no other gods before Me. ,-- The Bible, Exodus");
		table.put("Monarchy", "A multitude of rulers is not a good thing. Let there be one ruler, one king. ,-- Herodotus");
		table.put("Literature", "Some books are to be tasted, others to be swallowed, and some few to be chewed and digested. ,-- Sir Francis Bacon");
		table.put("Code Of Laws", "To bring about the rule of righteousness in the land, so that the strong should not harm the weak. ,-- Hammurabi's Code; Prologue");
		table.put("Drama", "All the world's a stage, And all the men and women merely players. They have their exits and their entrances; And one man in his time plays many parts.  ,-- William Shakespeare");
		table.put("Feudalism", "I will to my lord be true and faithful, and love all which he loves and shun all which he shuns. ,-- Anglo Saxon Oath of Fealty");
		table.put("Theology", "Two cities have been formed by two loves: the earthly by the love of self; the heavenly by the love of God. ,-- St. Augustine");
		table.put("Music", "If music be the food of love, play on. ,-- William Shakespeare");
		table.put("Guilds", "People of the same trade seldom meet together, even for merriment and diversion, but the conversation ends in a conspiracy against the public. ,-- Adam Smith");
		table.put("Civil Service", "The bureaucracy is expanding to meet the needs of the expanding bureaucracy ,-- Unknown");
		table.put("Divine Right", "I am the state. ,-- Louis XIV");
		table.put("Nationalism", "A man does not have himself killed for a half-pence a day or for a petty distinction. You must speak to the soul in order to electrify him. ,-- Napoleon Bonaparte");
		table.put("Military Tradition", "Victorious warriors win first and then go to war, while defeated warriors go to war first and then seek to win. ,-- Sun Tzu");
		table.put("Constitution", "No freeman shall be taken, imprisoned, or in any other way destroyed, except by the lawful judgment of his peers. ,-- The Magna Carta");
		table.put("Liberalism", "Any society that would give up a little liberty to gain a little security will deserve neither and lose both. ,-- Benjamin Franklin");
		table.put("Democracy", "It has been said that democracy is the worst form of government except all the others that have been tried. ,-- Winston Churchill");
		table.put("Fascism", "The great masses of the people... will more easily fall victims to a big lie than to a small one. ,-- Adolf Hitler");
		table.put("Corporation", "Corporation, n. An ingenious device for obtaining individual profit without individual responsibility. ,-- Ambrose Bierce");
		table.put("Communism", "When I give food to the poor, they call me a saint. When I ask why the poor have no food, they call me a communist. ,-- Dom Helder Camara");
		table.put("Mass Media", "The only thing worse than being talked about is not being talked about. ,-- Oscar Wilde");
		table.put("Ecology", "We do not inherit the earth from our ancestors, we borrow it from our children ,-- Native American Song");
		table.put("Fishing", "Give a man a fish and you feed him for a day. Teach a man to fish and you feed him for a lifetime. ,-- Lao Tzu");
		table.put("The Wheel", "Put your shoulder to the wheel. ,-- Aesop");
		table.put("Agriculture", "Oh farmers, pray that your summers be wet and your winters clear. ,-- Virgil");
		table.put("Pottery", "Hath not the potter power over the clay, to make one vessel unto honor, and another unto dishonor? ,-- The Bible, Romans");
		table.put("Sailing", "You can't direct the wind, but you can adjust your sails. ,-- Unknown");
		table.put("Writing", "True glory consists in doing what deserves to be written; in writing what deserves to be read. ,-- Pliny the Elder");
		table.put("Mathematics", "If in other sciences we should arrive at certainty without doubt and truth without error, it behooves us to place the foundations of knowledge in mathematics. ,-- Roger Bacon");
		table.put("Alphabet", "Words have the power to both destroy and heal. When words are both true and kind, they can change our world. ,-- The Buddha");
		table.put("Calendar", "For everything there is a season and a time for every purpose under heaven. ,-- Ecclesiastes");
		table.put("Currency", "Everything is worth what its purchaser will pay for it. ,-- Publius Syrus");
		table.put("Astronomy", "Astronomy compels the soul to look upwards and leads us from this world to another. ,-- Plato");
		table.put("Philosophy", "I have gained this by philosophy: that I do without being commanded what others do only from fear of the law. ,-- Aristotle");
		table.put("Paper", "I cannot live without books ,-- Thomas Jefferson");
		table.put("Banking", "Banking establishments are more dangerous than standing armies. ,-- Thomas Jefferson");
		table.put("Education", "There is no wealth like knowledge, no poverty like ignorance. ,-- Ali ibn Abi-Talib");
		table.put("Printing Press", "What gunpowder did for war, the printing press has done for the mind. ,-- Wendell Phillips");
		table.put("Economics", "Compound interest is the most powerful force in the universe. ,-- Albert Einstein");
		table.put("Scientific Method", "I do not feel obliged to believe that the same God who has endowed us with sense, reason, and intellect has intended us to forgo their use. ,-- Galileo Galilei");
		table.put("Chemistry", "Chemistry means the difference between poverty and starvation and the abundant life. ,-- Robert Brent");
		table.put("Physics", "To every action there is always opposed an equal reaction. ,-- Isaac Newton");
		table.put("Biology", "It is not the strongest of the species that survive, but the one most responsive to change. ,-- Charles Darwin");
		table.put("Medicine", "As to diseases make a habit of two things - to help, or at least, to do no harm. ,-- Hippocrates");
		table.put("Electricity", "We will make electricity so cheap that only the rich will burn candles. ,-- Thomas Edison");
		table.put("Combustion", "Everything in life is somewhere else, and you get there in a car. ,-- E. B. White");
		table.put("Fission", "If the radiance of a thousand suns were to burst at once into the sky, that would be like the splendor of the Mighty One... I am become Death, the Shatterer of Worlds. ,-- J. Robert Oppenheimer, quoting The Bhagavad Gita");
		table.put("Flight", "For once you have tasted flight you will walk the earth with your eyes turned skywards, for there you have been and there you will long to return. ,-- Leonardo Da Vinci");
		table.put("Plastics", "I just want to say one word to you. Just one word: plastics. ,-- Calder Willingham, The Graduate");
		table.put("Composites", "The whole is greater than the sum of its parts. ,-- Aristotle");
		table.put("Genetics", "Soon it will be a sin for parents to have a child which carries the heavy burden of genetic disease. ,-- Bob Edwards");
		table.put("Fiber Optics", "There is a single light of science, and to brighten it anywhere is to brighten it everywhere. ,-- Isaac Asimov");
		table.put("Fusion", "Any sufficiently advanced technology is indistinguishable from magic. ,-- Arthur C. Clarke");
		table.put("Hunting", "If you chase two rabbits, you will lose them both. ,-- Native American Saying");
		table.put("Mining", "The man who moves a mountain begins by carrying away small stones. ,-- Confucius");
		table.put("Archery", "Do not throw the arrow which will return against you. ,-- Kurdish Proverb");
		table.put("Masonry", "It is from their foes, not their friends, that cities learn the lesson of building high walls. ,-- Aristophanes");
		table.put("Bronze Working", "It is entirely seemly for a young man killed in battle to lie mangled by the bronze spear. In his death all things appear fair. ,-- Homer");
		table.put("Animal Husbandry", "Blessed shall be the fruit of thy cattle, the increase of thy kine, and the flocks of thy sheep. ,-- The Bible, Deut. 28:4");
		table.put("Iron Working", "You should hammer your iron when it is glowing hot. ,-- Publius Syrus");
		table.put("Metal Casting", "And them that take the sword shall perish by the sword. ,-- The Bible, Matthew");
		table.put("Construction", "And on the pedestal these words appear: 'My name is Ozymandias, king of kings: Look on my works, ye Mighty, and despair!' Nothing beside remains. ,-- Percy Bysshe Shelley");
		table.put("Horseback Riding", "If you speak the truth, have a foot in the stirrup. ,-- Turkish proverb");
		table.put("Compass", "The wisest men follow their own direction. ,-- Euripides");
		table.put("Machinery", "A god from the machine ,-- Menander");
		table.put("Engineering", "A designer knows he has achieved perfection not when there is nothing left to add, but when there is nothing left to take away. ,-- Antoine de Saint-Exupry");
		table.put("Optics", "One doesn't discover new lands without losing sight of the shore. ,-- Andre Gide");
		table.put("Gunpowder", "You can get more of what you want with a kind word and a gun than you can with just a kind word. ,-- Al Capone");
		table.put("Replaceable Parts", "The whole is more than the sum of its parts. ,-- Aristotle");
		table.put("Rifling", "Political power grows out of the barrel of a gun. ,-- Mao Zedong");
		table.put("Steam Power", "You would make a ship sail against the winds and currents by lighting a bon-fire under her deck? I have no time for such nonsense. ,-- Napoleon, on Robert Fulton's Steamship");
		table.put("Steel", "Before that steam drill shall beat me down, I'll die with my hammer in my hand. ,-- from John Henry, the Steel-Driving Man");
		table.put("Railroad", "I fooled you, I fooled you, I got pig iron, I got pig iron, I got all pig iron. ,-- Lonnie Donegan, Rock Island Line");
		table.put("Artillery", "Artillery adds dignity to what would otherwise be a vulgar brawl. ,-- Frederick the Great");
		table.put("Assembly Line", "People can have the Model T in any color - so long as it's black. ,-- Henry Ford");
		table.put("Industrialism", "There is one rule for the industrialist and that is: Make the best quality of goods possible at the lowest cost possible, paying the highest wages possible. ,-- Henry Ford");
		table.put("Radio", "Then one fine mornin' she puts on a New York station. You know her life was saved by Rock 'n' Roll. ,-- The Velvet Underground, Rock And Roll");
		table.put("Refrigeration", "Tell me what you eat, and I will tell you what you are. ,-- Anthelme Brillat-Savarin");
		table.put("Computers", "Never trust a computer you can't throw out a window. ,-- Steve Wozniak");
		table.put("Rocketry", "The Earth is the cradle of the mind, but one cannot eternally live in a cradle. ,-- Konstantin E. Tsiolkovsky");
		table.put("Satellites", "Beep...beep...beep...beep... ,-- Sputnik I");
		table.put("Robotics", "The real problem is not whether machines think, but whether men do. ,-- B.F. Skinner");
		table.put("Future Tech", "The future will be better tomorrow. ,-- Dan Quayle");

		return table;
	}
}
