/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aligreen_console.model.v20191115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aligreen_console.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddSfacePersonRequest extends RpcAcsRequest<AddSfacePersonResponse> {
	   

	private String personGender;

	private String personType;

	private String dataId;

	private String faceUrl;

	private String callbackSeed;

	private String callbackUrl;

	private String personName;
	public AddSfacePersonRequest() {
		super("aligreen-console", "2019-11-15", "AddSfacePerson");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPersonGender() {
		return this.personGender;
	}

	public void setPersonGender(String personGender) {
		this.personGender = personGender;
		if(personGender != null){
			putQueryParameter("PersonGender", personGender);
		}
	}

	public String getPersonType() {
		return this.personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
		if(personType != null){
			putQueryParameter("PersonType", personType);
		}
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
		if(dataId != null){
			putQueryParameter("DataId", dataId);
		}
	}

	public String getFaceUrl() {
		return this.faceUrl;
	}

	public void setFaceUrl(String faceUrl) {
		this.faceUrl = faceUrl;
		if(faceUrl != null){
			putQueryParameter("FaceUrl", faceUrl);
		}
	}

	public String getCallbackSeed() {
		return this.callbackSeed;
	}

	public void setCallbackSeed(String callbackSeed) {
		this.callbackSeed = callbackSeed;
		if(callbackSeed != null){
			putQueryParameter("CallbackSeed", callbackSeed);
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putQueryParameter("CallbackUrl", callbackUrl);
		}
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
		if(personName != null){
			putQueryParameter("PersonName", personName);
		}
	}

	@Override
	public Class<AddSfacePersonResponse> getResponseClass() {
		return AddSfacePersonResponse.class;
	}

}
