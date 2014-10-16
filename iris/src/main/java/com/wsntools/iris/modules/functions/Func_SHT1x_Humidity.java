/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package com.wsntools.iris.modules.functions;

import com.wsntools.iris.data.FunctionBasic;
import com.wsntools.iris.interfaces.IRIS_FunctionModule;

public class Func_SHT1x_Humidity extends FunctionBasic implements IRIS_FunctionModule {

	@Override
	public String getFunctionName() {

		return "SHT1x Rel.Humidity";
	}

	@Override
	public String getFunctionDescription() {
		
		return "Converts the delivered humidity value from a SHT1x sensor into relative humidity";
	}

	@Override
	public float[] computeData(float[][] val, float[] set) {
		
		float[] res = new float[val[0].length];
		for(int i=0; i<val[0].length; i++) {
			res[i] = (float) (-2.0468 + 0.037*val[0][i] + (-1.6 * Math.pow(10, -6)*Math.pow(val[0][i], 2)));			
		}
		return res;
	}

	@Override
	public String[] getParameterNames() {

		String[] res = {"TelosB Humidity"};
		return res;
	}

	@Override
	public String[] getSettingNames() {

		String[] res = {};
		return res;
	}

	@Override
	public float[] getDefaultSettings() {

		float[] res = {};
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
