package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            Paciente pa = new Paciente("MANUCIRCUIT");
            Nodule n1 = new Nodule(0);
            Nodule n2 = new Nodule(1);

            kSession.insert(pa);
            kSession.insert(n1);
            kSession.insert(n2);

            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}