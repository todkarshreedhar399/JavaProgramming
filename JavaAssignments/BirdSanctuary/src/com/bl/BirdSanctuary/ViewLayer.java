package com.bl.BirdSanctuary;

public class ViewLayer {

	public static ViewLayer instance;

	static synchronized ViewLayer getInstance() {
		if (instance == null) {
			instance = new ViewLayer();
		}
		return instance;
	}

	private ViewLayer() {

	}

	public void print() {
		BirdSancturayRepository birdSancturayRepository = BirdSancturayRepository.getInstance();

		for (Bird items : birdSancturayRepository.getAllBirds()) {
			System.out.println(items);
		}
	}

	public void printFlyable() {
		BirdSancturayRepository birdSancturayRepository = BirdSancturayRepository.getInstance();

		for (Bird items : birdSancturayRepository.getAllBirds()) {
			if (items.canFly) {
				items.fly();
			}
		}
	}

	public void printSwimmable() {
		BirdSancturayRepository birdSancturayRepository = BirdSancturayRepository.getInstance();

		for (Bird items : birdSancturayRepository.getAllBirds()) {
			if (items.canSwim) {
				items.swim();
			}
		}
	}

	public void printEatable() {
		BirdSancturayRepository birdSancturayRepository = BirdSancturayRepository.getInstance();

		for (Bird items : birdSancturayRepository.getAllBirds()) {
			items.eat();

		}
	}

	public void printBirdCount() {
		System.out.println("total bird " + BirdSancturayRepository.getInstance().getTotalBird());
	}

}
