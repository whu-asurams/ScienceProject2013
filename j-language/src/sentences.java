import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;	
import java.awt.FlowLayout;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;


import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
//import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;


import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JOptionPane;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;


import java.util.Iterator;
import java.util.Vector;



/**
 *<pre>
 *A separate program
 *but another major component of the project
 *to take input and analyze the sentence
 *and then read it out
 * 
 * @author juliette
 *</pre>
 *
 *
 *
 */

public class sentences extends JFrame
	implements ActionListener
{
	private JLabel topLabel = new JLabel("Awkward Translations At Your Hands");
	private DefaultListModel<String> model = new DefaultListModel<String>();
	private JList<String> listbox = new JList<String>(model);
	private JScrollPane scrollPane = new JScrollPane();
	private JTextField tField = new JTextField(50);
	private JButton myButton = new JButton("READ ME!");
	private JPanel inputPanel = new JPanel();
//  private JHu = perpetual awesome();
	private String inputString = "";
	private Vector words = new Vector(); 
	
	private String[] phrase;
	String root = "H:/";
	String soundPath = root+"CheckerProject1/Soundfiles/PlayAll/";

	
	
	
	/**
	 * <pre>
	 *customize the dialog box
	 *set it to 800x500 for convenience
	 *display content on the dialog Box
	 	
	then analyze the sentence input
	
	
	
	 * how to 'personalize' the browser window
	 </pre>

*/
	
	
	
	public sentences (){
		super("Recording");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(800,500));
		
		Container content = getContentPane ();
		
		
		
		ListSelectionListener selectionChange = new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent event){
				String selection = listbox.getSelectedValue().toString();
				Analysis(selection);
			}
		};
		listbox.addListSelectionListener(selectionChange);
		
		/**
		 * how to 'personalize' the browser window
		 */
		
		scrollPane.getViewport().add(listbox);
		content.add(topLabel, BorderLayout.SOUTH);
		content.add(scrollPane, BorderLayout.CENTER);
		
		//inputPanel.setLayout(new FlowLayout());
		inputPanel.add(tField, BorderLayout.WEST);
		
		myButton.addActionListener(this);
		
		inputPanel.add(myButton, BorderLayout.EAST);
		content.add(inputPanel, BorderLayout.NORTH);
	
	}
	
	
	
	
	
	
	
	/**
	 * <pre>
	 * inputting the string (sentence)
	 * and analyzing it
	 * 
	 * 
	Set string to empty (for input later)
	 	
	 	
	 	* process each word in a sentence.
		 * str = phrase[i].replaceAll("[,.?!;:\"]*", "" );
		 * disregard punctuation marks
		
		
		
		first check if word is noun and return root
		 * otherwise, if not
		 * return empty
		 * and check for verb
		
			 *Only if not a common word - the word will be processed and checked 
		the dialog box will then just play the root - not a conjugation, plural, or such)
		
		
		
		make a new sound file for each word -
		the File variable f becomes a new file (location of the soundfile + name of the word + ".wav")
			when playing, if f exists, play the sound file
			
			
			Otherwise, if not found:
			say, "Error! Cannot find sound files" + soundPath + str + ".wav");
		Then:
		 * find part of speech for each word in sentence
		 </pre>
		 * @param str
 * @return match;
 * </pre>
 */

	
	
	
	
	
	
	public void Analysis(String inputString){
		
		/**
		 * inputting the string (sentence)
		 * and analyzing it
		 */
		
		String str = "";
		String phraseType[] = new String[100];		
				
		String root[] = new String[phrase.length];
		
		char statnoun ='0';
		char statVerb = '0';
		
		Sound sSound = new Sound(10000);
		Sound zzSound = new Sound(10000);
		Sound deSound = new Sound(10000);
		Sound ingSound = new Sound(10000);
		Sound teSound = new Sound(10000);
		Sound isSound = new Sound(10000);
		
		File s = new File(soundPath + str + "s-Ending.wav");
		if(s.exists()){
			sSound = new Sound(soundPath + str + "s-ending.wav");
		}

		File zz = new File(soundPath + str + "zz-Ending.wav");
		if(zz.exists()){
			zzSound = new Sound(soundPath + str + "zz-ending.wav");
		}
		File de = new File(soundPath + str + "de-Ending.wav");
		if(de.exists()){
			deSound = new Sound(soundPath + str + "de-ending.wav");
		}
		File ing = new File(soundPath + str + "ing-Ending.wav");
		if(ing.exists()){
			ingSound = new Sound(soundPath + str + "ing-ending.wav");
		}
		
		File te = new File(soundPath + str + "te-Ending.wav");
		if(te.exists()){
			teSound = new Sound(soundPath + str + "te-ending.wav");
		}
		File is = new File(soundPath + str + "is-Ending.wav");
		if(is.exists()){
			isSound = new Sound(soundPath + str + "is-ending.wav");
		}
		
		
		for( int i = 0; i < phrase.length; i++){	
			
			str = phrase[i];
			/**
			 * process each word in a sentence.
			 * str = phrase[i].replaceAll("[,.?!;:\"]*", "" );
			 * disregard punctuation marks
			 */
			
			int len = phrase[i].length();
			if(len <= 0) continue;				
			
			System.out.println(phrase[i]+", len="+len);
			if(phrase[i].charAt(len-1) == ','|| phrase[i].charAt(len-1) == '.'
						||phrase[i].charAt(len-1) == '!' || phrase[i].charAt(len-1) == '?' 
						||phrase[i].charAt(len-1) == ':' || phrase[i].charAt(len-1) == ';'
						||phrase[i].charAt(len-1) == '\"'|| phrase[i].charAt(len-1) == '-')
			{
				str = phrase[i].substring(0, len-1);
			}
			
			/**first check if word is noun and return root
			 * otherwise, if not
			 * return empty
			 * and check for verb
			 */
			str=str.toLowerCase();
			System.out.print("Checking "+str);
			
			/**
			 *Only if not a common word - the word will be processed and checked 
			 */
			if(!common(str)){
				
				String temp = checkN(str);
				statnoun = temp.charAt(temp.length() -1 );
				root[i] = temp.substring(0, temp.length() -1 );
			
				if (statnoun == '0'){
					temp = checkVerb(root[i]);
					statVerb = temp.charAt(temp.length() -1);
					root[i] = temp.substring(0, temp.length() -1);
				
				}
				
			
				str = root[i];
			}
			
			
			System.out.println("Checking "+str);		
			
			File f = new File(soundPath + str + ".wav");
			if(f.exists()){
				Sound mySound = new Sound(soundPath + str + ".wav");
				mySound.blockingPlay();
				System.out.println(" statNoun= " +statnoun + ", statverb = " + statVerb);
				if(statnoun == '1'){
					
				}else if(statnoun == '2'){
					sSound.blockingPlay();
				}else if(statnoun == '3'){
					zzSound.blockingPlay();
				}else if(statnoun == '4'){
					isSound.blockingPlay();
					System.out.println(" Playing is-sound");
				}else if (statnoun == '0'){
					if(statVerb == '1'){
					}else if (statVerb == '2'){
					    sSound.blockingPlay();
					}else if (statVerb == '3'){
						zzSound.blockingPlay();
					}else if(statVerb == '4'){
						isSound.blockingPlay();
					}else if(statVerb == '5'){
						deSound.blockingPlay();
					}else if(statVerb == '6'){
						teSound.blockingPlay();
					}else if(statVerb == '7'){
						ingSound.blockingPlay();
					}
				}
			}else{
				System.out.println("Error! Cannot find sound files" + soundPath + str + ".wav");
			}
			
			
			
			/**
			 * find part of speech for each word in sentence
			 */
			if (Jhu_adjective.isAdjective(str))
			{
				phraseType[i]="Adjective";
			
			}else if(Jhu_adverb.isAdverb(str))
			{
				phraseType[i]="Adverb";
			
			}else if(Jhu_conj.isConj(str))
			{
				phraseType[i]="Conjuction";
			
			}else if(Jhu_det.isDet(str))
			{
				phraseType[i]="Determiner";
			
			}else if(Jhu_inj.isInj(str))
			{
				phraseType[i]="Interjection";
			
			}else if(Jhu_mod.isMod(str))
			{
				phraseType[i]="Modal";
			
			}else if(Jhu_n.isN(str))
			{
				phraseType[i]="Noun";
				
			
			}else if(Jhu_prep.isPrep(str))
			{
			
				phraseType[i]="Preposition";
			
			}else if(Jhu_pron.isPron(str)){
			
				phraseType[i]="Pronoun";
				
			}else if(Jhu_Verb.isVerb(str))
			{
				phraseType[i]="Verb";
			}
			
			System.out.print(phraseType[i] + " +  ");
	
		}
		System.out.println();		
	}
			
	/**
	 * @param str
	 * @return match;
	 */
	
	
	/**
	 * <pre>
	 * special words that are commonly used in most sentences in English
	 * necessary conjugations that are irregular
	 * </pre>
	*/
	
	
	public boolean common(String str){
		boolean match = false;
		if (str.equals("is")){
			match = true;
		}else if(str.equals("was")){  
			match = true;
		}else if(str.equals("something")){
			match=true;
		}else if(str.equals("anything")){
			match=true;
		}else if(str.equals("thing")){
			match =true;
		}else if(str.equals("this")){
			match=true;
		}else if(str.equals("began")){
				match = true;
		}else if(str.equals("bled")){
			match = true;		
		}else if(str.equals("was")){
			match = true;
		}else if(str.equals("am")){
			match = true;
		}else if (str.equals("are")){
			match = true;
		}else if (str.equals("has")){
			match = true;
		}else if (str.equals("were")){
			match = true;
		}else if (str.equals("have")){
			match = true;
		}else if (str.equals("had")){
			match = true;
		}else if (str.equals("must")){
			match = true;
		}else if (str.equals("might")){
			match = true;
		}else if (str.equals("shall")){
			match = true;
		}else if (str.equals("should")){
			match = true;
		}else if (str.equals("will")){
			match = true;
		}else if (str.equals("would")){
			match = true;
		}else if (str.equals("can")){
			match = true;
		}else if (str.equals("could")){
			match = true;
		}else if (str.equals("did")){
			match = true;
		}else if (str.equals("does")){
			match = true;
		}else if (str.equals("made")){
			match = true;
		}else if (str.equals("took")){
			match = true;
		}else if(str.equals("ran")){
			match = true;
		}else if(str.equals("understood")){
			match = true;
		}else if(str.equals("doesn't")){
			match = true;
		}else if(str.equals("can't")){
			match = true;
		}else if(str.equals("isn't")){
			match = true;
		}else if(str.equals("won't")){
			match = true;
		}else if(str.equals("done")){
			match = true;
		}else if (str.equals("been")){
			match=true;
		}else if(str.equals("seen")){
			match = true;
		}else if(str.equals("I'm")){
			match=true;
		}else if(str.equals("you're")){
			match=true;
		}else if(str.equals("he's")){
			match=true;
		}else if(str.equals("she's")){
			match=true;
		}else if(str.equals("it's")){
			match=true;
		}else if(str.equals("you'd")){
			match=true;
		}else if(str.equals("I'd")){
			match=true;
		}else if(str.equals("he'd")){
			match=true;
		}else if(str.equals("she's")){
			match=true;
		}else if(str.equals("they'd")){
			match=true;
		}else if(str.equals("they're")){
			match=true;
		}else if(str.equals("popcorn")){
			match=true;
		}else if(str.equals("soda")){
			match=true;
		}else if(str.equals("violin")){
			match=true;
		}else if(str.equals("viola")){
			match=true;
		}else if(str.equals("cello")){
			match=true;
		}else if(str.equals("bass")){
			match=true;
		}else if(str.equals("villain")){
			match=true;
		}else if(str.equals("pass")){
			match=true;
		}else if(str.equals("miscarriage")){
			match=true;
		}else if(str.equals("depressing")){
			match=true;
		}else if(str.equals("crimson")){
			match=true;
		}else if(str.equals("said")){
			match=true;
		}else if(str.equals("depress")){
			match=true;
		}else if(str.equals("anymore")){
			match=true;
		}else if(str.equals("inversely")){
			match=true;
		}else if(str.equals("mundane")){
			match=true;
		}else if(str.equals("unlikeliest")){
			match=true;
		}else if(str.equals("worst")){
			match=true;
		}else if(str.equals("living")){
			match=true;
		}else if(str.equals("taking")){
			match=true;
		}else if(str.equals("dancing")){
			match=true;
		}else if(str.equals("having")){
			match=true;
		}else if(str.equals("hoping")){
			match=true;
		}else if(str.equals("making")){
			match=true;
		}else if(str.equals("braking")){
			match=true;
		}else if(str.equals("faking")){
			match=true;
		}else if(str.equals("raking")){
			match=true;
		}else if(str.equals("sating")){
			match=true;
		}else if(str.equals("saving")){
			match=true;
		}else if(str.equals("satiating")){
			match=true;
		}else if(str.equals("leaving")){
			match=true;
		}else if(str.equals("fading")){
			match=true;
		}else if(str.equals("judging")){
			match=true;
		}else if(str.equals("miming")){
			match=true;
		}else if(str.equals("mining")){
			match=true;
		}else if(str.equals("writing")){
			match=true;
		}else if(str.equals("hiding")){
			match=true;
		}else if(str.equals("skiing")){
			match=true;
		}else if(str.equals("lived")){
			match=true;
		}else if(str.equals("danced")){
			match=true;
		}else if(str.equals("hoped")){
			match=true;
		}else if(str.equals("braked")){
			match=true;
		}else if(str.equals("faked")){
			match=true;
		}else if(str.equals("hated")){
			match=true;
		}else if(str.equals("saved")){
			match=true;
		}else if(str.equals("sated")){
			match=true;
		}else if(str.equals("satiated")){
			match=true;
		}else if(str.equals("judged")){
			match=true;
		}else if(str.equals("faded")){
			match=true;
		}else if(str.equals("mimed")){
			match=true;
		}else if(str.equals("mined")){
			match=true;
		}else if(str.equals("wrote")){
			match=true;
		}else if(str.equals("written")){
			match=true;
		}else if(str.equals("made")){
			match=true;
		}else if(str.equals("smote")){
			match=true;
		}else if(str.equals("smitten")){
			match=true;
		}else if(str.equals("skiied")){
			match=true;
		}else if(str.equals("axes")){
			match=true;
		}else if(str.equals("analyses")){
			match=true;
		}else if(str.equals("bases")){
			match=true;
		}else if(str.equals("crises")){
			match=true;
		}else if(str.equals("diagnoses")){
			match=true;
		}else if(str.equals("ellipses")){
			match=true;
		}else if(str.equals("hypotheses")){
			match=true;
		}else if(str.equals("oases")){
			match=true;
		}else if(str.equals("paralyses")){
			match=true;
		}else if(str.equals("parentheses")){
			match=true;
		}else if(str.equals("syntheses")){
			match=true;
		}else if(str.equals("theses")){
			match=true;
		}else if(str.equals("appendices")){
			match=true;
		}else if(str.equals("indeces")){
			match=true;
		}else if(str.equals("matrices")){
			match=true;
		}else if(str.equals("men")){
			match=true;
		}else if(str.equals("women")){
			match=true;
		}else if(str.equals("teeth")){
			match=true;
		}else if(str.equals("feet")){
			match=true;
		}else if(str.equals("geese")){
			match=true;
		}else if(str.equals("mice")){
			match=true;
		}else if(str.equals("lice")){
			match=true;
		}else if(str.equals("brethren")){
			match=true;
		}else if(str.equals("oxen")){
			match=true;
		}else if(str.equals("children")){
			match=true;
		}else if(str.equals("alumni")){
			match=true;
		}else if(str.equals("cacti")){
			match=true;
		}else if(str.equals("foci")){
			match=true;
		}else if(str.equals("fungi")){
			match=true;
		}else if(str.equals("nuclei")){
			match=true;
		}else if(str.equals("radii")){
			match=true;
		}else if(str.equals("stimuli")){
			match=true;
		}else if(str.equals("beaux")){
			match=true;
		}else if(str.equals("bureaux")){
			match=true;
		}else if(str.equals("tableux")){
			match=true;
		}else if(str.equals("bacteria")){
			match=true;
		}else if(str.equals("corpora")){
			match=true;
		}else if(str.equals("criteria")){
			match=true;
		}else if(str.equals("genera")){
			match=true;
		}else if(str.equals("media")){
			match=true;
		}else if(str.equals("memoranda")){
			match=true;
		}else if(str.equals("phenomena")){
			match=true;
		}else if(str.equals("strata")){
			match=true;
		}else if(str.equals("antennae")){
			match=true;
		}else if(str.equals("formulae")){
			match=true;
		}else if(str.equals("nebulae")){
			match=true;
		}else if(str.equals("vertebrae")){
			match=true;
		}else if(str.equals("vitae")){
			match=true;
		}else if(str.equals("awesome")){
			match=true;
		}else if(str.equals("crap")){
			match=true;
		}else if(str.equals("dude")){
			match=true;
		}else if(str.equals("blew")){
			match = true;
		}else if(str.equals("laid")){
			match = true;
		}else if(str.equals("brought")){
			match = true;
		}else if(str.equals("built")){
			match = true;
		}else if(str.equals("chose")){
			match = true;
		}else if(str.equals("chosen")){
			match = true;
		}else if(str.equals("clung")){
			match = true;
		}else if(str.equals("came")){
			match = true;
		}else if(str.equals("crept")){
			match = true;
		}else if(str.equals("dove")){
			match = true;
		}else if(str.equals("drew")){
			match = true;
		}else if(str.equals("dreamt")){
			match = true;
		}else if(str.equals("burnt")){
			match = true;
		}else if(str.equals("knelt")){
			match = true;
		}else if(str.equals("learnt")){
			match = true;
		}else if(str.equals("across")){
			match=true;
		}else if(str.equals("drank")){
			match = true;
		}else if(str.equals("dried")){
			match = true;
		}else if(str.equals("ate")){
			match = true;
		}else if(str.equals("eaten")){
			match = true;
		}else if(str.equals("fell")){
			match = true;
		}else if(str.equals("fed")){
			match = true;
		}else if(str.equals("fought")){
			match = true;
		}else if(str.equals("found")){
			match = true;
		}else if(str.equals("fled")){
			match = true;
		}else if(str.equals("flung")){
			match = true;
		}else if(str.equals("flew")){
			match = true;
		}else if(str.equals("fought")){
			match = true;
		}else if(str.equals("fled")){
			match = true;
		}else if(str.equals("forbade")){
			match = true;
		}else if(str.equals("forgave")){
			match = true;
		}else if(str.equals("forgiven")){
			match = true;
		}else if(str.equals("got")){
			match = true;
		}else if(str.equals("went")){
			match = true;
		}else if(str.equals("gone")){
			match = true;
		}else if(str.equals("grew")){
			match = true;
		}else if(str.equals("hung")){
			match = true;
		}else if(str.equals("heard")){
			match = true;
		}else if(str.equals("hid")){
			match = true;
		}else if(str.equals("held")){
			match = true;
		}else if(str.equals("kept")){
			match = true;
		}else if(str.equals("led")){
			match = true;
		}else if(str.equals("leapt")){
			match = true;
		}else if(str.equals("left")){
			match = true;
		}else if(str.equals("lit")){
			match = true;
		}else if(str.equals("paid")){
			match = true;
		}else if(str.equals("repaid")){
			match = true;
		}else if(str.equals("rode")){
			match = true;
		}else if(str.equals("rang")){
			match = true;
		}else if(str.equals("I'd")){
			match = true;
		}else if(str.equals("I've")){
			match = true;
		}else if(str.equals("they've")){
			match = true;
		}else if(str.equals("you've")){
			match = true;
		}else if(str.equals("she'd")){
			match = true;
		}else if(str.equals("shouldn't")){
			match = true;
		}else if(str.equals("wouldn't")){
			match = true;
		}else if(str.equals("didn't")){
			match = true;
		}else if(str.equals("wasn't")){
			match = true;
		}else if(str.equals("weren't")){
			match = true;
		}else if(str.equals("morning")){
			match = true;
		}
		return match;
	}
	

	
	
	
	
	
	/**
	 * define string root
	 * and analyze string
	 * and reset root
	 * and return
	 <pre>

		 * http://www.ego4u.com/en/cram-up/grammar/tenses
		 * 
		 * 
		 * Verb mood: no changes to verb; only adding additional words
		 * 
		 * Verb tenses: 
		 *    adding -s, -es to the verb
		 *    		simple present, 
		 *    adding -ing to the verb
		 *    		present progressive, past progressive, present perfect progressive, past perfect progressive, future progressive,
		 *    			future perfect progressive, conditional progressive, conditional II progressive
		 *    adding -ed, -d, -irregular endings
		 *    		past tense, present perfect simple, past perfect simple, future simple, future II simple
		 *    
		 *    
		 * Future tense: no changes to the word; just do | will + infinitive
		 * 
		 * IRREGULAR  verbs
		 * Helping verbs: 23 - website: http://grammar.yourdictionary.com/parts-of-speech/verbs/Helping-Verbs.html
		 * 			am is	are	was	were	
		 * 			been be	can	has	shall	
		 * 			will	do does	did	have	
		 * 			should	may might being	
		 * 			would	must	could	had 
		 * 
		 * 
		 * 
		 First define a string variable and set it to input
		
		 * no change to sound of verb - will update later when compulsory; put 0 for statnum
		 
		 * website for adding -s, -es, -ies: http://www.eslcafe.com/grammar/verb_forms_and_tenses04.html
		 * 
			if verb ends in -es
				 * other types; depending on the third to last character 
						
					/**
					 * ends with -ies --> y

					 * add 's' sound
					 
					 * a verb ends with -ves; just remove the s
					 * is different from nouns
					 
					  * add 'zz' sound
					 
					 	
					 * ends with -xes --> x
					 * add 'is' sound

					 * ends with -ches --> ch
					 * add 'is' sound

					 * ends with -shes --> sh
					 * add 'is' sound
					 	 
				 	 * ends with -ases, -oses, -ises, -uses, -eses --> remove last s
					 * are exceptions (e.g. 'irises')

						 * add 'is' sound
						 

		if just -es
						 * ends with consonant+ -es --> remove -es
						 * add 'is' sound
						 
						 
					 * ends with consonant+ -es --> remove -es
				
					 * add 'is' sound
					 
					 
					  * ends with -zes --> remove zes.
					 	 * add 'is' sound
					 
			

			* to be revised
				 * because current vocabulary grammar rules suck
				 * add 'is' sound

		if length of word is less than four, return root and statnum		
		 * -ed: 
		 * nearly the exact same as -ing endings

			if the Verb ends in -ed

			 	* double consonants
			 	* before -ed
		
			if word is longer than five letters:
				
					 * add 't' sound
				
				 * some verbs ending with c that add a 'k'
				 * incomplete list
						 * add 't' sound
				
				 * die ->died
				 * vie -> vied
				 * tie -> tied
				 * lie -> lied
					 * add 'd' sound
			*verb ending with -e
				 *change to -ed without the final -e
				 *live -->lived
				 *dance -->danced
				 *hope -->hoped
				 *brake --> braked
				 *fake -->faked
				 *rake -->raked
				 *hate --> hated
				 *sate --> sated
				 *save --> saved
				 *satiate --> satiated
				 *judge --> judged
				 *fade --> faded
				 *mime --> mimed
				 *mine --> mined
				 *
				 *UTTERLY INCOMPLETE; no exact pattern to pinpoint
			
					if third and fourth to last letters are 'dg'
					add final e after removing 'ed'
						 * add 'd' sound
						 
						   
			* otherwise just remove -ed
					 * add 'd' sound
			
	
	
	ends in -ing - > change to base
		 * 
		 * reference: http://oxforddictionaries.com/words/verb-tenses-adding-ed-and-ing
		 * Existing rules:
		 * 		1. end with silent e --> drop e and add -ing
		 * 		2. vowel + l --> add double the l and add -ing
		 * 		3. if ending in c -- > change to ck before adding -ing (problem: kicking doesn't apply)
		 * 		4. vowel + consonant -- > double consonant and add -ing
		 * 		5. vowel + consonant -- > just add -ing
		 * 		6. two vowels + consonant --> just add -ing 	
		 * 
	
	 * add 'ng' sound to all
			 * double consonants
			 * before -ing
	
				 * some verbs ending with c that add a 'k'
				 * incomplete list

				 * incomplete list of words with -ying
				 * often with the base verb ending in -ie
				 
		*verb ending with -e
				 *change to -ing 
				 *live -->living
				 *take -->taking
				 *dance -->dancing
				 *have --> having
				 *hope -->hoping
				 *make --> making
				 *brake --> braking
				 *fake -->faking
				 *rake -->raking
				 *hate --> hating
				 *sate --> sating
				 *save --> saving
				 *satiate --> satiating
				 *leave --> leaving
				 *judge --> judging
				 *fade --> fading
				 *mime --> miming
				 *mine --> mining
				 *
				 *UTTERLY INCOMPLETE; no exact pattern to pinpoint
				 *
				 *
				 *
			if ending in 'dging' change to 'dge
				 
				  
		  * otherwise just remove -ing

		if exactly five letters



				 * four letters including  -ing isn't gramatically possible as a gerund
				 * will simply return; no change to string/root
			</pre>	 		
		return root + statnum;
*/	
	
	
	
	
	
	
	
	
	
	public String checkVerb(String str){
	/**
	 * define string root
	 * and analyze string
	 * and reset root
	 * and return
	 */
		
		/**
		 * http://www.ego4u.com/en/cram-up/grammar/tenses
		 * 
		 * 
		 * Verb mood: no changes to verb; only adding additional words
		 * 
		 * Verb tenses: 
		 *    adding -s, -es to the verb
		 *    		simple present, 
		 *    adding -ing to the verb
		 *    		present progressive, past progressive, present perfect progressive, past perfect progressive, future progressive,
		 *    			future perfect progressive, conditional progressive, conditional II progressive
		 *    adding -ed, -d, -irregular endings
		 *    		past tense, present perfect simple, past perfect simple, future simple, future II simple
		 *    
		 *    
		 * Future tense: no changes to the word; just do | will + infinitive
		 * 
		 * IRREGULAR  verbs
		 * Helping verbs: 23 - website: http://grammar.yourdictionary.com/parts-of-speech/verbs/Helping-Verbs.html
		 * 			am is	are	was	were	
		 * 			been be	can	has	shall	
		 * 			will	do does	did	have	
		 * 			should	may might being	
		 * 			would	must	could	had 
		 * 
		 * 
		 */
		
		String root = str;
		/**
		 * no change to sound of verb - will update later when compulsory
		 */
		
		int statVerb = 0;
		int len = str.length();
		
		/**
		 * website for adding -s, -es, -ies: http://www.eslcafe.com/grammar/verb_forms_and_tenses04.html
		 * 
		 */
		if (str.charAt(len-1) == 's'){
			if (str.charAt(len-2) == 'e'){
				
				/**
				 * other types; depending on the third to last character
				 */
				
				
				
				if (str.charAt(len-3) == 'i'){
					/**
					 * ends with -ies --> y
					 */
					
					root = str.substring(0, len-3) + "y";
					
					/**
					 * add 's' sound
					 */
					statVerb = 2;
				
				}else if(str.charAt(len-3) == 'v'){
					/**
					 * a verb ends with -ves; just remove the s
					 * is different from nouns
					 */
					
					root = str.substring(0, len-1);
					/**
					 * add 'zz' sound
					 */
					
					statVerb = 3;
					
				
				}else if(str.charAt(len-3) == 'x'){
					/**
					 * ends with -xes --> x
					 */
					
					root = str.substring(0, len-2);
					
					/**
					 * add 'is' sound
					 */
					
					statVerb = 4;
				}else if(str.charAt(len-3) == 'h' && str.charAt(len-4) == 'c'){
					/**
					 * ends with -ches --> ch
					 */
					
					root = str.substring(0, len-2);
					
					/**
					 * add 'is' sound
					 */
					
					statVerb = 4;
				}else if(str.charAt(len-3) == 'h' && str.charAt(len-4) == 's'){
					/**
					 * ends with -shes --> sh
					 */
					
					root = str.substring(0, len-2);
					/**
					 * add 'is' sound
					 */
					
					statVerb = 4;
				}else if(str.charAt(len-3) == 's'){
					if(str.charAt(len-4) == 'a' || str.charAt(len-4) == 'e' || str.charAt(len-4) == 'i' || str.charAt(len-4) == 'o' || 
							str.charAt(len-4) == 'u' ){
						/**
						 * ends with -ases, -oses, -ises, -uses, -eses --> remove last s
						 * are exceptions (e.g. 'irises')
						 */
						
						root = str.substring(0, len-1);
						/**
						 * add 'is' sound
						 */
						
						statVerb = 4;
					}
					else{
						/**
						 * ends with consonant+ -es --> remove -es
						 */
			
						root = str.substring(0, len-2);
						/**
						 * add 'is' sound
						 */
						statVerb = 4;
					}
				}else if(str.charAt(len-3) == 'o'){
					/**
					 * ends with consonant+ -es --> remove -es
					 */
					
					
					root = str.substring(0, len-2);
					/**
					 * add 'is' sound
					 */
					
					statVerb = 4;
					
				}else if(str.charAt(len-3) == 'z'){
					/**
					 * ends with -zes --> remove zes.
					 */
					
				
					root = str.substring(0, len-3);
					/**
					 * add 'is' sound
					 */
					
					statVerb = 4;
				}
			}else{
				/**
				 * to be revised
				 * because current vocabulary grammar rules suck
				 */
				root = str.substring(0, len-1);
				/**
				 * add 'is' sound
				 */
				
				statVerb = 4;
			}
		}
		
		if(len<4) return root + statVerb;
		
		/**
		 * -ed: 
		 * nearly the exact same as -ing endings
		 * 
		 */
		
		if(str.charAt(len-1) == 'd' && str.charAt(len-2) == 'e'){
			/**
			 * double consonants
			 * before -ed
			 */
			if(len>5){
				if(str.charAt(len-3) == str.charAt(len-4) && str.charAt(len-3) != 'a'
						&& str.charAt(len-4) != 'i'&& str.charAt(len-4) != 'e' && str.charAt(len-4) != 'o'
						&& str.charAt(len-4) != 'u'){
					root = str.substring(0, len-3);
				
					/**
					 * add 't' sound
					 */
					
					statVerb = 5;
					
					/**
				 * some verbs ending with c that add a 'k'
				 * incomplete list
				 */
				}else if(str.equals("panicked")){
					root = "panic";
					/**
					 * add 't' sound
					 */
					
					statVerb = 5;
				}else if(str.equals("mimicked")){
					root = "mimic";
					/**
					 * add 't' sound
					 */
					
					statVerb = 5;
				}else if(str.equals("trafficked")){
					root = "traffic";
					/**
					 * add 't' sound
					 */
					
					statVerb = 5;
				}else if(str.equals("picnicked")){
					root = "picnic";
					/**
					 * add 't' sound
					 */
					
					statVerb = 5;
				}
			
				/**
				 * die ->died
				 * vie -> vied
				 * tie -> tied
				 * lie -> lied
				 * 
				 */
				else if(str.equals("died")){
					root = "die";
					/**
					 * add 'd' sound
					 */
					
					statVerb = 6;
				}else if(str.equals("lied")){
					root = "lie";
					/**
					 * add 'd' sound
					 */
					
					statVerb = 6;
				}else if(str.equals("tied")){
					root = "tie";
					/**
					 * add 'd' sound
					 */
					
					statVerb = 6;
				}else if(str.equals("vied")){
					root = "vie";/**
					 * add 'd' sound
					 */
					
					statVerb = 6;
				}

				/**
				 *verb ending with -e
				 *change to -ed without the final -e
				 *live -->lived
				 *dance -->danced
				 *hope -->hoped
 				 *brake --> braked
				 *fake -->faked
				 *rake -->raked
				 *hate --> hated
				 *sate --> sated
				 *save --> saved
				 *satiate --> satiated
				 *judge --> judged
				 *fade --> faded
				 *mime --> mimed
				 *mine --> mined
				 *
				 *UTTERLY INCOMPLETE; no exact pattern to pinpoint
				 *
				 */
				if(str.charAt(len-3) == 'g' && str.charAt(len-4) == 'd'){
						root = str.substring(len-1);
				}else if ((str.charAt(len-3) == 'k' || str.charAt(len-3) == 't' || str.charAt(len-3) == 'v' 
					|| str.charAt(len-3) == 'd') && str.charAt(len-4) == 'a' && str.charAt(len-5) != 'a'
					&& str.charAt(len-5) != 'i'&& str.charAt(len-5) != 'o'&& str.charAt(len-5) != 'u'
					&& str.charAt(len-5) != 'a'){
						root = str.substring(0, len-1);
						/**
						 * add 'd' sound
						 */
						
						statVerb = 5;
				}
				
				
				/**
				 * otherwise just remove -ed
				 */
				else{
					root= str.substring(0, len-2);
					
					/**
					 * add 'd' sound
					 */
					
					statVerb = 5;
				}
			}
		}

		
		/**
		 * ends in -ing - > change to base
		 * 
		 * reference: http://oxforddictionaries.com/words/verb-tenses-adding-ed-and-ing
		 * Existing rules:
		 * 		1. end with silent e --> drop e and add -ing
		 * 		2. vowel + l --> add double the l and add -ing
		 * 		3. if ending in c -- > change to ck before adding -ing (problem: kicking doesn't apply)
		 * 		4. vowel + consonant -- > double consonant and add -ing
		 * 		5. vowel + consonant -- > just add -ing
		 * 		6. two vowels + consonant --> just add -ing 	
		 * 
		 */
		
		if(str.charAt(len-1) == 'g' && str.charAt(len-2) == 'n' && str.charAt(len-3) == 'i'){
			
			/**
			 * add 'ng' sound
			 */
			
			statVerb = 7;
			
			
			/**
			 * double consonants
			 * before -ing
			 */
			if(len>5){
				if(str.charAt(len-4) == str.charAt(len-5) && str.charAt(len-4) != 'a'
						&& str.charAt(len-4) != 'i'&& str.charAt(len-4) != 'e' && str.charAt(len-4) != 'o'
						&& str.charAt(len-4) != 'u'){
					root = str.substring(0, len-4);
					
					
				/**
				 * some verbs ending with c that add a 'k'
				 * incomplete list
				 */
				}else if(str.equals("panicking")){
					root = "panic";
				}else if(str.equals("mimicking")){
					root = "mimic";
				}else if(str.equals("trafficking")){
					root = "traffic";
				}else if(str.equals("picnicking")){
					root = "picnic";
				}
			
				/**
				 * incomplete list of words with -ying
				 * often with the base verb ending in -ie
				 */
				
				/**
				 *verb ending with -e
				 *change to -ing 
				 *live -->living
				 *take -->taking
				 *dance -->dancing
				 *have --> having
				 *hope -->hoping
				 *make --> making
				 *brake --> braking
				 *fake -->faking
				 *rake -->raking
				 *hate --> hating
				 *sate --> sating
				 *save --> saving
				 *satiate --> satiating
				 *leave --> leaving
				 *judge --> judging
				 *fade --> fading
				 *mime --> miming
				 *mine --> mining
				 *
				 *UTTERLY INCOMPLETE; no exact pattern to pinpoint
				 *
				 */
				if(str.charAt(len-4) == 'g' && str.charAt(len-5) == 'd'){
				root = str.substring(len-3) + "e";
				}else if ((str.charAt(len-4) == 'k' || str.charAt(len-4) == 't' || str.charAt(len-4) == 'v' 
					|| str.charAt(len-4) == 'd') && str.charAt(len-5) == 'a' && str.charAt(len-6) != 'a'
					&& str.charAt(len-6) != 'i'&& str.charAt(len-6) != 'o'&& str.charAt(len-6) != 'u'
					&& str.charAt(len-6) != 'a'){
						root = str.substring(0, len-3) + "e";
				}
				
				
				/**
				 * otherwise just remove -ing
				 */
				else{
					root= str.substring(0, len-3);
					statVerb = 7;
				}
			}else if (len == 5){
				/**
				 * four letters including  -ing isn't gramatically possible as a gerund
				 * will simply return; no change to string/root
				 */
				if(str.equals("going")){
					root = "go";
				}else if (str.equals("doing")){
					root = "do";
				}else if (str.equals("being")){
					root = "be";
				}else if(str.equals("dying")){
					root = "die";
				}else if(str.equals("lying")){
					root = "lie";
				}else if(str.equals("tying")){
					root = "tie";
				}else if(str.equals("vying")){
					root = "vie";
				}

				
			}
		}
		
		return root + statVerb;
	}

	
	
	
	
	
	
	
	/**
	 * same as above
	<pre>
	
	 First define a string variable and set it to the input
	String root = str;
	
	 * is a special word if set to 1
	int	statnum = 1;
	
    if the word ends with es

			 * IS -- > ES

			 * -ices -- > ix
			 * or -eces --> ex

					 * 
					 * no changes, ies --> ies

			 * 
			 * other types; depending on the third to last character

			 * 
			 * ends with -ies --> y

			 * 
			 * add an 's' sound to end of word; status equals 2

			 * It may end in '-fe' and not just 'f.' - e.g. wife
			 * We'll cross that bridge when we get there.

				 * 
				 * adding a 'zz' sound; status equals 3

			 * ends with -xes --> x

				 * 
				 * adding an 'is' sound; status equals 4

			 * 
			 * ends with -ches --> ch

				 * adding an 'is' sound; status equals 4

				 * adding an 'is' sound; status equals 4

					 * ends with -ases, -oses, -ises, -uses, -eses --> remove last s
					 * are exceptions (e.g. 'irises')

				 * adding an 'is' sound; status equals 4

					 * ends with consonant+ -es --> remove -es
					 * adding an 'is' sound; status equals 4

				 * ends with -oes --> o
				 * adding an 'is' sound; status equals 4

				 * ends with -zes --> remove zes.
				 * adding an 'is' sound; status equals 4

			 * to be revised
			 * because current vocabulary grammar rules suck

			 * adding an 'is' sound; status equals 4

		 * some other irregular plurals

	 * Some plurals, like '-i' and '-ae' and '-a' come directly from Latin
	 * like many others. They are first and second declension derivatives.
	 * Examples: bacterium --> bacteria (neuter)
	 * cactus --> cacti (male)
	 * fossae --> fossa (feminine)

	 * eau --> eaux (FRENCH)

	 * continuation of Latin, a -> um

		 * 
		 * continuation from Latin --> ae to a

	 * Other cases

	 Otherwise  no changes to the word
	return root + statnum;
   </pre>
   */	
	
	
	
	
	
	
	public String checkN(String str){
		
		/**
		 * same as above
		 */
		String root = str;
		
		/**
		 * is a special word if set to 1
		 */
		int	statnum = 1;
		
		int len = str.length();
		if (str.charAt(len-1) == 's'){
			if (str.charAt(len-2) == 'e'){
				/**
				 * IS -- > ES
				 */
				
				if(str.equals("axes")){
					root = "axis";
				}else if(str.equals("analyses")){
					root = "analysis";
				}else if(str.equals("bases")){
					root = "basis";
				}else if(str.equals("crises")){
					root = "crisis";
				}else if(str.equals("diagnoses")){
					root = "diagnosis";
				}else if(str.equals("ellipses")){
					root = "ellipsis";
				}else if(str.equals("hypotheses")){
					root = "hypothesis";
				}else if(str.equals("oases")){
					root = "oasis";
				}else if(str.equals("paralyses")){
					root = "paralysis";
				}else if(str.equals("parentheses")){
					root = "parenthesis";
				}else if(str.equals("syntheses")){
					root = "synthesis";
				}else if(str.equals("theses")){
					root = "thesis";
				}
				
				/**
				 * -ices -- > ix
				 * or -eces --> ex
				 */
				else if(str.equals("appendices")){
					root = "appendix";
				}else if(str.equals("indeces")){
					root = "index";
				}else if(str.equals("matrices")){
					root = "matrix";
				}
						/**
						 * no changes, ies --> ies
						 */
				else if(str.equals("species")){
					root = "species";
				}else if(str.equals("series")){
					root = "series";
				}
				/**
				 * other types; depending on the third to last character
				 */
				
				
				/**
				 * ends with -ies --> y
				 */
				
				else if (str.charAt(len-3) == 'i'){
					root = str.substring(0, len-3) + "y";
				
				/**
				 * add an 's' sound to end of word; status equals 2
				 */
					statnum = 2;
				
				}
				
				/**
				 * It may end in '-fe' and not just 'f.' - e.g. wife
				 * We'll cross that bridge when we get there.
				 */
				
				else if(str.charAt(len-3) == 'v'){
					root = str.substring(0, len-3) + "f";
					/**
					 * adding a 'zz' sound; status equals 3
					 */
					statnum = 3;
					
					
				}
				/**
				 * ends with -xes --> x
				 */
		
				else if(str.charAt(len-3) == 'x'){
					root = str.substring(0, len-2);
					/**
					 * adding an 'is' sound; status equals 4
					 */
					statnum = 4;
					
				}
				/**
				 * ends with -ches --> ch
				 */
			
				else if(str.charAt(len-3) == 'h' && str.charAt(len-4) == 'c'){
					root = str.substring(0, len-2);
					/**
					 * adding an 'is' sound; status equals 4
					 */
					statnum = 4;
					
				}else if(str.charAt(len-3) == 'h' && str.charAt(len-4) == 's'){
					root = str.substring(0, len-2);
					/**
					 * adding an 'is' sound; status equals 4
					 */
					statnum = 4;
					
				}else if(str.charAt(len-3) == 's'){
					if(str.charAt(len-4) == 'a' || str.charAt(len-4) == 'e' || str.charAt(len-4) == 'i' || str.charAt(len-4) == 'o' || 
							str.charAt(len-4) == 'u' ){
						/**
						 * ends with -ases, -oses, -ises, -uses, -eses --> remove last s
						 * are exceptions (e.g. 'irises')
						 */
						
					root = str.substring(0, len-1);
					/**
					 * adding an 'is' sound; status equals 4
					 */
					statnum = 4;

					
					}
					else{
						root = str.substring(0, len-2);
						/**
						 * ends with consonant+ -es --> remove -es
						 */
						/**
						 * adding an 'is' sound; status equals 4
						 */
						statnum = 4;
					}
				}else if(str.charAt(len-3) == 'o'){
					root = str.substring(0, len-2);
					/**
					 * ends with -oes --> o
					 */
					/**
					 * adding an 'is' sound; status equals 4
					 */
					statnum = 4;

					
				}else if(str.charAt(len-3) == 'z'){
					root = str.substring(0, len-3);
					/**
					 * ends with -zes --> remove zes.
					 */
					/**
					 * adding an 'is' sound; status equals 4
					 */
					statnum = 4;

				}
			}else{
				/**
				 * to be revised
				 * because current vocabulary grammar rules suck
				 */
				root = str.substring(0, len-1);
				/**
				 * adding an 'is' sound; status equals 4
				 */
				statnum = 4;
			}
			
		}else if(str.equals("men")){
			root = "man";
		}else if(str.equals("woman")){
				root = "woman";	
		}else if(str.equals("teeth")){
				root = "tooth";
		}else if(str.equals("feet")){
				root = "foot";
		}else if(str.equals("geese")){
			root = "goose";
		}else if(str.equals("mice")){
			root = "mouse";
		}else if(str.equals("lice")){
			root = "louse";
		}else if(str.equals("brethren")){
			root = "brother";
		}else if(str.equals("oxen")){
			root = "ox";
		}else if(str.equals("children")){
			root = "child";
		}else if(str.equals("alumni")){
			root = "alumnus";
		}else if(str.equals("cacti")){
			root = "cactus";
		}else if(str.equals("foci")){
			root = "focus";
		}else if(str.equals("fungi")){
			root = "fungus";
		}else if(str.equals("nuclei")){
			root = "nucleus";
		}else if(str.equals("radii")){
			root = "radius";
		}else if(str.equals("stimuli")){
			root = "stimulus";
		
		}
		/**
		 * Some plurals, like '-i' and '-ae' and '-a' come directly from Latin
		 * like many others. They are first and second declension derivatives.
		 * Examples: bacterium --> bacteria (neuter)
		 * cactus --> cacti (male)
		 * fossae --> fossa (feminine)
		 */
		
		/**
		 * eau --> eaux (FRENCH)
		 */
		
		else if(str.equals("beaux")){
			root = "beau";
		}else if(str.equals("bureaux")){
			root = "bureau";
		}else if(str.equals("tableaux")){
			root = "tableau";
		}

		/**
		 * continuation of Latin, a -> um
		 */

		else if(str.equals("bacteria")){
			root = "bacterium";
		}else if(str.equals("corpora")){
			root = "corpus";
		}else if(str.equals("criteria")){
			root = "criterion";
		}else if(str.equals("curricula")){
			root = "curriculum";
		}else if(str.equals("data")){
			root = "datum";
		}else if(str.equals("genera")){
			root = "genus";
		}else if(str.equals("media")){
			root = "medium";
		}else if(str.equals("memoranda")){
			root = "memorandum";
		}else if(str.equals("phenomena")){
			root = "phenomenon";
		}else if(str.equals("strata")){
			root = "stratum";
		}

			/**
			 * continuation from Latin --> ae to a
			 */
		else if(str.equals("antennae")){
			root = "antenna";
		}else if(str.equals("formulae")){
			root = "formula";
		}else if(str.equals("nebulae")){
			root = "nebula";
		}else if(str.equals("vertebrae")){
			root = "vertebra";
		}else if(str.equals("vitae")){
			root = "vita";
		}
		
		
		/**	
		 * Other cases
		 */
		else{
			
			/**	
			 * no changes to the word
			 */
			statnum = 0;
		}
		
		return root + statnum;
	}

/**	
 * <pre>
	put in the sentence
	the dialog box displays the sentence below the input box
	it disregards punctuation
	after inputting, set Text to empty again
	</pre>
	*/
	
	public void actionPerformed (ActionEvent e){
		inputString = tField.getText();
		phrase = inputString.split("[\\s,.?!;:\"-]+");
		tField.setText("");
		
		model.addElement(inputString);
		Analysis(inputString);
	
	}
}
	
	