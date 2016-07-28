/*
 * Copyright 2012 International Business Machines Corp.
 * 
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package com.ibm.jbatch.tck.artifacts.reusable;

public class MyCounter {

	public int getBeforeCount() {
		return beforeCount;
	}
	public void incrementBeforeCount() {
		this.beforeCount++;
	}
	public int getAfterCount() {
		return afterCount;
	}
	public void incrementAfterCount() {
		this.afterCount++;
	}
	private int beforeCount = 0;
	private int afterCount = 0;
}
