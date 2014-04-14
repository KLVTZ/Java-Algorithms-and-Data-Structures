public class WeatherClass {
	private int temperature;
	private String weatherCondition;

	public WeatherClass()
	{
		this.temperature = 70;
		this.weatherCondition = "Sunny";
	}

	public WeatherClass (String weatherCondition, int temperature)
	{
		this.temperature = temperature;
		this.weatherCondition = weatherCondition;
	}

	public void setNewWeather(String weatherCondition, int temperature)
	{
		this.temperature = temperature;
		this.weatherCondition = weatherCondition;
	}

	public String toString() {
		if (temperature < -51 || temperature > 150) {
			return "The following " + weatherCondition + " temp exceeds range!";
		} else if (temperature < 32 && !(weatherCondition.equals("Snowy"))) {
			return "The following " + weatherCondition + " temp is not consistent";
		} else if (temperature > 100 && !(weatherCondition.equals("Sunny"))) {
			return "The following " + weatherCondition + " temp is not consistent";
		} else {
			return "Currently, the weather is " + weatherCondition + ((temperature - 32) * 5/9) + "* C";
		}
	}

	public boolean equals(Object comparison) {
		if (! (comparison instanceof WeatherClass)) {
			return false;
		}
		else {
			WeatherClass objCondition = (WeatherClass) comparison;
			if (this.weatherCondition.equals(objCondition.weatherCondition)
					&& temperature == objCondition.temperature)
			{
				return true;
			}
			return  false;
		}
	}
}
