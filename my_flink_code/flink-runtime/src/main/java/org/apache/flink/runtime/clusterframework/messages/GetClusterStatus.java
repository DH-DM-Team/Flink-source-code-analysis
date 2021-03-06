/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.runtime.clusterframework.messages;

/**
 * 发送到资源管理器的消息，以请求一个{@code GetClusterStatusResponse}，
 * 其中包含当前任务管理器的数量和任务槽的总数。
 * Message sent to the resource manager to request a {@code GetClusterStatusResponse} which contains
 * the current number of task managers and the total number of task slots.
 */
public class GetClusterStatus implements java.io.Serializable {

	private static final long serialVersionUID = 7808628311617273755L;

	/** The singleton instance */
	private static final GetClusterStatus INSTANCE = new GetClusterStatus();

	/**
	 * Gets the singleton instance.
	 * @return The singleton instance.
	 */
	public static GetClusterStatus getInstance() {
		return INSTANCE;
	}

	// ------------------------------------------------------------------------

	/** Private constructor to prevent instantiation */
	private GetClusterStatus() {}

	// ------------------------------------------------------------------------

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj.getClass() == GetClusterStatus.class;
	}

	@Override
	public int hashCode() {
		return 91;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	/**
	 * Read resolve to preserve the singleton object property.
	 */
	private Object readResolve() throws java.io.ObjectStreamException {
		return INSTANCE;
	}
}
