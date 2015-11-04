package client;

public class SCADAClient
{
    private BatchServerImplService service;
    private IBatchServer server;
    
    public void connect()
    {
        service = new BatchServerImplService();
        server = service.getBatchServerImplPort();
    }
}
