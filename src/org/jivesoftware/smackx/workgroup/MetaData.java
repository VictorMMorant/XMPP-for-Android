/**
 * $Revision$
 * $Date$
 *
 * Copyright 2003-2007 Jive Software.
 *
 * All rights reserved. Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jivesoftware.smackx.workgroup;

import java.util.Map;

import org.jivesoftware.smack.packet.PacketExtension;
import org.jivesoftware.smackx.workgroup.util.MetaDataUtils;

/**
 * MetaData packet extension.
 */
public class MetaData implements PacketExtension {

	/**
	 * Element name of the packet extension.
	 */
	public static final String ELEMENT_NAME = "metadata";

	/**
	 * Namespace of the packet extension.
	 */
	public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";

	private final Map<String, ?> metaData;

	public MetaData(Map<String, ?> metaData) {
		this.metaData = metaData;
	}

	@Override
	public String getElementName() {
		return ELEMENT_NAME;
	}

	/**
	 * @return the Map of metadata contained by this instance
	 */
	public Map<String, ?> getMetaData() {
		return metaData;
	}

	@Override
	public String getNamespace() {
		return NAMESPACE;
	}

	@Override
	public String toXML() {
		return MetaDataUtils.serializeMetaData(getMetaData());
	}
}