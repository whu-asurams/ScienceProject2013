/**
 * this class creates four arrays for interjections
 * 
 * @author juliette
 * @since Oct 28, 2012
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

public class Jhu_inj {
	public static int MAX_INJ = 2000;
	public static String[] inj_Word = new String[MAX_INJ];
	public static int [] inj_WordOrder = new int[MAX_INJ];
	public static int [] inj_WordFrequency = new int[MAX_INJ];
	public static String[] inj_WordPronounce = new String[MAX_INJ];

	public static Boolean isInj (String str){
		Boolean found = false;
		for (int i=0; i<inj_Word.length; i++){
			if(found)
				break;
			found = str.equalsIgnoreCase (inj_Word[i]);
		}
		return found;
	}

	public static void initialize(){
		inj_Word[0] ="aye";
		inj_WordOrder[0] = 1811;
		inj_WordFrequency[0] = 5166;
		inj_WordPronounce[0] = "aye.mp3";
		inj_Word[1] ="bye";
		inj_WordOrder[1] = 4042;
		inj_WordFrequency[1] = 1626;
		inj_WordPronounce[1] = "bye.mp3";
		inj_Word[2] ="dear";
		inj_WordOrder[2] = 2766;
		inj_WordFrequency[2] = 2884;
		inj_WordPronounce[2] = "dear.mp3";
		inj_Word[3] ="ha";
		inj_WordOrder[3] = 2674;
		inj_WordFrequency[3] = 3044;
		inj_WordPronounce[3] = "ha.mp3";
		inj_Word[4] ="hello";
		inj_WordOrder[4] = 2420;
		inj_WordFrequency[4] = 3530;
		inj_WordPronounce[4] = "hello.mp3";
		inj_Word[5] ="hey";
		inj_WordOrder[5] = 3870;
		inj_WordFrequency[5] = 1740;
		inj_WordPronounce[5] = "hey.mp3";
		inj_Word[6] ="no";
		inj_WordOrder[6] = 128;
		inj_WordFrequency[6] = 67999;
		inj_WordPronounce[6] = "no.mp3";
		inj_Word[7] ="ok";
		inj_WordOrder[7] = 3961;
		inj_WordFrequency[7] = 1672;
		inj_WordPronounce[7] = "ok.mp3";
		inj_Word[8] ="right";
		inj_WordOrder[8] = 2968;
		inj_WordFrequency[8] = 2562;
		inj_WordPronounce[8] = "right.mp3";
		inj_Word[9] ="well";
		inj_WordOrder[9] = 583;
		inj_WordFrequency[9] = 17809;
		inj_WordPronounce[9] = "well.mp3";
		inj_Word[10] ="yeah";
		inj_WordOrder[10] = 113;
		inj_WordFrequency[10] = 83382;
		inj_WordPronounce[10] = "yeah.mp3";
		inj_Word[11] ="yep";
		inj_WordOrder[11] = 4652;
		inj_WordFrequency[11] = 1317;
		inj_WordPronounce[11] = "yep.mp3";
		inj_Word[12] ="yes";
		inj_WordOrder[12] = 157;
		inj_WordFrequency[12] = 60592;
		inj_WordPronounce[12] = "yes.mp3";

	}
}