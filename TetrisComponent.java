package Homework02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

public class TetrisComponent extends JComponent {

	private int shape;
	private Color color;
	private int or;

	private int X4;
	private int X3;
	private int X2;
	private int X1;
	private int Y4;
	private int Y3;
	private int Y2;
	private int Y1;

	/**
	 * this accepts shape and color of the Tetromino
	 * 
	 * @param int   shape
	 * @param Color color
	 */
	public void setTetromino(int shape, Color color) { // is this redundant
		this.shape = shape;
		this.color = color;
	}

	/**
	 * this decides which rotation to choose for the shape
	 * 
	 * @param int or
	 */
	public void pickRotation(int or) {
		this.or = or;

	}

	/**
	 * This sets X and Y coordinates depending on the size of the block
	 * 
	 * @param int X4
	 * @param int X3
	 * @param int X2
	 * @param int Y2
	 * @param int Y1
	 */
	public void randomXY(int X4, int X3, int X2, int X1, int Y4, int Y3, int Y2, int Y1) {
		this.X4 = X4;
		this.X3 = X3;
		this.X2 = X2;
		this.X1 = X1;
		this.Y4 = Y4;
		this.Y3 = Y3;
		this.Y2 = Y2;
		this.Y1 = Y1;
	}

	/**
	 * this somehow allows for the input of shapes and drawing and filling
	 */
	public void paintComponent(Graphics g) {
		// Casts g as a Graphics2D object, allows us to draw/fill with shape

		Graphics2D g2 = (Graphics2D) g;

		// 000
		// --0

		if (this.shape == 0) {
			if (or == 0) {

				int n = -100;
				for (int i = 0; i < 4; i++) {
					n += 100;
					if (i != 3) {

						Rectangle2D.Double r = new Rectangle2D.Double(n + X3, 0 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						Rectangle2D.Double r2 = new Rectangle2D.Double(200 + X3, 100 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);

					}

				}
			}

			// -0
			// -0
			// 00
			else if (or == 1) {
				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i < 1) {
						n += 100;

						Rectangle2D.Double r = new Rectangle2D.Double(n + X2, 200 + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						m += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(100 + X2, m + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);

					}
				}
			}
			// 0--
			// 000
			else if (or == 2) {
				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i == 0) {
						n += 100;

						Rectangle2D.Double r = new Rectangle2D.Double(0 + X3, 0 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						m += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(m + X3, 100 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);

					}
				}
			}
			// 00
			// 0
			// 0
			else if (or == 3) {
				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i == 3) {
						n += 100;

						Rectangle2D.Double r = new Rectangle2D.Double(100 + X2, 0 + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						m += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(0 + X2, m + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);

					}
				}
			}
		}

		// 0000

		else if (this.shape == 1) {
			if (or == 0 || or == 1) {
				int n = -100;
				for (int i = 0; i < 4; i++) {
					n += 100;
					Rectangle2D.Double r = new Rectangle2D.Double(n + X4, 0 + Y1, 100, 100);
					g2.setColor(color);
					g2.fill(r);
					g2.setColor(Color.BLACK);
					g2.draw(r);

				}
			}
			// -0
			// -0
			// -0
			// -0
			if (or == 2 || or == 3) {
				int n = -100;
				for (int i = 0; i < 4; i++) {
					n += 100;
					Rectangle2D.Double r = new Rectangle2D.Double(0 + X1, n + Y4, 100, 100);
					g2.setColor(color);
					g2.fill(r);
					g2.setColor(Color.BLACK);
					g2.draw(r);

				}
			}
		}
		// 00
		// 00

		else if (this.shape == 2) {

			int n = -100;
			int m = -100;
			for (int i = 0; i < 4; i++) {
				n += 100;
				if (i < 2) {

					Rectangle2D.Double r = new Rectangle2D.Double(n + X2, 0 + Y2, 100, 100);
					g2.setColor(color);
					g2.fill(r);
					g2.setColor(Color.BLACK);
					g2.draw(r);

				} else {
					m += 100;
					Rectangle2D.Double r2 = new Rectangle2D.Double(m + X2, 100 + Y2, 100, 100);
					g2.setColor(color);
					g2.fill(r2);
					g2.setColor(Color.BLACK);
					g2.draw(r2);

				}

			}

		}
		// 000
		// 0--

		else if (this.shape == 3) {
			if (or == 0) {

				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i > 1) {
						m += 100;

						Rectangle2D.Double r = new Rectangle2D.Double(0 + X3, m + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						n += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(n + 100 + X3, 0 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);

					}

				}

			}
			// 0
			// 0
			// 00
			else if (or == 1) {
				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i == 3) {
						n += 100;

						Rectangle2D.Double r = new Rectangle2D.Double(100 + X2, 200 + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						m += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(0 + X2, m + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);

					}
				}
			}
			// --0
			// 000
			else if (or == 2) {
				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i == 0) {
						n += 100;

						Rectangle2D.Double r = new Rectangle2D.Double(200 + X3, 0 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						m += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(m + X3, 100 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);

					}
				}
			}
			// 00
			// -0
			// -0
			else if (or == 3) {
				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i == 3) {
						n += 100;

						Rectangle2D.Double r = new Rectangle2D.Double(0 + X2, 0 + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						m += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(100 + X2, m + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);

					}
				}
			}
		}
		// 000
		// -0

		else if (this.shape == 4) {

			if (or == 0) {

				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i < 3) {
						m += 100;

						Rectangle2D.Double r = new Rectangle2D.Double(m + X3, 0 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						n += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(100 + X3, 100 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);
					}

				}

			}

			// 0
			// 00
			// 0
			if (or == 1) {

				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i == 3) {
						m += 200;

						Rectangle2D.Double r = new Rectangle2D.Double(100 + X2, 100 + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						n += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(0 + X2, n + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);
					}

				}

			}

			// -0
			// 000
			if (or == 2) {

				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i == 3) {
						m += 200;

						Rectangle2D.Double r = new Rectangle2D.Double(100 + X3, 0 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						n += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(n + X3, 100 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);
					}

				}

			}
			// -0
			// 00
			// -0
			if (or == 3) {

				int n = -100;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					if (i == 3) {
						m += 200;

						Rectangle2D.Double r = new Rectangle2D.Double(0 + X2, 100 + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						n += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(100 + X2, n + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);
					}

				}

			}

		}
		// 00
		// -00

		else if (this.shape == 5) {
			if (or == 0 || or == 1) {

				int n = -100;
				int m = 0;
				for (int i = 0; i < 4; i++) {
					n += 100;
					if (i < 2) {

						Rectangle2D.Double r = new Rectangle2D.Double(n + X3, 0 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						m += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(m + X3, 100 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);

					}
				}

			}
			// -0
			// 00
			// 0
			if (or == 2 || or == 3) {

				int n = 0;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					n += 100;
					if (i < 2) {

						Rectangle2D.Double r = new Rectangle2D.Double(0 + X2, n + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						m += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(100 + X2, m + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);

					}
				}

			}

		}
		// -00
		// 00

		else if (this.shape == 6) {
			if (or == 0 || or == 1) {

				int n = -200;
				int m = -100;
				for (int i = 0; i < 4; i++) {
					n += 100;
					if (i > 1) {

						Rectangle2D.Double r = new Rectangle2D.Double(n + X3, 0 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						m += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(m + X3, 100 + Y2, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);
					}

				}

			}
			//0
			//00
			//-0
			if (or == 2 || or == 3) {

				int n = -100;
				int m = 0;
				for (int i = 0; i < 4; i++) {
					
					if (i > 1) {
						n += 100;
						Rectangle2D.Double r = new Rectangle2D.Double(0 + X2, n + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r);
						g2.setColor(Color.BLACK);
						g2.draw(r);

					} else {
						m += 100;
						Rectangle2D.Double r2 = new Rectangle2D.Double(100 + X2, m + Y3, 100, 100);
						g2.setColor(color);
						g2.fill(r2);
						g2.setColor(Color.BLACK);
						g2.draw(r2);
					}

				}

			}

		}
	}

	private static final long serialVersionUID = 1L;
}