package jmDNS;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class Registration{
	
	
	public static void main(String[] args) throws InterruptedException {

        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo lightning = ServiceInfo.create("_http._tcp.local.", "example", 50055, "path=index.html");
            ServiceInfo smarttv = ServiceInfo.create("_http._tcp.local.", "example", 50056, "path=index.html");
            ServiceInfo speakers = ServiceInfo.create("_http._tcp.local.", "example", 50057, "path=index.html");
            jmdns.registerService(lightning);
            jmdns.registerService(smarttv);
            jmdns.registerService(speakers);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}