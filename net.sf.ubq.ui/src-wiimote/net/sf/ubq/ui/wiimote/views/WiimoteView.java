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

package net.sf.ubq.ui.wiimote.views;



public class WiimoteView { /*extends ViewPart {
	private Canvas scope;
	private WiimoteMonitor monitor;
	private CmdPipe engine;
	private int step;
	
	
	public static final String ID = "net.sf.ubq.ui.wiimote.views.WiimoteView";
	private float[] array;

	public WiimoteView() {
		array = new float[500];
		step = 0;
	}
	
	private WiimoteLiveSettings getWiimoteLiveSettings(String wiiid) {
		WiimoteLiveSettings settingsRet = null;
		boolean absent = true;
		for (WiimoteLiveSettings settings : monitor.getWiimotes()) {
			if (wiiid.equals(settings.getWiiid())) {
				absent = false;
				settingsRet = settings;
			}
		}
		if (absent) {
			settingsRet = WiimoteFactory.eINSTANCE.createWiimoteLiveSettings();
			settingsRet.setWiiid(wiiid);
			monitor.getWiimotes().add(settingsRet);
		}
		return settingsRet;
	}
	
	private Map<NetCfg, List<Orchestror>>  netConfMap;
	
	public void initMonitoring(IFile netconfFile) {
		monitor = WiimoteFactory.eINSTANCE.createWiimoteMonitor();

		Injector injector = Guice.createInjector(new NetCfgUtilsModule());

		NetConfigUtil netCfgUtil = (NetConfigUtil) injector.getInstance(INetCfgUtil.class);
			
		netConfMap = netCfgUtil.loadNetCfg(netconfFile.getFullPath().toOSString());
		
		engine = netCfgUtil.getCmdEngineByCmdIDFromOrchestrors(netConfMap.values().iterator().next(), "engineMd8Osc0");
		engine.addQxEventHandler(new Md8OscCmdEventHandler(){
			@Override
			public void handleQxEvent(Event evt) {
				super.handleQxEvent(evt);
			}
		});
		engine.addQxEventHandler(new WiimoteOscCmdHandler(){
			@Override
			public void handleQxEvent(Event event) {
				if(event.getKind()==EVENT_KIND.RX_DONE) {
					if (event.getCmd() instanceof WiiAccelPryCmd) {
						WiimoteCmd cmd = (WiimoteCmd) event.getCmd();
						WiimoteLiveSettings settings = getWiimoteLiveSettings(cmd.getWiiid());
						
						if (cmd instanceof WiiAccelPryCmd) {
							float roll = ((WiiAccelPryCmd)cmd).getRoll();
							//float pitch = ((WiiAccelPryCmd)cmd).getPitch();
							//float yaw = ((WiiAccelPryCmd)cmd).getYaw();
							
							//final int r = new Float(roll * 100).intValue();
							//final int p = new Float(pitch * 100).intValue();
							//final int y = new Float(yaw * 100).intValue();
							
							//System.err.println(event.getQx().getCommands().size());
							if (roll != 0) {
								System.arraycopy(array, 1, array, 0, 499);
								array[499] = roll;
								Display.getDefault().asyncExec(new Runnable() {
									@Override
									public void run() {
										scope.redraw();
									}
								});
								settings.setAccelPRY((WiiAccelPryCmd)cmd);
								step++;
								triggerMd8MAsterCrossFaderCommandOnSignificantMotion(engine, array);
							}
							//System.err.println("Wii Acell PRY [pitch:"+pitch+"][roll:"+roll+"][yaw:"+yaw+"]");
							//System.err.println("Wii Acell PRY [pitch:"+p+"][roll:"+r+"][yaw:"+y+"]");
							//System.err.println("Wii Acell Roll PRY [roll:"+roll+"]");
						} else if (cmd instanceof WiiAccelXYZCmd) {
							float x = ((WiiAccelXYZCmd)cmd).getX();
							float y = ((WiiAccelXYZCmd)cmd).getY();
							float z = ((WiiAccelXYZCmd)cmd).getZ();
							settings.setAccelXYZ((WiiAccelXYZCmd)cmd);
							System.err.println("Wii Acell XYZ [x:"+x+"][y:"+y+"][z:"+z+"]");
						} else if (cmd instanceof WiiAnglesCmd) {
							float roll = ((WiiAnglesCmd)cmd).getRoll();
							float pitch = ((WiiAnglesCmd)cmd).getPitch();
							float yaw = ((WiiAnglesCmd)cmd).getYaw();
							settings.setAngles((WiiAnglesCmd)cmd);
							System.err.println("Wii Angles PRY [pitch:"+pitch+"][roll:"+roll+"][yaw:"+yaw+"]");
						} else if (cmd instanceof WiiMotionVeloCmd) {
							float roll_velo = ((WiiMotionVeloCmd)cmd).getPitch_velocity();
							float pitch_velo = ((WiiMotionVeloCmd)cmd).getRoll_velocity();
							float yaw_velo = ((WiiMotionVeloCmd)cmd).getYaw_velocity();
							settings.setMotionVelocity((WiiMotionVeloCmd)cmd);
							System.err.println("Wii Motion Velocities [pitch:"+pitch_velo+"][roll:"+roll_velo+"][yaw:"+yaw_velo+"]");
						} else if (cmd instanceof WiiMotionAnglesCmd) {
							float pitch_velo = ((WiiMotionAnglesCmd)cmd).getPitch();
							float roll_velo = ((WiiMotionAnglesCmd)cmd).getRoll();
							float yaw_velo = ((WiiMotionAnglesCmd)cmd).getYaw();
							settings.setMotionAngles((WiiMotionAnglesCmd)cmd);
							System.err.println("Wii Motion Angles [pitch:"+pitch_velo+"][roll:"+roll_velo+"][yaw:"+yaw_velo+"]");
						} else if (cmd instanceof WiiNunchukAccelPryCmd) {
							float pitch = ((WiiNunchukAccelPryCmd)cmd).getPitch();
							float roll = ((WiiNunchukAccelPryCmd)cmd).getRoll();
							float yaw = ((WiiNunchukAccelPryCmd)cmd).getYaw();
							settings.setNunchukAccelPRY((WiiNunchukAccelPryCmd)cmd);
							System.err.println("Wii Nunchuk Acell PRY [pitch:"+pitch+"][roll:"+roll+"][yaw:"+yaw+"]");
						} else if (cmd instanceof WiiNunchukAccelXyzCmd) {
							float x = ((WiiNunchukAccelXyzCmd)cmd).getX();
							float y = ((WiiNunchukAccelXyzCmd)cmd).getY();
							float z = ((WiiNunchukAccelXyzCmd)cmd).getZ();
							settings.setNunchukAccelXYZ((WiiNunchukAccelXyzCmd)cmd);
							System.err.println("Wii Nunchuk Acell XYZ [x:"+x+"][y:"+y+"][z:"+z+"]");
						} else if (cmd instanceof WiiIrCmd) {
							float x = ((WiiIrCmd)cmd).getX();
							float y = ((WiiIrCmd)cmd).getY();
							settings.setIr((WiiIrCmd)cmd);
							System.err.println("Wii IR  [x:"+x+"][y:"+y+"]");
						} else if (cmd instanceof WiiNunchukJoyCmd) {
							float x = ((WiiNunchukJoyCmd)cmd).getX();
							float y = ((WiiNunchukJoyCmd)cmd).getY();
							settings.setNunchukJoystickXY((WiiNunchukJoyCmd)cmd);
							System.err.println("Wii Nunchuk Joystick  [x:"+x+"][y:"+y+"]");
						} else if (cmd instanceof WiiButtonCmd) {
							for (WiiButtonCmd bCmd : settings.getWiiButtons()) {
								if (bCmd.getKind().equals(((WiiButtonCmd)cmd).getKind())) {
									settings.getWiiButtons().add(bCmd);
								}
							}
							System.err.println("Wiimote Button  [" + ((WiiButtonCmd)cmd).getKind().getName() + "]");
						} else if (cmd instanceof WiiNunchukButtonCmd) {
							System.err.println("Wiimote Button  [" + ((WiiNunchukButtonCmd)cmd).getKind().getName() + "]");
							for (WiiNunchukButtonCmd bCmd : settings.getNunchukButtons()) {
								if (bCmd.getKind().equals(((WiiNunchukButtonCmd)cmd).getKind())) {
									settings.getNunchukButtons().add(bCmd);
								}
							}
						}
					}
				}
			}
		});
	}

	private boolean isMotionSignificant(float array[]) {
		if (step>10) { // could be replaced by a gesture based computation
			step = 0;
			return true;
		}
		return false;
	}
	
	private void triggerMd8MAsterCrossFaderCommandOnSignificantMotion(CmdPipe engine, final float array[]) {
		if (isMotionSignificant(array)) {
			engine.getTx().postCommand(
				Md8OscCmdUtils.INSTANCE.create_ctrl_master_crossfader_slider(array[99])
			);
		}
	}

	public void createPartControl(Composite parent) {
		scope = new Canvas(parent, SWT.DOUBLE_BUFFERED);
		scope.setLayout(new FillLayout());
		scope.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				for (int i=0; i<array.length; i++) {
					int x = i * (e.width / array.length);
					int y = (int) (array[i] * (float) e.height);
					e.gc.drawPoint(x, y);
				}
			}
		});
	}

	@Override
	public void dispose() {
		OrcherstrorClockJob job =  (OrcherstrorClockJob) engine.getClient().getRunner();
		if (job instanceof OrcherstrorClockJob) {
			((OrcherstrorClockJob)job).sleep();
			((OrcherstrorClockJob)job).cancel();
			((OrcherstrorClockJob)job).done(Status.CANCEL_STATUS);
		}
		super.dispose();
	}
	
	public void setFocus() {
		scope.setFocus();
	}
	*/
}