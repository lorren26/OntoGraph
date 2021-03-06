/**
 * Copyright (c) Nine Points Solutions, LLC
 *
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
 * 
 */

package graph.models;

import lombok.Builder;
import lombok.Data;

/**
 * EdgeFlagsModel defines the flags for a property indicating whether it is functional,
 * inverse functional, symmetric, asymmetric, reflexive, irreflexive or transitive.
 * 
 * Lombok Builder allows instantiation with builder().
 * Lombok Data removes need for POJO boilerplate.
 *
 */
@Data
@Builder
public class EdgeFlagsModel {
	
	private boolean asymmetric;
	private boolean functional;
	private boolean inverseFunctional;
	private boolean irreflexive;
	private boolean reflexive;
	private boolean symmetric;
	private boolean transitive;
	private boolean multipleDomains;
	private boolean multipleRanges;


	/**
     * Creates an EdgeFlagsModel with all flags set to false.
     * 
     * @return EdgeFlagsModel
     * 
     */
    public static EdgeFlagsModel createEdgeFlagsFalse() {
    	
    	return EdgeFlagsModel.builder()
    			.asymmetric(false)
    			.functional(false)
    			.inverseFunctional(false)
    			.irreflexive(false)
    			.reflexive(false)
    			.symmetric(false)
    			.transitive(false)
    			.multipleDomains(false)
    			.multipleRanges(false)
    			.build();
    }
}
