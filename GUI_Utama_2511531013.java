package Pekan7_2511531013;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUI_Utama_2511531013 extends JFrame {
    private static final long serialVersionUID = 1L;

    private ArrayList<Mahasiswa_2511531013> dataMahasiswa_1013 = new ArrayList<>();

    private JTextField namaField_1013, nimField_1013, prodiField_1013;
    private JButton tambahButton_1013, hapusButton_1013, sortingButton_1013;
    private JComboBox<String> comboSorting_1013;
    private JTable tabelMahasiswa_1013;
    private DefaultTableModel modelTabel_1013;
    private JTextArea prosesArea_1013;

    public GUI_Utama_2511531013() {
        setTitle("Sorting Nama Mahasiswa - 2511531013");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        // panel input data mahasiswa
        JPanel inputPanel_1013 = new JPanel(new GridLayout(4, 2, 5, 5));
        inputPanel_1013.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));

        namaField_1013 = new JTextField();
        nimField_1013 = new JTextField();
        prodiField_1013 = new JTextField();

        inputPanel_1013.add(new JLabel("Nama Mahasiswa"));
        inputPanel_1013.add(namaField_1013);

        inputPanel_1013.add(new JLabel("NIM Mahasiswa"));
        inputPanel_1013.add(nimField_1013);

        inputPanel_1013.add(new JLabel("Program Studi"));
        inputPanel_1013.add(prodiField_1013);

        tambahButton_1013 = new JButton("Tambah Data");
        hapusButton_1013 = new JButton("Hapus Data");

        inputPanel_1013.add(tambahButton_1013);
        inputPanel_1013.add(hapusButton_1013);

        // tabel untuk menampilkan data mahasiswa
        modelTabel_1013 = new DefaultTableModel(new String[]{"Nama", "NIM", "Prodi"}, 0);

        // panel sorting
        JPanel sortingPanel_1013 = new JPanel(new FlowLayout());
        comboSorting_1013 = new JComboBox<>(
                new String[]{"Insertion Sort", "Selection Sort", "Bubble Sort"}
        );
        sortingButton_1013 = new JButton("Mulai Sorting");

        sortingPanel_1013.add(new JLabel("Pilih Algoritma Sorting: "));
        sortingPanel_1013.add(comboSorting_1013);
        sortingPanel_1013.add(sortingButton_1013);

        // area untuk menampilkan langkah sorting
        prosesArea_1013 = new JTextArea(12, 30);
        prosesArea_1013.setEditable(false);
        prosesArea_1013.setFont(new Font("Monospaced", Font.PLAIN, 13));
        JScrollPane scrollProses_1013 = new JScrollPane(prosesArea_1013);
        scrollProses_1013.setBorder(BorderFactory.createTitledBorder("Proses Sorting"));

        getContentPane().add(inputPanel_1013, BorderLayout.NORTH);
        getContentPane().add(sortingPanel_1013, BorderLayout.SOUTH);
        getContentPane().add(scrollProses_1013, BorderLayout.EAST);
        tabelMahasiswa_1013 = new JTable(modelTabel_1013);
        JScrollPane scrollTabel_1013 = new JScrollPane(tabelMahasiswa_1013);
        getContentPane().add(scrollTabel_1013, BorderLayout.CENTER);

        tambahButton_1013.addActionListener(e -> tambahData_1013());
        hapusButton_1013.addActionListener(e -> hapusData_1013());
        sortingButton_1013.addActionListener(e -> mulaiSorting_1013());
    }

    // method untuk menambahkan data mahasiswa
    private void tambahData_1013() {
        String nama_1013 = namaField_1013.getText().trim();
        String nim_1013 = nimField_1013.getText().trim();
        String prodi_1013 = prodiField_1013.getText().trim();

        if (nama_1013.isEmpty() || nim_1013.isEmpty() || prodi_1013.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua data harus diisi!");
            return;
        }

        Mahasiswa_2511531013 mhs_1013 =
                new Mahasiswa_2511531013(nama_1013, nim_1013, prodi_1013);

        dataMahasiswa_1013.add(mhs_1013);
        tampilkanData_1013();

        namaField_1013.setText("");
        nimField_1013.setText("");
        prodiField_1013.setText("");
    }

    // method untuk menghapus data berdasarkan baris yang dipilih
    private void hapusData_1013() {
        int baris_1013 = tabelMahasiswa_1013.getSelectedRow();

        if (baris_1013 == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
            return;
        }

        dataMahasiswa_1013.remove(baris_1013);
        tampilkanData_1013();
    }

    // method untuk menampilkan data ke tabel
    private void tampilkanData_1013() {
        modelTabel_1013.setRowCount(0);

        for (Mahasiswa_2511531013 mhs_1013 : dataMahasiswa_1013) {
            modelTabel_1013.addRow(new Object[]{
                    mhs_1013.getNama_1013(),
                    mhs_1013.getNim_1013(),
                    mhs_1013.getProdi_1013()
            });
        }
    }

    // method untuk menjalankan sorting sesuai pilihan combo box
    private void mulaiSorting_1013() {
        if (dataMahasiswa_1013.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data mahasiswa masih kosong!");
            return;
        }

        prosesArea_1013.setText("");

        String pilihan_1013 = comboSorting_1013.getSelectedItem().toString();

        if (pilihan_1013.equals("Insertion Sort")) {
            insertionSort_1013();
        } else if (pilihan_1013.equals("Selection Sort")) {
            selectionSort_1013();
        } else {
            bubbleSort_1013();
        }

        tampilkanData_1013();
        prosesArea_1013.append("\nHasil akhir: " + namaToString_1013() + "\n");
    }

    // algoritma insertion sort berdasarkan nama mahasiswa
    private void insertionSort_1013() {
        prosesArea_1013.append("=== INSERTION SORT ===\n");

        for (int i_1013 = 1; i_1013 < dataMahasiswa_1013.size(); i_1013++) {
            Mahasiswa_2511531013 key_1013 = dataMahasiswa_1013.get(i_1013);
            int j_1013 = i_1013 - 1;

            while (j_1013 >= 0 &&
                    dataMahasiswa_1013.get(j_1013).getNama_1013()
                            .compareToIgnoreCase(key_1013.getNama_1013()) > 0) {

                dataMahasiswa_1013.set(j_1013 + 1, dataMahasiswa_1013.get(j_1013));
                j_1013--;
            }

            dataMahasiswa_1013.set(j_1013 + 1, key_1013);

            prosesArea_1013.append("Langkah " + i_1013 + ": "
                    + namaToString_1013() + "\n");
        }
    }

    // algoritma selection sort berdasarkan nama mahasiswa
    private void selectionSort_1013() {
        prosesArea_1013.append("=== SELECTION SORT ===\n");

        for (int i_1013 = 0; i_1013 < dataMahasiswa_1013.size() - 1; i_1013++) {
            int minIndex_1013 = i_1013;

            for (int j_1013 = i_1013 + 1; j_1013 < dataMahasiswa_1013.size(); j_1013++) {
                if (dataMahasiswa_1013.get(j_1013).getNama_1013()
                        .compareToIgnoreCase(dataMahasiswa_1013.get(minIndex_1013).getNama_1013()) < 0) {
                    minIndex_1013 = j_1013;
                }
            }

            Mahasiswa_2511531013 temp_1013 = dataMahasiswa_1013.get(i_1013);
            dataMahasiswa_1013.set(i_1013, dataMahasiswa_1013.get(minIndex_1013));
            dataMahasiswa_1013.set(minIndex_1013, temp_1013);

            prosesArea_1013.append("Pass " + (i_1013 + 1) + ": "
                    + namaToString_1013() + "\n");
        }
    }

    // algoritma bubble sort berdasarkan nama mahasiswa
    private void bubbleSort_1013() {
        prosesArea_1013.append("=== BUBBLE SORT ===\n");

        for (int i_1013 = 0; i_1013 < dataMahasiswa_1013.size() - 1; i_1013++) {
            for (int j_1013 = 0; j_1013 < dataMahasiswa_1013.size() - i_1013 - 1; j_1013++) {
                if (dataMahasiswa_1013.get(j_1013).getNama_1013()
                        .compareToIgnoreCase(dataMahasiswa_1013.get(j_1013 + 1).getNama_1013()) > 0) {

                    Mahasiswa_2511531013 temp_1013 = dataMahasiswa_1013.get(j_1013);
                    dataMahasiswa_1013.set(j_1013, dataMahasiswa_1013.get(j_1013 + 1));
                    dataMahasiswa_1013.set(j_1013 + 1, temp_1013);
                }
            }

            prosesArea_1013.append("Pass " + (i_1013 + 1) + ": "
                    + namaToString_1013() + "\n");
        }
    }

    // method untuk menampilkan nama mahasiswa dalam bentuk array
    private String namaToString_1013() {
        String hasil_1013 = "[";

        for (int i_1013 = 0; i_1013 < dataMahasiswa_1013.size(); i_1013++) {
            hasil_1013 += dataMahasiswa_1013.get(i_1013).getNama_1013();

            if (i_1013 < dataMahasiswa_1013.size() - 1) {
                hasil_1013 += ", ";
            }
        }

        hasil_1013 += "]";
        return hasil_1013;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUI_Utama_2511531013 gui_1013 =
                    new GUI_Utama_2511531013();

            gui_1013.setVisible(true);
        });
    }
}