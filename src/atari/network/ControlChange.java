// Copyright 2011-2012 Paulo Augusto Peccin. See licence.txt distributed with this file.

package atari.network;

import java.io.Serializable;

import atari.controls.ConsoleControls.Control;

public class ControlChange implements Serializable {

	public ControlChange(Control control, boolean state) {
		this.control = control;
		this.state = state;
	}

	public Control control;
	public boolean state;

	private static final long serialVersionUID = 1L;

}