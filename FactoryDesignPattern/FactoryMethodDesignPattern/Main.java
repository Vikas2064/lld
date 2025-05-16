class Main{
    public static void main(String []args)
    {
        ILoggerFactory infoLoggerFactory= new InfoLoggerFactory();
        ILogger infoLogger = infoLoggerFactory.createLogger();

       infoLogger.logs();
    }
}