/***********************************************************************************
 * UBQT - A ubiquitous computing utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
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
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.ubq.util.gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

public class DSLInfrastructure {

	public final static DSLInfrastructure INSTANCE = new DSLInfrastructure();
	
	static String  UBQT_FILE_2 = "import \"o.orchestror\";" +
	"\ndisplay(1440,900);" +
	//"\ndisplay(1920,1080);" +
	//"\ndisplay(1024, 768);" +
	"\nfiducial fiducial0  code 0;" +
	"\nfiducial fiducial1  code 1;" +
	"\nfiducial fiducial2  code 2;" +
	"\nfiducial fiducial3  code 3;" +
	"\nfiducial fiducial4  code 4;" +
	"\nfiducial fiducial5  code 5;" +
	"\nfiducial fiducial6  code 6;" +
	"\nfiducial fiducial7  code 7;" +
	"\nfiducial fiducial8  code 8;" +
	"\nfiducial fiducial9  code 9;" +
	"\nfiducial fiducial10 code 10;" +
	"\nfiducial fiducial11 code 11;" +
	"\nfiducial fiducial28 code 28;" +
	"\nfiducial fiducial29 code 29;" +
	"\nfiducial fiducial30 code 30;" +
	"\nfiducial fiducial31 code 31;" +
	"\nfiducial fiducial32 code 32;" +
	"\nfiducial fiducial33 code 33;" +
	"\nfiducial fiducial34 code 34;" +
	"\nfiducial fiducial35 code 35;" +
	"\nfiducial fiducial12 code 12;" +
	"\nfiducial fiducial16 code 16;" +
	"\nfiducial fiducial20 code 20;" +
	"\nfiducial fiducial24 code 24;" +
	"\n" +
	"\naction udpModulateDrumMachineTempoAction trigger \"org.tetalab.tangible.puredata.setDrumMachineTempoAction\";" +
	"\naction udpSelectDrumMachineIntrumentAction trigger \"org.tetalab.tangible.puredata.selectDrumMachineInstrumentAction\";" +
	"\naction udpSetDrumMachineIntrumentPatternAction trigger \"org.tetalab.tangible.puredata.setDrumMachineInstrumentPatternAction\";" +
	"\n" +
	"\nreaction readInstrumentPatternReaction handles \"drumMachinePatternSettingCommand\" with \"org.tetalab.tangible.puredata.tcpCmdHandler\";" +
	"\n" +
	"\n" +
	"\nslot p0CheckboxSlot in P0 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p23CheckboxSlot in P23 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p45CheckboxSlot in P45 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p67CheckboxSlot in P67 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p90CheckboxSlot in P90 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p113CheckboxSlot in P113 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p135CheckboxSlot in P135 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p157CheckboxSlot in P157 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p180CheckboxSlot in P180 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p203CheckboxSlot in P203 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p225CheckboxSlot in P225 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p247CheckboxSlot in P247 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p270CheckboxSlot in P270 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p293CheckboxSlot in P293 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p315CheckboxSlot in P315 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\nslot p337CheckboxSlot in P337 kind PUSH status UNSELECTED {" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on WIDGET_SELECTION;" +
	"\n};" +
	"\n" +
	"\nproxima proxFid0 maps fiducial0 to engineUDP0 range [0..100] radius 180  {" +
	"\n};" +
	"\nproxima proxFid1 maps fiducial1 to engineUDP0 range [0..100] radius 180  {" +
	"\n};" +
	"\nproxima proxFid2 maps fiducial2 to engineUDP0 range [0..100] radius 180  {" +
	"\n};" +
	"\nproxima proxFid3 maps fiducial3 to engineUDP0 range [0..100] radius 180  {" +
	"\n};" +
	"\nproxima proxFid4 maps fiducial4 to engineUDP0 range [0..100] radius 180  {" +
	"\n};" +
	"\nproxima proxFid6 maps fiducial6 to engineUDP0 range [0..100] radius 180  {" +
	"\n};" +
	"\nproxima pureData127_0_0_1_port3002 maps fiducial9 to engineUDP2 range [0..9] radius 180 requires pureData127_0_0_1_port3000 {" +
	"\n  emits udpSelectDrumMachineIntrumentAction on PROXIMA_UPDATE;" +
	"\n};" +
	"\n" +
	"\nproxima pureData127_0_0_1_port3001 maps fiducial5 to engineUDP1 range [50..180] radius 180 {" +
	"\n  emits udpModulateDrumMachineTempoAction on PROXIMA_UPDATE;" +
	"\n};" +
	"\n" +
	"\nproxima pureData127_0_0_1_port3000 maps fiducial8 to engineUDP0 range [0..16] radius 180  requires pureData127_0_0_1_port3002 {" +
	"\n  p0CheckboxSlot, p23CheckboxSlot, p45CheckboxSlot, p67CheckboxSlot, p90CheckboxSlot, " +
	"\n  p113CheckboxSlot, p135CheckboxSlot, p157CheckboxSlot, p180CheckboxSlot, p203CheckboxSlot, " +
	"\n  p225CheckboxSlot, p247CheckboxSlot, p270CheckboxSlot, p293CheckboxSlot, p315CheckboxSlot, p337CheckboxSlot;" +
	"\n  emits udpSetDrumMachineIntrumentPatternAction on PROXIMA_ADD;" +
	"\n  handles readInstrumentPatternReaction with pureData127_0_0_1_port3002;" +
	"\n};" +
	"\n" +
	"\n" +
	"\ncursor mouse (0,0) dimension (5,5) ;" +
	"";

	//
	// Network config (ports, bindings, protocols, decoder, interpreters)
	//
	static String NETCONF_FILE_1 = "import \"o.orchestror\";" +
			"\nlistener listenerUSB0 : \"net.sf.smbt.i2c.thingm.cmdHandler\";" +
			//"\nlistener listenerUSB1 : \"net.sf.smbt.i2c.wii.nunchuk.cmdHandler\";" +
			"\ninterpreter interpreterUSB0 : \"net.sf.smbt.i2c.thingm.cmdInterpreter\";" +
			//"\ndecoder decoderUSB1 : \"net.sf.smbt.i2c.wii.nunchuk.frameInterpreter\";" +
			"\nport usb0 : \"/dev/tty.usbserial-A6007to3\" as USB at 19200;" + // XBee + Funnel IO + blinkm
			//"\nport usb0 : \"/dev/tty.usbserial-A7006022\" as USB at 19200;" + // Arduino + blinkm
			//"\nport usb0 : \"COM4\" as USB at 19200;" +
			//"\nport usb1 : \"COM5\" as USB at 19200;" +
			"\nscope orchestror1 {" +
			"\n\tbind engineUSB0 => interpreterUSB0  to usb0 with listenerUSB0;" +
			//"\n\tbind engineUSB1 <= decoderUSB1  to usb1;" +
			"\n};\n";
	
	//
	// Network config (ports, bindings, protocols, decoder, interpreters)
	//
	static String NETCONF_FILE_2 = "import \"o.orchestror\";" +
			"\nlistener listenerUDP : \"net.sf.smbt.tcp.puredata.cmdHandler\";" +
			"\ninterpreter interpreterUDP : \"net.sf.smbt.tcp.puredata.cmdInterpreter\";" +
			//"\ninterpreter interpreterNunchuk : \"net.sf.smbt.i2c.wii.nunchuk.frameInterpreter\";"+
			"\ninterpreter interpreterWiimote : \"net.sf.smbt.osc.wiimote.frameInterpreter\";"+
			//"\nlistener listenerNunchuk : \"net.sf.smbt.i2c.wii.nunchuk.cmdHandler\";" +
			//"\ndecoder nunchunkDecoder : \"net.sf.smbt.i2c.wii.nunchuk.frameInterpreter\";" +
			"\ndecoder decoderUDP : \"net.sf.smbt.tcp.puredata.frameInterpreter\";" +
			"\n" +
			"\nport osc0 : as UDP accept 8001;" +
			"\nport udp0 : \"127.0.0.1:3000\" as UDP accept 1234;" +
			"\nport udp1 : \"127.0.0.1:3001\" as UDP;" +
			"\nport udp2 : \"127.0.0.1:3002\" as UDP;" +
			"\n" +
			//"\nport usb0 : \"/dev/tty.usbserial-A7006022\" as USB at 19200;" +
			"\n" +
			"\nscope orchestror1 {" +
			"\n  bind engineOSC0 <= interpreterWiimote to osc0;" +
			"\n  bind engineUDP0 => interpreterUDP <= decoderUDP to udp0 with listenerUDP;" +
			"\n  bind engineUDP1 => interpreterUDP to udp1 with listenerUDP;" +
			"\n  bind engineUDP2 => interpreterUDP to udp2 with listenerUDP;" +
			//"\n  bind engineUSB0 => interpreterNunchuk <= nunchunkDecoder to usb0 with listenerNunchuk;" +
			"\n};\n";
	
	//
	// Network config (ports, bindings, protocols, decoder, interpreters)
	//
	static String NETCONF_FILE_3 = "import \"o.orchestror\";" + 
			"\nlistener listenerOsc0 : \"net.sf.xqz.engine.cmdHandler\";" +
			"\ndecoder decoderOsc0 : \"net.sf.smbt.osc.frameInterpreter\";" +
			"\nport udp0 : as UDP accept 1234;" +
			"\nscope orchestror1 {" +
			"\n\tbind engineOsc0 <= decoderOsc0 to udp0;" +
			"\n};\n";
	

	//
	// Orchestror (engine, queues, clients, etc ...)
	//
	static String ORCHESTROR_FILE_1 = "orchestror orchestror1 {" +
			"\nengine engineUSB0;" +
			"\nengine engineUSB1;" +
			"\nclient client1 { engineUSB0 engineUSB1 };" +
			"\n  timeline timeline1 : engineUSB0;" +
			"\n  timeline timeline2 : engineUSB1;" +
			"\n  application application1 { client1 };" +
			"\n}\n";

	//
	// Orchestror (engine, queues, clients, etc ...)
	//
	static String ORCHESTROR_FILE_2 = "orchestror orchestror1 {" +
			"\nengine engineUDP0;" +
			"\nengine engineUDP1;" +
			"\nengine engineUDP2;" +
			//"\nengine engineUSB0;" +
			"\nclient client1 { engineUSB0 engineUDP0 engineUDP1 engineUDP2 };" +
			"\n  timeline timeline1 : engineUDP0 ;" +
			"\n  timeline timeline2 : engineUDP1 ;" +
			"\n  timeline timeline3 : engineUDP2 ;" +
			//"\n  timeline timeline4 : engineUSB0 ;" +
			"\napplication application1 { client1 };" +
			"\n}\n";

	//
	// Orchestror (engine, queues, clients, etc ...)
	//
	static String ORCHESTROR_FILE_3 = "orchestror orchestror1 {" +
			"\nengine engineOsc0;" +
			"\nclient client1 { engineOsc0 };" +
			"\n  timeline timeline1 : engineOsc0;" +
			"\n  application application1 { client1 };" +
			"\n}\n";



	public void init1USB0TestWorkspace() {
		initTestWorkspace(
			null, 
			NETCONF_FILE_1,
			ORCHESTROR_FILE_1
		);
	}
	
	public void init1OscPortInTestWorkspace() {
		initTestWorkspace(
			null, 
			NETCONF_FILE_3,
			ORCHESTROR_FILE_3
		);
	}
	
	public void initTestWorkspace() {
		initTestWorkspace(
			UBQT_FILE_2, 
			NETCONF_FILE_2,
			ORCHESTROR_FILE_2
		);
	}
	
	public void initTestWorkspace(String UBQ_FILE, String NETCFG_FILE, String ORCHESTROR_FILE) {
		if (Platform.isRunning()) {
			try{
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IWorkspaceRoot wsroot = workspace.getRoot();
				
				IProject p = wsroot.getProject( "DefaultXQZProject" );
				
				IProjectDescription desc =
					workspace.newProjectDescription(p.getName());

				if (p.exists()) {
					p.delete(true, new NullProgressMonitor());
				}
				
				p.create(desc, null);
				

				// Open the project if it isn't open
				if (!p.isOpen()) {
					p.open(null);
				}
				
				// Create the resource if it doesn't exist
				Path dataDirPath = new Path("data");
				if (!p.getFolder(dataDirPath).exists()) {
					p.getFolder(dataDirPath).create(true, true, new NullProgressMonitor());
				}

				
				File netconf = new File("n.netconf");
				FileOutputStream neOutputStream = new FileOutputStream(netconf);
				neOutputStream.write(NETCFG_FILE.getBytes());
				neOutputStream.flush();
				neOutputStream.close();

				if (!p.getFile("data/n.netconf").exists()) {
					p.getFile("data/n.netconf").create(new FileInputStream(netconf), true, new NullProgressMonitor());
				}

				
				File orchestrorFile = new File("o.orchestror");
				
				FileOutputStream orOutputStream = new FileOutputStream(orchestrorFile);
				orOutputStream.write(ORCHESTROR_FILE.getBytes());
				orOutputStream.flush();
				orOutputStream.close();

				if (!p.getFile("data/o.orchestror").exists()) {
					p.getFile("data/o.orchestror").create(new FileInputStream(orchestrorFile), true, new NullProgressMonitor());
				}
				

				if (UBQ_FILE != null) {
					File ubqtFile = new File("u.ubqt");
					
					FileOutputStream ubqtOutputStream = new FileOutputStream(ubqtFile);
					ubqtOutputStream.write(UBQ_FILE.getBytes());
					ubqtOutputStream.flush();
					ubqtOutputStream.close();
	
					if (!p.getFile("data/u.ubqt").exists()) {
						p.getFile("data/u.ubqt").create(new FileInputStream(ubqtFile), true, new NullProgressMonitor());
					}
				}
				
				p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			throw new UnsupportedOperationException("OSGi needed !!!");
		}
	}
}
