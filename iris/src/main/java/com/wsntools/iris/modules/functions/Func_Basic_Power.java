/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package com.wsntools.iris.modules.functions;

import com.wsntools.iris.data.FunctionBasic;
import com.wsntools.iris.interfaces.IRIS_FunctionModule;

public class Func_Basic_Power extends FunctionBasic implements IRIS_FunctionModule {

	@Override
	public String getFunctionName() {
		
		return "Power";
	}

	@Override
	public String getFunctionDescription() {

		return "Multiplies the input n-times with itself";
	}

	@Override
	public float[] computeData(float[][] val, float[] set) {
		
		float[] res = new float[val[0].length];
		for(int i=0; i<val[0].length; i++) {
			res[i] = (float) Math.pow(val[0][i], set[0]);
		}
		
		return res;
	}

	@Override
	public String[] getParameterNames() {
		
		String[] res = {"Input"};
		return res; 
	}

	@Override
	public String[] getSettingNames() {

		String[] res = {"Power"};
		return res;
	}

	@Override
	public float[] getDefaultSettings() {
		
		float[] res = {2};
		return res;
	}

	@Override
	public boolean isScalarValueResult() {
		
		return false;
	}
	
	@Override
	public boolean hasPredictionValues() {

		return false;
	}

	@Override
	public float[] getPredictionValues() {

		float[] res = {};
		return res;
	}

}
