package checknoprint;

import checknoprint.base.Model.PrintingContent;
import checknoprint.base.Model.PrintingObject;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

import org.apache.log4j.Logger;

public class print extends javax.swing.JFrame {
	private static final Logger LOG = Logger.getLogger(print.class.getName());

	private PrintingObject printData = new PrintingObject();

	private aligment_position_serialize ali_ser = new aligment_position_serialize();
	private PrintingContent printContent;
	private javax.swing.JCheckBoxMenuItem JmenuPrepareAlternate;
	private JComboBox SelectBankName;
	private JButton jButton1;
	private JLabel jLabel1;

	public print() {
		try {
			initComponents();
			TitleImage();
			GetBankList();
		} catch (Exception e) {
			LOG.error("error--->" + e.getMessage());
		}
	}

	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;

	private void GetBankList() {
		try {
			Statement stm = (Statement) dbconnect.connectionadmin.opencon().createStatement();
			Throwable localThrowable3 = null;
			try {
				ResultSet rs = stm.executeQuery("select bankname from bankaddress order by bankname");
				Throwable localThrowable4 = null;
				try {
					while (rs.next()) {
						this.SelectBankName.addItem(rs.getString("bankname"));
					}
				} catch (Throwable localThrowable1) {
					localThrowable4 = localThrowable1;
					throw localThrowable1;
				} finally {
				}
			} catch (Throwable localThrowable2) {
				localThrowable3 = localThrowable2;
				throw localThrowable2;
			} finally {
				if (stm != null)
					if (localThrowable3 != null)
						try {
							stm.close();
						} catch (Throwable x2) {
							localThrowable3.addSuppressed(x2);
						}
					else
						stm.close();
			}
		} catch (SQLException e) {
			LOG.error(e);
		}
	}

	private JLabel jLabel13;
	private JLabel jLabel14;
	private JLabel jLabel15;
	private JLabel jLabel16;

	private void initComponents() {
		this.jPanel1 = new JPanel();
		this.jLabel1 = new JLabel();
		this.jLabel3 = new JLabel();
		this.jLabel4 = new JLabel();
		this.jLabel5 = new JLabel();
		this.jLabel6 = new JLabel();
		this.txtaddressside1 = new JTextField();
		this.txtaddressside2 = new JTextField();
		this.txtcenteraddress1 = new JTextField();
		this.txtcenteraddress2 = new JTextField();
		this.txtcenteraddress3 = new JTextField();
		this.jLabel7 = new JLabel();
		this.jLabel8 = new JLabel();
		this.jLabel9 = new JLabel();
		this.txtnumfrom = new JTextField();
		this.jLabel10 = new JLabel();
		this.noto = new JTextField();
		this.txtbankcode = new JTextField();
		this.txtbankcode1 = new JTextField();
		this.jButton1 = new JButton();
		this.jLabel11 = new JLabel();
		this.txtbankcode2 = new JTextField();
		this.jLabel12 = new JLabel();
		this.jLabel13 = new JLabel();
		this.jLabel14 = new JLabel();
		this.SelectBankName = new JComboBox();
		this.jLabel15 = new JLabel();
		this.jLabel16 = new JLabel();
		this.txtcenteraddress4 = new JTextField();
		this.jLabel17 = new JLabel();
		this.txtAccNo = new JTextField();
		this.jLabel18 = new JLabel();
		this.jLabel19 = new JLabel();
		this.txtHolderName = new JTextField();
		this.txtHolderOrg = new JTextField();
		this.jLabel21 = new JLabel();
		this.txtAccountType = new JTextField();
		this.jMenuBar1 = new JMenuBar();
		this.jMenu1 = new JMenu();
		this.jMenuItem3 = new JMenuItem();
		this.jMenu3 = new JMenu();
		this.jMenuItem1 = new JMenuItem();
		this.jMenuItem2 = new JMenuItem();
		this.JmenuPrepareAlternate = new javax.swing.JCheckBoxMenuItem();

		setDefaultCloseOperation(3);
		setTitle("Cheque MICR printing");
		setBackground(new Color(51, 51, 255));
		setPreferredSize(new java.awt.Dimension(450, 450));

		this.jPanel1.setBackground(new Color(111, 166, 255));
		this.jPanel1.setForeground(new Color(255, 255, 255));
		this.jPanel1.setToolTipText("");
		this.jPanel1.setPreferredSize(new java.awt.Dimension(350, 350));

		this.jLabel1.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel1.setForeground(new Color(255, 255, 255));
		this.jLabel1.setText("Center Address2");

		this.jLabel3.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel3.setForeground(new Color(255, 255, 255));
		this.jLabel3.setText("Side Address");

		this.jLabel4.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel4.setForeground(new Color(255, 255, 255));
		this.jLabel4.setText("Side Address 2");

		this.jLabel5.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel5.setForeground(new Color(255, 255, 255));
		this.jLabel5.setText("Center Address");

		this.jLabel6.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel6.setForeground(new Color(255, 255, 255));
		this.jLabel6.setText("Center Address3");

		this.txtaddressside1.setNextFocusableComponent(this.txtaddressside2);

		this.txtaddressside2.setNextFocusableComponent(this.txtcenteraddress1);

		this.txtcenteraddress1.setNextFocusableComponent(this.txtcenteraddress2);

		this.txtcenteraddress2.setNextFocusableComponent(this.txtcenteraddress3);

		this.txtcenteraddress3.setNextFocusableComponent(this.txtnumfrom);

		this.jLabel7.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel7.setForeground(new Color(255, 255, 255));
		this.jLabel7.setText("Check No-To");

		this.jLabel8.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel8.setForeground(new Color(255, 255, 255));
		this.jLabel8.setText("Bank Code-1:");

		this.jLabel9.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel9.setForeground(new Color(255, 255, 255));
		this.jLabel9.setText("Check No-From");

		this.txtnumfrom.setNextFocusableComponent(this.noto);

		this.jLabel10.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel10.setForeground(new Color(255, 255, 255));
		this.jLabel10.setText("Bank Code:");

		this.noto.setNextFocusableComponent(this.txtbankcode);

		this.txtbankcode.setNextFocusableComponent(this.txtbankcode1);

		this.txtbankcode1.setNextFocusableComponent(this.txtbankcode2);

		this.jButton1.setFont(new Font("Arial", 0, 12));
		this.jButton1.setForeground(new Color(42, 188, 217));
		this.jButton1.setText("Print");
		this.jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				print.this.jButton1ActionPerformed(evt);
			}

		});
		this.jLabel11.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel11.setForeground(new Color(255, 255, 255));
		this.jLabel11.setText("Bank Code-2:");

		this.txtbankcode2.setNextFocusableComponent(this.jButton1);

		this.jLabel12.setFont(new Font("Times New Roman", 0, 12));
		this.jLabel12.setForeground(new Color(204, 0, 0));
		this.jLabel12.setText("(9-digits)");

		this.jLabel13.setFont(new Font("Times New Roman", 0, 12));
		this.jLabel13.setForeground(new Color(204, 0, 51));
		this.jLabel13.setText("(6-digits)");

		this.jLabel14.setFont(new Font("Times New Roman", 0, 12));
		this.jLabel14.setForeground(new Color(204, 0, 0));
		this.jLabel14.setText("(2-digits)");

		this.SelectBankName.setFont(new Font("Times New Roman", 0, 12));
		this.SelectBankName.setForeground(new Color(255, 255, 255));
		this.SelectBankName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Bank Name" }));
		this.SelectBankName.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				print.this.SelectBankNameItemStateChanged(evt);
			}
		});
		this.SelectBankName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				print.this.SelectBankNameActionPerformed(evt);
			}

		});
		this.jLabel15.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel15.setForeground(new Color(255, 255, 255));
		this.jLabel15.setText("Select Bank ");

		this.jLabel16.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel16.setForeground(new Color(255, 255, 255));
		this.jLabel16.setText("Center Address4");

		this.txtcenteraddress4.setNextFocusableComponent(this.txtnumfrom);

		this.jLabel17.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel17.setForeground(new Color(255, 255, 255));
		this.jLabel17.setText("Bank Acc No.");

		this.txtAccNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				print.this.txtAccNoActionPerformed(evt);
			}

		});
		this.jLabel18.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel18.setForeground(new Color(255, 255, 255));
		this.jLabel18.setText("Holder Name");

		this.jLabel19.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel19.setForeground(new Color(255, 255, 255));
		this.jLabel19.setText("Organisation");

		this.jLabel21.setFont(new Font("Times New Roman", 0, 18));
		this.jLabel21.setForeground(new Color(255, 255, 255));
		this.jLabel21.setText("Account Type");

		GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
		this.jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(
						jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
								jPanel1Layout
										.createSequentialGroup().addGap(72, 72, 72).addGroup(jPanel1Layout
												.createParallelGroup(GroupLayout.Alignment.LEADING,
														false)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGroup(jPanel1Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(this.jLabel4, -2, 126, -2)
																.addComponent(this.jLabel3, -2, 126, -2)
																.addComponent(this.jLabel5, -2, 129, -2)
																.addComponent(this.jLabel1, -2, 137, -2)
																.addComponent(this.jLabel15, -2, 126, -2)
																.addComponent(this.jLabel6, -2, 136, -2)
																.addComponent(this.jLabel16, -2, 132, -2))
														.addGap(42, 42, 42)
														.addGroup(jPanel1Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.TRAILING, false)
																		.addComponent(this.txtcenteraddress2,
																				GroupLayout.Alignment.LEADING)
																		.addComponent(this.txtcenteraddress1,
																				GroupLayout.Alignment.LEADING)
																		.addComponent(this.txtaddressside2,
																				GroupLayout.Alignment.LEADING)
																		.addComponent(this.SelectBankName,
																				GroupLayout.Alignment.LEADING, 0, 150,
																				32767)
																		.addComponent(this.txtaddressside1,
																				GroupLayout.Alignment.LEADING)
																		.addComponent(this.txtcenteraddress3))
																.addComponent(this.txtcenteraddress4,
																		GroupLayout.Alignment.TRAILING, -2, 150, -2)))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(this.jLabel17, -2, 132, -2)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1,
																32767)
														.addComponent(this.txtAccNo, -2, 150, -2)))
										.addGap(77, 77, 77)
										.addGroup(jPanel1Layout
												.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(GroupLayout.Alignment.LEADING, false)
														.addGroup(jPanel1Layout
																.createSequentialGroup()
																.addGroup(jPanel1Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING, false)
																		.addComponent(this.jLabel9, -1, -1, 32767)
																		.addComponent(this.jLabel7, -2, 118, -2)
																		.addComponent(this.jLabel8, -2, 106, -2))
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(this.jLabel13))
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(this.jLabel10, -2, 87, -2)
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																		-1, 32767)
																.addComponent(this.jLabel12)))
														.addGap(21, 21, 21)
														.addGroup(jPanel1Layout
																.createParallelGroup(GroupLayout.Alignment.TRAILING)
																.addComponent(this.txtbankcode, -2, 150, -2)
																.addGroup(jPanel1Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING, false)
																		.addComponent(this.noto)
																		.addComponent(this.txtbankcode1, -1, 150, 32767)
																		.addComponent(this.txtnumfrom))))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(this.jLabel11, -2, 118, -2)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jLabel14).addGap(22, 22, 22)
														.addComponent(this.txtbankcode2, -2, 150, -2))
												.addGroup(GroupLayout.Alignment.TRAILING,
														jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(this.jLabel18, -1, -1, 32767)
																.addComponent(this.jLabel19, -1, -1, 32767))
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																		-1, 32767)
																.addGroup(jPanel1Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																		.addComponent(this.txtHolderOrg,
																				GroupLayout.Alignment.TRAILING, -2, 150, -2)
																		.addComponent(this.txtHolderName,
																				GroupLayout.Alignment.TRAILING, -2, 150, -2)))
												.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout
														.createSequentialGroup().addComponent(this.jLabel21)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1,
																32767)
														.addGroup(jPanel1Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(this.jButton1, -2, 76, -2)
																.addComponent(this.txtAccountType, -2, 150, -2))))
										.addContainerGap(304, 32767)));

		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(62, 32767)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel15).addComponent(this.SelectBankName, -2, -1, -2)
								.addComponent(this.jLabel9).addComponent(this.txtnumfrom, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel3).addComponent(this.txtaddressside1, -2, -1, -2)
								.addComponent(this.jLabel7).addComponent(this.noto, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel4).addComponent(this.txtaddressside2, -2, -1, -2)
								.addComponent(this.jLabel10).addComponent(this.jLabel12)
								.addComponent(this.txtbankcode, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel5).addComponent(this.txtcenteraddress1, -2, -1, -2)
								.addComponent(this.jLabel8).addComponent(this.jLabel13)
								.addComponent(this.txtbankcode1, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel1).addComponent(this.txtcenteraddress2, -2, -1, -2)
								.addComponent(this.jLabel11).addComponent(this.jLabel14)
								.addComponent(this.txtbankcode2, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel6).addComponent(this.txtcenteraddress3, -2, -1, -2)
								.addComponent(this.jLabel19).addComponent(this.txtHolderOrg, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel16).addComponent(this.txtcenteraddress4, -2, -1, -2)
								.addComponent(this.jLabel18).addComponent(this.txtHolderName, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel17).addComponent(this.txtAccNo, -2, -1, -2)
								.addComponent(this.jLabel21).addComponent(this.txtAccountType, -2, -1, -2))
						.addGap(30, 30, 30).addComponent(this.jButton1, -2, 38, -2).addContainerGap(31, 32767)));

		this.jMenuBar1.setBackground(new Color(77, 137, 233));
		this.jMenuBar1.setForeground(new Color(255, 255, 255));

		this.jMenu1.setText("File");

		this.jMenuItem3.setText("Exit");
		this.jMenuItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				print.this.jMenuItem3ActionPerformed(evt);
			}
		});
		this.jMenu1.add(this.jMenuItem3);

		this.jMenuBar1.add(this.jMenu1);

		this.jMenu3.setText("Settings");

		this.jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGE/notices1.jpg")));
		this.jMenuItem1.setText("Position Aligment");
		this.jMenuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				print.this.jMenuItem1ActionPerformed(evt);
			}
		});
		this.jMenu3.add(this.jMenuItem1);

		this.jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGE/addbank.jpg")));
		this.jMenuItem2.setText("Bank Detaills");
		this.jMenuItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				print.this.jMenuItem2ActionPerformed(evt);
			}
		});
		this.jMenu3.add(this.jMenuItem2);

		this.JmenuPrepareAlternate.setText("Prepare Alternate");
		this.JmenuPrepareAlternate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGE/alternate.png")));
		this.JmenuPrepareAlternate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				print.this.JmenuPrepareAlternateActionPerformed(evt);
			}
		});
		this.jMenu3.add(this.JmenuPrepareAlternate);

		this.jMenuBar1.add(this.jMenu3);

		setJMenuBar(this.jMenuBar1);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 1122, -2));

		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 423, 32767));

		setSize(new java.awt.Dimension(897, 471));
		setLocationRelativeTo(null);
	}

	private void jMenuItem1ActionPerformed(ActionEvent evt) {
		new PositionAlignment_setting().setVisible(true);
	}

	private JLabel jLabel17;
	private JLabel jLabel18;
	private JLabel jLabel19;
	private JLabel jLabel21;

	private void jMenuItem2ActionPerformed(ActionEvent evt) {
		new AddNewBank().setVisible(true);
		dispose();
	}

	private void jMenuItem3ActionPerformed(ActionEvent evt) {
		int reply = javax.swing.JOptionPane.showConfirmDialog(null, "You close the Application", "Close Application",
				0);
		if (reply == 0) {
			System.exit(0);
		}
	}

	private void JmenuPrepareAlternateActionPerformed(ActionEvent evt) {
		new PrepareAlternate().setVisible(true);
	}

	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;

	private void txtAccNoActionPerformed(ActionEvent evt) {
	}

	private void SelectBankNameActionPerformed(ActionEvent evt) {
	}

	private void SelectBankNameItemStateChanged(java.awt.event.ItemEvent evt) {
		try {
			String bankname = this.SelectBankName.getSelectedItem().toString();
			if (bankname.equals("Select Bank Name")) {
				this.txtaddressside1.setText("");
				this.txtaddressside2.setText("");
				this.txtcenteraddress1.setText("");
				this.txtcenteraddress2.setText("");
				this.txtcenteraddress3.setText("");
				this.txtcenteraddress4.setText("");
				this.txtbankcode.setText("");
				this.txtbankcode1.setText("");
				this.txtAccNo.setText("");
				this.txtHolderName.setText("");
				this.txtHolderOrg.setText("");
			} else {
				Statement stm = (Statement) dbconnect.connectionadmin.opencon().createStatement();
				Throwable localThrowable3 = null;
				try {
					String sql = "select * from bankaddress where bankname='" + bankname + "'";
					ResultSet rs = stm.executeQuery(sql);
					Throwable localThrowable4 = null;
					try {
						while (rs.next()) {
							this.txtaddressside1.setText(rs.getString("side1"));
							this.txtaddressside2.setText(rs.getString("side2"));
							this.txtcenteraddress1.setText(rs.getString("center1"));
							this.txtcenteraddress2.setText(rs.getString("center2"));
							this.txtcenteraddress3.setText(rs.getString("center3"));
							this.txtcenteraddress4.setText(rs.getString("center4"));
							this.txtbankcode.setText(rs.getString("bankcode9digits"));
							this.txtbankcode1.setText(rs.getString("bankcode6digits"));
							this.txtAccNo.setText(rs.getString("AccNo"));
							this.txtHolderName.setText(rs.getString("AccHolderName"));
							this.txtHolderOrg.setText(rs.getString("AccHolderOrg"));
						}
					} catch (Throwable localThrowable1) {
						localThrowable4 = localThrowable1;
						throw localThrowable1;
					} finally {
					}
				} catch (Throwable localThrowable2) {
					localThrowable3 = localThrowable2;
					throw localThrowable2;

				} finally {

					if (stm != null)
						if (localThrowable3 != null)
							try {
								stm.close();
							} catch (Throwable x2) {
								localThrowable3.addSuppressed(x2);
							}
						else
							stm.close();
				}
				dbconnect.connectionadmin.opencon().close();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private JLabel jLabel9;
	private JMenu jMenu1;
	private JMenu jMenu3;
	private JMenuBar jMenuBar1;
	private JMenuItem jMenuItem1;

	private void jButton1ActionPerformed(ActionEvent evt) {
		String side_length = null;
		String side_height = null;
		String side_space = null;
		String center_length = null;
		String center_height = null;
		String center_space = null;
		String chequeNum_len = null;
		String chequeNum_heg = null;
		String java_home = System.getProperty("user.home");
		String alignment_file = java_home + "\\Cheque_MICRPrinting\\alignment";

		String filename = alignment_file + "\\Current_setting.txt";
		String default_filename = alignment_file + "\\position_default.txt";

		File file_cur = new File(filename);
		File file_default = new File(default_filename);
		try {
			if (!file_default.exists()) {
				javax.swing.JOptionPane.showMessageDialog(null,
						"Alignment is Empty value..\n So you can't take the printout..");
				return;
			}
			FileInputStream fout;
			if (file_cur.exists()) {
				fout = new FileInputStream(filename);
			} else {
				fout = new FileInputStream(file_default);
			}
			ObjectInputStream obj_in = new ObjectInputStream(fout);
			Throwable localThrowable2 = null;
			try {
				this.ali_ser = ((aligment_position_serialize) obj_in.readObject());
			} catch (Throwable localThrowable1) {
				localThrowable2 = localThrowable1;
				throw localThrowable1;
			} finally {
				if (obj_in != null)
					if (localThrowable2 != null)
						try {
							obj_in.close();
						} catch (Throwable x2) {
							localThrowable2.addSuppressed(x2);
						}
					else
						obj_in.close();
			}
			fout.close();
		} catch (java.awt.HeadlessException | java.io.IOException | ClassNotFoundException ex) {
			LOG.error(ex);
		}
		SetPrintingData();
		new checknoprint.base.PrintableModel.PrintChequeNo(this.printData).print();
	}

	private JMenuItem jMenuItem2;

	private void SetPrintingData() {
		this.printContent = new PrintingContent();
		this.printContent.getAli_ser().clear();
		this.printData.getPrintingContent().clear();
		this.printContent.getAli_ser().add(this.ali_ser);

		java.net.URL urlimage1 = iMAGE.imageclass.class.getResource("MICR121.gif");
		java.net.URL urlimage2 = iMAGE.imageclass.class.getResource("MICR122.gif");
		this.printContent.setUrlimage1(urlimage1);
		this.printContent.setUrlimage2(urlimage2);
		this.printContent.setSideaddress1(this.txtaddressside1.getText());
		this.printContent.setSideaddress2(this.txtaddressside2.getText());
		this.printContent.setCenteraddress1(this.txtcenteraddress1.getText());
		this.printContent.setCenteraddress2(this.txtcenteraddress2.getText());
		this.printContent.setCenteraddress3(this.txtcenteraddress3.getText());
		this.printContent.setCenteraddress4(this.txtcenteraddress4.getText());
		this.printContent.setNofrom(this.txtnumfrom.getText().trim());
		this.printContent.setNumto(this.noto.getText().trim());
		this.printContent.setBankcode(this.txtbankcode.getText().trim());
		this.printContent.setBankcode1(this.txtbankcode1.getText().trim());
		this.printContent.setBankcode2(this.txtbankcode2.getText().trim());
		this.printContent.setAccNo(this.txtAccNo.getText().trim());
		this.printContent.setAccHolderName(this.txtHolderName.getText().trim());
		this.printContent.setAccOrganisation(this.txtHolderOrg.getText().trim());
		this.printContent.setAccountType(this.txtAccountType.getText().trim());
		this.printData.getPrintingContent().add(this.printContent);
		this.printData.setPrinttype(checknoprint.base.Model.PrintingObject.PRINTTYPE.DIRECTPRINT);
	}

	private JMenuItem jMenuItem3;
	private JPanel jPanel1;

	private void TitleImage() {
		try {
			getRootPane().setWindowDecorationStyle(8);
			List imageList = new java.util.ArrayList();
			imageList.add(javax.imageio.ImageIO.read(getClass().getResource("/iMAGE/Durkesh_Title.png")));
			setIconImages(imageList);
		} catch (java.io.IOException e) {
			LOG.error(e);
		}
	}

	private JTextField noto;
	private JTextField txtAccNo;

	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			LOG.error(ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new print().setVisible(true);
			}
		});
	}

	private JTextField txtAccountType;
	private JTextField txtHolderName;
	private JTextField txtHolderOrg;
	private JTextField txtaddressside1;
	private JTextField txtaddressside2;
	private JTextField txtbankcode;
	private JTextField txtbankcode1;
	private JTextField txtbankcode2;
	private JTextField txtcenteraddress1;
	private JTextField txtcenteraddress2;
	private JTextField txtcenteraddress3;
	private JTextField txtcenteraddress4;
	private JTextField txtnumfrom;
}