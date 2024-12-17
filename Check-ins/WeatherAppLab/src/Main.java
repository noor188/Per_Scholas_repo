public class Main {
    public static void main(String[] args) {
// Create a WeatherReader object
        WeatherReader w0 = new WeatherReader();

        // part 1
        // Invoke the method to process the weather file
        //        String path = "C:\\Users\\User\\Desktop\\Noor\\per-scholas\\repo\\Check-ins\\WeatherAppLab\\weather.txt";
        //        w0.processWeatherFile(path);

        //
        WeatherReader w1 = new WeatherReader();
        String path = w1.getFileNameFromUser();
        w1.processWeatherFile(path);

    }
}
