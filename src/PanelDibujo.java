import javax.swing.*;
import javax.swing.border.Border;   
import java.awt.*;

public class PanelDibujo extends JPanel{
	
	/**Calcula los vértices para un polígono de número de lados n (comprendido entre PoligonoModelo.MINLADOS y PoligonoModelo.MAXLADOS)	 
	 *  Se utilizan las coordenadas del panel (origen en la esquina superior izquierda) y coordenadas polares tomando como origen el centro	 
	 *  del panel.	 
	 * 	 
	 * @param n: número de lados del polígono a dibujar. 
	 * Precondicion: PoligonoModelo.MINLADOS <= n <= PoligonoModelo.MAXLADOS	
	 *  
	 * @return Vértices del polígono en coordenadas del panel actual. 
	 * int[0] es un array con n componentes donde se almacenan	 
	 * las abcisas de los vértices del polígono. En int[1] se almacenan las ordenadas.	 */	
		
	private int[][] calcularVertices(int n){		
		/* 		 */		
		int VIEW_WIDTH = this.getWidth();		
		int VIEW_HEIGHT = this.getHeight();		
		int centro_x = VIEW_WIDTH/2; 		
		int centro_y = VIEW_HEIGHT/2;		
		int VERTICAL_SPACE=20;		
		
		//int[0] almacena las x e int[1] las y	
		int[][] result = new int[2][n];		
		result[0][0] = centro_x;		
		result[1][0] = 2*VERTICAL_SPACE;		
		//Calculo las coordenadas polares del primer punto del polígono 
		//respecto al origen en el centro del panel	
		//Radio:		
		int r = centro_y - 2*VERTICAL_SPACE;		
		// ángulo. 		
		float beta = (float)Math.PI/2;		
		// ángulo entre dos vértices del polígono		
		float alfa = 2*(float)Math.PI/n; 		
		// Calculation of the rest of points for this polygon en coordenas S1		
		for (int j=1; j < n; j++){			
			result[0][j] = centro_x + (int)(r*Math.cos(beta + j*alfa));			
			result[1][j] = centro_y - (int)(r*Math.sin(beta + j*alfa));		
			}		
		return result;	
		}

}
