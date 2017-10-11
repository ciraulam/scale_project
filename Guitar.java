/* Author: Matthew Ciraula
**
**   This data structure represents a guitar with a scale pattern
** on the fretboard. It can use arbitrary scales, an arbitrary number of
** strings, and an arbitrary tuning.
**
** TODO: comments
*/

public class Guitar
{
	private static final int SCALE_LENGTH = 12;
	private static final int NUM_STRINGS = 6;
	private int[] TUNING;
	private final int ROOT;
	private char[][] chromatic;
	private boolean[][] fretboard;
	private boolean[] scale;

	public Guitar(int[] tuning, int root, boolean[] scale) {
		this.TUNING = tuning;
		this.ROOT = root;
		this.scale = scale;
		chromatic = new int[NUM_STRINGS][SCALE_LENGTH];
		fretboard = new boolean[NUM_STRINGS][SCALE_LENGTH];
		initChromatic();
		initFretboard();
	}

	private void initChromatic() {
		for(int i = 0; i < NUM_STRINGS; i++) {
			chromatic[i][0] = TUNING[i];
			for(int j = 1; j < SCALE_LENGTH; j++) {
				chromatic[i][j] = (chromatic[i][j-1] + 1) % 12;
			}
		}
	}

	private void initFretboard() {
		char[] convert = new int[12];
		int scaleIndex = this.ROOT;
		for(int i = 0; i < 12; i++) {
			convert[scaleIndex] = i;
			scaleIndex++;
			scaleIndex = scaleIndex % 12;
		}
		for(int i = 0; i < NUM_STRINGS; i++) {
			for(int j = 0; j < SCALE_LENGTH; j++) {
				fretboard[i][j] = scale[convert[chromatic[i][j]]];
			}
		}
	}

	public void printFretboard() {
		for(int i  =  NUM_STRINGS-1; i >= 0; i--) {
			for(int j = 0; j < SCALE_LENGTH; j++) {
				System.out.print("|  ");
				if(fretboard[i][j])
					System.out.print("x");
				else
					System.out.print(" ");
				System.out.print("  |");
			}
			System.out.print("\n");
		}
	}
}
