

public interface HandleAdapter {
    /**
     * 判断处理者是否适配
     */
    boolean support(Handler handler);
    HandleResult handle();
    HandlerVersion getVersion();
}
