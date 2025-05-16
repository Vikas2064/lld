class ErrorLoggerFactory implements ILoggerFactory{
    public ILogger createLogger(){
        return new ErrorLogs();
    }
}