package uk.co.radfordconsultancy.util.security;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PasswordUtils {

	// Get log
	private final static Log log = LogFactory.getLog(PasswordUtils.class);
	
	public static enum PasswordStrength { LOW, MEDIUM, HIGH }
	
	public static String generatePassword(PasswordStrength strength, int length) {
    	//if (log.isDebugEnabled()) log.debug(String.format("Generating password with strength %s and length %d", strength, length));

		String password = null;
		switch (strength) {
			case LOW:
				password = generateLowStrengthPassword(length);
				break;
			case MEDIUM:
				password = generateMediumStrengthPassword(length);
				break;
			case HIGH:
				password = generateHighStrengthPassword(length);
				break;
			default:
				String error = String.format("Password strength of %s not supported", strength);
				log.error(error);
				throw new SecurityException(error);
		}

    	//if (log.isDebugEnabled()) log.debug(String.format("Returning password %s", password));
		return password;
	}
	
	private static String generateLowStrengthPassword(int length) {
    	//if (log.isDebugEnabled()) log.debug(String.format("Generating low strength password of length %d", length));
		StringBuilder pass = new StringBuilder(length);
		switch (length) {
			case 6:
				pass.append(getRandomLowerCaseWord(3));
				pass.append(getRandomLowerCaseWord(3));
				break;
			case 7:
				pass.append(getRandomLowerCaseWord(3));
				pass.append(getRandomLowerCaseWord(4));
				break;
			case 8:
				pass.append(getRandomLowerCaseWord(4));
				pass.append(getRandomLowerCaseWord(4));
				break;
			case 9:
				pass.append(getRandomLowerCaseWord(4));
				pass.append(getRandomLowerCaseWord(5));
				break;
			case 10:
				pass.append(getRandomLowerCaseWord(5));
				pass.append(getRandomLowerCaseWord(5));
				break;
			case 11:
				pass.append(getRandomLowerCaseWord(3));
				pass.append(getRandomLowerCaseWord(4));
				pass.append(getRandomLowerCaseWord(4));
				break;
			case 12:
				pass.append(getRandomLowerCaseWord(4));
				pass.append(getRandomLowerCaseWord(4));
				pass.append(getRandomLowerCaseWord(4));
				break;
			default:
				String error = String.format("Password length of %d not supported", length);
				log.error(error);
				throw new SecurityException(error);
		}
    	//if (log.isDebugEnabled()) log.debug(String.format("Returning password %s", pass));
		return pass.toString();
	}
	
	private static String generateMediumStrengthPassword(int length) {
    	//if (log.isDebugEnabled()) log.debug(String.format("Generating medium strength password of length %d", length));
		StringBuilder pass = new StringBuilder(length);
		switch (length) {
			case 6:
				pass.append(getRandomMixedCaseWord(5));
				pass.append(getRandomNumber(1));
				break;
			case 7:
				pass.append(getRandomMixedCaseWord(3));
				pass.append(getRandomMixedCaseWord(3));
				pass.append(getRandomNumber(1));
				break;
			case 8:
				pass.append(getRandomMixedCaseWord(3));
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomNumber(1));
				break;
			case 9:
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomNumber(1));
				break;
			case 10:
				pass.append(getRandomMixedCaseWord(5));
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomNumber(1));
				break;
			case 11:
				pass.append(getRandomMixedCaseWord(5));
				pass.append(getRandomMixedCaseWord(5));
				pass.append(getRandomNumber(1));
				break;
			case 12:
				pass.append(getRandomMixedCaseWord(3));
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomNumber(1));
				break;
			default:
				String error = String.format("Password length of %d not supported", length);
				log.error(error);
				throw new SecurityException(error);
		}
    	//if (log.isDebugEnabled()) log.debug(String.format("Returning password %s", pass));
		return pass.toString();
	}

	private static String generateHighStrengthPassword(int length) {
    	//if (log.isDebugEnabled()) log.debug(String.format("Generating high strength password of length %d", length));
		StringBuilder pass = new StringBuilder(length);
		switch (length) {
			case 6:
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomNumber(2));
				break;
			case 7:
				pass.append(getRandomMixedCaseWord(5));
				pass.append(getRandomNumber(2));
				break;
			case 8:
				pass.append(getRandomMixedCaseWord(3));
				pass.append(getRandomNumber(1));
				pass.append(getRandomMixedCaseWord(3));
				pass.append(getRandomNumber(1));
				break;
			case 9:
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomNumber(1));
				pass.append(getRandomMixedCaseWord(3));
				pass.append(getRandomNumber(1));
				break;
			case 10:
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomNumber(1));
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomNumber(1));
				break;
			case 11:
				pass.append(getRandomMixedCaseWord(5));
				pass.append(getRandomNumber(1));
				pass.append(getRandomMixedCaseWord(4));
				pass.append(getRandomNumber(1));
				break;
			case 12:
				pass.append(getRandomMixedCaseWord(5));
				pass.append(getRandomNumber(1));
				pass.append(getRandomMixedCaseWord(5));
				pass.append(getRandomNumber(1));
				break;
			default:
				String error = String.format("Password length of %d not supported", length);
				log.error(error);
				throw new SecurityException(error);
		}
    	//if (log.isDebugEnabled()) log.debug(String.format("Returning password %s", pass));
		return pass.toString();
	}

	private static String getRandomMixedCaseWord(int length) throws SecurityException {
		String word = StringUtils.capitalize(getRandomWord(length));
		return word;
	}

	private static String getRandomLowerCaseWord(int length) throws SecurityException {
		String word = getRandomWord(length).toLowerCase();
		return word;
	}
	
	private static String getRandomNumber(int length) throws SecurityException {
    	//if (log.isDebugEnabled()) log.debug(String.format("Getting random number of length %d", length));
		StringBuilder number = new StringBuilder(length);
		for (int index=0 ; index < length ; index++) {
			number.append(DIGIT[RandomUtils.nextInt(DIGIT_LENGTH)]);
		}
    	//if (log.isDebugEnabled()) log.debug(String.format("Returning number %s", number));
		return number.toString();
	}
	
	/*private static String getRandomSymbol(int length) throws SecurityException {
    	//if (log.isDebugEnabled()) log.debug(String.format("Getting random symbol of length %d", length));
		StringBuilder symbol = new StringBuilder(length);
		for (int index=0 ; index < length ; index++) {
			symbol.append(SYMBOL[RandomUtils.nextInt(SYMBOL_LENGTH)]);
		}
    	//if (log.isDebugEnabled()) log.debug(String.format("Returning symbol %s", symbol));
		return symbol.toString();
	}*/

	private static String getRandomWord(int length) throws SecurityException {
    	//if (log.isDebugEnabled()) log.debug(String.format("Getting random word of length %d", length));
		String word = null;
		switch (length) {
		
			case 3:
				word = THREE_LTR[RandomUtils.nextInt(THREE_LTR_LENGTH)];
				break;
				
			case 4:
				word = FOUR_LTR[RandomUtils.nextInt(FOUR_LTR_LENGTH)];
				break;

			case 5:
				word = FIVE_LTR[RandomUtils.nextInt(FIVE_LTR_LENGTH)];
				break;

			default:
				String error = String.format("Word length of %d not supported", length);
				log.error(error);
				throw new SecurityException(error);
		}
    	//if (log.isDebugEnabled()) log.debug(String.format("Returning word %s", word));
		return word;
	}
	
	//private final static String[] SYMBOL = {"!","*","+","#",":"};	
	//private final static int SYMBOL_LENGTH = SYMBOL.length;	

	private final static String[] DIGIT = {"2","3","4","6","7","8","9"};	
	private final static int DIGIT_LENGTH = DIGIT.length;	
	
	private final static String[] THREE_LTR = {"ace","ale","ant",
											   "bag","bar","bat","bed","bee","bow","bus",
											   "cab","cap","car","cat","cot","cup",
											   "dig","dog",
											   "fly",
											   "hat","hit","hot",
											   "ice","ink",
											   "map",
											   "pan","pen","pet","pin","pot",
											   "red","rod",
											   "saw",
											   "top",
											   "wax","web",
											   "yak",
											   "zoo"
											   };	
	private final static int THREE_LTR_LENGTH = THREE_LTR.length;
	
	private final static String[] FOUR_LTR = {"bank","bath","bear","bike","blue","boat","book",
											  "card","cart","chip","cold",
											  "data","door","drum",
											  "fire","fish",
											  "goat","gold",
											  "hill",
											  "iron",
											  "kite",
											  "lake","lock","lion","lime","line","list","lynx",
											  "mice","mink","mole",
											  "pear","pink","pipe","pool","puma",
											  "sand","ship","shop","soap","sock",
											  "tree","tune",
											  "wasp","wire","wish"
											  };	
	private final static int FOUR_LTR_LENGTH = FOUR_LTR.length;
	
	private final static String[] FIVE_LTR = {"apple","beach","cable","chair","dance","glass","goose","green",
											  "horse","house","lemon","lorry","mouse","olive",
											  "phone","plane","plant","plate","river","steam",
											  "table","tiger","watch",
											  "water","white","zebra"};	
	private final static int FIVE_LTR_LENGTH = FIVE_LTR.length;
	
	
}