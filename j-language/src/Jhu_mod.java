/**
 * 
 */


/**
 * this class creates four arrays for modal words
 * 
 * @author juliette
 **@since Oct 28, 2012
 *
 *
 *<br>
 	 * <br>
	 * <pre>
	 * when called to initialization, all of the words will be loaded into the program
	 * to be referred to freely
	 * </pre>
	 * 
 */
public class Jhu_mod {
	public static int MAX_MOD = 2000;
	public static String[] modal_Word = new String[MAX_MOD];
	public static int [] modal_WordOrder = new int[MAX_MOD];
	public static int [] modal_WordFrequency = new int[MAX_MOD];
	public static String[] modal_WordPronounce = new String[MAX_MOD];

	public static Boolean isMod (String str){
		Boolean found = false;
		for (int i=0; i<modal_Word.length; i++){
			if(found)
				break;
			found = str.equalsIgnoreCase (modal_Word[i]);
		}
		return found;
	}

	public static void initialize(){
		modal_Word[0] ="can";
		modal_WordOrder[0] = 37;
		modal_WordFrequency[0] = 266116;
		modal_WordPronounce[0] = "can.mp3";
		modal_Word[1] ="could";
		modal_WordOrder[1] = 57;
		modal_WordFrequency[1] = 168387;
		modal_WordPronounce[1] = "could.mp3";
		modal_Word[2] ="may";
		modal_WordOrder[2] = 88;
		modal_WordFrequency[2] = 113024;
		modal_WordPronounce[2] = "may.mp3";
		modal_Word[3] ="might";
		modal_WordOrder[3] = 151;
		modal_WordFrequency[3] = 61446;
		modal_WordPronounce[3] = "might.mp3";
		modal_Word[4] ="must";
		modal_WordOrder[4] = 120;
		modal_WordFrequency[4] = 72059;
		modal_WordPronounce[4] = "must.mp3";
		modal_Word[5] ="need";
		modal_WordOrder[5] = 2497;
		modal_WordFrequency[5] = 3356;
		modal_WordPronounce[5] = "need.mp3";
		modal_Word[6] ="ought";
		modal_WordOrder[6] = 1574;
		modal_WordFrequency[6] = 6077;
		modal_WordPronounce[6] = "ought.mp3";
		modal_Word[7] ="shall";
		modal_WordOrder[7] = 166;
		modal_WordFrequency[7] = 57056;
		modal_WordPronounce[7] = "shall.mp3";
		modal_Word[8] ="should";
		modal_WordOrder[8] = 78;
		modal_WordFrequency[8] = 128393;
		modal_WordPronounce[8] = "should.mp3";
		modal_Word[9] ="used";
		modal_WordOrder[9] = 881;
		modal_WordFrequency[9] = 11513;
		modal_WordPronounce[9] = "used.mp3";
		modal_Word[10] ="will";
		modal_WordOrder[10] = 35;
		modal_WordFrequency[10] = 297281;
		modal_WordPronounce[10] = "will.mp3";
		modal_Word[11] ="would";
		modal_WordOrder[11] = 36;
		modal_WordFrequency[11] = 272345;
		modal_WordPronounce[11] = "would.mp3";
	}
}