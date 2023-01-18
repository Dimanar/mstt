package laba2.agent.impl.aprog.simplerule;

import laba2.agent.impl.ObjectWithDynamicAttributes;

/**
 * Implementation of a NOT condition.
 *
 * @author Ciaran O'Reilly
 */
public class NOTCondition extends Condition {
	private Condition con;

	public NOTCondition(Condition con) {
		assert (null != con);

		this.con = con;
	}

	@Override
	public boolean evaluate(ObjectWithDynamicAttributes p) {
		return (!con.evaluate(p));
	}

	@Override
	public String toString() {
		return "![" + con + "]";
	}
}