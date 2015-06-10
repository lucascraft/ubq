package net.sf.ubq.gui.actions;
import java.io.File;
import java.net.URL;

import net.sf.ubq.gui.Activator;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IFileEditorMapping;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.registry.EditorDescriptor;
import org.eclipse.ui.internal.registry.EditorRegistry;
import org.eclipse.ui.internal.registry.FileEditorMapping;
import org.eclipse.ui.progress.UIJob;


public class RegisterIAnnixEditor implements IStartup {

    String programPath = "";

    @Override
	public void earlyStartup() {
      
        URL url = null;
		try {
			String app = "";
			if (Platform.getOS().equals(Platform.OS_WIN32)) {
				app = "IanniX.exe";
			} else if (Platform.getOS().equals(Platform.OS_LINUX)) {
				app = "IanniX.sh";
			} else if (Platform.getOS().equals(Platform.OS_MACOSX)) {
				app = "IanniX.app";
			}
			String ubiquisenseJarPath = "/iannix/" +  app;
			url = FileLocator.find(Activator.getDefault().getBundle(), new Path(ubiquisenseJarPath), null);
			if (url != null) {
				java.net.URI fileUri = FileLocator.resolve(url).toURI();
				if (fileUri != null) {
					File f = new File(fileUri);
					if (f != null) {
						programPath = new Path(f.getCanonicalPath()).toOSString();
					}
				}
			}
		} catch(Exception e) {
		    e.toString();
		}
        
	       
	    
	    new UIJob("Early Iannix Editor Mapping") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
			       // error handling is omitted for brevity
			    String extension = "iannix";
			    String editorId = "net.sf.ubq.interface.iannixEditorID";
	
			    EditorRegistry editorReg = (EditorRegistry)PlatformUI.getWorkbench().getEditorRegistry();
			    
			    EditorDescriptor editorExt = EditorDescriptor.createForProgram(programPath);
		        
			    FileEditorMapping mapping = new FileEditorMapping(extension);
			    mapping.addEditor(editorExt);
			    mapping.setDefaultEditor(editorExt);
	
			    IFileEditorMapping[] mappings = editorReg.getFileEditorMappings();
			    FileEditorMapping[] newMappings = new FileEditorMapping[mappings.length+1];
			    for (int i = 0; i < mappings.length; i++) {
			        newMappings[i] = (FileEditorMapping) mappings[i];
			    }
			    newMappings[mappings.length] = mapping;
			    editorReg.setFileEditorMappings(newMappings);
				return Status.OK_STATUS;
			}
		};
    
	}

}
