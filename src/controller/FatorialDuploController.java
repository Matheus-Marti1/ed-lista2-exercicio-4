package controller;

public class FatorialDuploController {

	public FatorialDuploController() {
		super();
	}

	public int fatorialDuplo(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num * fatorialDuplo(num - 2);
		}
	}

}
