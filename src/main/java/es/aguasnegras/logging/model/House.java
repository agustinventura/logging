package es.aguasnegras.logging.model;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class House {

	private static Logger logger = LoggerFactory.getLogger(House.class);
	
	private String name;
	
	private Set<BannerMan> bannerMen;
	
	public House(String name) {
		this.setName(name);
		this.bannerMen = new HashSet<BannerMan>();
		logger.trace("Loaded house {} without bannermen", name);
	}

	public Set<BannerMan> getBannerMen() {
		return bannerMen;
	}

	public void setBannerMen(Set<BannerMan> bannerMen) {
		this.bannerMen = bannerMen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public BannerMan invokeBannerMan(String bannerManName) {
		if (StringUtils.isEmpty(bannerManName)) {
			logger.error("Error loading house {} bannerman: bannerman name can't be empty", name);
			throw new IllegalStateException("Cant invoke bannerman without name");
		}
		BannerMan bannerMan = new BannerMan(this, bannerManName);
		logger.trace("Adding bannerman {} to house {}", bannerManName, name);
		this.bannerMen.add(bannerMan);
		return bannerMan;
	}
}
