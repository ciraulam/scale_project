/*
**
** Author: Matthew Ciraula
** 
**     This is a driver program that can be used to print musical scales using
** the Guitar class.
**
** TODO: Add command line interface
**
** Int | Note
** ----------
**  0  |  A
**  1  |  A#
**  2  |  B
**  3  |  C
**  4  |  C#
**  5  |  D
**  6  |  D#
**  7  |  E
**  8  |  F
**  9  |  F#
** 10  |  G
** 11  |  G#
*/

public class Driver {
	public static void main(String[] args) {
		boolean[] ionian = {true, false, true, false, true, true, false, true, false, true, false, true};
		//                   1      2b     2     3b     3     4     5b     5     6b     6     7b     7
		boolean[] dorian = {true, false, true, true, false, true, false, true, false, true, true, false};
		//                   1      2b     2     3b     3     4     5b     5     6b     6     7b     7
		boolean[] phrygian = {true, true, false, true, false, true, false, true, true, false, true, false};
		//                    1      2b     2     3b     3     4     5b     5     6b     6     7b     7
		boolean[] lydian = {true, false, true, false, true, false, true, true, false, true, false, true};
		//                   1      2b     2     3b     3     4     5b     5     6b     6     7b     7
		boolean[] mixolydian = {true, false, true, false, true, true, false, true, false, true, false, true};
		//                       1      2b     2     3b     3     4     5b     5     6b     6     7b     7
		boolean[] aeolian = {true, false, true, true, false, true, false, true, true, false, true, false};
		//                    1      2b     2     3b     3     4     5b     5     6b     6     7b     7
		boolean[] locrian = {true, true, false, true, false, true, true, false, true, false, true, false};
		//                    1      2b     2     3b     3     4     5b     5     6b     6     7b     7

		char[] stdTuning = {7, 0, 5, 10, 2, 7};
		//                  E  A  D  G   B  E

		// print c lydian scale on Guitar in standard tuning
		Guitar guitar = new Guitar(stdTuning, (char) 3, lydian);
		guitar.printFretboard();
	}
}
