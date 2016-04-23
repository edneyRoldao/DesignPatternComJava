package observer.exemplo02;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Classe que coloca as quantidades em um gráfico de barras.
 * Obs: precisa baixar os jars do JFreeChart
 * 	
 * jfreechart-version.jar e jcommon-version.jar
 * 
 * 	http://www.jfree.org/jfreechart/
 * 
 * @author Edney Roldão
 *
 */
public class GraficoBarras implements Observador{ // Observador que terá os gráficoss atualizados
	
	private DefaultCategoryDataset dataset;
	private JFrame frame = new JFrame();

	
	// Construtor
	public GraficoBarras() {
		dataset = new DefaultCategoryDataset();
		JFreeChart chart = ChartFactory.createBarChart("Carteira de acoes", "Siglas", "Quantidade", dataset, PlotOrientation.VERTICAL, false, true, false);
		ChartPanel charPanel = new ChartPanel(chart);
		frame.setContentPane(charPanel);
		frame.setSize(1000, 270);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void mudancaQuantidade(String acao, int quantidade) {
		dataset.setValue(quantidade, "Quantidade", acao);
	}
	
	

}
