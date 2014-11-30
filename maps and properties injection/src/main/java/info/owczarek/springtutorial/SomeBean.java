package info.owczarek.springtutorial;

import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class SomeBean {
	private Map<String, Locale> locales;
	private Properties settings;

	public Map<String, Locale> getLocales() {
		return locales;
	}

	public void setLocales(Map<String, Locale> locales) {
		this.locales = locales;
	}

	public Properties getSettings() {
		return settings;
	}

	public void setSettings(Properties settings) {
		this.settings = settings;
	}
}
