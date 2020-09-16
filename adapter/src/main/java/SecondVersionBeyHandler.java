public class SecondVersionBeyHandler extends SecondVersionHandler implements Handler {
    public HandleResult handle() {
        HandleResult result = new HandleResult();
        result.setResMessage("Version 2.0 : Bey adapter");
        return result;
    }
}
