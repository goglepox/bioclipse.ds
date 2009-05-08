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
package net.bioclipse.ds.business;

import java.util.List;

import net.bioclipse.core.PublishedClass;
import net.bioclipse.core.business.BioclipseException;
import net.bioclipse.core.business.IBioclipseManager;
import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.ds.model.IDSTest;
import net.bioclipse.ds.model.ITestResult;
import net.bioclipse.ds.model.impl.DSException;


@PublishedClass( "Contains methods for Bioclipse Decision Support")
/**
 * Contains methods for Bioclipse Decision Support
 * 
 * @author ola
 *
 */
public interface IDSManager extends IBioclipseManager{

    public List<String> getTests() throws BioclipseException;

    /**
     * Run a test for a molecule, return list of matches
     * @param test
     * @param mol
     * @return
     * @throws BioclipseException 
     * @throws DSException 
     */
    public List<ITestResult> runTest(String testID, IMolecule mol) throws BioclipseException, DSException;

    public IDSTest getTest( String string ) throws BioclipseException;
    
}