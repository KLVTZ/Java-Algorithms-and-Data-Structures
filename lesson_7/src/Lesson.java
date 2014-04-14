class Lesson
{
	public static void main(String[] args)
	{
		String message;
		WeatherClass weather = new WeatherClass();
		message = weather.toString();
		System.out.println(message);

		WeatherClass otherWeather = new WeatherClass("Sunny", 70);

		if (weather.equals(otherWeather)) {
			System.out.println("The following weather comparison is exact\n");
		} else {
			System.out.println("The following comparison is different\n");
		}

		weather.setNewWeather("Sunny", 96);
		message = weather.toString();
		System.out.println(message);

		weather.setNewWeather("Cloudy", 60);
		message = weather.toString();
		System.out.println(message);
	}
}
