package Pekan7_2511531013;

import java.awt.*;
import javax.swing.*;

public class InsertionSortGUI_2511531013 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array_1013;
	private JLabel [] labelArray_1013;
	private JButton stepButton_1013, resetButton_1013, setButton_1013;
	private JTextField inputField_1013;
	private JPanel panelArray_1013;
	private JTextArea stepArea_1013;
			
	private int i_1013 = 1 ,j_1013;
	private boolean sorting_1013 = false;
	private int stepCount_1013 = 1;
			
	public InsertionSortGUI_2511531013() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// Panel input
		JPanel inputPanel_1013 = new JPanel(new FlowLayout());
		inputField_1013 = new JTextField(30);
		setButton_1013 = new JButton("Set Array");
		inputPanel_1013.add(new JLabel("Masukkan angka (pisahkan dengan koma): "));
		inputPanel_1013.add(inputField_1013);
		inputPanel_1013.add(setButton_1013);

		// Panel array visual
		panelArray_1013 = new JPanel();
		panelArray_1013.setLayout(new FlowLayout());

		// Panel kontrol
		JPanel controlPanel_1013 = new JPanel();
		stepButton_1013 = new JButton("Langkah Selanjutnya");
		resetButton_1013 = new JButton("Reset");
		stepButton_1013.setEnabled(false);
    		controlPanel_1013.add(stepButton_1013);
    		controlPanel_1013.add(resetButton_1013);
    		
    		// Area teks untuk log langkah-langkah
    		stepArea_1013 = new JTextArea(8, 60);
    		stepArea_1013.setEditable(false);
    		stepArea_1013.setFont(new Font("Monospaced", Font.PLAIN, 14));
    		JScrollPane scrollPane_1013 = new JScrollPane(stepArea_1013);

    		// Tambahkan panel ke frame
    		add(inputPanel_1013, BorderLayout.NORTH);
    		add(panelArray_1013, BorderLayout.CENTER);
    		add(controlPanel_1013, BorderLayout.SOUTH);
    		add(scrollPane_1013, BorderLayout.EAST);

    		// Event Set Array
    		setButton_1013.addActionListener(e -> setArrayFromInput());

    		// Event Langkah Selanjutnya
    		stepButton_1013.addActionListener(e -> performStep());

    		// Event Reset
    		resetButton_1013.addActionListener(e -> reset());

	}
	private void setArrayFromInput() {
	    String text_1013 = inputField_1013.getText().trim();
	    if (text_1013.isEmpty()) return;
	    String[] parts_1013 = text_1013.split(",");
	    array_1013 = new int[parts_1013.length];
	    try {
	        for (int k_1013 = 0; k_1013 < parts_1013.length; k_1013++) {
	            array_1013[k_1013] = Integer.parseInt(parts_1013[k_1013].trim());
	        }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan "
	                + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    
	    i_1013 = 1;
	    stepCount_1013 = 1;
	    sorting_1013 = true;
	    stepButton_1013.setEnabled(true);
	    stepArea_1013.setText("");
	    panelArray_1013.removeAll();
	    
	    labelArray_1013 = new JLabel[array_1013.length];
	    for (int k_1013 = 0; k_1013 < array_1013.length; k_1013++) {
	        labelArray_1013[k_1013] = new JLabel(String.valueOf(array_1013[k_1013]));
	        labelArray_1013[k_1013].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_1013[k_1013].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_1013[k_1013].setPreferredSize(new Dimension(50, 50));
	        labelArray_1013[k_1013].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_1013.add(labelArray_1013[k_1013]);
	    }
	    
	    panelArray_1013.revalidate();
	    panelArray_1013.repaint();
	}

	private void performStep() {
		if (i_1013 < array_1013.length && sorting_1013) {
			int key_1013 = array_1013[i_1013];
			j_1013 = i_1013 - 1;
			
			StringBuilder stepLog = new StringBuilder();
			stepLog.append("Langkah").append(stepCount_1013).
			append(": Memasukkan ").append(key_1013).append("\n");
			
			while ( j_1013 >= 0 && array_1013[j_1013] > key_1013) {
				array_1013 [j_1013 + 1] = array_1013[j_1013];
				j_1013--;
			}
			array_1013[j_1013 + 1] = key_1013;
			
			updateLabels();
			stepLog.append("Hasil: ").append(arrayToString(array_1013)).append("\n\n");
			stepArea_1013.append(stepLog.toString());
			
			i_1013++;
			stepCount_1013++;
			
			if (i_1013 == array_1013.length) {
				sorting_1013= false;
				stepButton_1013.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting selesai!");
			}
		}
	}
	private void updateLabels() {
	    for (int k_1013 = 0; k_1013 < array_1013.length; k_1013++) {
	        labelArray_1013[k_1013].setText(String.valueOf(array_1013[k_1013]));
	    }
	}

	private void reset() {
	    inputField_1013.setText("");
	    panelArray_1013.removeAll();
	    panelArray_1013.revalidate();
	    panelArray_1013.repaint();
	    stepArea_1013.setText("");
	    stepButton_1013.setEnabled(false);
	    sorting_1013 = false;
	    i_1013 = 1;
	    stepCount_1013 = 1;
	}

	private String arrayToString(int[] arr) {
	    StringBuilder sb = new StringBuilder();
	    for (int k = 0; k < arr.length; k++) {
	        sb.append(arr[k]);
	        if (k < arr.length - 1) sb.append(", ");
	    }
	    return sb.toString();
	}
}




