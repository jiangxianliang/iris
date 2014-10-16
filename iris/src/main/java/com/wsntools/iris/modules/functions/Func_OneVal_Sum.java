/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package com.wsntools.iris.modules.functions;

import com.wsntools.iris.data.FunctionBasic;
import com.wsntools.iris.interfaces.IRIS_FunctionModule;

public class Func_OneVal_Sum extends FunctionBasic implements IRIS_FunctionModule {

	@Override
	public String getFunctionName() {
		
		return "Sum";
	}

	@Override
	public String getFunctionDescription() {

		return "Computes the sum of all values";
	}

	@Override
	public float[] computeData(float[][] val, float[] set) {
		
		float[] res = new float[1];
		res[0] = 0;
		for(int i=0; i<val[0].length; i++) {
			res[0] += val[0][i];
		}
		
		return res;
	}

	@Override
	public String[] getParameterNames() {
		
		return new String[] {"Value 1"}; 
	}

	@Override
	public String[] getSettingNames() {

		return new String[] {};
	}

	@Override
	public float[] getDefaultSettings() {
		
		return new float[] {};
	}

	@Override
	public boolean isScalarValueResult() {
		
		return true;
	}

	@Override
	public boolean hasPredictionValues() {

		return false;
	}

	@Override
	public float[] getPredictionValues() {

		return new float[] {};
	}

}
