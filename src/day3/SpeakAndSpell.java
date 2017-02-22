package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak & Spell was introduced at the summer
 * Consumer Electronics Show in June 1978, making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you would make this program. Allow them to
 * code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		int correct = (0);
		// 2. Catch the user's answer in a String
		// 3. If the user spelled the word correctly, speak "correct"
		speak("SPELL elephant");
		String word = JOptionPane.showInputDialog("type word here");
		if (word.equals("elephant")) {
			speak("correct");
			correct++;
		} else {
			speak("wrong");
		}
		speak("SPELL dog");
		String worda = JOptionPane.showInputDialog("type word here");
		if (worda.equals("dog")) {
			speak("correct");
			correct++;
		} else {
			speak("wrong");
		}
		speak("SPELL cat");
		String wordb = JOptionPane.showInputDialog("type word here");
		if (wordb.equals("cat")) {
			speak("correct");
			correct++;
		} else {
			speak("wrong");
		}
		speak("SPELL puppy");
		String wordc = JOptionPane.showInputDialog("type word here");
		if (wordc.equals("puppy")) {
			speak("correct");
			correct++;
		} else {
			speak("wrong");
		}
		speak("SPELL kitten");
		String wordd = JOptionPane.showInputDialog("type word here");
		if (wordd.equals("kitten")) {
			speak("correct");
			correct++;
		} else {
			speak("wrong");
		}
		speak("SPELL sloth");
		String worde = JOptionPane.showInputDialog("type word here");
		if (worde.equals("sloth")) {
			speak("correct");
			correct++;
		} else {
			speak("wrong");
		}
		speak("SPELL blue jay");
		String wordf = JOptionPane.showInputDialog("type word here");
		if (wordf.equals("blue jay")) {
			speak("correct");
			correct++;
		} else {
			speak("wrong");
		}

		if (correct == 7) {
			speak("you got them all right, slow clap.");
		}
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
