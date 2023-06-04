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
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

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
	private JPanel panelhistori;
	private JTextArea outputhistori;

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
		contentPane.setBackground(UIManager.getColor("info"));
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
					panelhistori.setVisible(false);
				}
			}
		});

		JButton btnh = new JButton("");
		ImageIcon icon2 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\histori.png");
		Image image2 = icon2.getImage().getScaledInstance(45, 34, Image.SCALE_SMOOTH);
		btnh.setIcon(new ImageIcon(image2));
		btnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelhistori.isVisible()) {
					panelhistori.setVisible(false);
				} else {
					panelhistori.setVisible(true);
					panelluas.setVisible(false);
					panelkel.setVisible(false);
					panelinfo.setVisible(false);
				}
			}
		});
		btnh.setBounds(14, 140, 45, 34);
		contentPane.add(btnh);
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
					panelhistori.setVisible(false);
				}
			}
		});
		ImageIcon icon = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\L.png");
		Image image = icon.getImage().getScaledInstance(35, 24, Image.SCALE_SMOOTH);
		btnl.setIcon(new ImageIcon(image));
		btnl.setBounds(14, 30, 45, 34);
		contentPane.add(btnl);

		btnk = new JButton("");
		ImageIcon icon1 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\E.png");
		Image image1 = icon1.getImage().getScaledInstance(35, 24, Image.SCALE_SMOOTH);
		btnk.setIcon(new ImageIcon(image1));
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelkel.isVisible()) {
					panelkel.setVisible(false);
				} else {
					panelkel.setVisible(true);
					panelluas.setVisible(false);
					panelinfo.setVisible(false);
					panelhistori.setVisible(false);
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
		Image image7 = icon7.getImage().getScaledInstance(81, 70, Image.SCALE_SMOOTH);
		ImageIcon icon8 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\genjang.png");
		Image image8 = icon8.getImage().getScaledInstance(81, 70, Image.SCALE_SMOOTH);
		ImageIcon icon9 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\trap.png");
		Image image9 = icon9.getImage().getScaledInstance(81, 70, Image.SCALE_SMOOTH);
		ImageIcon icon10 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\bg.png");
		Image imageB = icon10.getImage().getScaledInstance(750, 530, Image.SCALE_SMOOTH);
		ImageIcon Icon11 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\backg.jpg");
		Image ImageBg = Icon11.getImage().getScaledInstance(750, 540, Image.SCALE_SMOOTH);
		ImageIcon Icon12 = new ImageIcon("C:\\Users\\HP\\Desktop\\bahan gui\\backgr.jpg");
		Image ImageBgr = Icon12.getImage().getScaledInstance(750, 540, Image.SCALE_SMOOTH);

		panelluas = new JPanel();
		panelluas.setBorder(UIManager.getBorder("RadioButton.border"));
		panelluas.setBounds(69, 0, 684, 540);
		panelluas.setLayout(null);
		panelluas.setBackground(SystemColor.textHighlight);
		lblNewLabel = new JLabel("Menghitung Luas");
		lblNewLabel.setForeground(new Color(255, 128, 128));
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel.setBounds(277, 10, 158, 20);
		panelluas.add(lblNewLabel);
		contentPane.add(panelluas);

		JTextArea outputluas = new JTextArea();
		outputluas.setBackground(SystemColor.menu);
		outputluas.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		outputluas.setEditable(false);
		outputluas.setBounds(10, 446, 666, 83);
		panelluas.add(outputluas);

		JScrollPane scrollPane = new JScrollPane(outputluas);
		scrollPane.setBounds(10, 449, 666, 81);
		panelluas.add(scrollPane);

		JButton buttonsegitiga = new JButton("Segitiga");
		buttonsegitiga.setForeground(Color.WHITE);
		buttonsegitiga.setBackground(new Color(128, 0, 128));
		buttonsegitiga.setFont(new Font("Sitka Text", Font.BOLD, 11));
		buttonsegitiga.setBounds(81, 129, 121, 21);
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

				try {
					double alas = Double.parseDouble(alasInput);
					double tinggi = Double.parseDouble(tinggiInput);

					Segitiga segitiga = new Segitiga();
					segitiga.setAlas(alas);
					segitiga.setTinggi(tinggi);

					double luas = segitiga.hitungLuas();

					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					String formattedAlas = decimalFormat.format(alas);
					String formattedTinggi = decimalFormat.format(tinggi);
					String formattedLuas = decimalFormat.format(luas);

					outputluas.setText("Alas Segitiga: " + formattedAlas + "\nTinggi Segitiga: " + formattedTinggi
							+ "\nLuas Segitiga: " + formattedLuas);

					// ini untuk menambahkan perhitungan ke outputhistori
					tambahHistori("Alas Segitiga: " + formattedAlas + "\nTinggi Segitiga: " + formattedTinggi
							+ "\nLuas Segitiga: " + formattedLuas + "\n");
				} catch (NumberFormatException ex) {
					outputluas.setText("Salah input");
				}
			}
		});

		JLabel labelsegitiga = new JLabel("");
		labelsegitiga.setBackground(new Color(112, 128, 144));
		labelsegitiga.setIcon(new ImageIcon(image4));
		labelsegitiga.setBounds(85, 49, 117, 70);
		labelsegitiga.setHorizontalAlignment(JLabel.CENTER);
		labelsegitiga.setVerticalAlignment(JLabel.CENTER);
		panelluas.add(labelsegitiga);

		btnLingkaran = new JButton("Lingkaran");
		btnLingkaran.setForeground(Color.WHITE);
		btnLingkaran.setBackground(new Color(128, 0, 128));
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
					double jari = Double.parseDouble(jariInput);

					double luas = Math.PI * Math.pow(jari, 2);

					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					String formattedJari = decimalFormat.format(jari);
					String formattedLuas = decimalFormat.format(luas);

					outputluas.setText("Jari-jari Lingkaran: " + formattedJari + "\nLuas Lingkaran: " + formattedLuas);
					tambahHistori(
							"Jari-jari Lingkaran: " + formattedJari + "\nLuas Lingkaran: " + formattedLuas + "\n");
				} catch (NumberFormatException ex) {
					outputluas.setText("Salah input");
				}
			}
		});
		btnLingkaran.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnLingkaran.setBounds(81, 368, 121, 21);
		panelluas.add(btnLingkaran);

		JLabel labelbulet = new JLabel("");
		labelbulet.setIcon(new ImageIcon(image5));
		labelbulet.setBounds(81, 288, 121, 70);
		labelbulet.setHorizontalAlignment(JLabel.CENTER);
		labelbulet.setVerticalAlignment(JLabel.CENTER);
		panelluas.add(labelbulet);

		JLabel labelpp = new JLabel("");
		labelpp.setIcon(new ImageIcon(image6));
		labelpp.setVerticalAlignment(JLabel.CENTER);
		labelpp.setHorizontalAlignment(JLabel.CENTER);
		labelpp.setBounds(507, 288, 121, 70);
		panelluas.add(labelpp);

		buttonpp = new JButton("Persegi Panjang");
		buttonpp.setForeground(Color.WHITE);
		buttonpp.setBackground(new Color(128, 0, 128));
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
					double panjang = Double.parseDouble(panjangInput);
					double lebar = Double.parseDouble(lebarInput);

					double luas = panjang * lebar;

					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					String formattedPanjang = decimalFormat.format(panjang);
					String formattedLebar = decimalFormat.format(lebar);
					String formattedLuas = decimalFormat.format(luas);

					outputluas.setText("Panjang Persegi Panjang: " + formattedPanjang + "\nLebar Persegi Panjang: "
							+ formattedLebar + "\nLuas Persegi Panjang: " + formattedLuas);
					tambahHistori("Panjang Persegi Panjang: " + formattedPanjang + "\nLebar Persegi Panjang: "
							+ formattedLebar + "\nLuas Persegi Panjang: " + formattedLuas + "\n");
				} catch (NumberFormatException ex) {
					outputluas.setText("Salah input");
				}
			}
		});

		buttonpp.setFont(new Font("Sitka Text", Font.BOLD, 11));
		buttonpp.setBounds(507, 368, 121, 21);
		panelluas.add(buttonpp);

		labelpersegi = new JLabel("");
		labelpersegi.setIcon(new ImageIcon(image7));
		labelpersegi.setVerticalAlignment(SwingConstants.CENTER);
		labelpersegi.setHorizontalAlignment(SwingConstants.CENTER);
		labelpersegi.setBounds(507, 49, 121, 70);
		panelluas.add(labelpersegi);

		buttonpersegi = new JButton("Persegi");
		buttonpersegi.setForeground(Color.WHITE);
		buttonpersegi.setBackground(new Color(128, 0, 128));
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
					double sisi = Double.parseDouble(sisiInput);

					double luas = sisi * sisi;

					String formattedSisi = decimalFormat.format(sisi);
					String formattedLuas = decimalFormat.format(luas);

					outputluas.setText("Sisi Persegi: " + formattedSisi + "\nLuas Persegi: " + formattedLuas);

					tambahHistori("Sisi Persegi: " + formattedSisi + ", \nLuas Persegi: " + formattedLuas + "\n");
				} catch (NumberFormatException ex) {
					outputluas.setText("Salah input");
				}
			}
		});

		buttonpersegi.setFont(new Font("Sitka Text", Font.BOLD, 11));
		buttonpersegi.setBounds(507, 129, 121, 21);
		panelluas.add(buttonpersegi);

		JButton buttonjajargenjang = new JButton("Jajar Genjang");
		buttonjajargenjang.setForeground(Color.WHITE);
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
					double alas = Double.parseDouble(alasInput);
					double tinggi = Double.parseDouble(tinggiInput);

					double luas = alas * tinggi;

					String formattedAlas = decimalFormat.format(alas);
					String formattedTinggi = decimalFormat.format(tinggi);
					String formattedLuas = decimalFormat.format(luas);

					outputluas.setText("Alas Jajar Genjang: " + formattedAlas + "\nTinggi Jajar Genjang: "
							+ formattedTinggi + "\nLuas Jajar Genjang: " + formattedLuas);
					tambahHistori("Alas Jajar Genjang: " + formattedAlas + "\nTinggi Jajar Genjang: " + formattedTinggi
							+ "\nLuas Jajar Genjang: " + formattedLuas + "\n");
				} catch (NumberFormatException ex) {
					outputluas.setText("Salah input");
				}
			}
		});
		buttonjajargenjang.setFont(new Font("Sitka Text", Font.BOLD, 11));
		buttonjajargenjang.setBackground(new Color(128, 0, 128));
		buttonjajargenjang.setBounds(298, 129, 121, 21);
		panelluas.add(buttonjajargenjang);

		JLabel labelgenjang = new JLabel("");
		labelgenjang.setIcon(new ImageIcon(image8));
		labelgenjang.setVerticalAlignment(SwingConstants.CENTER);
		labelgenjang.setHorizontalAlignment(SwingConstants.CENTER);
		labelgenjang.setBounds(298, 49, 117, 70);
		panelluas.add(labelgenjang);

		JLabel labeltrap = new JLabel("");
		labeltrap.setIcon(new ImageIcon(image9));
		labeltrap.setVerticalAlignment(SwingConstants.CENTER);
		labeltrap.setHorizontalAlignment(SwingConstants.CENTER);
		labeltrap.setBounds(302, 288, 117, 70);
		panelluas.add(labeltrap);

		JButton buttontrapesium = new JButton("Trapesium");
		buttontrapesium.setForeground(Color.WHITE);
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
					double alasAtas = Double.parseDouble(alasAtasInput);
					double alasBawah = Double.parseDouble(alasBawahInput);
					double tinggi = Double.parseDouble(tinggiInput);

					double luas = (alasAtas + alasBawah) * tinggi / 2;

					String formattedAlasAtas = decimalFormat.format(alasAtas);
					String formattedAlasBawah = decimalFormat.format(alasBawah);
					String formattedTinggi = decimalFormat.format(tinggi);
					String formattedLuas = decimalFormat.format(luas);

					outputluas.setText("Alas Atas Trapesium: " + formattedAlasAtas + "\nAlas Bawah Trapesium: "
							+ formattedAlasBawah + "\nTinggi Trapesium: " + formattedTinggi + "\nLuas Trapesium: "
							+ formattedLuas);
					tambahHistori("Alas Atas Trapesium: " + formattedAlasAtas + "\nAlas Bawah Trapesium: "
							+ formattedAlasBawah + "\nTinggi Trapesium: " + formattedTinggi + "\nLuas Trapesium: "
							+ formattedLuas + "\n");
				} catch (Exception ex) {
					outputluas.setText("Salah input");
				}
			}
		});
		buttontrapesium.setFont(new Font("Sitka Text", Font.BOLD, 11));
		buttontrapesium.setBackground(new Color(128, 0, 128));
		buttontrapesium.setBounds(298, 368, 121, 21);
		panelluas.add(buttontrapesium);

		JLabel backg = new JLabel("New label");
		backg.setIcon(new ImageIcon(ImageBg));
		backg.setHorizontalAlignment(JLabel.CENTER);
		backg.setVerticalAlignment(JLabel.CENTER);
		backg.setBounds(0, 0, 684, 540);
		panelluas.add(backg);
		panelluas.setVisible(false);

		panelkel = new JPanel();
		panelkel.setBounds(69, 0, 684, 540);
		panelkel.setLayout(null);
		panelkel.setBackground(new Color(128, 128, 192));
		contentPane.add(panelkel);

		JLabel lblMenghitungKeliling = new JLabel("Menghitung Keliling");
		lblMenghitungKeliling.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenghitungKeliling.setBackground(Color.BLACK);
		lblMenghitungKeliling.setForeground(new Color(255, 128, 128));
		lblMenghitungKeliling.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblMenghitungKeliling.setBounds(277, 10, 158, 20);
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
		kelsegitiga.setForeground(Color.WHITE);
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
					double sisiA = Double.parseDouble(sisiAInput);
					double sisiB = Double.parseDouble(sisiBInput);
					double sisiC = Double.parseDouble(sisiCInput);

					double keliling = sisiA + sisiB + sisiC;

					String formattedSisiA = decimalFormat.format(sisiA);
					String formattedSisiB = decimalFormat.format(sisiB);
					String formattedSisiC = decimalFormat.format(sisiC);
					String formattedKeliling = decimalFormat.format(keliling);

					outputkel.setText("Panjang Sisi A Segitiga: " + formattedSisiA + "\nPanjang Sisi B Segitiga: "
							+ formattedSisiB + "\nPanjang Sisi C Segitiga: " + formattedSisiC + "\nKeliling Segitiga: "
							+ formattedKeliling);
					tambahHistori("Panjang Sisi A Segitiga: " + formattedSisiA + "\nPanjang Sisi B Segitiga: "
							+ formattedSisiB + "\nPanjang Sisi C Segitiga: " + formattedSisiC + "\nKeliling Segitiga: "
							+ formattedKeliling + "\n");
				} catch (Exception ex) {
					outputkel.setText("Salah input");
				}
			}
		});
		kelsegitiga.setFont(new Font("Sitka Text", Font.BOLD, 11));
		kelsegitiga.setBackground(Color.BLACK);
		kelsegitiga.setBounds(81, 129, 121, 21);
		panelkel.add(kelsegitiga);

		JLabel gambarsegitiga = new JLabel("");
		gambarsegitiga.setVerticalAlignment(SwingConstants.CENTER);
		gambarsegitiga.setHorizontalAlignment(SwingConstants.CENTER);
		gambarsegitiga.setBounds(85, 49, 117, 70);
		gambarsegitiga.setIcon(new ImageIcon(image4));
		panelkel.add(gambarsegitiga);

		JButton kellingkaran = new JButton("Lingkaran");
		kellingkaran.setForeground(Color.WHITE);
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
					double jari = Double.parseDouble(jariInput);

					double keliling = 2 * Math.PI * jari;

					String formattedJari = decimalFormat.format(jari);
					String formattedKeliling = decimalFormat.format(keliling);

					outputkel.setText("Panjang Jari-jari Lingkaran: " + formattedJari + "\nKeliling Lingkaran: "
							+ formattedKeliling);
					tambahHistori("Panjang Jari-jari Lingkaran: " + formattedJari + "\nKeliling Lingkaran: "
							+ formattedKeliling + "\n");
				} catch (Exception ex) {
					outputkel.setText("Salah input");
				}
			}
		});
		kellingkaran.setFont(new Font("Sitka Text", Font.BOLD, 11));
		kellingkaran.setBackground(Color.BLACK);
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
		kelpp.setForeground(Color.WHITE);
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
					double panjang = Double.parseDouble(panjangInput);
					double lebar = Double.parseDouble(lebarInput);

					double keliling = 2 * (panjang + lebar);

					String formattedPanjang = decimalFormat.format(panjang);
					String formattedLebar = decimalFormat.format(lebar);
					String formattedKeliling = decimalFormat.format(keliling);

					outputkel.setText("Panjang Persegi Panjang: " + formattedPanjang + "\nLebar Persegi Panjang: "
							+ formattedLebar + "\nKeliling Persegi Panjang: " + formattedKeliling);
					tambahHistori("Panjang Persegi Panjang: " + formattedPanjang + "\nLebar Persegi Panjang: "
							+ formattedLebar + "\nKeliling Persegi Panjang: " + formattedKeliling + "\n");
				} catch (Exception ex) {
					outputkel.setText("Salah input");
				}
			}
		});
		kelpp.setFont(new Font("Sitka Text", Font.BOLD, 11));
		kelpp.setBackground(Color.BLACK);
		kelpp.setBounds(507, 368, 121, 21);
		panelkel.add(kelpp);

		JLabel gambarpersegi = new JLabel("");
		gambarpersegi.setIcon(new ImageIcon(image7));
		gambarpersegi.setVerticalAlignment(SwingConstants.CENTER);
		gambarpersegi.setHorizontalAlignment(SwingConstants.CENTER);
		gambarpersegi.setBounds(507, 49, 121, 70);
		panelkel.add(gambarpersegi);

		JButton kelpersegi = new JButton("Persegi");
		kelpersegi.setForeground(Color.WHITE);
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
							double sisi = Double.parseDouble(sisiInput);

							double keliling = 4 * sisi;

							String formattedSisi = decimalFormat.format(sisi);
							String formattedKeliling = decimalFormat.format(keliling);

							outputkel.setText("Panjang Sisi Persegi: " + formattedSisi + "\nKeliling Persegi: "
									+ formattedKeliling);
							tambahHistori("Panjang Sisi Persegi: " + formattedSisi + "\nKeliling Persegi: "
									+ formattedKeliling + "\n");
						} catch (Exception ex) {
							outputkel.setText("Salah input");
						}
					}
				}
			}
		});
		kelpersegi.setFont(new Font("Sitka Text", Font.BOLD, 11));
		kelpersegi.setBackground(Color.BLACK);
		kelpersegi.setBounds(507, 129, 121, 21);
		panelkel.add(kelpersegi);

		JButton keljajargenjang = new JButton("Jajar Genjang");
		keljajargenjang.setForeground(Color.WHITE);
		keljajargenjang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alasJajargenjangInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Alas Jajargenjang:",
						"Input Alas", JOptionPane.QUESTION_MESSAGE);
				String tinggiJajargenjangInput = JOptionPane.showInputDialog(null, "Masukkan Tinggi Jajargenjang:",
						"Input Tinggi", JOptionPane.QUESTION_MESSAGE);
				String sisiMiringJajargenjangInput = JOptionPane.showInputDialog(null,
						"Masukkan Panjang Sisi Miring Jajargenjang:", "Input Sisi Miring",
						JOptionPane.QUESTION_MESSAGE);
				if (alasJajargenjangInput == null || tinggiJajargenjangInput == null
						|| sisiMiringJajargenjangInput == null) {
					return;
				}
				if (!alasJajargenjangInput.matches("\\d+(\\.\\d+)?")
						|| !tinggiJajargenjangInput.matches("\\d+(\\.\\d+)?")
						|| !sisiMiringJajargenjangInput.matches("\\d+(\\.\\d+)?")) {
					outputkel.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double alas = Double.parseDouble(alasJajargenjangInput);
					double tinggi = Double.parseDouble(tinggiJajargenjangInput);
					double sisiMiring = Double.parseDouble(sisiMiringJajargenjangInput);

					double keliling = 2 * (alas + sisiMiring);

					String formattedSisiMiring = decimalFormat.format(sisiMiring);
					String formattedAlas = decimalFormat.format(alas);
					String formattedTinggi = decimalFormat.format(tinggi);
					String formattedKeliling = decimalFormat.format(keliling);

					outputkel.setText("Alas Jajargenjang: " + formattedAlas + "\nTinggi Jajargenjang: "
							+ formattedTinggi + "\nSisi Miring Jajargenjang: " + formattedSisiMiring
							+ "\nKeliling Jajargenjang: " + formattedKeliling);
					tambahHistori("Alas Jajargenjang: " + formattedAlas + "\nTinggi Jajargenjang: " + formattedTinggi
							+ "\nSisi Miring Jajargenjang: " + formattedSisiMiring + "\nKeliling Jajargenjang: "
							+ formattedKeliling + "\n");
				} catch (Exception ex) {
					outputkel.setText("Salah input");
				}
			}
		});
		keljajargenjang.setFont(new Font("Sitka Text", Font.BOLD, 11));
		keljajargenjang.setBackground(Color.BLACK);
		keljajargenjang.setBounds(298, 129, 121, 21);
		panelkel.add(keljajargenjang);

		JLabel gambargenjang = new JLabel("");
		gambargenjang.setIcon(new ImageIcon(image8));
		gambargenjang.setVerticalAlignment(SwingConstants.CENTER);
		gambargenjang.setHorizontalAlignment(SwingConstants.CENTER);
		gambargenjang.setBounds(298, 49, 117, 70);
		panelkel.add(gambargenjang);

		JButton keltrap = new JButton("Trapesium");
		keltrap.setForeground(Color.WHITE);
		keltrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sisiATrapesiumInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi A Trapesium:",
						"Input Sisi A", JOptionPane.QUESTION_MESSAGE);
				String sisiBTrapesiumInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi B Trapesium:",
						"Input Sisi B", JOptionPane.QUESTION_MESSAGE);
				String sisiCTrapesiumInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi C Trapesium:",
						"Input Sisi C", JOptionPane.QUESTION_MESSAGE);
				String sisiDTrapesiumInput = JOptionPane.showInputDialog(null, "Masukkan Panjang Sisi D Trapesium:",
						"Input Sisi D", JOptionPane.QUESTION_MESSAGE);
				if (sisiATrapesiumInput == null || sisiBTrapesiumInput == null || sisiCTrapesiumInput == null
						|| sisiDTrapesiumInput == null) {
					return;
				}
				if (!sisiATrapesiumInput.matches("\\d+(\\.\\d+)?") || !sisiBTrapesiumInput.matches("\\d+(\\.\\d+)?")
						|| !sisiCTrapesiumInput.matches("\\d+(\\.\\d+)?")
						|| !sisiDTrapesiumInput.matches("\\d+(\\.\\d+)?")) {
					outputkel.setText("Salah input");
					return;
				}

				try {
					DecimalFormat decimalFormat = new DecimalFormat("#.##");
					double sisiA = Double.parseDouble(sisiATrapesiumInput);
					double sisiB = Double.parseDouble(sisiBTrapesiumInput);
					double sisiC = Double.parseDouble(sisiCTrapesiumInput);
					double sisiD = Double.parseDouble(sisiDTrapesiumInput);

					double keliling = sisiA + sisiB + sisiC + sisiD;

					String formattedSisiA = decimalFormat.format(sisiA);
					String formattedSisiB = decimalFormat.format(sisiB);
					String formattedSisiC = decimalFormat.format(sisiC);
					String formattedSisiD = decimalFormat.format(sisiD);
					String formattedKeliling = decimalFormat.format(keliling);

					outputkel.setText("Sisi A Trapesium: " + formattedSisiA + "\nSisi B Trapesium: " + formattedSisiB
							+ "\nSisi C Trapesium: " + formattedSisiC + "\nSisi D Trapesium: " + formattedSisiD
							+ "\nKeliling Trapesium: " + formattedKeliling + "\n");
					tambahHistori("Sisi A Trapesium: " + formattedSisiA + "\nSisi B Trapesium: " + formattedSisiB
							+ "\nSisi C Trapesium: " + formattedSisiC + "\nSisi D Trapesium: " + formattedSisiD
							+ "\nKeliling Trapesium: " + formattedKeliling + "\n");
				} catch (Exception ex) {
					outputkel.setText("Salah input");
				}
			}
		});

		keltrap.setFont(new Font("Sitka Text", Font.BOLD, 11));
		keltrap.setBackground(Color.BLACK);
		keltrap.setBounds(298, 368, 121, 21);
		panelkel.add(keltrap);

		JLabel gambartrap = new JLabel("");
		gambartrap.setIcon(new ImageIcon(image9));
		gambartrap.setVerticalAlignment(SwingConstants.CENTER);
		gambartrap.setHorizontalAlignment(SwingConstants.CENTER);
		gambartrap.setBounds(302, 288, 117, 70);
		panelkel.add(gambartrap);

		JLabel backgr = new JLabel("");
		backgr.setIcon(new ImageIcon(ImageBgr));
		backgr.setVerticalAlignment(SwingConstants.CENTER);
		backgr.setHorizontalAlignment(SwingConstants.CENTER);
		backgr.setBounds(0, 0, 684, 540);
		panelkel.add(backgr);

		panelhistori = new JPanel();
		panelhistori.setBounds(69, 0, 684, 540);
		panelhistori.setLayout(null);
		panelhistori.setBackground(SystemColor.textInactiveText);
		contentPane.add(panelhistori);

		outputhistori = new JTextArea();
		outputhistori.setFont(new Font("MS Gothic", Font.BOLD, 13));
		outputhistori.setEditable(false);
		outputhistori.setBounds(117, 44, 441, 475);
		panelhistori.add(outputhistori);

		JScrollPane scrollPaneHistori = new JScrollPane(outputhistori);
		scrollPaneHistori.setBounds(10, 41, 664, 463);
		panelhistori.add(scrollPaneHistori);

		JLabel lblHistori = new JLabel("Histori");
		lblHistori.setForeground(Color.CYAN);
		lblHistori.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblHistori.setBounds(298, 11, 72, 20);
		panelhistori.add(lblHistori);

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

		JTextPane deskripsi = new JTextPane();
		deskripsi.setBackground(Color.GRAY);
		deskripsi.setFont(new Font("Serif", Font.PLAIN, 12));
		deskripsi.setText(
				"Tugas Akhir yang berjudul Kalkuator Macam\" Bangun Datar Sederhana ini dibuat dengan menggunakan eclipse dengan bahasa pemrograman java. Modul modul yang terpakai dalam program ini adalah Modul 1,Modul 2,Modul 3,Modul 4, Modul 6, dan Modul 8. Konsep dari program ini adalah untuk mempermudah mencari luas dan keliling beberapa bangun\" datar .");
		deskripsi.setEditable(false);
		deskripsi.setBounds(10, 401, 664, 73);
		panelinfo.add(deskripsi);

		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(imageB));
		background.setVerticalAlignment(SwingConstants.CENTER);
		background.setHorizontalAlignment(SwingConstants.CENTER);
		background.setBounds(0, 0, 751, 538);
		contentPane.add(background);
		panelinfo.setVisible(false);
		panelhistori.setVisible(false);
		panelkel.setVisible(false);
	}

	private void tambahHistori(String perhitungan) {
		outputhistori.append(perhitungan + "\n");
	}
}
