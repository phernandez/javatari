// Copyright 2011-2012 Paulo Augusto Peccin. See licence.txt distributed with this file.

package atari.controls;

public interface ConsoleControls {

	public static enum Control {
		JOY0_UP, JOY0_DOWN, JOY0_LEFT, JOY0_RIGHT, JOY0_BUTTON,
		JOY1_UP, JOY1_DOWN, JOY1_LEFT, JOY1_RIGHT, JOY1_BUTTON,
		PADDLE0_POSITION, PADDLE0_BUTTON, PADDLE1_POSITION, PADDLE1_BUTTON,		// Position fom 380 (Left) to 190 (Center) to 0 (Right)
		POWER, BLACK_WHITE, SELECT, RESET,
		DIFFICULTY0, DIFFICULTY1,
		DEBUG, DEBUG_NO_COLLISIONS, TRACE, PAUSE, FRAME, FAST_SPEED,
		
		SAVE_STATE_0(0), SAVE_STATE_1(1), SAVE_STATE_2(2), SAVE_STATE_3(3), SAVE_STATE_4(4), SAVE_STATE_5(5),
		SAVE_STATE_6(6), SAVE_STATE_7(7), SAVE_STATE_8(8), SAVE_STATE_9(9), SAVE_STATE_10(10), SAVE_STATE_11(11), SAVE_STATE_12(12),
		LOAD_STATE_0(0), LOAD_STATE_1(1), LOAD_STATE_2(2), LOAD_STATE_3(3), LOAD_STATE_4(4), LOAD_STATE_5(5), 
		LOAD_STATE_6(6), LOAD_STATE_7(7), LOAD_STATE_8(8), LOAD_STATE_9(9), LOAD_STATE_10(10), LOAD_STATE_11(11), LOAD_STATE_12(12); 
		
		Control() {
			this(-1);
		}
		Control(int slot) {
			this.slot = slot;
		}
		public boolean isStateControl() {
			return slot >= 0;
		}
		public int slot;
	};
	
}