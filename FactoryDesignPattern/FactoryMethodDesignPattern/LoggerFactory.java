public class LoggerFactory {

    public static ILogger createLogger(LogLevel logLevel){
        if(logLevel==LogLevel.DEBUG)
        {
            return new DebugLogger();
        }
        else if(logLevel==LogLevel.INFO){
            return new InfoLogger();
        }else if(logLevel==LogLevel.ERROR) {
            return new ErrorLogs();
        }
        return null;
    }

}
