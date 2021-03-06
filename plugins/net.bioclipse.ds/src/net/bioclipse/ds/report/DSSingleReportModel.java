/* *****************************************************************************
 * Copyright (c) 2009 Ola Spjuth.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ola Spjuth - initial API and implementation
 ******************************************************************************/
package net.bioclipse.ds.report;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ola
 *
 */
public class DSSingleReportModel {

    private byte[] queryStructure;
    private byte[] consensusImage;
	private List<AbstractTestReportModel> testsmodels;
  private String compoundName;
  private String consensusText;
  private double mw;
  private String SMILES;
	
	public byte[] getQueryStructure() {
		return queryStructure;
	}
	public void setQueryStructure(byte[] queryStructure) {
		this.queryStructure = queryStructure;
	}
	public List<AbstractTestReportModel> getTestModels() {
		return testsmodels;
	}
	public void setTestModels(List<AbstractTestReportModel> testmodels) {
		this.testsmodels = testmodels;
	}
	
	public void addTestModel(AbstractTestReportModel test){
		if (testsmodels==null)
			testsmodels=new ArrayList<AbstractTestReportModel>();
		testsmodels.add(test);
	}
	public AbstractTestReportModel getTestModel(String name) {
		for (AbstractTestReportModel test : testsmodels){
			if (test.getName().equals(name))
				return test;
		}
		return null;
	}
    
    public String getCompoundName() {
    
        return compoundName;
    }
    
    public void setCompoundName( String compoundName ) {
    
        this.compoundName = compoundName;
    }
    
    public double getMw() {
    
        return mw;
    }
    
    public void setMw( double mw ) {
    
        this.mw = mw;
    }
    
    public String getSMILES() {
    
        return SMILES;
    }
    
    public void setSMILES( String smiles ) {
    
        SMILES = smiles;
    }
    public String getConsensusText() {
        return consensusText;
    }
    public byte[] getConsensusImage() {
        return consensusImage;
    }
    
    public void setConsensusImage( byte[] consensusImage ) {
        this.consensusImage = consensusImage;
    }
    
    public void setConsensusText( String consensusText ) {
        this.consensusText = consensusText;
    }

	
}
