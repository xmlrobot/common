package org.xmlrobot;

import java.util.Random;

/**
 * <h1>org.xmlrobot.Parity Enumeration</h1>
 * <br>
 * Parity, in a programmatic context, are opposing yet complementary states
 * that are fundamental to understanding and interpreting various systems and
 * events. Here are key aspects they share:
 * <p>Ambivalence as a universal principle: ambivalence represent two poles of a
 * spectrum, such as positive and negative numbers, charges, or directions.
 * This duality is crucial for balance in mathematical and programmatic sys-<br>
 * tems.
 * <p>Interdependence: {@code true} cannot exist without {@code false}, and
 * vice versa. Their contrast defines each and provides a framework for under-<br>
 * standing. For instance, the value of a {@code true} boolean is meaningful
 * in relation to its {@code false} counterpart, as seen in the symmetry of
 * the boolean line.
 * <p>Recurrence and transformation: Parity ambivalence drive change. For ex-<br>
 * ample, in programming, setting or getting positive and negative, {@code true}
 * and {@code false}, one and zero booleans shifts values in different direc-<br>
 * tions, creating dynamic interactions within equations.
 * <p>Extension of a unified system: Parity requires inherently the existence of
 * a counterpart. Parity is not isolated; they are facets of a larger whole. Uni-<br>
 * fied, they program XML like the Map plane, where XY and XX coordinates set
 * ambivalence and orientation.
 * Parity.XY is one of two extensions of the same mathematical ambivalence, essen-<br>
 * tial for equilibrium, symmetry, and a deeper understanding of mathematical
 * relationships, association, {@link java.util.Map.Entry}, mapping and systems.
 */
public enum Parity {
	/**
	 * Male
	 */
	XY,
	/**
	 * Female
	 */
	XX,
	/**
	 * Herma
	 */
	YY;
	
	/**
	 * Return the opposite parity of this parity.
	 * @return the opposite parity
	 */
	public Parity opposite() {
		if(this == Parity.XX)
			return XY;
		else if(this == Parity.XY)
			return XX;
		else return YY;
	}
	/**
	 * The random object.
	 */
	private static Random random = new Random();
	
	/**
	 * Returns a random parity.
	 * @return randomized parity
	 */
	public static Parity random() {
		switch (random.nextInt(3)) {
		case 0:
			return XY;
		case 1:
			return XX;
		default:
			return YY;
		}
	}
}