/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans.util;

import javax.telephony.*;

/**
 *
 * @Autor: Oswaldo Cruz
 * @Fecha: 08-MAY-2015
 * 
 */
public class SoftPhone {    
    

    public void realizarLlamada(String nro) {
        Provider prov;
        Terminal term;
        Call call;
        JtapiPeer peer;
        Connection[] connections;
        CallObserver callObsv;

        try {
            peer = JtapiPeerFactory.getJtapiPeer(null);
            prov = peer.getProvider("iptel.org;login=OswlC001;passwd=sipVale;appinfo=MyApp");
//            term = prov.getTerminal(args[0]);
//            call = prov.createCall();
//            connections = call.connect(term, term.getAddresses()[0], args[1]);
            prov.shutdown();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
