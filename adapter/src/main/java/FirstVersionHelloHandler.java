public class FirstVersionHelloHandler extends FirstVersionHandler implements Handler {
    public HandleResult handle() {
        HandleResult result = new HandleResult();
        result.setResMessage("Version 1.0 : Hello adapter");
        return result;
    }

}
