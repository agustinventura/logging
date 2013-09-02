package es.aguasnegras.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.aguasnegras.logging.model.House;

public class Logging {

	private static Logger logger = LoggerFactory.getLogger(Logging.class);
	
	public static void main (String... args) {
		logger.info("Starting application");
		logger.debug("Loading Lannister house");
		House lannister = new House("Lannister");
		logger.debug("Invoking Clegane bannerman");
		lannister.invokeBannerMan("Clegane");
		logger.debug("Invoking erroneous bannerman");
		lannister.invokeBannerMan(null);
		logger.info("Ended application");
	}
}
