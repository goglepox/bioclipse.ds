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
package net.bioclipse.ds.bursi.calc;

import net.bioclipse.ds.prop.calc.BaseDSPropertyCalculator;


/**
 * 
 * @author ola
 *
 */
public class NearestMatchCalculator extends BaseDSPropertyCalculator{

    @Override
    public String getPropertyName() {
        return "Bursi nearest neighbour";
    }

    @Override
    public String getTestID() {
        return "bursi.sdflookup.nearest";
    }

}
