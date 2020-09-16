

public class SecondVersionHandleAdapter implements HandleAdapter {

    private Handler handler;

    public HandlerVersion getVersion(){
        return HandlerVersion.SECOND;
    }

    public boolean support(Handler handler) {
        if (handler instanceof SecondVersionHandler) {
            this.handler = handler;
            return true;
        }
        return false;
    }

    public HandleResult handle() {
        return handler.handle();
    }
}
