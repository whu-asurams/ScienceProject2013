/**
 * 
 */


/**
	 * this class creates four arrays for determiners
	 * 
 * @author juliette
  *@since Oct 28, 2012
  *
 *<br>
	 * <br>
	 * <pre>
	 * when called to initialization, all of the words will be loaded into the program
	 * to be referred to freely
	 * </pre>
	 * 
 */
public class Jhu_det {
	public static int MAX_DET = 2000;
	public static String[] det_Word = new String[MAX_DET];
	public static int [] det_WordOrder = new int[MAX_DET];
	public static int [] det_WordFrequency = new int[MAX_DET];
	public static String[] det_WordPronounce = new String[MAX_DET];

	public static Boolean isDet (String str){
		Boolean found = false;
		for (int i=0; i<det_Word.length; i++){
			if(found)
				break;
			found = str.equalsIgnoreCase (det_Word[i]);
		}
		return found;
	}

	public static void initialize(){
		det_Word[0] ="a";
		det_WordOrder[0] = 5;
		det_WordFrequency[0] = 2186369;
		det_WordPronounce[0] = "a.mp3";
		det_Word[1] ="all";
		det_WordOrder[1] = 43;
		det_WordFrequency[1] = 230737;
		det_WordPronounce[1] = "all.mp3";
		det_Word[2] ="an";
		det_WordOrder[2] = 33;
		det_WordFrequency[2] = 343063;
		det_WordPronounce[2] = "an.mp3";
		det_Word[3] ="another";
		det_WordOrder[3] = 159;
		det_WordFrequency[3] = 60182;
		det_WordPronounce[3] = "another.mp3";
		det_Word[4] ="any";
		det_WordOrder[4] = 83;
		det_WordFrequency[4] = 123655;
		det_WordPronounce[4] = "any.mp3";
		det_Word[5] ="both";
		det_WordOrder[5] = 227;
		det_WordFrequency[5] = 41162;
		det_WordPronounce[5] = "both.mp3";
		det_Word[6] ="each";
		det_WordOrder[6] = 150;
		det_WordFrequency[6] = 61492;
		det_WordPronounce[6] = "each.mp3";
		det_Word[7] ="either";
		det_WordOrder[7] = 840;
		det_WordFrequency[7] = 12167;
		det_WordPronounce[7] = "either.mp3";
		det_Word[8] ="enough";
		det_WordOrder[8] = 1387;
		det_WordFrequency[8] = 6958;
		det_WordPronounce[8] = "enough.mp3";
		det_Word[9] ="every";
		det_WordOrder[9] = 234;
		det_WordFrequency[9] = 40114;
		det_WordPronounce[9] = "every.mp3";
		det_Word[10] ="few";
		det_WordOrder[10] = 539;
		det_WordFrequency[10] = 19160;
		det_WordPronounce[10] = "few.mp3";
		det_Word[11] ="fewer";
		det_WordOrder[11] = 2638;
		det_WordFrequency[11] = 3101;
		det_WordPronounce[11] = "fewer.mp3";
		det_Word[12] ="former";
		det_WordOrder[12] = 603;
		det_WordFrequency[12] = 16973;
		det_WordPronounce[12] = "former.mp3";
		det_Word[13] ="half";
		det_WordOrder[13] = 460;
		det_WordFrequency[13] = 22232;
		det_WordPronounce[13] = "half.mp3";
		det_Word[14] ="her";
		det_WordOrder[14] = 45;
		det_WordFrequency[14] = 218258;
		det_WordPronounce[14] = "her.mp3";
		det_Word[15] ="his";
		det_WordOrder[15] = 26;
		det_WordFrequency[15] = 426896;
		det_WordPronounce[15] = "his.mp3";
		det_Word[16] ="its";
		det_WordOrder[16] = 62;
		det_WordFrequency[16] = 163081;
		det_WordPronounce[16] = "its.mp3";
		det_Word[17] ="latter";
		det_WordOrder[17] = 1267;
		det_WordFrequency[17] = 7762;
		det_WordPronounce[17] = "latter.mp3";
		det_Word[18] ="less";
		det_WordOrder[18] = 959;
		det_WordFrequency[18] = 10522;
		det_WordPronounce[18] = "less.mp3";
		det_Word[19] ="little";
		det_WordOrder[19] = 378;
		det_WordFrequency[19] = 26553;
		det_WordPronounce[19] = "little.mp3";
		det_Word[20] ="many";
		det_WordOrder[20] = 108;
		det_WordFrequency[20] = 89659;
		det_WordPronounce[20] = "many.mp3";
		det_Word[21] ="more";
		det_WordOrder[21] = 131;
		det_WordFrequency[21] = 67198;
		det_WordPronounce[21] = "more.mp3";
		det_Word[22] ="most";
		det_WordOrder[22] = 212;
		det_WordFrequency[22] = 43792;
		det_WordPronounce[22] = "most.mp3";
		det_Word[23] ="much";
		det_WordOrder[23] = 301;
		det_WordFrequency[23] = 31284;
		det_WordPronounce[23] = "much.mp3";
		det_Word[24] ="my";
		det_WordOrder[24] = 65;
		det_WordFrequency[24] = 152619;
		det_WordPronounce[24] = "my.mp3";
		det_Word[25] ="neither";
		det_WordOrder[25] = 2687;
		det_WordFrequency[25] = 3018;
		det_WordPronounce[25] = "neither.mp3";
		det_Word[26] ="next";
		det_WordOrder[26] = 202;
		det_WordFrequency[26] = 46221;
		det_WordPronounce[26] = "next.mp3";
		det_Word[27] ="no";
		det_WordOrder[27] = 74;
		det_WordFrequency[27] = 137026;
		det_WordPronounce[27] = "no.mp3";
		det_Word[28] ="our";
		det_WordOrder[28] = 102;
		det_WordFrequency[28] = 95001;
		det_WordPronounce[28] = "our.mp3";
		det_Word[29] ="own";
		det_WordOrder[29] = 126;
		det_WordFrequency[29] = 69459;
		det_WordPronounce[29] = "own.mp3";
		det_Word[30] ="same";
		det_WordOrder[30] = 144;
		det_WordFrequency[30] = 62402;
		det_WordPronounce[30] = "same.mp3";
		det_Word[31] ="several";
		det_WordOrder[31] = 416;
		det_WordFrequency[31] = 24002;
		det_WordPronounce[31] = "several.mp3";
		det_Word[32] ="some";
		det_WordOrder[32] = 56;
		det_WordFrequency[32] = 171174;
		det_WordPronounce[32] = "some.mp3";
		det_Word[33] ="such";
		det_WordOrder[33] = 94;
		det_WordFrequency[33] = 108524;
		det_WordPronounce[33] = "such.mp3";
		det_Word[34] ="that";
		det_WordOrder[34] = 27;
		det_WordFrequency[34] = 384313;
		det_WordPronounce[34] = "that.mp3";
		det_Word[35] ="the";
		det_WordOrder[35] = 1;
		det_WordFrequency[35] = 6187267;
		det_WordPronounce[35] = "the.mp3";
		det_Word[36] ="their";
		det_WordOrder[36] = 39;
		det_WordFrequency[36] = 260919;
		det_WordPronounce[36] = "their.mp3";
		det_Word[37] ="these";
		det_WordOrder[37] = 79;
		det_WordFrequency[37] = 125442;
		det_WordPronounce[37] = "these.mp3";
		det_Word[38] ="this";
		det_WordOrder[38] = 22;
		det_WordFrequency[38] = 461945;
		det_WordPronounce[38] = "this.mp3";
		det_Word[39] ="those";
		det_WordOrder[39] = 109;
		det_WordFrequency[39] = 88862;
		det_WordPronounce[39] = "those.mp3";
		det_Word[40] ="what";
		det_WordOrder[40] = 41;
		det_WordFrequency[40] = 249466;
		det_WordPronounce[40] = "what.mp3";
		det_Word[41] ="whatever";
		det_WordOrder[41] = 768;
		det_WordFrequency[41] = 13236;
		det_WordPronounce[41] = "whatever.mp3";
		det_Word[42] ="whatsoever";
		det_WordOrder[42] = 5635;
		det_WordFrequency[42] = 970;
		det_WordPronounce[42] = "whatsoever.mp3";
		det_Word[43] ="which";
		det_WordOrder[43] = 30;
		det_WordFrequency[43] = 372031;
		det_WordPronounce[43] = "which.mp3";
		det_Word[44] ="whichever";
		det_WordOrder[44] = 5989;
		det_WordFrequency[44] = 871;
		det_WordPronounce[44] = "whichever.mp3";
		det_Word[45] ="whose";
		det_WordOrder[45] = 521;
		det_WordFrequency[45] = 19833;
		det_WordPronounce[45] = "whose.mp3";
		det_Word[46] ="your";
		det_WordOrder[46] = 72;
		det_WordFrequency[46] = 138334;
		det_WordPronounce[46] = "your.mp3";

	
	}
}