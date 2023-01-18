package laba2.agent.impl;

import laba2.agent.State;

/**
 * @author Ciaran O'Reilly
 */
public class DynamicState extends ObjectWithDynamicAttributes implements State {
	public DynamicState() {
	}

	@Override
	public String describeType() {
		return State.class.getSimpleName();
	}
}