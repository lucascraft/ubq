/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
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

package net.sf.ubq.mt.editor;

import net.sf.smbt.ubqt.UbqColor;
import net.sf.smbt.ubqt.UbqIncrementableRange;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.ubq.draw2d.renderer.utils.UbqUtils;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class ProximaPropertySection extends AbstractPropertySection {
	private UbqProxima proxima;
	private Composite container;

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);
		
		parent.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		parent.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		parent.setBackground(GUIToolkit.BG);
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.getParent().getParent().setBackground(GUIToolkit.BG);

		container = GUIToolkit.INSTANCE.createComposite(parent);
		
		container.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
		
		container.addPaintListener(new PaintListener() {
			
			public void paintControl(PaintEvent e) {
				if (proxima != null) {
					GC gc = e.gc;
					
					Rectangle rect = Rectangle.SINGLETON.setBounds(e.x, e.y, e.width, e.height);
					
					int radius = proxima.getRadius();
					UbqIncrementableRange range = proxima.getRange();
					
					float angle = proxima.getAngle();
					int fid = (proxima.getFiducial()!=null)?proxima.getFiducial().getFidcode():-1;
					double limit = proxima.getLimit();
					UbqColor fg = proxima.getFgColor();
					UbqColor bg = proxima.getBgColor();
					
					Color nFG = UbqUtils.INSTANCE.getcolor(fg);
					Color nBG = UbqUtils.INSTANCE.getcolor(bg);
					
					if(nFG != null) {
						gc.setBackground(nFG);
					}
					if(nFG != null) {
						gc.setForeground(nBG);
					}
					
					gc.fillOval(rect.width/2-radius/2, rect.height/2-radius/2, radius, radius);
				}
			}
		});
	}
	
    private void layoutComposite(Control control) {
    	if (control instanceof Composite) {
    		Composite composite = (Composite) control;
    		for (Control c : composite.getChildren()) {
				if (!c.isDisposed()) {
					if (c instanceof Composite) {
						Composite cmp = (Composite) c;
						cmp.layout(true);
						cmp.redraw();
						layoutComposite(cmp);
					}
					c.redraw();
				}
			}
    	}
    }

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object o = unwrap(selection);
		if (o instanceof UbqProxima) {
			proxima = (UbqProxima) o;
		}
		container.update();
		container.layout(true);
		container.redraw();
	}
	
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
}
