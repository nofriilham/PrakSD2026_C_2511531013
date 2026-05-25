package Pekan8_2511531013;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BubleSortGUI_2511531013 extends JFrame {

    private JTextField inputField_1013;
    private JButton setButton_1013;
    private JButton stepButton_1013;
    private JButton resetButton_1013;
    private JTextArea stepArea_1013;
    private JPanel panelArray_1013;

    private int[] array_1013;
    private JLabel[] labelArray_1013;

    private int i_1013 = 0;
    private int j_1013 = 0;
    private int stepCount_1013 = 1;
    private boolean sorting_1013 = false;

    public BubleSortGUI_2511531013() {
        setTitle("Visualisasi Bubble Sort");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Panel input bagian atas
        JPanel inputPanel = new JPanel(new FlowLayout());

        JLabel inputLabel = new JLabel("Masukkan angka (pisahkan dengan koma):");
        inputField_1013 = new JTextField(30);

        setButton_1013 = new JButton("Set Array");
        stepButton_1013 = new JButton("Step");
        resetButton_1013 = new JButton("Reset");

        stepButton_1013.setEnabled(false);

        inputPanel.add(inputLabel);
        inputPanel.add(inputField_1013);
        inputPanel.add(setButton_1013);
        inputPanel.add(stepButton_1013);
        inputPanel.add(resetButton_1013);

        add(inputPanel, BorderLayout.NORTH);

        // Panel untuk menampilkan array
        panelArray_1013 = new JPanel(new FlowLayout());
        panelArray_1013.setPreferredSize(new Dimension(750, 120));
        add(panelArray_1013, BorderLayout.CENTER);

        // Text area untuk menampilkan langkah sorting
        stepArea_1013 = new JTextArea();
        stepArea_1013.setEditable(false);
        stepArea_1013.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(stepArea_1013);
        scrollPane.setPreferredSize(new Dimension(750, 250));

        add(scrollPane, BorderLayout.SOUTH);

        // Event tombol
        setButton_1013.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setArrayFromInput();
            }
        });

        stepButton_1013.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performStep();
            }
        });

        resetButton_1013.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
    }

    private void setArrayFromInput() {
        String text = inputField_1013.getText().trim();

        if (text.isEmpty()) {
            return;
        }

        String[] parts_1013 = text.split(",");
        array_1013 = new int[parts_1013.length];

        try {
            for (int k = 0; k < parts_1013.length; k++) {
                array_1013[k] = Integer.parseInt(parts_1013[k].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan hanya angka yang dipisahkan koma!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        i_1013 = 0;
        j_1013 = 0;
        stepCount_1013 = 1;
        sorting_1013 = true;

        stepButton_1013.setEnabled(true);
        stepArea_1013.setText("");
        panelArray_1013.removeAll();

        labelArray_1013 = new JLabel[array_1013.length];

        for (int k = 0; k < array_1013.length; k++) {
            labelArray_1013[k] = new JLabel(String.valueOf(array_1013[k]));
            labelArray_1013[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_1013[k].setOpaque(true);
            labelArray_1013[k].setBackground(Color.WHITE);
            labelArray_1013[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_1013[k].setPreferredSize(new Dimension(50, 50));
            labelArray_1013[k].setHorizontalAlignment(SwingConstants.CENTER);

            panelArray_1013.add(labelArray_1013[k]);
        }

        panelArray_1013.revalidate();
        panelArray_1013.repaint();
    }

    private void performStep() {
        if (!sorting_1013 || i_1013 >= array_1013.length - 1) {
            sorting_1013 = false;
            stepButton_1013.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }

        resetHighlights();

        StringBuilder stepLog = new StringBuilder();

        labelArray_1013[j_1013].setBackground(Color.CYAN);
        labelArray_1013[j_1013 + 1].setBackground(Color.CYAN);

        if (array_1013[j_1013] > array_1013[j_1013 + 1]) {
            // Swap
            int temp = array_1013[j_1013];
            array_1013[j_1013] = array_1013[j_1013 + 1];
            array_1013[j_1013 + 1] = temp;

            labelArray_1013[j_1013].setBackground(Color.RED);
            labelArray_1013[j_1013 + 1].setBackground(Color.RED);

            stepLog.append("Langkah ").append(stepCount_1013).append(": ")
                    .append("Menukar elemen ke-").append(j_1013)
                    .append(" (").append(array_1013[j_1013 + 1]).append(")")
                    .append(" dengan ke-").append(j_1013 + 1)
                    .append(" (").append(array_1013[j_1013]).append(")\n");

        } else {
            stepLog.append("Langkah ").append(stepCount_1013).append(": ")
                    .append("Tidak ada pertukaran antara ke-")
                    .append(j_1013).append(" dan ke-")
                    .append(j_1013 + 1).append("\n");
        }

        stepLog.append("Hasil: ").append(arrayToString(array_1013)).append("\n\n");
        stepArea_1013.append(stepLog.toString());

        updateLabels();

        j_1013++;

        if (j_1013 >= array_1013.length - 1 - i_1013) {
            j_1013 = 0;
            i_1013++;
        }

        stepCount_1013++;

        if (i_1013 >= array_1013.length - 1) {
            sorting_1013 = false;
            stepButton_1013.setEnabled(false);
            resetHighlights();

            for (JLabel label : labelArray_1013) {
                label.setBackground(Color.GREEN);
            }

            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels() {
        for (int k_1013 = 0; k_1013 < array_1013.length; k_1013++) {
            labelArray_1013[k_1013].setText(String.valueOf(array_1013[k_1013]));
        }
    }

    private void resetHighlights() {
        for (JLabel label : labelArray_1013) {
            label.setBackground(Color.WHITE);
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
        i_1013 = 0;
        j_1013 = 0;
        stepCount_1013 = 1;
    }

    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k]);

            if (k < arr.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BubleSortGUI_2511531013().setVisible(true);
            }
        });
    }
}