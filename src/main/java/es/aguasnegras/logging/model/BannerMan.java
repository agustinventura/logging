package es.aguasnegras.logging.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BannerMan {

	private static Logger logger = LoggerFactory.getLogger(BannerMan.class);
	
	private String name;
	
	private House house;
	
	public BannerMan (House house, String name) {
		this.house = house;
		this.name = name;
		logger.trace("Loaded bannerman {} with house {}", name, house.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
}
