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
package net.bioclipse.ds.smarts.model.impl;

import net.bioclipse.ds.model.SubStructureMatch;

/**
 * A result that also holds a SMARTS string
 * @author ola
 *
 */
public class SmartsMatchingTestMatch extends SubStructureMatch{

    public SmartsMatchingTestMatch(String name, int resultStatus) {
        super( name, resultStatus );
    }

    private String smartsString;
    
    public String getSmartsString() {
    
        return smartsString;
    }
    public void setSmartsString( String smarts ) {
    
        this.smartsString = smarts;
        
    }

}