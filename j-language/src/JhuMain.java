



import java.util.*;
import java.io.*;

/**
 *this Class handles creating sound files, and then creating an array for each part of speech and loading them into the program 
 * 
 * @author juliette
 *
 */
public class JhuMain {

	
	/**
	 * initiates each method
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws SoundException
	 @since Oct 27, 2012
	 * 
	 * <br>
	 * 
	 * 
	 
	 *<pre> 
	 * if you create the JhuMain object called jm, then you are going to separate the sound file of each word from the recording 
	 * if you create the sentences object, just called sentences, then you're doing sentence analysis (a separate program)
	 * 		and then read out the input-sentence
	 * </pre>
	 */
	String root = "D:/";
	
	public static void main(String[] args)
			throws FileNotFoundException, SoundException			
	{
		JhuMain jm = new JhuMain();
		//jm.createFiles();
		//jm.autoCreateSoundFiles();
		//jm.createSoundFiles();
		//jm.test();
		//jm.init();
		
		sentences MyWindow = new sentences();
		MyWindow.pack();
		MyWindow.show();
	
	}
	
	/**
	 * @throws FileNotFoundException
	 * @throws SoundException
	 */
	/**
	 * @throws FileNotFoundException
	 * @throws SoundException
	 */
	
	/**
	 * @since Oct 28, 2012
	 * 
	 * initializes the Java classes that contain words pertaining to their part of speech 
	 * 
	 */
	public void init(){
		Jhu_adjective.initialize();
		Jhu_adverb.initialize();
		Jhu_conj.initialize();
		Jhu_det.initialize();
		Jhu_inj.initialize();
		Jhu_mod.initialize();
		Jhu_n.initialize1();
		Jhu_n.initialize2();
		Jhu_n.initialize3();
		Jhu_prep.initialize();
		Jhu_pron.initialize();
		Jhu_Verb.initialize();
		
		
	}
	
	
	/**
	 * a simple test
	 * 
	 * @throws FileNotFoundException
	 * @throws SoundException
	 * @since Oct 28, 2012
	 * 
	 * <pre>
	 * displays the integers inside a sound file for patterns
	 * (where the end, beginning of the sound file is)
	 * </pre>	 
	 */
	
	public void test()
				throws FileNotFoundException, SoundException
				
	{
		String soundPath = root+"CheckerProject1/j-language/src/";
		Sound s = new Sound(soundPath + "able.wav");
		
		//s.explore();
		
		for(int j=0; j<250000; j++){
		
		System.out.print(s.getSampleValueAt(j)+ ", ");
		}
		
	}
	
	
	/**
	 * the utilized program that separates a sound file into sound segments automatically
	 * 
	 * @throws FileNotFoundException
	 * @throws SoundException
	 * @ Nov 5, 2012
	 * 
	 * <pre>
	 * detects the beginning and end of a sound segment
	 * 		absolute value of numbers less than 100 are usually just background sounds
	 * 		absolute value of numbers greater than 100 are where my voice has been
	 * 
	 * 			throws FileNotFoundException, SoundException
		
		had to separate all 6000 words into lists of 200 by MYSELF
		AND THEN READ ONE BY ONE AND THEN DO IT OVER AGAIN WHEN IT WAS UNSATISFACTORY
		
		creating sounds files starts from list 1 
			the first giant sound file is then saved to the soundPath (library)
		
		there are 200 words in each list, staring from 0 to 199
		matches the sound segments to each word in the .txt (which also contains 200 words)
		
		after it would save each separate word's sound file into the soundPath
		
		or, condensed:
		 * cut a segment of the sound file, play it, and paste into a personalized file for the word - if 
		 * appropriate.
		 *  
		 
		 	the position is where the sound file is currently at after being cut
		 	when you first play the sound file, the position is 0, and the index is 0
		 	
		
		
				 * Lets you adjust mistakes
				 * by entering the start position of the audio file (which is 0 at the start)
				 * 
				 * then, if there is a mistake, such as a large noise caused a lag
				 * you can enter the position and index of the next word if the word was supposed to be paired with the one before		
		
		
			in the for loop, every time you make the createFile name, you use the word from the list
			ex. able
			so the file name becomes able.wav
			
			target means audio segment of the recording
				 * this means that if numbers do not show more than 1000000 TWICE in a row,
				it's not the voice - it's just background shuffling.
				put into perspective of a transverse wave 
				 = big numbers, high altitudes -x000 to x000; low numbers, low altitudes -x00 to x00
				this helps determine proper place to siphon off sound segment
				 * 
		if the total of a 1000 numbers, separated by commas, is greater than 100000, the voice has been found.
		Otherwise, it hasn't. So you keep going.
				
	
	 * found voice!
	 * BOOYAH
	
				 * decide where the voice ends
			
		 * here is where the voice ends in the uncut segment
		 * gives a little space where the voice ends and then begins in SEQUENCE
	
		aa- is ending
		then go backwards a little bit to include all parts of the word
		
		copy the sound segment of the recording from the beginning, position, to the ending, -aa
		then it saves to the sound object called target and plays it to make sure of any inconsistencies

	it plays the segment from beginning to end,
	and you can observe the consistency between the word, sound, and position
	if there is a shifting of the word against the sound played, the program needs to be rerun by adjusting the starting
	position where the shifting occurred, and the index (number assigned to the word)

				SAVED SO MUCH TIME
		sometimes the word just doesn't have the correct pronunciation and cannot be corrected
		so it is added to a list of words that have been mistakenly done away with
				to be recorded later
	 * 
	 * </pre>
	 */
	
	
	public void autoCreateSoundFiles()
				throws FileNotFoundException, SoundException
	{
		
		int fileno = 17;
		String soundPath = root+"CheckerProject1/j-language/src/";
		Sound s = new Sound(soundPath + "recording"+fileno + ".wav");
		//s.play();
		/**
		 * read list of words from file
		 */

		int numberOfWords=206;
		String[] readlist= new String[numberOfWords];
		int h=0;
		Scanner inFile = new Scanner(new FileReader(soundPath + "r" + fileno +  ".txt"));
		while (inFile.hasNext() && h<numberOfWords) {
			readlist[h] = new String(inFile.next().trim());
			h++;
		}
		inFile.close();
	
		
		/**
		 * cut a segment of the sound file, play it, and paste into a personalized file for the word - if 
		 * appropriate.
		 *  
		 */
	
		/**for(int j=175000; j<250000; j++){
			System.out.print(s.getSampleValueAt(j)+ ", ");
		}
		*/
		
		int position=0;
		//where you are after you read a segment of the file - corresponds with sound file
		int startWord=0;
		int totalOf1000=0;
		int foundVoice=0;

		String fileName = readlist[startWord];
	
		Scanner con = new Scanner(System.in);
		System.out.println("Enter the index of the word: ");
		startWord = con.nextInt();
		/**
		 * Lets you adjust mistakes
		 */
		System.out.println("Enter the start position of the audio file: ");
		position = con.nextInt();
		
		
		
		Sound target = new Sound (10000000);
		int aa = position;
		boolean previousBlock=false;
		 
		for (int i = startWord; i<readlist.length; i++)
		{
			fileName=readlist[i];
			//in the for loop, every time you make the createFile name, you use the word from the list
			//ex. able
			//so the file name becomes able.wav
			
			//target means audio segment of the recording
			System.out.println(" i= " + i);
			do {
				totalOf1000=0;
				for (int v=0; v<1000; v++){
					totalOf1000+=Math.abs(s.getSampleValueAt(aa));
					aa++;
				}
				/**
				 * this means that if numbers do not show more than 1000000 TWICE in a row,
				it's not the voice - it's just background shuffling.
				put into perspective of a transverse wave 
				 = big numbers, high altitudes -x000 to x000; low numbers, low altitudes -x00 to x00
				this helps determine proper place to siphon off sound segment
				 * 
				 */
				if(totalOf1000>100000){
					if(!previousBlock){
						previousBlock=true;
					}
					foundVoice++;
				} else{
					previousBlock=false;
					foundVoice=0;
			
				}
						
			}while(foundVoice<2);
	/**
	 * found voice!
	 * BOOYAH
	 */
			aa -= 2000;
			position = aa;
			System.out.print(i + ": position=" +position+ ",");
				/**
				 * decide where the voice ends
				 */
			
			foundVoice=0;
			previousBlock=false;
			do {
				totalOf1000=0;
				for(int v=0; v<1000; v++){
					totalOf1000+=Math.abs(s.getSampleValueAt(aa));
					aa++;	
				}
				if (totalOf1000<100000){
					if(!previousBlock){
						previousBlock=true;
					}
					foundVoice++;
				}else{
					previousBlock=false;
					foundVoice=0;
				}
				
			}while(foundVoice<10);
		/**
		 * here is where the voice ends in the uncut segment
		 * gives a little space where the voice ends and then begins in SEQUENCE
		 */
		aa-=1000;
			System.out.println("length=" +(aa-position)+", word =" +fileName);
			
			target = s.portion(position, aa).scale(0.5);
			target.blockingPlay();
		//	target.explore();
			
			try{
				target.writeToFile(soundPath+fileName+".wav");
			}catch(Exception e){
					System.out.println(e);	
			}
				
		}
	
	}			


	
	/**
	 * obsolete version of creating sound segments from a giant sound file
	 * 
	 * @throws FileNotFoundException
	 * @since Nov 4, 2012
	 * 
	 * 
	 * <pre>
	 * ended up being inefficient and painstaking
	 * so the autoCreate was introduced
	 * 
	 * this program takes a recording of two hundred words, using Sound Recorder, provided in Windows 7,
	 *   and analyzes it word by word.
	 *   
	 *  the beginning of the sound of a word and the ending of the sound of that word in the recording file
	 *  	are estimated one by one
	 *  essentially trying to blindly grasp for a whole word in the midst of a mess
	 *  then just do that forever
	 *  
	 *  a better program was required so the software can detect by itself - and estimate - the beginning and end of a word
	 *  which is autoCreate.
	 * </pre>
	 * 
	 */
	
	
	public void createSoundFiles()
				throws FileNotFoundException, SoundException
	{
		int fileno = 0;
		Sound s = new Sound(root+"CheckerProject1/j-language/src/recording" + fileno + ".wav");
	    //s.play();
		/**
		 * read list of words from file
		 */
	
		int numberOfWords=200;
		String[] readlist= new String[numberOfWords];
		int h=0;
		Scanner inFile = new Scanner(new FileReader(root+"CheckerProject/Language-Project/r1.txt"));
		while (inFile.hasNext() && h<numberOfWords) {
			readlist[h] = new String(inFile.next().trim());
			h++;
		}
		inFile.close();
		
		/**
		 * cut a segment of the sound file, play it, and paste into a personalized file for the word - if 
		 * appropriate. 
		 * Otherwise, adjust the length and repeat the step above.
		 */
		
		Scanner console = new Scanner(System.in);
	    /**
	     * lets me read from keyboard
	     */
		
		int position=180000;
		/**
		 * where you are after you read a segment of the file - corresponds with sound file
		 */

		int sampleValue;
		int length = 27000;
		String fileName = readlist[0];
		
		String soundPath = root+"CheckerProject1/j-language/src/";
		int adjustment = 0;
		/**
		 * this for loop is for the purpose that after you finish reading one segment, you read the next.
		only if valid does this apply - marked by values 0, -(integer) or +(integer)
		 */
		
		for (int i = 0; i<readlist.length; i++)
		{
			fileName=readlist[i];
			/**in the for loop, every time you make the createFile name, you use the word from the list
			ex. able
			so the file name becomes able.wav
			*/
			Sound target = new Sound (length);
			/**
			 * target means audio segment of the recording
			 */
			adjustment = 0;
			/**
			 * length, which is where you actually use 0, -(integer), +(integer) to adjust the spacing
			
			this loop reads the segments, technically, plays it, and ascribes new file names to the
			segment
			*/
			do{	
				length += adjustment;
				target = new Sound (length);
				/**this for loop reads the segment from the sound recording and 
				pastes it into the separate sound
				*/	
				for ( int seg = 0; seg<length; seg++)
				{
					sampleValue = s.getSampleValueAt(position+seg);
					target.setSampleValue(seg, sampleValue);
				}
					
				target.play();
				//it plays the segment
				
				System.out.println("Select the following option: ");
				System.out.println("1. Type 0 to go to the next word.");
				System.out.println("2. Type in a positive integer to extend the length of the segment.");
				System.out.println("3. Type in a negative number to shrink the length of the segment. ");
				adjustment = console.nextInt();
				//it waits for you to type in the next integer
				
			}while (adjustment !=0);
				
			try{
				target.writeToFile(soundPath+fileName+".wav");
			}catch(Exception e){
					System.out.println(e);	
			}
				/**
				 * it goes to the next segment	
				 */
				position += length;				
		}
    }
	
	
	
	/**
	 *creates files for each part of speech 
	 * @throws FileNotFoundException
	 * @since Oct 28, 2012
	 * <br>
	 * 
	 * 
	 * <pre>
	 *
	 *used to create the giant array files for each part of speech
	 *		each file contains an array for Order, Frequency, Pronounce, and the word itself
	 *				according to the words of the same type in each list
	 *			later, this file will be utilized to actually initialize the arrays inside the classes such as
	 *							Jhu_adjective, Jhu_adverb, Jhu_conj, Jhu_det, Jhu_inj... etc.
	 *					just kept them there
	 *		only needed for creating the classes of all parts of speech
	 *		after creating the objects of those classes, all 6000 words will be loaded into the program
	 * </pre>
	 */
	
	public void createFiles()
			throws FileNotFoundException
	{
	
		String [] wtypes = {"a", "adv", "V", "conj", "inj", "det", "modal", "n", "prep", "pron"};
		String preStr = wtypes[0];
		int order = 0;
		int frequency = 0;
		String word = "";
		int index = 0; 
		
		for (int i=0; i<10; i++){		
			index = 0;
			preStr = wtypes[i];
			Scanner infile = new Scanner(new FileReader(root+"CheckerProject1/j-language/src/com/jhu_language/appspot/" +preStr+ ".txt"));
			PrintWriter outFile = new PrintWriter(root+"CheckerProject1/j-language/src/com/jhu_language/appspot/" + preStr + "word.txt");
			
			while(infile.hasNext()){
				 order = infile.nextInt();
				 frequency = infile.nextInt();
				 word=infile.next();
				 
				outFile.println(preStr+"_Word[" + index + "] =\"" + word + "\";" );  
				outFile.println(preStr+"_WordOrder[" + index + "] = " + order + ";");
				outFile.println(preStr+"_WordFrequency[" + index + "] = " + frequency + ";"); 
				outFile.println(preStr+"_WordPronounce[" + index + "] = \"" + word+ ".mp3\";");
				index++;
		 }
			infile.close();
			outFile.close();
		 	}
		}
	
	
}
