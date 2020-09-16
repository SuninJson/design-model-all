public class Client {
    public static void main(String[] args) {
        ClientRequest clientRequest1 = new ClientRequest();
        clientRequest1.setHandlerVersion(HandlerVersion.FIRST);
        clientRequest1.setBusinessType(BusinessType.HELLO);

        ClientRequest clientRequest2 = new ClientRequest();
        clientRequest2.setHandlerVersion(HandlerVersion.FIRST);
        clientRequest2.setBusinessType(BusinessType.BEY);

        ClientRequest clientRequest3 = new ClientRequest();
        clientRequest3.setHandlerVersion(HandlerVersion.SECOND);
        clientRequest3.setBusinessType(BusinessType.HELLO);

        ClientRequest clientRequest4 = new ClientRequest();
        clientRequest4.setHandlerVersion(HandlerVersion.SECOND);
        clientRequest4.setBusinessType(BusinessType.BEY);


        VersionDispatcher dispatcher = new VersionDispatcher();

        System.out.println(dispatcher.doHandle(clientRequest1).getResMessage());
        System.out.println(dispatcher.doHandle(clientRequest2).getResMessage());
        System.out.println();
        System.out.println(dispatcher.doHandle(clientRequest3).getResMessage());
        System.out.println(dispatcher.doHandle(clientRequest4).getResMessage());

    }
}
