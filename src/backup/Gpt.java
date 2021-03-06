/*
 * Copyright (C) 2014-2015 José Luis Risco Martín <jlrisco@ucm.es> and 
 * Saurabh Mittal <smittal@duniptech.com>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see
 * http://www.gnu.org/licenses/
 *
 * Contributors:
 *  - José Luis Risco Martín
 */
package backup;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.Level;

import cloud.DataCenter;
import edge.NodoVirtual;
import fog.FogServer;
import xdevs.core.modeling.Coupled;
import xdevs.core.simulation.Coordinator;
import xdevs.core.util.DevsLogger;

/**
 *
 * @author jlrisco
 */
public class Gpt extends Coupled {

    public Gpt(String name, double period, double observationTime) {
    	super(name);
        /*
        String userDirectory = Paths.get("")
            .toAbsolutePath()
            .toString();
	
// ANSIBLE FICHEROS
Ficheros ap1 = new Ficheros("ap1", period, userDirectory + "/data/ap1/", null, null);
super.addComponent(ap1);

Ficheros ap5 = new Ficheros("ap5", period, userDirectory + "/data/ap5/", null, null);
super.addComponent(ap5);

Ficheros ap6 = new Ficheros("ap6", period, userDirectory + "/data/ap6/", null, null);
super.addComponent(ap6);

Ficheros ap7 = new Ficheros("ap7", period, userDirectory + "/data/ap7/", null, null);
super.addComponent(ap7);

Ficheros dh1 = new Ficheros("dh1", period, userDirectory + "/data/dh1/", null, null);
super.addComponent(dh1);

Ficheros dh2 = new Ficheros("dh2", period, userDirectory + "/data/dh2/", null, null);
super.addComponent(dh2);

Ficheros dh3 = new Ficheros("dh3", period, userDirectory + "/data/dh3/", null, null);
super.addComponent(dh3);

Ficheros dh4 = new Ficheros("dh4", period, userDirectory + "/data/dh4/", null, null);
super.addComponent(dh4);

        
        
// ANSIBLE NVIRTUAL
NodoVirtual nodoVirtual1 = new NodoVirtual("nodoVirtual1", period);
super.addComponent(nodoVirtual1);

NodoVirtual nodoVirtual2 = new NodoVirtual("nodoVirtual2", period);
super.addComponent(nodoVirtual2);

NodoVirtual nodoVirtual3 = new NodoVirtual("nodoVirtual3", period);
super.addComponent(nodoVirtual3);

NodoVirtual nodoVirtual4 = new NodoVirtual("nodoVirtual4", period);
super.addComponent(nodoVirtual4);

NodoVirtual nodoVirtual5 = new NodoVirtual("nodoVirtual5", period);
super.addComponent(nodoVirtual5);

NodoVirtual nodoVirtual6 = new NodoVirtual("nodoVirtual6", period);
super.addComponent(nodoVirtual6);

NodoVirtual nodoVirtual7 = new NodoVirtual("nodoVirtual7", period);
super.addComponent(nodoVirtual7);

NodoVirtual nodoVirtual8 = new NodoVirtual("nodoVirtual8", period);
super.addComponent(nodoVirtual8);

    	

// ANSIBLE FOGSERVER
FogServer fogserver1 = new FogServer("fogserver1", period, 10.0, 80.0, Arrays.asList(12.771, 9.692, 8.165, 14.779), Arrays.asList(83.829, 82.415, 79.381, 77.897) );
super.addComponent(fogserver1);

FogServer fogserver2 = new FogServer("fogserver2", period, 14.0, 85.0, Arrays.asList(15.409, 14.244, 12.264, 12.957), Arrays.asList(86.845, 84.642, 84.802, 85.018) );
super.addComponent(fogserver2);

        

// ANSIBLE DATACENTER
DataCenter dataCenter = new DataCenter("dataCenter", period);
super.addComponent(dataCenter);

        

// ANSIBLE CONECTOR
super.addCoupling(ap1.oOut, nodoVirtual1.iInFichero);
super.addCoupling(ap5.oOut, nodoVirtual2.iInFichero);
super.addCoupling(ap6.oOut, nodoVirtual3.iInFichero);
super.addCoupling(ap7.oOut, nodoVirtual4.iInFichero);
super.addCoupling(dh1.oOut, nodoVirtual5.iInFichero);
super.addCoupling(dh2.oOut, nodoVirtual6.iInFichero);
super.addCoupling(dh3.oOut, nodoVirtual7.iInFichero);
super.addCoupling(dh4.oOut, nodoVirtual8.iInFichero);
super.addCoupling(nodoVirtual1.out, fogserver1.iInNodovirtual1);
super.addCoupling(nodoVirtual2.out, fogserver1.iInNodovirtual2);
super.addCoupling(nodoVirtual3.out, fogserver1.iInNodovirtual3);
super.addCoupling(nodoVirtual4.out, fogserver1.iInNodovirtual4);
super.addCoupling(nodoVirtual5.out, fogserver2.iInNodovirtual5);
super.addCoupling(nodoVirtual6.out, fogserver2.iInNodovirtual6);
super.addCoupling(nodoVirtual7.out, fogserver2.iInNodovirtual7);
super.addCoupling(nodoVirtual8.out, fogserver2.iInNodovirtual8);
super.addCoupling(fogserver1.oOut, dataCenter.iInFogserver1);
super.addCoupling(fogserver2.oOut, dataCenter.iInFogserver2);
        
        */
    }

    public static void main(String args[]) {
    	/*
        DevsLogger.setup(Level.INFO);
        Gpt gpt = new Gpt("gpt", 1, 200);
        //CoordinatorParallel coordinator = new CoordinatorParallel(gpt);
        Coordinator coordinator = new Coordinator(gpt);
        //RTCentralCoordinator coordinator = new RTCentralCoordinator(gpt);
        coordinator.initialize();
        coordinator.simulate(Long.MAX_VALUE);
        */
    }

}
