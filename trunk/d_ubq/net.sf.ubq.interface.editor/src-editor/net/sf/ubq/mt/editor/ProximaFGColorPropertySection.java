package net.sf.ubq.mt.editor;

import net.sf.smbt.ubqt.UbqColor;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqtPackage;
import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class ProximaFGColorPropertySection extends
		AbstractUbqColorPropertySection {

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.setBackground(GUIToolkit.BG);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);

		super.createControls(parent, aTabbedPropertySheetPage);
	}
	
	@Override
	protected UbqColor getUbqColor() {
		return ((UbqProxima)getEObject()).getFgColor();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return UbqtPackage.Literals.UBQ_PROXIMA__FG_COLOR;
	}

	@Override
	protected String getLabelText() {
		return "FG Color";
	}

}
