public class SecondVersionHelloHandler extends SecondVersionHandler implements Handler {
    public HandleResult handle() {
        HandleResult result = new HandleResult();
        result.setResMessage("Version 2.0 : Hello adapter");
        return result;
    }
}
