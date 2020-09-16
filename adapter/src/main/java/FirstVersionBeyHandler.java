public class FirstVersionBeyHandler extends FirstVersionHandler implements Handler {
    public HandleResult handle() {
        HandleResult result = new HandleResult();
        result.setResMessage("Version 1.0 : Bey adapter");
        return result;
    }
}
