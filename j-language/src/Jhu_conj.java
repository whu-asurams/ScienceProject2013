/**
 * 
 */


/**
	 * this class creates four arrays for conjunctions
 * 
 * @author juliette
  *@since Oct 28, 2012

 *<br>
	 * <br>
	 * <pre>
	 * when called to initialization, all of the words will be loaded into the program
	 * to be referred to freely
	 * </pre>
	 * 
 */
public class Jhu_conj {

	public static int MAX_CONJ = 2000;
	public static String[] conj_Word = new String[MAX_CONJ];
	public static int [] conj_WordOrder = new int[MAX_CONJ];
	public static int [] conj_WordFrequency = new int[MAX_CONJ];
	public static String[] conj_WordPronounce = new String[MAX_CONJ];

	public static Boolean isConj (String str){
		Boolean found = false;
		for (int i=0; i<conj_Word.length; i++){
			if(found)
				break;
			found = str.equalsIgnoreCase (conj_Word[i]);
		}
		return found;
	}

	public static void initialize(){
		conj_Word[0] ="after";
		conj_WordOrder[0] = 312;
		conj_WordFrequency[0] = 30855;
		conj_WordPronounce[0] = "after.mp3";
		conj_Word[1] ="albeit";
		conj_WordOrder[1] = 4477;
		conj_WordFrequency[1] = 1406;
		conj_WordPronounce[1] = "albeit.mp3";
		conj_Word[2] ="although";
		conj_WordOrder[2] = 215;
		conj_WordFrequency[2] = 43635;
		conj_WordPronounce[2] = "although.mp3";
		conj_Word[3] ="and";
		conj_WordOrder[3] = 4;
		conj_WordFrequency[3] = 2687863;
		conj_WordPronounce[3] = "and.mp3";
		conj_Word[4] ="as";
		conj_WordOrder[4] = 31;
		conj_WordFrequency[4] = 364164;
		conj_WordPronounce[4] = "as.mp3";
		conj_Word[5] ="because";
		conj_WordOrder[5] = 96;
		conj_WordFrequency[5] = 103003;
		conj_WordPronounce[5] = "because.mp3";
		conj_Word[6] ="before";
		conj_WordOrder[6] = 314;
		conj_WordFrequency[6] = 30731;
		conj_WordPronounce[6] = "before.mp3";
		conj_Word[7] ="but";
		conj_WordOrder[7] = 23;
		conj_WordFrequency[7] = 459622;
		conj_WordPronounce[7] = "but.mp3";
		conj_Word[8] ="considering";
		conj_WordOrder[8] = 6318;
		conj_WordFrequency[8] = 800;
		conj_WordPronounce[8] = "considering.mp3";
		conj_Word[9] ="cos";
		conj_WordOrder[9] = 625;
		conj_WordFrequency[9] = 16247;
		conj_WordPronounce[9] = "cos.mp3";
		conj_Word[10] ="except";
		conj_WordOrder[10] = 1056;
		conj_WordFrequency[10] = 9569;
		conj_WordPronounce[10] = "except.mp3";
		conj_Word[11] ="for";
		conj_WordOrder[11] = 1326;
		conj_WordFrequency[11] = 7332;
		conj_WordPronounce[11] = "for.mp3";
		conj_Word[12] ="if";
		conj_WordOrder[12] = 38;
		conj_WordFrequency[12] = 261089;
		conj_WordPronounce[12] = "if.mp3";
		conj_Word[13] ="immediately";
		conj_WordOrder[13] = 6202;
		conj_WordFrequency[13] = 822;
		conj_WordPronounce[13] = "immediately.mp3";
		conj_Word[14] ="like";
		conj_WordOrder[14] = 3775;
		conj_WordFrequency[14] = 1792;
		conj_WordPronounce[14] = "like.mp3";
		conj_Word[15] ="nor";
		conj_WordOrder[15] = 822;
		conj_WordFrequency[15] = 12442;
		conj_WordPronounce[15] = "nor.mp3";
		conj_Word[16] ="once";
		conj_WordOrder[16] = 960;
		conj_WordFrequency[16] = 10511;
		conj_WordPronounce[16] = "once.mp3";
		conj_Word[17] ="or";
		conj_WordOrder[17] = 29;
		conj_WordFrequency[17] = 373808;
		conj_WordPronounce[17] = "or.mp3";
		conj_Word[18] ="provided";
		conj_WordOrder[18] = 1948;
		conj_WordFrequency[18] = 4692;
		conj_WordPronounce[18] = "provided.mp3";
		conj_Word[19] ="providing";
		conj_WordOrder[19] = 3207;
		conj_WordFrequency[19] = 2292;
		conj_WordPronounce[19] = "providing.mp3";
		conj_Word[20] ="since";
		conj_WordOrder[20] = 291;
		conj_WordFrequency[20] = 32404;
		conj_WordPronounce[20] = "since.mp3";
		conj_Word[21] ="so";
		conj_WordOrder[21] = 114;
		conj_WordFrequency[21] = 79028;
		conj_WordPronounce[21] = "so.mp3";
		conj_Word[22] ="than";
		conj_WordOrder[22] = 67;
		conj_WordFrequency[22] = 147618;
		conj_WordPronounce[22] = "than.mp3";
		conj_Word[23] ="that";
		conj_WordOrder[23] = 13;
		conj_WordFrequency[23] = 760399;
		conj_WordPronounce[23] = "that.mp3";
		conj_Word[24] ="though";
		conj_WordOrder[24] = 270;
		conj_WordFrequency[24] = 34801;
		conj_WordPronounce[24] = "though.mp3";
		conj_Word[25] ="till";
		conj_WordOrder[25] = 3112;
		conj_WordFrequency[25] = 2377;
		conj_WordPronounce[25] = "till.mp3";
		conj_Word[26] ="unless";
		conj_WordOrder[26] = 916;
		conj_WordFrequency[26] = 11011;
		conj_WordPronounce[26] = "unless.mp3";
		conj_Word[27] ="until";
		conj_WordOrder[27] = 269;
		conj_WordFrequency[27] = 34807;
		conj_WordPronounce[27] = "until.mp3";
		conj_Word[28] ="when";
		conj_WordOrder[28] = 87;
		conj_WordFrequency[28] = 113655;
		conj_WordPronounce[28] = "when.mp3";
		conj_Word[29] ="where";
		conj_WordOrder[29] = 209;
		conj_WordFrequency[29] = 44496;
		conj_WordPronounce[29] = "where.mp3";
		conj_Word[30] ="whereas";
		conj_WordOrder[30] = 1535;
		conj_WordFrequency[30] = 6236;
		conj_WordPronounce[30] = "whereas.mp3";
		conj_Word[31] ="whether";
		conj_WordOrder[31] = 260;
		conj_WordFrequency[31] = 36169;
		conj_WordPronounce[31] = "whether.mp3";
		conj_Word[32] ="while";
		conj_WordOrder[32] = 187;
		conj_WordFrequency[32] = 50548;
		conj_WordPronounce[32] = "while.mp3";
		conj_Word[33] ="whilst";
		conj_WordOrder[33] = 1635;
		conj_WordFrequency[33] = 5839;
		conj_WordPronounce[33] = "whilst.mp3";

	}
}