import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VersionDispatcher {
    private static List<Handler> handlers = new ArrayList<>();
    private static List<HandleAdapter> handleAdapters = new ArrayList<>();

    static {
        handlers.add(new FirstVersionHelloHandler());
        handlers.add(new SecondVersionHelloHandler());
        handlers.add(new FirstVersionBeyHandler());
        handlers.add(new SecondVersionBeyHandler());

        handleAdapters.add(new FirstVersionHandleAdapter());
        handleAdapters.add(new SecondVersionHandleAdapter());
    }

    public HandleResult doHandle(ClientRequest request) {
        HandleAdapter handlerAdapter = getHandlerAdapter(request);
        return handlerAdapter.handle();
    }

    private HandleAdapter getHandlerAdapter(ClientRequest request) {
        List<Handler> handlersOfBusiness = getHandlers(request.getBusinessType());
        List<HandleAdapter> handleAdapterOfVersion = handleAdapters.stream().filter(h -> h.getVersion().equals(request.getHandlerVersion())).collect(Collectors.toList());
        for (HandleAdapter handleAdapter : handleAdapterOfVersion) {
            for (Handler handler : handlersOfBusiness) {
                if (handleAdapter.support(handler)) {
                    return handleAdapter;
                }
            }
        }
        throw new RuntimeException("未找到合适的适配者");
    }

    private List<Handler> getHandlers(BusinessType businessType) {
        List<Handler> handlersOfBusiness = new ArrayList<>();
        for (Handler handler : handlers) {
            String simpleName = handler.getClass().getSimpleName();
            if (simpleName.contains(businessType.businessName)) {
                handlersOfBusiness.add(handler);
            }
        }
        if (handlersOfBusiness.isEmpty()) {
            throw new RuntimeException("未找到合适的处理者");
        }
        return handlersOfBusiness;
    }
}
