public class ConversionUtil
{
    //Instance will be created at load time
    private static ConversionUtil instance;

    //Creating private constructor
    private ConversionUtil() { }

    //Declaring static method
    public static ConversionUtil getInstance()
    {
        if (null == instance){
            instance = new ConversionUtil();
        }
        return instance;
    }

    public static double toFahrenheit(double dCelcius){
        return  ((dCelcius*9)/5)+32;
    }

}
