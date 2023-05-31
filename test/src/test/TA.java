package test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.text.DecimalFormat;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class TA extends JFrame {

	private JPanel contentPane;
	private JTextField ijo;
	private JButton btnk;
	private JButton btnl;
	private JButton btni;
	private JPanel panelluas;
	private JLabel lblNewLabel;
	private JPanel panelkel;
	private JPanel panelinfo;
	private JButton buttonpersegi;
	private JButton buttonpp;
	private JButton btnLingkaran;
	private JLabel labelpersegi;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TA frame = new TA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TA() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Desktop\\bahan gui\\download.png"));
		setForeground(new Color(0, 64, 64));
		setBackground(new Color(192, 192, 192));
		setTitle("Project Tugas Akhir");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btni = new JButton("");
		ImageIcon icon3 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\i.JPG");
		Image image3 = icon3.getImage().getScaledInstance(45, 34, Image.SCALE_SMOOTH);
		btni.setIcon(new ImageIcon(image3));
		btni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelinfo.isVisible()) {
					panelinfo.setVisible(false);
				} else {
					panelinfo.setVisible(true);
					panelkel.setVisible(false);
					panelluas.setVisible(false);
				}
			}
		});
		btni.setBounds(14, 490, 45, 34);
		contentPane.add(btni);

		btnl = new JButton();
		btnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelluas.isVisible()) {
					panelluas.setVisible(false);
				} else {
					panelluas.setVisible(true);
					panelkel.setVisible(false);
					panelinfo.setVisible(false);
				}
			}
		});
		ImageIcon icon = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\L.png");
		Image image = icon.getImage().getScaledInstance(45, 34, Image.SCALE_SMOOTH);
		btnl.setIcon(new ImageIcon(image));
		btnl.setBounds(14, 30, 45, 34);
		contentPane.add(btnl);

		btnk = new JButton("");
		ImageIcon icon1 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\E.png");
		Image image1 = icon1.getImage().getScaledInstance(45, 34, Image.SCALE_SMOOTH);
		btnk.setIcon(new ImageIcon(image1));
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelkel.isVisible()) {
					panelkel.setVisible(false);
				} else {
					panelkel.setVisible(true);
					panelluas.setVisible(false);
					panelinfo.setVisible(false);
				}
			}
		});
		btnk.setBounds(14, 84, 45, 34);
		contentPane.add(btnk);

		ijo = new JTextField();
		ijo.setBackground(new Color(64, 128, 128));
		ijo.setEditable(false);
		ijo.setBounds(0, 0, 73, 540);
		contentPane.add(ijo);
		ijo.setColumns(10);
		ImageIcon icon4 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\segitiga.png");
		Image image4 = icon4.getImage().getScaledInstance(81, 70, Image.SCALE_SMOOTH);
		ImageIcon icon5 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\bulet.png");
		Image image5 = icon5.getImage().getScaledInstance(81, 70, Image.SCALE_SMOOTH);
		ImageIcon icon6 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\pp.png");
		Image image6 = icon6.getImage().getScaledInstance(81, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\persegi.png");
		Image image7 = icon7.getImage().getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon icon8 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\genjang.png");
		Image image8 = icon8.getImage().getScaledInstance(81, 70, Image.SCALE_SMOOTH);
		ImageIcon icon9 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\trap.png");
		Image image9 = icon9.getImage().getScaledInstance(81, 70, Image.SCALE_SMOOTH);

		panelluas = new JPanel();
		panelluas.setBounds(69, 0, 684, 540);
		panelluas.setLayout(null);
		panelluas.setBackground(new Color(0, 0, 128));
		lblNewLabel = new JLabel("Menghitung Luas");
		lblNewLabel.setForeground(new Color(255, 128, 128));
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel.setBounds(277, 10, 158, 20);
		panelluas.add(lblNewLabel);
		contentPane.add(panelluas);

		JTextArea outputluas = new JTextArea();
		outputluas.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		outputluas.setEditable(false);
		outputluas.setBounds(10, 446, 666, 83);
		panelluas.add(outputluas);

		JScrollPane scrollPane = new JScrollPane(outputluas);
		scrollPane.setBounds(10, 446, 666, 83);
		panelluas.add(scrollPane);

		JButton buttonsegitiga = new JButton("Segitiga");
		buttonsegitiga.setBackground(new Color(255, 255, 128));
		buttonsegitiga.setFont(new Font("Sitka Text", Font.BOLD, 11));
		buttonsegitiga.setBounds(81, 139, 121, 21);
		panelluas.add(buttonsegitiga);
		buttonsegitiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alasInput = JOptionPane.showInputDialog(null, "Masukkan Alas Segitiga:", "Input Alas",
						JOptionPane.QUESTION_MESSAGE);
				String tinggiInput = JOptionPane.showInputDialog(null, "Masukkan Tinggi Segitiga:", "Input Tinggi",
						JOptionPane.QUESTION_MESSAGE);
				if (alasInput == null || tinggiInput == null) {
					return;
				}
				if (!alasInput.matches("\\d+(\\.\\d+)?") || !tinggiInput.matches("\\d+(\\.\\d+)?")) {
					outputluas.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double alas = decimalFormat.parse(alasInput).doubleValue();
					double tinggi = decimalFormat.parse(tinggiInput).doubleValue();

					double luas = (alas * tinggi) / 2;

					outputluas.setText(
							"Alas Segitiga: " + alas + "\nTinggi Segitiga: " + tinggi + "\nLuas Segitiga: " + luas);
				} catch (Exception ex) {
					outputluas.setText("Salah input");
				}
			}
		});

		JLabel labelsegitiga = new JLabel("");
		labelsegitiga.setIcon(new ImageIcon(image4));
		labelsegitiga.setBounds(85, 59, 117, 70);
		labelsegitiga.setHorizontalAlignment(JLabel.CENTER);
		labelsegitiga.setVerticalAlignment(JLabel.CENTER);
		panelluas.add(labelsegitiga);

		btnLingkaran = new JButton("Lingkaran");
		btnLingkaran.setBackground(new Color(255, 255, 128));
		btnLingkaran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jariInput = JOptionPane.showInputDialog(null, "Masukkan Jari-jari Lingkaran:", "Input Jari-jari",
						JOptionPane.QUESTION_MESSAGE);
				if (jariInput == null) {
					return;
				}
				if (!jariInput.matches("\\d+(\\.\\d+)?")) {
					outputluas.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double jari = decimalFormat.parse(jariInput).doubleValue();

					double luas = Math.PI * Math.pow(jari, 2);

					outputluas.setText("Jari-jari Lingkaran: " + jari + "\nLuas Lingkaran: " + luas);
				} catch (Exception ex) {
					outputluas.setText("Salah input");
				}
			}
		});
		btnLingkaran.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnLingkaran.setBounds(81, 378, 121, 21);
		panelluas.add(btnLingkaran);

		JLabel labelbulet = new JLabel("");
		labelbulet.setIcon(new ImageIcon(image5));
		labelbulet.setBounds(81, 298, 121, 70);
		labelbulet.setHorizontalAlignment(JLabel.CENTER);
		labelbulet.setVerticalAlignment(JLabel.CENTER);
		panelluas.add(labelbulet);

		JLabel labelpp = new JLabel("");
		labelpp.setIcon(new ImageIcon(image6));
		labelpp.setVerticalAlignment(JLabel.CENTER);
		labelpp.setHorizontalAlignment(JLabel.CENTER);
		labelpp.setBounds(507, 298, 121, 70);
		panelluas.add(labelpp);

		buttonpp = new JButton("Persegi Panjang");
		buttonpp.setBackground(new Color(255, 255, 128));
		buttonpp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String panjangInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Persegi Panjang:",
						"Input Panjang", JOptionPane.QUESTION_MESSAGE);
				String lebarInput = JOptionPane.showInputDialog(null, "Masukkan Lebar Persegi Panjang:", "Input Lebar",
						JOptionPane.QUESTION_MESSAGE);
				if (panjangInput == null || lebarInput == null) {
					return;
				}
				if (!panjangInput.matches("\\d+(\\.\\d+)?") || !lebarInput.matches("\\d+(\\.\\d+)?")) {
					outputluas.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double panjang = decimalFormat.parse(panjangInput).doubleValue();
					double lebar = decimalFormat.parse(lebarInput).doubleValue();

					double luas = panjang * lebar;

					outputluas.setText("Panjang Persegi Panjang: " + panjang + "\nLebar Persegi Panjang: " + lebar
							+ "\nLuas Persegi Panjang: " + luas);
				} catch (Exception ex) {
					outputluas.setText("Salah input");
				}
			}
		});

		buttonpp.setFont(new Font("Sitka Text", Font.BOLD, 11));
		buttonpp.setBounds(507, 378, 121, 21);
		panelluas.add(buttonpp);

		labelpersegi = new JLabel("");
		labelpersegi.setIcon(new ImageIcon(image7));
		labelpersegi.setVerticalAlignment(SwingConstants.CENTER);
		labelpersegi.setHorizontalAlignment(SwingConstants.CENTER);
		labelpersegi.setBounds(507, 59, 121, 70);
		panelluas.add(labelpersegi);

		buttonpersegi = new JButton("Persegi");
		buttonpersegi.setBackground(new Color(255, 255, 128));
		buttonpersegi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sisiInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi Persegi:", "Input Sisi",
						JOptionPane.QUESTION_MESSAGE);
				if (sisiInput == null) {
					return;
				}
				if (!sisiInput.matches("\\d+(\\.\\d+)?")) {
					outputluas.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double sisi = decimalFormat.parse(sisiInput).doubleValue();

					double luas = sisi * sisi;

					outputluas.setText("Panjang Sisi: " + sisi + "\nLuas Persegi: " + luas);
				} catch (Exception ex) {
					outputluas.setText("Salah input");
				}
			}
		});

		buttonpersegi.setFont(new Font("Sitka Text", Font.BOLD, 11));
		buttonpersegi.setBounds(507, 139, 121, 21);
		panelluas.add(buttonpersegi);

		JButton buttonjajargenjang = new JButton("Jajar Genjang");
		buttonjajargenjang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alasInput = JOptionPane.showInputDialog(null, "Masukkan Alas Jajar Genjang:", "Input Alas",
						JOptionPane.QUESTION_MESSAGE);
				String tinggiInput = JOptionPane.showInputDialog(null, "Masukkan Tinggi Jajar Genjang:", "Input Tinggi",
						JOptionPane.QUESTION_MESSAGE);
				if (alasInput == null || tinggiInput == null) {
					return;
				}
				if (!alasInput.matches("\\d+(\\.\\d+)?") || !tinggiInput.matches("\\d+(\\.\\d+)?")) {
					outputluas.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double alas = decimalFormat.parse(alasInput).doubleValue();
					double tinggi = decimalFormat.parse(tinggiInput).doubleValue();

					double luas = alas * tinggi;

					outputluas.setText("Alas Jajar Genjang: " + alas + "\nTinggi Jajar Genjang: " + tinggi
							+ "\nLuas Jajar Genjang: " + luas);
				} catch (Exception ex) {
					outputluas.setText("Salah input");
				}
			}
		});
		buttonjajargenjang.setFont(new Font("Sitka Text", Font.BOLD, 11));
		buttonjajargenjang.setBackground(new Color(255, 255, 128));
		buttonjajargenjang.setBounds(298, 139, 121, 21);
		panelluas.add(buttonjajargenjang);

		JLabel labelgenjang = new JLabel("");
		labelgenjang.setIcon(new ImageIcon(image8));
		labelgenjang.setVerticalAlignment(SwingConstants.CENTER);
		labelgenjang.setHorizontalAlignment(SwingConstants.CENTER);
		labelgenjang.setBounds(298, 59, 117, 70);
		panelluas.add(labelgenjang);

		JLabel labeltrap = new JLabel("");
		labeltrap.setIcon(new ImageIcon(image9));
		labeltrap.setVerticalAlignment(SwingConstants.CENTER);
		labeltrap.setHorizontalAlignment(SwingConstants.CENTER);
		labeltrap.setBounds(302, 298, 117, 70);
		panelluas.add(labeltrap);

		JButton buttontrapesium = new JButton("Trapesium");
		buttontrapesium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alasAtasInput = JOptionPane.showInputDialog(null, "Masukkan Alas Atas Trapesium:",
						"Input Alas Atas", JOptionPane.QUESTION_MESSAGE);
				String alasBawahInput = JOptionPane.showInputDialog(null, "Masukkan Alas Bawah Trapesium:",
						"Input Alas Bawah", JOptionPane.QUESTION_MESSAGE);
				String tinggiInput = JOptionPane.showInputDialog(null, "Masukkan Tinggi Trapesium:", "Input Tinggi",
						JOptionPane.QUESTION_MESSAGE);
				if (alasAtasInput == null || alasBawahInput == null || tinggiInput == null) {
					return;
				}
				if (!alasAtasInput.matches("\\d+(\\.\\d+)?") || !alasBawahInput.matches("\\d+(\\.\\d+)?")
						|| !tinggiInput.matches("\\d+(\\.\\d+)?")) {
					outputluas.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double alasAtas = decimalFormat.parse(alasAtasInput).doubleValue();
					double alasBawah = decimalFormat.parse(alasBawahInput).doubleValue();
					double tinggi = decimalFormat.parse(tinggiInput).doubleValue();

					double luas = (alasAtas + alasBawah) * tinggi / 2;

					outputluas.setText("Alas Atas Trapesium: " + alasAtas + "\nAlas Bawah Trapesium: " + alasBawah
							+ "\nTinggi Trapesium: " + tinggi + "\nLuas Trapesium: " + luas);
				} catch (Exception ex) {
					outputluas.setText("Salah input");
				}
			}
		});
		buttontrapesium.setFont(new Font("Sitka Text", Font.BOLD, 11));
		buttontrapesium.setBackground(new Color(255, 255, 128));
		buttontrapesium.setBounds(298, 375, 121, 21);
		panelluas.add(buttontrapesium);

		panelkel = new JPanel();
		panelkel.setBounds(69, 0, 684, 540);
		panelkel.setLayout(null);
		panelkel.setBackground(new Color(128, 128, 192));
		contentPane.add(panelkel);

		JLabel lblMenghitungKeliling = new JLabel("Menghitung Keliling");
		lblMenghitungKeliling.setForeground(new Color(128, 255, 128));
		lblMenghitungKeliling.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblMenghitungKeliling.setBounds(277, 0, 158, 20);
		panelkel.add(lblMenghitungKeliling);

		JTextArea outputkel = new JTextArea();
		outputkel.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		outputkel.setEditable(false);
		outputkel.setBounds(10, 449, 666, 81);
		panelkel.add(outputkel);

		JScrollPane scrollPanekel = new JScrollPane(outputkel);
		scrollPanekel.setBounds(10, 449, 666, 81);
		panelkel.add(scrollPanekel);

		JButton kelsegitiga = new JButton("Segitiga");
		kelsegitiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sisiAInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi A Segitiga:",
						"Input Sisi A", JOptionPane.QUESTION_MESSAGE);
				String sisiBInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi B Segitiga:",
						"Input Sisi B", JOptionPane.QUESTION_MESSAGE);
				String sisiCInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi C Segitiga:",
						"Input Sisi C", JOptionPane.QUESTION_MESSAGE);
				if (sisiAInput == null || sisiBInput == null || sisiCInput == null) {
					return;
				}
				if (!sisiAInput.matches("\\d+(\\.\\d+)?") || !sisiBInput.matches("\\d+(\\.\\d+)?")
						|| !sisiCInput.matches("\\d+(\\.\\d+)?")) {
					outputkel.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double sisiA = decimalFormat.parse(sisiAInput).doubleValue();
					double sisiB = decimalFormat.parse(sisiBInput).doubleValue();
					double sisiC = decimalFormat.parse(sisiCInput).doubleValue();

					double keliling = sisiA + sisiB + sisiC;

					outputkel.setText("Panjang Sisi A Segitiga: " + sisiA + "\nPanjang Sisi B Segitiga: " + sisiB
							+ "\nPanjang Sisi C Segitiga: " + sisiC + "\nKeliling Segitiga: " + keliling);
				} catch (Exception ex) {
					outputkel.setText("Salah input");
				}
			}
		});
		kelsegitiga.setFont(new Font("Sitka Text", Font.BOLD, 11));
		kelsegitiga.setBackground(new Color(255, 255, 128));
		kelsegitiga.setBounds(81, 129, 121, 21);
		panelkel.add(kelsegitiga);

		JLabel gambarsegitiga = new JLabel("");
		gambarsegitiga.setVerticalAlignment(SwingConstants.CENTER);
		gambarsegitiga.setHorizontalAlignment(SwingConstants.CENTER);
		gambarsegitiga.setBounds(85, 49, 117, 70);
		gambarsegitiga.setIcon(new ImageIcon(image4));
		panelkel.add(gambarsegitiga);

		JButton kellingkaran = new JButton("Lingkaran");
		kellingkaran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jariInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Jari-jari Lingkaran:",
						"Input Jari-jari", JOptionPane.QUESTION_MESSAGE);
				if (jariInput == null) {
					return;
				}
				if (!jariInput.matches("\\d+(\\.\\d+)?")) {
					outputkel.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double jari = decimalFormat.parse(jariInput).doubleValue();

					double keliling = 2 * Math.PI * jari;

					outputkel.setText("Panjang Jari-jari Lingkaran: " + jari + "\nKeliling Lingkaran: " + keliling);
				} catch (Exception ex) {
					outputkel.setText("Salah input");
				}
			}
		});
		kellingkaran.setFont(new Font("Sitka Text", Font.BOLD, 11));
		kellingkaran.setBackground(new Color(255, 255, 128));
		kellingkaran.setBounds(81, 368, 121, 21);
		panelkel.add(kellingkaran);

		JLabel gambarlingkaran = new JLabel("");
		gambarlingkaran.setBounds(81, 288, 121, 70);
		gambarlingkaran.setIcon(new ImageIcon(image5));
		gambarlingkaran.setVerticalAlignment(SwingConstants.CENTER);
		gambarlingkaran.setHorizontalAlignment(SwingConstants.CENTER);
		panelkel.add(gambarlingkaran);

		JLabel gambarpp = new JLabel("");
		gambarpp.setIcon(new ImageIcon(image6));
		gambarpp.setVerticalAlignment(SwingConstants.CENTER);
		gambarpp.setHorizontalAlignment(SwingConstants.CENTER);
		gambarpp.setBounds(507, 288, 121, 70);
		panelkel.add(gambarpp);

		JButton kelpp = new JButton("Persegi Panjang");
		kelpp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String panjangInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Persegi Panjang:",
						"Input Panjang", JOptionPane.QUESTION_MESSAGE);
				String lebarInput = JOptionPane.showInputDialog(null, "Masukkan Lebar Persegi Panjang:", "Input Lebar",
						JOptionPane.QUESTION_MESSAGE);
				if (panjangInput == null || lebarInput == null) {
					return;
				}
				if (!panjangInput.matches("\\d+(\\.\\d+)?") || !lebarInput.matches("\\d+(\\.\\d+)?")) {
					outputkel.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double panjang = decimalFormat.parse(panjangInput).doubleValue();
					double lebar = decimalFormat.parse(lebarInput).doubleValue();

					double keliling = 2 * (panjang + lebar);

					outputkel.setText("Panjang Persegi Panjang: " + panjang + "\nLebar Persegi Panjang: " + lebar
							+ "\nKeliling Persegi Panjang: " + keliling);
				} catch (Exception ex) {
					outputkel.setText("Salah input");
				}
			}
		});
		kelpp.setFont(new Font("Sitka Text", Font.BOLD, 11));
		kelpp.setBackground(new Color(255, 255, 128));
		kelpp.setBounds(507, 368, 121, 21);
		panelkel.add(kelpp);

		JLabel gambarpersegi = new JLabel("");
		gambarpersegi.setIcon(new ImageIcon(image7));
		gambarpersegi.setVerticalAlignment(SwingConstants.CENTER);
		gambarpersegi.setHorizontalAlignment(SwingConstants.CENTER);
		gambarpersegi.setBounds(507, 49, 121, 70);
		panelkel.add(gambarpersegi);

		JButton kelpersegi = new JButton("Persegi");
		kelpersegi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validInput = false;

				while (!validInput) {
					String sisiInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi Persegi:", "Input Sisi",
							JOptionPane.QUESTION_MESSAGE);
					if (sisiInput == null) {
						return;
					}
					if (!sisiInput.matches("\\d+(\\.\\d+)?")) {
						outputkel.setText("Salah input");
					} else {
						validInput = true;
						try {
							DecimalFormat decimalFormat = new DecimalFormat("#.##");
							double sisi = decimalFormat.parse(sisiInput).doubleValue();

							double keliling = 4 * sisi;

							outputkel.setText("Panjang Sisi Persegi: " + sisi + "\nKeliling Persegi: " + keliling);
						} catch (Exception ex) {
							outputkel.setText("Salah input");
						}
					}
				}
			}
		});
		kelpersegi.setFont(new Font("Sitka Text", Font.BOLD, 11));
		kelpersegi.setBackground(new Color(255, 255, 128));
		kelpersegi.setBounds(507, 129, 121, 21);
		panelkel.add(kelpersegi);

		JButton keljajargenjang = new JButton("Jajar Genjang");
		keljajargenjang.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String alasJajargenjangInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Alas Jajargenjang:", "Input Alas", JOptionPane.QUESTION_MESSAGE);
		        String tinggiJajargenjangInput = JOptionPane.showInputDialog(null, "Masukkan Tinggi Jajargenjang:", "Input Tinggi", JOptionPane.QUESTION_MESSAGE);
		        String sisiMiringJajargenjangInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi Miring Jajargenjang:", "Input Sisi Miring", JOptionPane.QUESTION_MESSAGE);
		        if (alasJajargenjangInput == null || tinggiJajargenjangInput == null || sisiMiringJajargenjangInput == null) {
		            return;
		        }
		        if (!alasJajargenjangInput.matches("\\d+(\\.\\d+)?") || !tinggiJajargenjangInput.matches("\\d+(\\.\\d+)?") || !sisiMiringJajargenjangInput.matches("\\d+(\\.\\d+)?")) {
		            outputkel.setText("Salah input");
		            return;
		        }

		        try {
		            DecimalFormat decimalFormat = new DecimalFormat("#.##");
		            double alas = decimalFormat.parse(alasJajargenjangInput).doubleValue();
		            double tinggi = decimalFormat.parse(tinggiJajargenjangInput).doubleValue();
		            double sisiMiring = decimalFormat.parse(sisiMiringJajargenjangInput).doubleValue();

		            double keliling = 2 * (alas + sisiMiring);

		            outputkel.setText("Alas Jajargenjang: " + alas + "\nTinggi Jajargenjang: " + tinggi + "\nSisi Miring Jajargenjang: " + sisiMiring + "\nKeliling Jajargenjang: " + keliling);
		        } catch (Exception ex) {
		            outputkel.setText("Salah input");
		        }
		    }
		});
		keljajargenjang.setFont(new Font("Sitka Text", Font.BOLD, 11));
		keljajargenjang.setBackground(new Color(255, 255, 128));
		keljajargenjang.setBounds(298, 129, 121, 21);
		panelkel.add(keljajargenjang);

		JLabel gambargenjang = new JLabel("");
		gambargenjang.setIcon(new ImageIcon(image8));
		gambargenjang.setVerticalAlignment(SwingConstants.CENTER);
		gambargenjang.setHorizontalAlignment(SwingConstants.CENTER);
		gambargenjang.setBounds(298, 49, 117, 70);
		panelkel.add(gambargenjang);

		JButton keltrap = new JButton("Trapesium");
		keltrap.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String sisiATrapesiumInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi A Trapesium:", "Input Sisi A", JOptionPane.QUESTION_MESSAGE);
		        String sisiBTrapesiumInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi B Trapesium:", "Input Sisi B", JOptionPane.QUESTION_MESSAGE);
		        String sisiCTrapesiumInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi C Trapesium:", "Input Sisi C", JOptionPane.QUESTION_MESSAGE);
		        String sisiDTrapesiumInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi D Trapesium:", "Input Sisi D", JOptionPane.QUESTION_MESSAGE);
		        if (sisiATrapesiumInput == null || sisiBTrapesiumInput == null || sisiCTrapesiumInput == null || sisiDTrapesiumInput == null) {
		            return;
		        }
		        if (!sisiATrapesiumInput.matches("\\d+(\\.\\d+)?") || !sisiBTrapesiumInput.matches("\\d+(\\.\\d+)?") || !sisiCTrapesiumInput.matches("\\d+(\\.\\d+)?") || !sisiDTrapesiumInput.matches("\\d+(\\.\\d+)?")) {
		            outputkel.setText("Salah input");
		            return;
		        }

		        try {
		            DecimalFormat decimalFormat = new DecimalFormat("#.##");
		            double sisiA = decimalFormat.parse(sisiATrapesiumInput).doubleValue();
		            double sisiB = decimalFormat.parse(sisiBTrapesiumInput).doubleValue();
		            double sisiC = decimalFormat.parse(sisiCTrapesiumInput).doubleValue();
		            double sisiD = decimalFormat.parse(sisiDTrapesiumInput).doubleValue();

		            double keliling = sisiA + sisiB + sisiC + sisiD;

		            outputkel.setText("Sisi A Trapesium: " + sisiA + "\nSisi B Trapesium: " + sisiB + "\nSisi C Trapesium: " + sisiC + "\nSisi D Trapesium: " + sisiD + "\nKeliling Trapesium: " + keliling);
		        } catch (Exception ex) {
		            outputkel.setText("Salah input");
		        }
		    }
		});

		keltrap.setFont(new Font("Sitka Text", Font.BOLD, 11));
		keltrap.setBackground(new Color(255, 255, 128));
		keltrap.setBounds(298, 368, 121, 21);
		panelkel.add(keltrap);

		JLabel gambartrap = new JLabel("");
		gambartrap.setIcon(new ImageIcon(image9));
		gambartrap.setVerticalAlignment(SwingConstants.CENTER);
		gambartrap.setHorizontalAlignment(SwingConstants.CENTER);
		gambartrap.setBounds(302, 288, 117, 70);
		panelkel.add(gambartrap);

		panelinfo = new JPanel();
		panelinfo.setBounds(69, 0, 684, 540);
		panelinfo.setLayout(null);
		panelinfo.setBackground(new Color(64, 0, 0));
		contentPane.add(panelinfo);

		JLabel Informasi = new JLabel("Informasi");
		Informasi.setForeground(new Color(128, 255, 128));
		Informasi.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		Informasi.setBounds(286, 11, 74, 20);
		panelinfo.add(Informasi);

		JLabel nama = new JLabel("Nama");
		nama.setForeground(new Color(128, 255, 128));
		nama.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		nama.setBounds(10, 104, 158, 20);
		panelinfo.add(nama);

		JLabel NIM = new JLabel("NIM");
		NIM.setForeground(new Color(128, 255, 128));
		NIM.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		NIM.setBounds(10, 173, 158, 20);
		panelinfo.add(NIM);

		JLabel asal = new JLabel("Asal");
		asal.setForeground(new Color(128, 255, 128));
		asal.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		asal.setBounds(10, 249, 158, 20);
		panelinfo.add(asal);

		JLabel lblDeskripsiSingkat = new JLabel("Deskripsi Singkat");
		lblDeskripsiSingkat.setForeground(new Color(128, 255, 128));
		lblDeskripsiSingkat.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblDeskripsiSingkat.setBounds(10, 371, 158, 20);
		panelinfo.add(lblDeskripsiSingkat);

		JLabel isinama = new JLabel("Syafiq Naufal Musyaffa");
		isinama.setFont(new Font("Tahoma", Font.BOLD, 11));
		isinama.setForeground(new Color(255, 255, 255));
		isinama.setBounds(10, 134, 136, 29);
		panelinfo.add(isinama);

		JLabel isinim = new JLabel("21120122140107");
		isinim.setForeground(Color.WHITE);
		isinim.setFont(new Font("Tahoma", Font.BOLD, 11));
		isinim.setBounds(10, 203, 136, 29);
		panelinfo.add(isinim);

		JLabel isiasal = new JLabel("Jakarta Utara");
		isiasal.setForeground(Color.WHITE);
		isiasal.setFont(new Font("Tahoma", Font.BOLD, 11));
		isiasal.setBounds(10, 279, 136, 29);
		panelinfo.add(isiasal);

		JTextPane deskrips = new JTextPane();
		deskrips.setBackground(Color.GRAY);
		deskrips.setFont(new Font("Serif", Font.PLAIN, 12));
		deskrips.setText(
				"Tugas Akhir yang berjudul Kalkuator Macam\" Bangun Datar Sederhana ini dibuat dengan menggunakan eclipse dengan bahasa pemrograman java. Modul modul yang terpakai dalam program ini adalah Modul 1,Modul 2,Modul 3,Modul 4, Modul 5, dan Modul 8. Konsep dari program ini adalah untuk mempermudah mencari luas dan keliling beberapa bangun\" datar .");
		deskrips.setEditable(false);
		deskrips.setBounds(10, 401, 664, 73);
		panelinfo.add(deskrips);
		panelinfo.setVisible(false);
		panelkel.setVisible(false);

		panelluas.setVisible(false);
	}
}
