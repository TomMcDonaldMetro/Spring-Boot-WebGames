package com.springBoot.WebGames.printing;



import com.springBoot.WebGames.keys.Period;


public class PrettyPeriod implements PrettyPrinter{

	private Period period;
	private Day day;
	
	public PrettyPeriod(Period period) {
		this.period = period;
		setDay(period.getNumber());
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}
	
	public void setDay(int dayNum) {
		Day temp = new Day(dayNum);
		this.day = temp;
	}

	@Override
	public String Print() {
		return "Period: " + period.getNumber() + "\n" 
				+ "Day: " + day.getDay() + " " + period.getName() + "\n"
				+ "Temperature: " + period.getTemperature() + period.getTemperatureUnit() + "\n"
				+ "Windspeed: " + period.getWindSpeed() + " " + period.getWindDirection() + "\n";
	}
	
	
}
