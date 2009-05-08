/*******************************************************************************
 * Copyright (c) 2009 Ola Spjuth.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ola Spjuth - initial API and implementation
 ******************************************************************************/
package net.bioclipse.ds.ui.views;

import net.bioclipse.ds.model.ITestResult;
import net.bioclipse.ds.model.TestRun;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;


public class TestsViewContentProvider implements ITreeContentProvider{

    public Object[] getChildren( Object parentElement ) {
        if ( parentElement instanceof TestRun ) {
            TestRun run = (TestRun) parentElement;
            if (run.getMatches() != null && run.getMatches().size()>0)
                return run.getMatches().toArray();
        }
        return null;
    }

    public Object getParent( Object element ) {
        if ( element instanceof ITestResult ) {
            ITestResult match = (ITestResult) element;
            return match.getTestRun();
        }
        return null;
    }

    public boolean hasChildren( Object element ) {
        if ( element instanceof TestRun ) {
            TestRun run = (TestRun) element;
            if (run.getMatches() != null && run.getMatches().size()>0)
                return true;
        }
        return false;
    }

    public Object[] getElements( Object inputElement ) {
        if ( inputElement instanceof Object[] ) {
            Object[] objs = (Object[]) inputElement;
            return objs;
        }
        System.out.println("Unsupported input in treeviewer: " + inputElement);
        return new Object[0];
    }

    public void dispose() {
    }

    public void inputChanged( Viewer viewer, Object oldInput, Object newInput ) {
    }

}