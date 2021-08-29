package data.config;

import java.io.IOException;
import java.util.Properties;

import com.util.SeleniumHelper;

public class ConfigDataProvider {
	
	public Properties properties;
	
	public ConfigDataProvider() throws IOException {
		properties = SeleniumHelper.readProperties("Data/browserData.properties");
		
	}
	
	public String getBrowser() {
		return properties.getProperty("browserName");
		
	}

	public String getUrl() {
		return properties.getProperty("url");
		
	}
}
