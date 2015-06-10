/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2014, Lucas Bigeardel
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
import net.sf.smbt.ubqt.UbqtFactory;
import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTabbedPropertySection;
import org.eclipse.jface.preference.ColorSelector;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;


public abstract class AbstractUbqColorPropertySection extends AbstractTabbedPropertySection {

	private ColorSelector colorSelector;

	private CLabel colorLabel;

	private Composite compositeColorSelector;

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.setBackground(GUIToolkit.BG);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);

		super.createControls(parent, aTabbedPropertySheetPage);
	}
	

	/**
	 * @see org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTabbedPropertySection#createWidgets(org.eclipse.swt.widgets.Composite)
	 */
	protected void createWidgets(Composite composite) {
		composite.getParent().setBackground(GUIToolkit.BG);
		colorLabel = getWidgetFactory().createCLabel(composite, getLabelText());
		compositeColorSelector = getWidgetFactory().createFlatFormComposite(composite);
		colorSelector = new ColorSelector(compositeColorSelector);
	}

	/**
	 * @see org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTabbedPropertySection#setSectionData(org.eclipse.swt.widgets.Composite)
	 */
	protected void setSectionData(Composite composite) {
		FormData data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(0, 0);
		data.right = new FormAttachment(compositeColorSelector, -ITabbedPropertyConstants.HSPACE);
		colorLabel.setLayoutData(data);

		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(colorLabel, 0, SWT.CENTER);
		data.left = new FormAttachment(colorLabel, ITabbedPropertyConstants.HSPACE);
		compositeColorSelector.setLayoutData(data);
	}

	/**
	 * @see org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTabbedPropertySection#hookListeners()
	 */
	protected void hookListeners() {
		colorSelector.addListener(new IPropertyChangeListener() {

			public void propertyChange(PropertyChangeEvent event) {
				handleColorChanged();
			}
		});

	}

	/**
	 * Called when the selected color changes
	 */
	protected void handleColorChanged() {
		RGB rgb = colorSelector.getColorValue();
		
		UbqColor newColor = UbqtFactory.eINSTANCE.createUbqColor();
		newColor.setR(rgb.red);
		newColor.setG(rgb.green);
		newColor.setB(rgb.blue);
		
		createCommand(getUbqColor(), newColor);
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#refresh()
	 */
	public void refresh() {
		colorSelector.setEnabled(!isReadOnly());
		UbqColor c = getUbqColor();
		RGB rgb = ColorConstants.lightGreen.getRGB();
		if (c != null) {
			rgb = new RGB(c.getR(), c.getG(), c.getB());
		}
		colorSelector.setColorValue(rgb);
	}

	/**
	 * Get the new RGB value of the color feature for the section.
	 * 
	 * @return the RGB value of the feature.
	 */
	protected abstract UbqColor getUbqColor();

}


