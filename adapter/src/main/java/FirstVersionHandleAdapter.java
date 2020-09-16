

public class FirstVersionHandleAdapter implements HandleAdapter {

    private Handler handler;

    public HandlerVersion getVersion(){
        return HandlerVersion.FIRST;
    }

    public boolean support(Handler handler) {
        if (handler instanceof FirstVersionHandler) {
            this.handler = handler;
            return true;
        }
        return false;
    }

    public HandleResult handle() {
        return handler.handle();
    }
}
