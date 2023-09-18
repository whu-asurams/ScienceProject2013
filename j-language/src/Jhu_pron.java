/**
 * 
 */


/**
 * this class creates four arrays for pronouns
 * 
 * @author juliette
 *  @since Oct 28, 2012
 *  
	 * <br>
	 * <pre>
	 * when called to initialization, all of the words will be loaded into the program
	 * to be referred to freely
	 * </pre>
	 * 
 *
 */
public class Jhu_pron {

	public static int MAX_PRON = 40000;
	public static String[] pron_Word = new String[MAX_PRON];
	public static int [] pron_WordOrder = new int[MAX_PRON];
	public static int [] pron_WordFrequency = new int[MAX_PRON];
	public static String[] pron_WordPronounce = new String[MAX_PRON];

	public static Boolean isPron (String str){
		Boolean found = false;
		for (int i=0; i<pron_Word.length; i++){
			if(found)
				break;
			found = str.equalsIgnoreCase (pron_Word[i]);
		}
		return found;
	}

	public static void initialize(){
		pron_Word[0] ="anybody";
		pron_WordOrder[0] = 1872;
		pron_WordFrequency[0] = 4952;
		pron_WordPronounce[0] = "anybody.mp3";
		pron_Word[1] ="anyone";
		pron_WordOrder[1] = 686;
		pron_WordFrequency[1] = 14956;
		pron_WordPronounce[1] = "anyone.mp3";
		pron_Word[2] ="anything";
		pron_WordOrder[2] = 347;
		pron_WordFrequency[2] = 28321;
		pron_WordPronounce[2] = "anything.mp3";
		pron_Word[3] ="everybody";
		pron_WordOrder[3] = 1572;
		pron_WordFrequency[3] = 6084;
		pron_WordPronounce[3] = "everybody.mp3";
		pron_Word[4] ="everyone";
		pron_WordOrder[4] = 762;
		pron_WordFrequency[4] = 13337;
		pron_WordPronounce[4] = "everyone.mp3";
		pron_Word[5] ="everything";
		pron_WordOrder[5] = 559;
		pron_WordFrequency[5] = 18675;
		pron_WordPronounce[5] = "everything.mp3";
		pron_Word[6] ="he";
		pron_WordOrder[6] = 15;
		pron_WordFrequency[6] = 681255;
		pron_WordPronounce[6] = "he.mp3";
		pron_Word[7] ="her";
		pron_WordOrder[7] = 93;
		pron_WordFrequency[7] = 108710;
		pron_WordPronounce[7] = "her.mp3";
		pron_Word[8] ="hers";
		pron_WordOrder[8] = 2995;
		pron_WordFrequency[8] = 2525;
		pron_WordPronounce[8] = "hers.mp3";
		pron_Word[9] ="herself";
		pron_WordOrder[9] = 597;
		pron_WordFrequency[9] = 17197;
		pron_WordPronounce[9] = "herself.mp3";
		pron_Word[10] ="him";
		pron_WordOrder[10] = 59;
		pron_WordFrequency[10] = 165014;
		pron_WordPronounce[10] = "him.mp3";
		pron_Word[11] ="himself";
		pron_WordOrder[11] = 307;
		pron_WordFrequency[11] = 31082;
		pron_WordPronounce[11] = "himself.mp3";
		pron_Word[12] ="his";
		pron_WordOrder[12] = 1443;
		pron_WordFrequency[12] = 6678;
		pron_WordPronounce[12] = "his.mp3";
		pron_Word[13] ="i";
		pron_WordOrder[13] = 12;
		pron_WordFrequency[13] = 884599;
		pron_WordPronounce[13] = "i.mp3";
		pron_Word[14] ="it";
		pron_WordOrder[14] = 9;
		pron_WordFrequency[14] = 1090186;
		pron_WordPronounce[14] = "it.mp3";
		pron_Word[15] ="itself";
		pron_WordOrder[15] = 422;
		pron_WordFrequency[15] = 23712;
		pron_WordPronounce[15] = "itself.mp3";
		pron_Word[16] ="me";
		pron_WordOrder[16] = 73;
		pron_WordFrequency[16] = 138151;
		pron_WordPronounce[16] = "me.mp3";
		pron_Word[17] ="mine";
		pron_WordOrder[17] = 2143;
		pron_WordFrequency[17] = 4148;
		pron_WordPronounce[17] = "mine.mp3";
		pron_Word[18] ="myself";
		pron_WordOrder[18] = 821;
		pron_WordFrequency[18] = 12444;
		pron_WordPronounce[18] = "myself.mp3";
		pron_Word[19] ="nobody";
		pron_WordOrder[19] = 1540;
		pron_WordFrequency[19] = 6229;
		pron_WordPronounce[19] = "nobody.mp3";
		pron_Word[20] ="none";
		pron_WordOrder[20] = 1198;
		pron_WordFrequency[20] = 8440;
		pron_WordPronounce[20] = "none.mp3";
		pron_Word[21] ="no-one";
		pron_WordOrder[21] = 1112;
		pron_WordFrequency[21] = 9064;
		pron_WordPronounce[21] = "no-one.mp3";
		pron_Word[22] ="nothing";
		pron_WordOrder[22] = 277;
		pron_WordFrequency[22] = 34064;
		pron_WordPronounce[22] = "nothing.mp3";
		pron_Word[23] ="one";
		pron_WordOrder[23] = 110;
		pron_WordFrequency[23] = 86364;
		pron_WordPronounce[23] = "one.mp3";
		pron_Word[24] ="other";
		pron_WordOrder[24] = 685;
		pron_WordFrequency[24] = 14959;
		pron_WordPronounce[24] = "other.mp3";
		pron_Word[25] ="ours";
		pron_WordOrder[25] = 3902;
		pron_WordFrequency[25] = 1717;
		pron_WordPronounce[25] = "ours.mp3";
		pron_Word[26] ="ourselves";
		pron_WordOrder[26] = 1998;
		pron_WordFrequency[26] = 4515;
		pron_WordPronounce[26] = "ourselves.mp3";
		pron_Word[27] ="plenty";
		pron_WordOrder[27] = 1904;
		pron_WordFrequency[27] = 4841;
		pron_WordPronounce[27] = "plenty.mp3";
		pron_Word[28] ="she";
		pron_WordOrder[28] = 28;
		pron_WordFrequency[28] = 380257;
		pron_WordPronounce[28] = "she.mp3";
		pron_Word[29] ="somebody";
		pron_WordOrder[29] = 1328;
		pron_WordFrequency[29] = 7316;
		pron_WordPronounce[29] = "somebody.mp3";
		pron_Word[30] ="someone";
		pron_WordOrder[30] = 558;
		pron_WordFrequency[30] = 18681;
		pron_WordPronounce[30] = "someone.mp3";
		pron_Word[31] ="something";
		pron_WordOrder[31] = 180;
		pron_WordFrequency[31] = 52452;
		pron_WordPronounce[31] = "something.mp3";
		pron_Word[32] ="theirs";
		pron_WordOrder[32] = 5417;
		pron_WordFrequency[32] = 1035;
		pron_WordPronounce[32] = "theirs.mp3";
		pron_Word[33] ="them";
		pron_WordOrder[33] = 55;
		pron_WordFrequency[33] = 173414;
		pron_WordPronounce[33] = "them.mp3";
		pron_Word[34] ="themselves";
		pron_WordOrder[34] = 424;
		pron_WordFrequency[34] = 23673;
		pron_WordPronounce[34] = "themselves.mp3";
		pron_Word[35] ="there";
		pron_WordOrder[35] = 42;
		pron_WordFrequency[35] = 239460;
		pron_WordPronounce[35] = "there.mp3";
		pron_Word[36] ="they";
		pron_WordOrder[36] = 25;
		pron_WordFrequency[36] = 433441;
		pron_WordPronounce[36] = "they.mp3";
		pron_Word[37] ="us";
		pron_WordOrder[37] = 145;
		pron_WordFrequency[37] = 62350;
		pron_WordPronounce[37] = "us.mp3";
		pron_Word[38] ="we";
		pron_WordOrder[38] = 32;
		pron_WordFrequency[38] = 358039;
		pron_WordPronounce[38] = "we.mp3";
		pron_Word[39] ="who";
		pron_WordOrder[39] = 47;
		pron_WordFrequency[39] = 205432;
		pron_WordPronounce[39] = "who.mp3";
		pron_Word[40] ="whoever";
		pron_WordOrder[40] = 4323;
		pron_WordFrequency[40] = 1475;
		pron_WordPronounce[40] = "whoever.mp3";
		pron_Word[41] ="whom";
		pron_WordOrder[41] = 783;
		pron_WordFrequency[41] = 12926;
		pron_WordPronounce[41] = "whom.mp3";
		pron_Word[42] ="ye";
		pron_WordOrder[42] = 4242;
		pron_WordFrequency[42] = 1516;
		pron_WordPronounce[42] = "ye.mp3";
		pron_Word[43] ="you";
		pron_WordOrder[43] = 14;
		pron_WordFrequency[43] = 695498;
		pron_WordPronounce[43] = "you.mp3";
		pron_Word[44] ="yours";
		pron_WordOrder[44] = 2111;
		pron_WordFrequency[44] = 4239;
		pron_WordPronounce[44] = "yours.mp3";
		pron_Word[45] ="yourself";
		pron_WordOrder[45] = 939;
		pron_WordFrequency[45] = 10746;
		pron_WordPronounce[45] = "yourself.mp3";

	
	}
}