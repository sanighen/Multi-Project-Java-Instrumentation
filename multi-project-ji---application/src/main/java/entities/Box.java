package entities;

import instruments.AddConstructor;

@AddConstructor
public class Box {

	private int id;

	@Override
	public String toString() {
		return "Box [id=" + id + "]";
	}

}
