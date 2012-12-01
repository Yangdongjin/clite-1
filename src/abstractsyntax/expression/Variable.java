package abstractsyntax.expression;


/**
 * Variable = String id
 */
public class Variable extends Expression {
	private String id;

	public Variable(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		String s = ((Variable) obj).id;
		return id.equals(s); // case-sensitive identifiers
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

}
